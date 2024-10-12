package Questions;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe uma string: ");
		String string = sc.nextLine();

		 int letrasA = contaLetrasA(string);

	        if (letrasA > 0) {
	            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + letrasA + " vez(es) na string.");
	        } else {
	            System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece na string.");
	        }
		
		sc.close();
	}

	public static int contaLetrasA(String str) {
		int contadorDeA = 0;

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);

			if (a == 'a' || a == 'A') {
				contadorDeA++;
			}
		}
		return contadorDeA;
	}

}
