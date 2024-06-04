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
        
        resultado = (double) healthCalcImpl.basalMetabolicRate(new PersonImpl(peso,alt,pasarGen(genero),edad));
        
        return resultado;
    }

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception {
        int resultado = 0;
        int alt = (int) altura * 100;
        
        resultado = (int) healthCalcImpl.getIdealBodyWeight(new PersonImpl(alt, pasarGen(genero))) * 1000;
        
        return resultado;
    }

    public Gender pasarGen(char genero){
        if(genero == 'h'){
            return Gender.MALE;
        } else if (genero == 'm'){
            return Gender.FEMALE;
        } else{
            throw new IllegalArgumentException();
        }
    }
    
}

