package uma.healthcalc;

public class EuropeanHHDecorator extends HealthHospitalDecorator {

    public EuropeanHHDecorator(HealthStatsProxy hci) {
        super(hci);
        //TODO Auto-generated constructor stub
    }

   
    public int pesoIdeal(char genero, float altura){
        int resultado = super.pesoIdeal(genero, altura);
        //String mensaje = mostrarMensaje(genero, altura, 0, 0, (double) resultado);
        //mensajeToString(mensaje);
        return resultado;
    }
    

    public double bmr(char genero, int edad, float altura, int peso) throws Exception{
        double resultado = super.bmr(genero, edad, altura, peso);
        String mensaje = mostrarMensaje(genero, altura, edad, peso, resultado);
        mensajeToString(mensaje);
        return resultado;
    }

    public String mostrarMensaje(char genero, float altura, int edad, int peso, double resultado){
        String mensaje = "";
        String g = "";
        String ge = "";
        
        if(genero == 'H'){
            g = "masculino";
            ge = "male";
        } else{
            g = "femenino";
            ge = "female";
        }

        mensaje = "Español: La persona con altura " + altura + " metros, " + peso/1000 + " kg tiene un BMR de " + resultado + ".";
        mensaje += "\n";
        mensaje += "English: The person with a height of " + altura + " meters and " + peso/1000 + " kg has a BMR of " + resultado + ".";
        mensaje += "\n";
        return mensaje;
    }

    public void mensajeToString(String mensaje){
        System.out.print(mensaje);
    }
}