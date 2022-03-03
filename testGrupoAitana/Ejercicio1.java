package testGrupoAitana;

public class Ejercicio1 {

	public static void main(String[] args) {
		for (int i = 100; i >= 1; i--) {
			if (i%7==0 && i%2==0) {
				System.out.println("AB");
			}else if(i%7==0) {
				System.out.println("A");
			}else if(i%2==0) {
				System.out.println("B");
			}else {
				System.out.println(i);
			}
		}

	}

}
