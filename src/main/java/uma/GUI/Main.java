package uma.GUI;

import uma.healthcalc.HealthCalcImpl;
import uma.healthcalc.HealthHospitalAdapter;
import uma.healthcalc.HealthStatsProxy;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        HealthCalcImpl model = HealthCalcImpl.getInstance();
        Controlador controlador = new Controlador(vista, model);
        vista.setControlador(controlador); // Añade esta línea
        vista.mostrar(); // Añade esta línea

        
    }
}
