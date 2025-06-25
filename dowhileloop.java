import java.util.*;
class dowhileloop{
        Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n:");
		n=sc.nextInt(
	    int res=0,temp=n;
		while(n>0)
		{
			int rem=n%10;
			res=res+(rem*rem*rem);
			n=n/10;
		}
		if(temp==res){
			
		}
	