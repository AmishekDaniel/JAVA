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
        int[] arr3 = new int[arr2.length];
        for(int i=0;i<arr2.length;i++){
            int count = 1;
            for(int j=i+1; j<arr2.length;j++){
                if(arr2[i]==arr2[j]){
                    count++;
                    arr3[j]=-1;
                

                }
                if(arr3[i]!=-1){
                    arr3[i]=count;
                }
                
            }
        }
        for(int f=0; f<arr3.length; f++){
            if(arr3[f]>0){
                System.out.println(arr2[f]+ " Occurs "+ arr3[f] + " times");
            }
           

        }
     
    }
}
