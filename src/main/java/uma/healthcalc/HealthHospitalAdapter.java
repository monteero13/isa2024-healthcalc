package uma.healthcalc;

public class HealthHospitalAdapter implements HealthHospital{

    private HealthCalcImpl healthCalcImpl;

    public HealthHospitalAdapter(HealthCalcImpl hcl){
        healthCalcImpl = hcl;
    }
    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        double resultado = 0;
        int alt = (int) altura * 100;
        float pes = peso/1000;
        
        resultado = (double) healthCalcImpl.basalMetabolicRate(pes, alt, genero, edad);
        
        return resultado;
    }

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception {
        int resultado = 0;
        int alt = (int) altura * 100;
        
        resultado = (int) healthCalcImpl.idealWeight(alt, genero) * 1000;

        return resultado;
    }

    
}

