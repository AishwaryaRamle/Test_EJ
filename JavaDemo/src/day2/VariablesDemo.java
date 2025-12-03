package day2;

public class VariablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a; //Declaration
		a=100; // assignment
		
		int b=100; //Declaration+Assignment
		System.out.println(a);// print value 100
		System.out.println("a");// print value as a because it is double quote
		
		a=200;
		System.out.println(a); //print value 200 because again a is assigned as 200
		
		
		//Approach:1   If all the variables belong to different data types
		int a1= 100;
		int b1= 200;
		int c1=300;
		//
		//Approach:2  This approach is valid if all variables are of same data types
		int x,y,z;
		x=100;
		y=200;
		z=300;
		
		//Approach :3 If all the variables belongs to same data types
		
		int x1=200, y1= 300, z1=400;
		
		
		System.out.println("The value of a is"+a);
		System.out.println("The value of b is"+b);
		System.out.println("The value of c1 is"+c1);
		
		//To Print value in Single Line
		
		System.out.println(x + y+ z); //gives result of addition(i.e. 900) so need to separate with space
		System.out.println(x +" "+y+" "+z); //this will Print value in Single Line
		
		 
	}

}
