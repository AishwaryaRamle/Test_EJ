package day3;

public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Data type represent type of data store in variable
		//Types of Data types
		//1.Premitive Data type.
		//Non-Premitive Data type1
		
		//Numeric Data type
		
		//int Data type --->is of 4 byte and store number from -32768 to 32767
		
		System.out.println("INTEGER DATAYPE");
		int a=100 ,b=200;
		System.out.println(a);
		//OR
		System.out.println("The value of a is :"+ a);
		
		System.out.println(b);
		//OR
		System.out.println("The value of b is :"+ b);
		System.out.println(a+b);
		System.out.println("The Sum of a and b is:"+(a+b)); //300
		System.out.println("The Sum of :"+a+b); //will print 100200 because it consider whole statement as String
		//as String is getting Concatenate with two + Symbol.
		
		
		
		//Byte Data type --->is of 1 byte and store number from -128 to 127
		System.out.println("\nBYTE DATAYPE");
		
		byte by=125;
		System.out.println(by);
		
		//Short Data type --->is of 2 byte and store number from 
		System.out.println("\nSHORT DATAYPE");
		
		short sh=3535;
		System.out.println(sh);

		//Long Data type --->is of 8 byte and store number from -922...5808 to 9223....5807
		System.out.println("\nLONG DATAYPE");
		
		long l= 1234567789L;  //need to add Literal in end of value
		System.out.println(l);
		
		
		//Decimal Number---Float and double
		//Float Data type --->is of 4 byte and store fraction number up to 7 decimal digits
		
		System.out.println("\nFLOAT DATATYPE");
		float item_price =15.5f;      //need to add literal or will show error
		System.out.println(item_price);
		
		
		//Double Data type---->is of 8 byte store fraction number upto 15 decimal digits
		System.out.println("\nDOUBLE DATAYPE");
		
		double db1= 12.4343412  ; //for double don't need to add literal
		
		System.out.println(db1);
		
		//char Data type
		System.out.println("\nCHAR DATAYPE");
		char grad='A';
		System.out.println(grad);
		
		
		//String Data type
		System.out.println("\nSTRING DATAYPE");
		 String str ="John";
		 System.out.println(str);
		 
		 //char ch='ABC'; //invalid... char store only one character;
		// String ch='ABC'; //invalid....because of single quotation;
		// String ch='A'; //invalid....store in single quotation;
		String ch="A"; //valid
		
		System.out.println(); //extra line
		System.out.println(ch);
		
		//Boolean Data type
		
		boolean b1= false; //allow only true or false
		System.out.println(b1);
		
		//boolean b1="true"; //invalid --->store in double quotation.
		//boolean b1="false"; // not valid
		
		//String b1=true; //Not valid -->No quotation declared
		String s1= "true"; //valid
		System.out.println();
		System.out.println(s1);
	}

}
