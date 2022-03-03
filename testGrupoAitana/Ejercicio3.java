package testGrupoAitana;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner Kb = new Scanner(System.in);
		
		System.out.println("Introduce la oración");
		String Cadena = Kb.nextLine();
		
		String[] VCadena = Cadena.split(" ");
		
		Cadena ="";
		for (int i = VCadena.length-1; i >= 0; i--) {
			Cadena += VCadena[i] + " ";
		}
		
		System.out.println(Cadena.strip());
		
		Kb.close();
		
	}

}
