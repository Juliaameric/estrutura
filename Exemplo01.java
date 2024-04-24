package exemplo.aula.quarta;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int impar = 0, par = 0, num;
		
		for (int i = 1 ; i <= 10 ; i ++) {
			System.out.println("informe o" + i + " numero: ");
			num = ler.nextInt();
			if (num % 2==0)
				par = par +1 ;
			else
				impar = impar +1;
		}
		System.out.println("qnt de par :"+par);
		System.out.println("qnt de par :"+impar);
		ler.close();
		
		}

	}


