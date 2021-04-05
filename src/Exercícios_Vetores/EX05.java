package Exercícios_Vetores;

import java.util.Scanner;

public class EX05 {
	
	//Menor e Posição
	//https://www.urionlinejudge.com.br/judge/pt/problems/view/1180

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int N = 0;
		int posicao = 0;
		int menor = 0;

		N = entrada.nextInt(); 
		int [] X = new int [N]; 

		for (int i = 0; i <X.length; i++)
		{
			X[i] = entrada.nextInt();
			menor = X[i];

		}
		
		for (int i = 0; i <X.length; i++)
		{
			if (X[i] < menor)
			{
				menor = X[i];
				posicao = i;
			}
		}
		System.out.println("Menor valor: " +menor+ "\n" + "Posicao: " +posicao);
	}

}
