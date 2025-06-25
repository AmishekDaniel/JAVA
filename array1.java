public class array1 {
    public static void main(String[] args){
         int[] arr0 =  {3,5,6,7,7,0,8,4};
         int[] arr1 = new int[8];
         for(int i=0; i<arr0.length; i++){
            arr1[i] = arr0[i];
 
         }
         for (int j = 0; j < arr0.length; j++) {
             System.out.print(arr0[j] + " ");
         }
         System.out.println(" ");

          for( int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
          }
          System.out.println(" ");

          array1 arr = new array1();
          arr.duplicates();


          
    }
    public void duplicates() {

        int[] arr2 = { 3, 5, 6, 7, 7, 0, 7, 4 };
        for (int j = 0; j < arr2.length; j++) {
            for(int i = j+1; i< arr2.length; i++){

                if(arr2[i] == arr2[j]){
                    System.out.println("duplicate is found at " + i);
                }

            }
            
        }
        
    }
}
