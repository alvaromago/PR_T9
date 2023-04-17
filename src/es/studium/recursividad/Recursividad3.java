package es.studium.recursividad;

import java.util.Scanner;

public class Recursividad3
{

	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		int n;
		System.out.println("Dame un número:");
		n = t.nextInt();
		t.close();
		for(int i = 0; i <= n; i++)
		{
			System.out.println(fibonacci(i));
		}
	}
	
	public static int fibonacci(int n)
	{
		int resultado;
		if(n == 0)
		{
			resultado = 0;
		}
		else if(n == 1)
		{
			resultado = 1;
		}
		else
		{
			resultado = fibonacci(n-1) + fibonacci(n-2);
		}
		return resultado;
	}
}
