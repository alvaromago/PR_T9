package es.studium.recursividad;

import java.util.Scanner;

public class Recursividad4
{

	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		int n;
		System.out.println("Dame el valor de n:");
		n = t.nextInt();
		t.close();
		sucesion(n-1);
	}
	
	public static void sucesion(int n)
	{
		if(n == 0)
		{
			System.out.println((float)3/2);
		}
		else
		{
			sucesion(n-1);
			System.out.println((float)(n+3)/(float)2);
		}
	}
}
