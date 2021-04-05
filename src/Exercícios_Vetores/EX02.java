package Exercícios_Vetores;

import java.util.Scanner;

public class EX02 {
	
	//Seleção em Vetor I
	//https://www.urionlinejudge.com.br/judge/pt/problems/view/1173 

	public static void main(String[] args) {

		float [] A = new float [100]; 
		Scanner entrada = new Scanner (System.in);
			
		for (int i=0; i < A.length; i++)
		{
			A[i] = entrada.nextInt(); 
		}
		
		for (int i=0; i< A.length; i++)
		{
			if (A[i] <= 10)
			{
				System.out.println("A["+i+"]= " + A[i]);
			}
		}
		
	}

}
