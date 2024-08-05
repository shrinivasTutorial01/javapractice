package javapractice;

public class Class3 {

	public static void main(String[] args) {
		// Sum of element in array
		
		int a[]= {10,20,50,60,30,40};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
		 sum=sum+a[i];
		}
		System.out.println("Sum of elements in array are:"+ sum);
		
	}

}
