package zohoset14;

public class Rotate2dMatrix {
    public static void main(String[] args) {
        Rotate2dMatrix rotate2dMatrix=new Rotate2dMatrix();
        rotate2dMatrix.init();
    }
    private void init(){
        int[][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(arr);
    }
    private void rotate(int[][] a){
        int n=a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[0].length; j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length/2; j++) {
                int temp=a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1]=temp;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

}
