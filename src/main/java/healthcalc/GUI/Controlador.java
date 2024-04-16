package healthcalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{

	private char genero;
	private int altura;
	private int edad;
	private float peso;
	private HealthCalcImpl calc = new HealthCalcImpl();
	private Vista vista;
	
	public Controlador(HealthCalcImpl calculadora, Vista gui) {
		this.calc = calculadora;
		this.vista = gui;
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		switch (comando) {
			case "HombreBT":
				vista.getHombreBT();
				vista.getMujerBT();
				gender = 'H';
				break;
			case "MujerBT":
				vista.getMujerBT();
				vista.getHombreBT();
				gender = 'M';
				break;
			case "getBMR":
				try {
					altura = Integer.parseInt(vista.getAltura().getText());
					peso = Float.parseFloat(vista.getPeso().getText());
					edad = (Integer) vista.getEdad().getValue();
					
					try {
						float bmr = this.calc.basalMetabolicRate(peso, altura, genero, edad);
			            vista.escribirResultadosBMR(bmr);
					} catch (Exception e1) {
						vista.entradaInvalida(e1.getMessage());
					}
				} catch (Exception e0) {
					vista.errorNoEntrada();
				}
				break;
			case "getIW":	
				try {
					altura = Integer.parseInt(vista.getAltura().getText());
					
					try {
						float idealWeight = this.calc.idealWeight(altura, genero);
			            vista.escribirResultadosIW(idealWeight);
					} catch (Exception e1) {
						vista.entradaInvalida(e1.getMessage());
					} 
					
				} catch (Exception e0) {
					vista.errorNoEntrada();
				}
				break;
				
		}
	}

}