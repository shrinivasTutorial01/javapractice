package javapractice;

import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		//Palindrome number or not
		System.out.println("Eneter a number");
		Scanner sc= new Scanner(System.in);
	    int num=sc.nextInt();
	    
	    int Org_num=num;
	    int rev=0;
	    
	    while(num!=0) 
	    {
	    	rev=rev*10+num%10;
	    	num=num/10;
	    }
	    if(Org_num==rev) 
	    {
	    	System.out.println("This is palindrome number");
	    }
	    else 
	    {
	    	System.out.println("This is not palindrome number");
	    }

	}

}
