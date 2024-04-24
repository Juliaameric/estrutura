package exemplo.aula.quarta;

import java.util.Scanner;

public class Exemplo02precond {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.println("digite um numerio: ");
		numero = ler.nextInt();
		while (numero % 2 != 0) {
			System.out.println("o numero digitado ñ é par, digite novamente..");
			numero=ler.nextInt();
		}
		System.out.println("o numero "+numero+"é par");
		ler.close();
	}

}
