import java.util.*;
class operators
{
	int input;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of input:");
	input=sc.nextInt();
	 int a,b,c;
	    System.out.println("Enter the value of a is:");
	    a=sc.nextInt();
	    System.out.println("Enter the value of b is:");
	    b=sc.nextInt();
	switch(input)
	{
		case 1:	   
	    c=a+b;
	    System.out.println("ADD" +c);
		break;
		
		case 2:
	    c=a-b;
	    System.out.println("Result" +c);
		break;
		
		case 3:
			
	c=a*b;
	System.out.println("Result" +c);
		break;
		
		case 4:
	
	c=a*b;
	System.out.println("Result" +c);
		break;
		
		case 5:
	
	c=a%b;
	System.out.println("Result" +c);
		break;
		
		case 6:
		break;
	 
	}
}