import java.util.*;
class prime
{
        Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n:");
		n=sc.nextInt(
	    for(int i=2;i<=n;i++)
		{
			for(int j=2; j<=n;j++){
				if( j%i==0 && i==j){
					System.out.println(j+"is a prime number");
				}
				
			}
		}
}

/*Two Dimensional Array:
     The Array with more than one dimensional is knowns as two dimesntional array
	 In a