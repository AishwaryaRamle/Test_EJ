package controlstatements;

public class Largestof3Number {
	/*
	 * a>b and a>c ---->a is largest
	 * b>a and b>c -----> b is largest
	 * c>a and c>b ----->c is largest
	 */

	public static void main(String[] args) {
		int a=10, b=20, c=30;
		if(a>b && a>c)  
			
		//If condition can have one expression or multiple expressions
		{
			System.out.println("a is greater");
		}
		else if (b<a && b>c)
		{
			System.out.println("b is greater");
		}
		else  // Here condition not needed, if above two conditions are false by default third condition is true
		{
			System.out.println("c is grearter");
		}
			
		

	}

}
