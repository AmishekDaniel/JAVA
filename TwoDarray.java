public class TwoDarray {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,3},{4,5,6,6},{7,8,9,9},{7,8,9,9}};
        int[][] b = new int[4][4];
        for(int i=0;i<a.length;i++){

            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+" ");
                b[i][j] = a[j][i];
            }
            System.out.println(" ");
        }
        System.out.println("================");
        System.out.println("after transpose ");
        System.out.println("================");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
