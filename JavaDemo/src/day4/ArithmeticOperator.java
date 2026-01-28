package day4;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Arithmetic Operator ----> + - * / %
				int a=20, b=10;
				System.out.println("Sum of a nd b is:"+(a+b)); //1st return value of (a+b) and then concatenate with string
				System.out.println("Division of a nd b is:"+(a-b));
				System.out.println("Multiplication of a nd b is:"+(a*b));
				System.out.println("Division of a nd b is:"+(a/b));  //Return Quotient
				System.out.println("Modulo of a nd b is:"+(a%b));    //Return Remainder
				
				
				//OR
				
		int result	= a+b; //store result in another variable
		System.out.println("Sum of a and b is:"+ result);
	}

}
