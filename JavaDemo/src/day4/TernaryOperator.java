package day4;

public class TernaryOperator {

	public static void main(String[] args) {
		//6. Conditional/Ternary Operator
		
	//	var= exp ? result1:result2
		
		int a=200, b=100;
		
		int result=(a>b)?a:b; //If expression is true a value will return or if expression is false b value will return
		System.out.println(result);
		
		
		int res=(a<b)?a:b;
		System.out.println(res); //here o/p will be 100 as expression is false
		
		
		int x=(1==1)?100:200;
		System.out.println(x);//here 1 is equal to 1  and its true so output will be 100
		
		
		int x1=(1==2)?100:200;
		System.out.println(x1);//here 1 is not equal to 1  and its true so output will be 200
		
		int person_age=15;
		String  age=(person_age>18)?"Eligible":"Non_Eligible";
		System.out.println(age);
	}

}
