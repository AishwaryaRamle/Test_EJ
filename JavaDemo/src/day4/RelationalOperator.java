package day4;

public class RelationalOperator {

	public static void main(String[] args) {
		int a=10 ,b=20;
		//2.Relational/Comparison Operator ----> > >= < <= ! != ==    
		//returns boolean value either true or false
		//Relation Operator Compare two values and return a boolean value either true or false
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a>=b); //Here are two comparison ...if a is greater than b 
	//expression  will be true  if a is greater than b and other is a is equal to b

	System.out.println(a<=b);

	b=20;   // to change value of b don't need to specify data type again

	System.out.println(a<=b);
	System.out.println(a>=10);
	System.out.println(a!=b);
	System.out.println(a==b);

	boolean res= a>b;
	System.out.println(res);


	}

}
