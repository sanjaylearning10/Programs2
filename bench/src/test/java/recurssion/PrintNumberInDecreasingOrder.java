package recurssion;

import java.util.Scanner;

public class PrintNumberInDecreasingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		//printDecreasingOrder(num);
		printWithZeroDecreasingOrder(num);
		sc.close();
		

	}
	public static void printDecreasingOrder(int n)
	{
		if(n==1)
		{
			System.out.println(n);
			return ;
		}
		System.out.println(n);
		printDecreasingOrder(n-1);
	}
	public static void printWithZeroDecreasingOrder(int n)
	{
		if(n==0)
		{
			return ;
		}
		System.out.println(n);
		printDecreasingOrder(n-1);
	}
	

}
