package uma.healthcalc;


public class HealthHospitalDecorator implements HealthHospital{
    private HealthStatsProxy healthCalcImpl;

    public HealthHospitalDecorator(HealthStatsProxy hci){
        this.healthCalcImpl = hci;
    }

    public int pesoIdeal(char genero, float altura){
        return healthCalcImpl.pesoIdeal(genero, altura);
    }

    public double bmr(char genero, int edad, float altura, int peso) throws Exception{
        return healthCalcImpl.bmr(genero, edad, altura, peso);
    }


}
