package healthcalc.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Vista extends JFrame {
    private JLabel titleLabel;
    private JLabel genderLabel;
    private JRadioButton maleButton;
    private JRadioButton femaleButton;
    private JLabel heightLabel;
    private JTextField heightField;
    private JLabel weightLabel;
    private JTextField weightField;
    private JLabel ageLabel;
    private JTextField ageField;
    private JButton bmrButton;
    private JButton iwButton;
    private JTextField resultField;


    public Vista() {
        super("Health Calculator");
        setLayout(new GridLayout(7, 2));

        titleLabel = new JLabel("Health Calculator");
        genderLabel = new JLabel("Género:");
        maleButton = new JRadioButton("Hombre");
        femaleButton = new JRadioButton("Mujer");
        heightLabel = new JLabel("Altura:");
        heightField = new JTextField();
        weightLabel = new JLabel("Peso:");
        weightField = new JTextField();
        ageLabel = new JLabel("Edad:");
        ageField = new JTextField();
        bmrButton = new JButton("Tasa metabólica basal");
        iwButton = new JButton("Peso ideal");
        resultField = new JTextField();
        

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        add(titleLabel);
        add(new JLabel());
        add(genderLabel);
        add(maleButton);
        add(new JLabel());
        add(femaleButton);
        add(heightLabel);
        add(heightField);
        add(weightLabel);
        add(weightField);
        add(ageLabel);
        add(ageField);
        add(bmrButton);
        add(iwButton);
        resultField.setEditable(false);
        add(new JLabel("Resultado:"));
        add(resultField);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public String getGender() {
        if (maleButton.isSelected()) {
            return "H";
        } else if (femaleButton.isSelected()) {
            return "M";
        } else {
            return null;
        }
    }

    public int getHeightValue() {
        try {
            return Integer.parseInt(heightField.getText());
        } catch (NumberFormatException e) {
            return -1; // Return -1 if parsing fails
        }
    }

    public float getWeightValue() {
        try {
            return Float.parseFloat(weightField.getText());
        } catch (NumberFormatException e) {
            return -1; // Return -1 if parsing fails
        }
    }

    public int getAgeValue() {
        try {
            return Integer.parseInt(ageField.getText());
        } catch (NumberFormatException e) {
            return -1; // Return -1 if parsing fails
        }
    }
    
    public void setResult(String result) {
        resultField.setText(result);
    }

    public void addBMRButtonListener(ActionListener listener) {
        bmrButton.addActionListener(listener);
    }

    public void addIWButtonListener(ActionListener listener) {
        iwButton.addActionListener(listener);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
