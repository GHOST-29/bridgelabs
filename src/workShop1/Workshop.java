package workShop1;

import java.util.Scanner;

public class Workshop {
	public static void Swapnum(int x,int y) {
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping = " +x+ " "  +y);
	}
	public static void addition(int a, int b)
	{
		System.out.println("addition of 2 numbers are = "+(a+b));
	}
	public static void main(String[] args) 
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		x = sc.nextInt();
		System.out.println("Enter second Number");
		y = sc.nextInt();
		System.out.println("before swapping = " +x+ " "  +y);
		Swapnum(x,y);	
		addition(x,y);
		
	}
}
