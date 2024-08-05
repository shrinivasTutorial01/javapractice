package javapractice;

public class Class2 {

	public static void main(String[] args) {
		//Even or odd numbers from array
		int a[]= {6,1,5,9,7,3,8};
		
		System.out.println("Even numbers are:");
		
		for(int i=0;i<a.length;i++) 
		{
		 if(a[i]%2==0) 
		 {
			 System.out.println(a[i]);
		 }	
		}
		System.out.println("Odd numbers are:");
		for(int i=0;i<a.length;i++) 
		{
		 if(a[i]%2!=0) 
		 {
			 System.out.println(a[i]);
		 }	
		}
		

	}
	}
