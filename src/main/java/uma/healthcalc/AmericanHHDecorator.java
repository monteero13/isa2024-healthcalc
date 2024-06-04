package uma.healthcalc;

public class AmericanHHDecorator extends HealthHospitalDecorator{
    
    public AmericanHHDecorator(HealthStatsProxy hci) {
        super(hci);
        //TODO Auto-generated constructor stub
    }

    public int pesoIdeal(char genero, float altura) throws Exception{
        int resultado = super.pesoIdeal(genero, altura);
        //String mensaje = mostrarMensaje(genero, altura, 0, 0, (double) resultado);
        //mensajeToString(mensaje);
        return resultado;
    }
    

    public double bmr(char genero, int edad, float altura, int peso) throws Exception{
    	peso = (int) (peso / 2.20462f*1000);
        altura = altura * 0.3048f;
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

        mensaje = "Español: La persona con altura " + String.format("%.2f", altura/0.3048f) + " pies, " + String.format("%.2f",peso*2.20462/1000) + " libras tiene un BMR de " + resultado + ".";
        mensaje += "\n";
        mensaje += "English: The person with a height of " + String.format("%.2f", altura/0.3048f) + " feet and " + String.format("%.2f",peso*2.20462/1000) + " pounds has a BMR of " + resultado + ".";
        return mensaje;
    }

    public void mensajeToString(String mensaje){
        System.out.print(mensaje);
    }
}
