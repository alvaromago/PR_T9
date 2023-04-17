package es.studium.recursividad;

import java.util.Scanner;

public class Recursividad1
{

	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		int n;
		int resultado;
		System.out.println("Dame el número entero a calcular su sumatorio:");
		n = t.nextInt();
		t.close();
		resultado = sumatorio(n);
		System.out.println(resultado);
	}

	public static int sumatorio(int n)
	{
		int r;
		// Caso base
		if(n == 1)
		{
			r = 1;
		}
		// Caso recursivo
		else
		{
			r = n + sumatorio(n-1);
		}
		return r;
	}
}
