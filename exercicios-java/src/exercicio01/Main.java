package exercicio01;

//import
import java.util.Scanner;

//main
public class Main {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número: ");
			int valor1 = entrada.nextInt();
			System.out.println("Digite o segundo número: ");
			int valor2 = entrada.nextInt();
			System.out.println("Os números ímpares do intervalo são: ");

			for (int i = valor1; i <= valor2; i++) {
				if (i % 2 != 0) {
					System.out.print( i + " ");
				}
			}
		}
	}
}