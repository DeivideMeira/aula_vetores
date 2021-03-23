package Vetores;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Digitar o maior e menor antes de ordem e sua posição
		//Ordenar em ordem crescente dentro do vetor
		
		
		Scanner entrada = new Scanner (System.in);

		int maior=0;
		int menor=2^60;
		int i;
		int posicao=0;
		
		int x[] = new int[3];
		
		for (i=0; i < x.length; i++)
		{
			x[i] = entrada.nextInt(); //alimenta o vetor
		}
		
		for(i=0; i<x.length; i++)
		{
			if (x[i] < menor)
			{
				menor = x[i];
				posicao = i;
			}
			if (x[i] > maior)
			{
				maior = x[i];
				posicao = i;
			}
		}
		System.out.println("maior = "+maior+" na posição x["+i+"]");
	}

}
