package uma.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uma.healthcalc.Gender;
import uma.healthcalc.HealthCalcImpl;
import uma.healthcalc.PersonImpl;



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
        Gender gender = vista.getGender();
        int height = vista.getHeightValue();
        float weight = vista.getWeightValue();
        int age = vista.getAgeValue();
        try {
            double bmr = model.basalMetabolicRate(new PersonImpl(weight,height, gender,age));
            vista.setResult(String.format("%.2d kcal/día", bmr)); 
        } catch (Exception ex) {
            vista.displayErrorMessage(ex.getMessage());
        }
    }

    void calculateIdealWeight() {
        int height = vista.getHeightValue();
        Gender gender = vista.getGender();

        try {
            double idealWeight = model.getIdealBodyWeight(new PersonImpl(height, gender));
            vista.setResult(String.format("%.2d kg", idealWeight)); 
        } catch (Exception ex) {
            vista.displayErrorMessage(ex.getMessage());
        }
    }
}