package day4;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		
		//4.Increment and Decrement Operator ++ --
		
		//case1:

		int a1=1;
		System.out.println(a1);

		a1=a1+10; //normal operation(Increase existing value)
		System.out.println("Value of a1 is "+ a1);

		//OR
		a1++; //it is similar to a1= a1+1
		System.out.println(a1);  

		//In Post Increment , first assignment happen after that increment happen
		//In Pre Increment , first increment happen after that assignment happen.
		
		
		
		
		//case2: -->Post Increment , In Post increment first value is assigned then increment happens

		int ai=10;
		int result_n= ai++;
		System.out.println(result_n); // result will be 10
		// in post increment operation , increment happens, but only value is stored in variable(i.e 10) then increment happen(i.e. 11)
		
		System.out.println(ai); //here output is 11  ..this line is printed to check increment happen or not.
		
		
		
		
		//case3:  ---->Pre increment Operator
		
		int bi=20;
		int result_b = ++bi;
		System.out.println(result_b);
		System.out.println(bi);
		
		
		//Decrement Operator
		
		//case:4
		int x= 100;
		x=x-1;
		System.out.println("value of x after decrementing value of x is:"+x);
		
		//OR
		x--;
		System.out.println("value of x after decrementing value of x  through post decrement operator is:"+x);
		
	
		//case:5
		
		int y=20;
		int res_y= y--;
		System.out.println(res_y); //op will be 20 as a is assigned value 100 first and stored in variable , then decrement happen
		//y--; 
		System.out.println(y); // op will be 18 if 65 is uncomment as decrement has happened twice
		
		
		
		
		//case:6
		
		int z=100;
		int res_z=--z;
		System.out.println(res_z); 
		System.out.println(z);
		}

}
