package javapractice;

public class Class10 {

	public static void main(String[] args) {
		//Fibonnacci series
		
		int n1=0,n2=1, sum=0;
		
		System.out.println(n1+"  "+n2 );
		for(int i=2;i<=10;i++) 
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
	}

}
