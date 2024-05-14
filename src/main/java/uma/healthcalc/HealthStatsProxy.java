package uma.healthcalc;

import java.util.ArrayList;
import java.util.List;

import uma.healthcalc.HealthHospital;
import uma.healthcalc.HealthStats;

public class HealthStatsProxy implements HealthStats, HealthHospital{

    private HealthHospital healthCalcImpl;
    private List<Float> lAlturas;
    private List<Integer> lPesos;
    private List<Integer> lEdad;
    private List<Double> lBmr;
    private int nHombres;
    private int nMujeres;

    public HealthStatsProxy(HealthHospital hci){
        this.healthCalcImpl = hci;
        this.lAlturas = new ArrayList<>();
        this.lPesos = new ArrayList<>();
        this.lEdad = new ArrayList<>();
        this. lBmr = new ArrayList<>();
        this.nHombres = 0;
        this.nMujeres = 0;
    }

    public float alturaMedia(){
        float suma = 0;
        for(int i = 0; i < lAlturas.size(); i++){
            suma += lAlturas.get(i);
        }

        return suma/lAlturas.size();
    }

    public float pesoMedio(){
        float suma = 0;
        for(int i = 0; i < lPesos.size(); i++){
            suma += lPesos.get(i);
        }

        return suma/lPesos.size();
    }


    public float edadMedia(){
        float suma = 0;
        for(int i = 0; i < lEdad.size(); i++){
            suma += lEdad.get(i);
        }

        return suma/lEdad.size();
    }

    public float bmrMedio(){
        float suma = 0;
        for(int i = 0; i < lBmr.size(); i++){
            suma += lBmr.get(i);
        }

        return suma/lBmr.size();
    }

    public int numSexoH(){
        return nHombres;
    }

    public int numSexoM(){
        return nMujeres;
    }

    public int numTotalPacientes(){
        return nHombres + nMujeres;
    }

    public double bmr(char genero, int edad, float altura, int peso){
        double resultado = healthCalcImpl.bmr(genero, edad, altura, peso);
        lAlturas.add(altura);
        lEdad.add(edad);
        lPesos.add(peso);
        lBmr.add(resultado);
        if(genero == 'H'){
            nHombres++;
        }else{
            nMujeres++;
        }
    }

    public int pesoIdeal(char genero, float altura){
        int resultado = healthCalcImpl.pesoIdeal(genero, altura);
        lAlturas.add(altura);
        if(genero == 'H'){
            nHombres++;
        }else{
            nMujeres++;
        }
    }
}