package day5;

public class WhileLoopWithoutCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int i=1;
		
		while(true)  //without making condition false exiting while loop using break statement
		{
			System.out.println("Hello");
			i++;
			if(i==10)
			{
				break;
			}
		}
		
		
		/*
		 * 
		 * bike----source,destination,fuel ---for loop
		 * bus-----do while  (e.g. get into bus then buy ticket)
		 * flight ---while  (satisfied condition first i.e. buy ticket first then statement get execute 
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
