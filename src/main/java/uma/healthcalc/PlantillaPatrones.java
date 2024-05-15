package uma.healthcalc;



public class PlantillaPatrones {

    public static void main(String[] args) throws Exception {
    	
        HealthCalcImpl model = HealthCalcImpl.getInstance();
        HealthHospitalAdapter adapter = new HealthHospitalAdapter(model);
        HealthStatsProxy proxy = new HealthStatsProxy(adapter);
    
        AmericanHHDecorator americanCalculator = new AmericanHHDecorator(proxy);
        EuropeanHHDecorator europeanCalculator = new EuropeanHHDecorator(proxy);
        
        char gender = 'M';
        int age = 20;
        float height = 5.75f; // Altura en pies
        int weight = 176; // Peso en libras
        
        char gender1 = 'H';
        int age1 = 35;
        float height1 = 1.83f; // Altura en metros
        int weight1 = 120000; // Peso en gramos

        char gender2 = 'M';
        int age2 = 25;
        float height2 = 5.50f; // Altura en pies
        int weight2 = 160; // Peso en libras

        char gender3 = 'H';
        int age3 = 30;
        float height3 = 1.95f; // Altura en metros
        int weight3 = 185000; // Peso en gramos

       // europeanCalculator.bmr(gender, age, height, weight);
        System.out.println("Persona 1 con medidas americanas:");
        americanCalculator.bmr(gender, age, height, weight);
        System.out.println("\n");
        System.out.println("Persona 2 con medidas europeas:");
        europeanCalculator.bmr(gender1, age1, height1, weight1);
        System.out.println("\n");
        System.out.println("Persona 3 con medidas americanas:");
        americanCalculator.bmr(gender2, age2, height2, weight2);
        System.out.println("\n");
        System.out.println("Persona 4 con medidas europeas:");
        europeanCalculator.bmr(gender3, age3, height3, weight3);
            
         // Ahora podemos obtener las medias y otros datos
            float pesoMedio = proxy.pesoMedio();
            float edadMedia = proxy.edadMedia();
            float alturaMedia = proxy.alturaMedia();
            float bmrMedio = proxy.bmrMedio();
            int nPacientesTotal = proxy.numTotalPacientes();
            int nHombres = proxy.numSexoH();
            int nMujeres = proxy.numSexoM();
    
            // Paso 4: Imprimir los resultados o realizar cualquier otra acción
            System.out.print("\n");
            System.out.println("Media de peso (gramos): " + pesoMedio);
            System.out.println("Media de edad (años): " + edadMedia);
            System.out.println("Media de altura (metros): " + String.format("%.2f",alturaMedia));
            System.out.println("Media de tasa metabólica basal: " + bmrMedio);
            System.out.println("Número de pacientes total: " + nPacientesTotal); 
            System.out.println("Número de pacientes masculinos: " + nHombres);
            System.out.println("Número de pacientes femeninos: " + nMujeres);
    }
    
    

}