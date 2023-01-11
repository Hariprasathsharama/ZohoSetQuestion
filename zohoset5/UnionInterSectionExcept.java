package zohoset5;

import java.util.Arrays;

public class UnionInterSectionExcept {
    public static void main(String[] args) {
        UnionInterSectionExcept uie=new UnionInterSectionExcept();
        uie.init();
    }

    private void init() {
        int[] a = {1, 3, 4, 5, 6, 8, 9};
        int[] b = {1, 5, 8, 9, 2};
        union(a, b);
        interSection(a, b);
        except(a, b);
    }

    private void union(int[] a, int[] b) {
        int[] union = new int[a.length + b.length];
        int k = 0;
        for (int i :
                a) {
            if (contains(i, union)) {
                union[k++] = i;
            }

        }
        for (int i :
                b) {
            if (contains(i, union)) {
                union[k++] = i;
            }
        }
        System.out.print(Arrays.toString(union));
    }
        private void interSection(int[] a,int[] b){
            System.out.println("Intersection");
            outer:
            for(int i:a){
                for(int j:b){
                    if(i==j){
                        System.out.println(i+" ");
                        continue outer;
                    }
                }
            }
            System.out.println();
    }
    private void except(int[] a,int[] b){
        System.out.println("Except:");
        for(int i:a) if(i%2==1) System.out.print(i+" ");
        for(int i:b) if(i%2==0) System.out.println(i+" ");
    }
    private boolean contains(int a,int[] union){
        for (int i :
                union) {
            if (i==a)return false;
            return true;
        }
        return false;   
    }
}
