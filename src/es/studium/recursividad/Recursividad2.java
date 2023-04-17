package es.studium.recursividad;

import java.util.Scanner;

public class Recursividad2
{

	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		int n;
		int resultado;
		System.out.println("Dame el número entero a calcular su factorial:");
		n = t.nextInt();
		t.close();
		resultado = factorial(n);
		System.out.println(resultado);
	}

	public static int factorial(int n)
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
			r = n * factorial(n-1);
		}
		return r;
	}
}
