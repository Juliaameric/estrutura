package exemplo.aula.quarta;

import java.util.Scanner;

public class Impares00 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int impar=0;
		int valor;
		System.out.println("informe um intervalo de valores: ");
		valor= ler.nextInt();
		
		while (impar <= valor) {
			impar++;
			if (impar%2 ==1)
				System.out.println("os numeros impares são: "+impar);
			ler.close();
		}
	}

}
