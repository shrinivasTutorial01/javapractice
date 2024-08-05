package javapractice;

import java.util.Scanner;

public class Class11 {

	public static void main(String[] args) {
		// largest of 3 numbers
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter first number");
		int a=sc.nextInt();
		System.out.println("Enter Second Numnber");
		int b=sc.nextInt();
		System.out.println("Enter third number");

		int c=sc.nextInt();
		if(a>b && b>c) 
		{
			System.out.println(a+"is largest number");
		}
		else if(a>b && b>c) 
		{
			System.out.println(b+"is largest number");
		}
		else 
		{
			System.out.println(c+"is largets number");
		}
	}

}
