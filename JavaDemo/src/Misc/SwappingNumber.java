package Misc;

public class SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is"+b);
		
		int c=a;
		a=b;
		b=c;
		System.out.println();
		System.out.println("Value of a after swapping is "+a);
		System.out.println("Value of b after swapping is "+b);
		
		
		//using ternary operator
		
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is"+b);
		
		
		int x=(a<b)?10:20;
		int y=(a>b)?10:20;
		System.out.println("Value of a after swapping is "+x);
		System.out.println("Value of b after swapping is "+y);

	}

}
