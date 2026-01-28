package day5;

public class WhileVsDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=1;
		
	/*	while(i<=5)
		{
			System.out.println(i);
			i++;
		}*/
		
		do   //in do while loop statements will execute atleast once
		{
			System.out.println(i);
			i++;
		}while(i<=5);
	}

}
