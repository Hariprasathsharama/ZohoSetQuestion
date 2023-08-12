package zohoremainingproblems;


public class FindMaxSubArray {
    public static void main(String[] args) {
            new FindMaxSubArray().init();
    }
    private void init(){
        int[] input={-2 ,-3, 4, -1, -2, 1, 5, -3};
        findElements(input);
    }
    private void findElements(int[] a){
        int sum=0,max=0,start=-1,ansStart=-1,end=-1;
        for (int i = 0; i < a.length; i++) {
            if (sum==0){
                start=i;
            }
            sum=sum+a[i];

            if(sum>max){
                max=sum;
                ansStart=start;
                end=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("The sum is:" + max);
        System.out.println("The elements are");
        for (int i = ansStart; i <=end ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}