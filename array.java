import java.util.Scanner;

public class array{
    public static void main (String[] args){


        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("Enter the input numbers : ");
            a[i] = scanner.nextInt();

        }

        for(int i=0; i<10; i++){
            System.out.print(  "["+ a[i] + "]");
            

        }


      

    
        
        }
    }
