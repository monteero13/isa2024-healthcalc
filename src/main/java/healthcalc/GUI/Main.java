package healthcalc.GUI;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        HealthCalcImpl model = new HealthCalcImpl();
        Controlador controlador = new Controlador(vista, model);
    }
}
