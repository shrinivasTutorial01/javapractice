package javapractice;

import java.util.Random;

public class Class5 {

	public static void main(String[] args) {
		// Generate random number
		
		Random rand= new Random();
		int rand_int=rand.nextInt(3);
		System.out.println(rand_int);

	}

}
