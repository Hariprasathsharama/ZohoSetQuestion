package zohoset6;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        RotateMatrix rotateMatrix=new RotateMatrix();
        rotateMatrix.init();
    }
    private void init(){
        int[][] a={
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13,14,15,16}
        };
        rotate(a);
        System.out.println("Rotated");
        display(a);
    }
    private void rotate(int[][] a){
        int n=a.length;
        int iteration=0;
        int row=a.length;
        int col=a[0].length;
        while (iteration<n/2){
            int first=a[iteration][iteration];
            for (int i = iteration; i < row - 1 - iteration; i++) {
                a[i][iteration]=a[i+1][iteration];
            }
            for (int i = iteration; i < col-1-iteration; i++) {
                a[col-1-iteration][i]=a[col-1-iteration][i+1];
            }
            for (int i = row-1-iteration; i >iteration; i--) {
                a[i][col - 1 - iteration] = a[i - 1][col - 1 - iteration];
            }
            for (int i = col-1-iteration; i >iteration+1; i--) {
                a[iteration][i]=a[iteration][i-1];
            }
            a[iteration][iteration+1]=first;
            iteration++;
        }
    }
    private void display(int[][] a){
            for(int[] i :a) System.out.print(Arrays.toString(i));
    }
}
