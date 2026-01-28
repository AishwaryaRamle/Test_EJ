package day5;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * for(initialization;condition;inc/dec)
 * {
 * statements;
 * }
 * 

		
	//Example1:    1....10 numbers
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		} 
		
	//Example2:    1...10 even number
		for(int i=2;i<=10;i+=2)
		{
			System.out.println(i);
		}
		
   //Example3: odd even
		for (int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" "+"Even");
			}
			else
			{
				System.out.println(i+" "+"Odd");
			}*/
		
		
		//Example 4:  10.....1 desc
		
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}
				
			
		}
			
	}


/*
 * Which loop is prefered to use
 * --------------------------------
 * If you know the number of iterations in advance,the for loop is often the most suitable.
 * If you want to execute the loop at least once,the do-while loop is appropriate.
 * If you are uncertain about the number of iterations and the loop termination is based on a condition,
 * the while loop is a good choice.
 * 
 * 
 */

