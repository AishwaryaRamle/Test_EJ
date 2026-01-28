package day5;

public class BreakSatetment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=10;i++)
		{
			if(i==5)  //i became 5 then loop gets break(i.e. exit from loop)
			{
				break; //after break any statement should not added
			}
			System.out.println(i);
		}
	}

}
