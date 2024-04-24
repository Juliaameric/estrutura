package exemplo.aula.quarta;

import java.util.Scanner;

public class Atv03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int number, i=1, impar=0, par=0, soma=0;
		while (i<=10) {
			i++;
			System.out.println("informe um numero:");
			number= ler.nextInt();
			soma=soma+number;
			
			if (number % 2 == 0) {
			par=par+1;
		}
			else 
		impar=impar+1;
	}
		 
		
		System.out.println(" a soma dos numeros é: "+soma);
		System.out.println("tem "+impar+"numeros impares");
		System.out.println("tem "+par+"numeros pares");
		ler.close();
	}

}
