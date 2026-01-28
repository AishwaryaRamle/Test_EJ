package day5;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dig=12345;
		int sum=0;
		while(dig>0)     // OR  while(dig !=0)
		{
			sum=sum+dig%10; //get last digit
			dig=dig/10;     //remove last digit
			
		}
		System.out.println(sum);
	}

}
