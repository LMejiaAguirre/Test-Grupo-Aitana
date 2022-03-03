package testGrupoAitana;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {

	public static void main(String[] args) {
		//He generado una array de precios aleatorios
		ArrayList<Float> Precios = new ArrayList<Float>();
		
		for (int i = 0; i < 100; i++) {
			Precios.add((float)Math.random()*99+1);
		}
		
		Collections.sort(Precios);
		System.out.println("Mayor precio: " + String.format("%.2f", Precios.get(Precios.size()-1)) + " Euros");
		System.out.println("Menor precio: " + String.format("%.2f", Precios.get(0)) + " Euros");
		System.out.println("Sumatorio: " + String.format("%.2f", Sumatorio(Precios)) + " Euros");
	}
	
	private static double Sumatorio(ArrayList<Float> Precios) {
		double Sum=0;
		for (int i = 0; i < Precios.size(); i++) {
			Sum += Precios.get(i);
		}
		return Sum;
	}
}
