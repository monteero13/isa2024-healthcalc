package uma.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uma.healthcalc.HealthCalcImpl;



public class Controlador {
    private Vista vista;
    private HealthCalcImpl model;

    public Controlador(Vista vista, HealthCalcImpl model) {
        this.vista = vista;
        this.model = model;

        this.vista.addBMRButtonListener(new BMRButtonListener());
        this.vista.addIWButtonListener(new IWButtonListener());
    }

    class BMRButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculateBMR();
        }
    }

    class IWButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculateIdealWeight();
        }
    }

    void calculateBMR() {
        String gender = vista.getGender();
        int height = vista.getHeightValue();
        float weight = vista.getWeightValue();
        int age = vista.getAgeValue();
        try {
            float bmr = model.basalMetabolicRate(weight, height, gender.charAt(0), age);
            vista.setResult(String.format("%.2f kcal/día", bmr)); 
        } catch (Exception ex) {
            vista.displayErrorMessage(ex.getMessage());
        }
    }

    void calculateIdealWeight() {
        int height = vista.getHeightValue();
        String gender = vista.getGender();

        try {
            float idealWeight = model.idealWeight(height, gender.charAt(0));
            vista.setResult(String.format("%.2f kg", idealWeight)); 
        } catch (Exception ex) {
            vista.displayErrorMessage(ex.getMessage());
        }
    }
}