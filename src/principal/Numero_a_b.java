package principal;
import java.util.Scanner;

public class Numero_a_b {
	
	/*
	 el programa pide dos números y los compara diciendo 
	 cual de ellos es mayor o menor o iguales
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creamos un objeto para leer del teclado
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int a = scanner.nextInt();
		
		System.out.println("Introduce otro numero");
		int b = scanner.nextInt();

		

		if (a > b) {
			System.out.println("a mayor que b");
		} else{

			if (a < b) {
			System.out.println("b mayor que a");
			} else {
			System.out.println("a igual que b");

			}
			}
	}

}
