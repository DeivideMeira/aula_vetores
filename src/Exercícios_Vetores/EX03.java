package Exercícios_Vetores;

import java.util.Scanner;

public class EX03 {

	//Troca em Vetor I
	//https://www.urionlinejudge.com.br/judge/pt/problems/view/1175
	
	public static void main(String[] args) {

		int [] N = new int [20]; 
		int x = N.length;
		int i;

		Scanner entrada = new Scanner (System.in);
		
		for (i = (x-1); i >= (x/2); i--)
		{
			N[i] = entrada.nextInt(); 

		}
		
		for (i = (x/2-1); i >= 0; i--)
		{
			N[i] = entrada.nextInt(); 

		}
		
		
		for (i=0; i <x; i++)
		{
			System.out.println("N["+i+"]= " + N[i]);
		}
	}

}
