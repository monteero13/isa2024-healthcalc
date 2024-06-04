package uma.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;

import uma.healthcalc.Gender;

import javax.swing.JButton;

public class Vista {

    private JFrame frame;
    private JTextField TBaltura;
    private JTextField TBpeso;
    private JTextField TBedad;
    private JTextField TBresultado;
    private JRadioButton BTmujer; 
    private JRadioButton BThombre; 
    private JButton BTtasa; 
    private JButton BTpeso; 
    private ButtonGroup buttonGroup;
	private Controlador controlador;

    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Vista window = new Vista();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the application.
     */
    public Vista() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1207, 409);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        JLabel lblNewLabel_1 = new JLabel("Selecciona tu género:");
        lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        
        JLabel lblNewLabel_2 = new JLabel("Introduce tu altura (cm):");
        lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        
        JLabel lblNewLabel_3 = new JLabel("Introduce tu peso (kg):");
        lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        
        JLabel lblNewLabel_4 = new JLabel("Introduce tu edad:");
        lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        
        JLabel lblNewLabel_5 = new JLabel("Selecciona:");
        lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        
        JLabel lblNewLabel_6 = new JLabel("Resultado:");
        lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        
        BTmujer = new JRadioButton("Mujer"); // Cambiado de JButton a JRadioButton
        BTmujer.setFont(new Font("Comic Sans MS", Font.BOLD, 14));

        BThombre = new JRadioButton("Hombre"); // Cambiado de JButton a JRadioButton
        BThombre.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(BTmujer);
        buttonGroup.add(BThombre);
        
        TBaltura = new JTextField();
        TBaltura.setColumns(10);
        
        TBpeso = new JTextField();
        TBpeso.setColumns(10);
        
        TBedad = new JTextField();
        TBedad.setColumns(10);
        
        TBresultado = new JTextField();
        TBresultado.setColumns(10);
        
        BTtasa = new JButton("Tasa metabólica basal");
        BTtasa.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        
        BTpeso = new JButton("Peso ideal");
        BTpeso.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1322, Short.MAX_VALUE)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(253)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblNewLabel_1)
                        .addComponent(lblNewLabel_2)
                        .addComponent(lblNewLabel_3)
                        .addComponent(lblNewLabel_4)
                        .addComponent(lblNewLabel_6)
                        .addComponent(lblNewLabel_5))
                    .addGap(66)
                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addComponent(TBresultado, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(BTmujer)
                            .addPreferredGap(ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                            .addComponent(BThombre))
                        .addComponent(TBaltura, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(BTtasa)
                            .addPreferredGap(ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                            .addComponent(BTpeso, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
                        .addComponent(TBpeso, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                        .addComponent(TBedad, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                    .addGap(311))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addComponent(panel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel_1)
                        .addComponent(BThombre)
                        .addComponent(BTmujer))
                    .addGap(36)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel_2)
                        .addComponent(TBaltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(26)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel_3)
                        .addComponent(TBpeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(31)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel_4)
                        .addComponent(TBedad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(33)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel_5)
                        .addComponent(BTtasa, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTpeso, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                    .addGap(42)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel_6)
                        .addComponent(TBresultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(56, Short.MAX_VALUE))
        );
        
        JLabel lblNewLabel = new JLabel("Health Calculator");
        lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        panel.add(lblNewLabel);
        frame.getContentPane().setLayout(groupLayout);
    }
    
    public Gender getGender() {
        if (BThombre.isSelected()) {
            return Gender.MALE;
        } else if (BTmujer.isSelected()) {
            return Gender.FEMALE;
        } else {
            return null;
        }
    }

    public int getHeightValue() {
        try {
            return Integer.parseInt(TBaltura.getText());
        } catch (NumberFormatException e) {
            return -1; 
        }
    }

    public float getWeightValue() {
        try {
            return Float.parseFloat(TBpeso.getText());
        } catch (NumberFormatException e) {
            return -1; // Return -1 if parsing fails
        }
    }

    public int getAgeValue() {
        try {
            return Integer.parseInt(TBedad.getText());
        } catch (NumberFormatException e) {
            return -1; // Return -1 if parsing fails
        }
    }
    
    public void setResult(String result) {
        TBresultado.setText(result);
    }
    
    public void addBMRButtonListener(ActionListener listener) {
        BTtasa.addActionListener(listener);
    }

    public void addIWButtonListener(ActionListener listener) {
        BTpeso.addActionListener(listener);
    }

    
    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(frame, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void mostrar() {
        frame.setVisible(true);
    }

}
