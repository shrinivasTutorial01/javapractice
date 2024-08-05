package javapractice;

import java.util.Arrays;

public class Class1 {

	public static void main(String[] args) {
		// check two arrays are equal or not

		int a1[] = { 10, 50, 40, 30, 80, 90 };
		int a2[] = { 20, 50, 60, 780, 80 };
		boolean status = Arrays.equals(a1, a2);
         if(status==true)
         {
        	 System.out.println("Arrays are equals");
         }
         else 
         {
        	 System.out.println("Arrays are not equals");
         }
	}

}
