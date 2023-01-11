package zohoset17;
import  java.util.*;
public class NumberOccurrences {
    public static void main(String args[]){
        NumberOccurrences nofOcc=new NumberOccurrences();
        nofOcc.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        frequency(a);
    }
    private void frequency(int[] a){
        int n=a.length;
        int[] f=new int[n];
        for(int i=0;i<n;i++){
            f[i]=-1;
        }
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    f[j]=0;
                    count++;
                }
            }
            if (f[i]!=0){
                f[i]=count;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                    int temp2=f[i];
                    f[i]=f[j];
                    f[j]=temp2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (f[i]!=0){
                System.out.println(a[i]+"->"+f[i]);
            }
        }
    }
}
