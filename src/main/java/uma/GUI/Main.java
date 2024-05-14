package uma.GUI;

import uma.healthcalc.HealthCalcImpl;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        HealthCalcImpl model = new HealthCalcImpl();
        Controlador controlador = new Controlador(vista, model);
        vista.setControlador(controlador); // Añade esta línea
        vista.mostrar(); // Añade esta línea

        
    }
}
