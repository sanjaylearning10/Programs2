package recurssion;

import java.util.Scanner;

public class PrintNumberInIncreasingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		printIncreasingOrder(num);
		

	}
	public static void printIncreasingOrder(int n)
	{
		if(n==1)
		{
			System.out.println(n);
			return ;
		}
		printIncreasingOrder(n-1);
		System.out.println(n);
		
	}
	public static void printWithZeroIncreasingOrder(int n)
	{
		if(n==0)
		{
			return ;
		}
		printIncreasingOrder(n-1);
		System.out.println(n);
		
	}

}
