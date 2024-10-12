package Questions;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("informe um numero: ");
		int numero = sc.nextInt();

		if (pertenceFibonacci(numero)) {
			System.out.println("Pertence a sequencia");
		} else {
			System.out.println("Nao pertence a sequencia");
		}

		sc.close();

	}

	public static boolean pertenceFibonacci(int num) {

		if (num == 0) return true;
		
		int anterior = 0;
		int atual = 1;

		int proximoNumero = anterior + atual;
		// gerar a sequencia de fibonacci até o numero informado
		while (proximoNumero <= num) {

			if (proximoNumero == num)
				return true;

			anterior = atual;
			atual = proximoNumero;
			proximoNumero = anterior + atual;

		}

		return false;
	}

}
