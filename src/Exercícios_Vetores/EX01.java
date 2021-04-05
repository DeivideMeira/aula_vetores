package Exercícios_Vetores;

import java.util.Scanner;

public class EX01 {
	
	//Preenchimento de Vetor I

	//https://www.urionlinejudge.com.br/judge/pt/problems/view/1173 

	public static void main(String[] args) {

		int[] N = new int [4]; 
		int x;
		Scanner entrada = new Scanner (System.in);
		
		x = entrada.nextInt();

		if (x<=50)
		{
			for(int i = 0; i<N.length; i++)
			{
				System.out.println("N["+i+"]= " + x);
				x = x * 2;
			}

		}

	}

}
