package exemplo.aula.quarta;

import java.util.Scanner;

public class Atv02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1;
		int numero=1;
		int soma=0;
		while (i <=5) {
			i++;
			System.out.println("insira um numero: ");
			numero = ler.nextInt();
			soma=soma+numero;
		}
		double media=soma/5;
		System.out.println("a soma dos valores é: "+soma );
		System.out.println("a media dos valores é: "+media );
		ler.close();
	}

}
