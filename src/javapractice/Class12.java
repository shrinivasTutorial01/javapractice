package javapractice;

public class Class12 {

	public static void main(String[] args) {
		// Sum of digit in number
		
		int num=12584795;
		
		int sum=0;
		while(num>0) 
		{
		sum=sum+num%10;
		num=num/10;
		}
		System.out.println("sum of digit in number: "+sum);

	}

}
