import java.util.*;
class operator
{
public static void main (String args[]){
	
	String operation;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter what operation what do you want to do:");
	operation=sc.next();
	operator obj=new operator();
	if(operation=="add"){
		obj.add();
		}
	else if(operation=="sub"){
		obj.sub();
	}
	else if(operation=="mul"){
		obj.mul();
	}
	
	else if(operation=="div"){
		obj.div();
		
		
	}
	else if(operation=="mod"){
		obj.mod();
		
	}
	
	
}
public void add(){
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the value of a is:");
	a=sc.nextInt();
	System.out.println("Enter the value of b is:");
	b=sc.nextInt();
	c=a+b;
	System.out.println("Result" +c);
	
	
}
public void sub(){
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the value of a is:");
	a=sc.nextInt();
	System.out.println("Enter the value of b is:");
	b=sc.nextInt();
	c=a-b;
	System.out.println("Result" +c);
	
	}
public void mul(){
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the value of a is:");
	a=sc.nextInt();
	System.out.println("Enter the value of b is:");
	b=sc.nextInt();
	c=a*b;
	System.out.println("Result" +c);
	
	}
public void div(){
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the value of a is:");
	a=sc.nextInt();
	System.out.println("Enter the value of b is:");
	b=sc.nextInt();
	c=a/b;
	System.out.println("Result" +c);
	
	}

public void mod(){
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the value of a is:");
	a=sc.nextInt();
	System.out.println("Enter the value of b is:");
	b=sc.nextInt();
	c=a%b;
	System.out.println("Result" +c);}

} 