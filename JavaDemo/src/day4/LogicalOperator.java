package day4;

public class LogicalOperator {

	public static void main(String[] args) {
		//3.Logical Operator ...&&(and) ||(OR) !(not)
		   //Logical Operators are used only with boolean data types where as Relational operators are used between two variables of any data types

		boolean x= true;
		boolean y= false;

		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);

		boolean b1 =10>20;
		System.out.println(b1);

		boolean b2= 20>10;
		System.out.println(b2);

		System.out.println(b1 && b2);
		System.out.println(b1 || b2);

		System.out.println((10>20)&&(20>10)); //It is combination of Logical and Relational Operators




	}

}
