package Exercícios_Vetores;

import java.util.Scanner;

public class EX04 {
	
	
	//Preenchimento de Vetor III
	//https://www.urionlinejudge.com.br/judge/pt/problems/view/1178
	
	public static void main(String[] args) {
		
		
		int [] N = new int [5]; 
		double x=0;

		Scanner entrada = new Scanner (System.in);
		x = entrada.nextInt(); 

		for (int i = 0; i <N.length; i++)
		{
			System.out.println(String.format("N["+i+"]= %.4f", x));
			x = x/2;
		}

	}

}
