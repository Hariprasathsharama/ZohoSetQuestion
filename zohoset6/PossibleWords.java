package zohoset6;
import java.util.*;
public class PossibleWords {
    public static void main(String args[]){
        PossibleWords possibleWords=new PossibleWords();
        possibleWords.init();
    }
    private void init(){
        Scanner in=new Scanner(System.in);
        String str=in.next();
        find(str,"");
    }
    private void find(String num,String res){
        if (num.length()==0){
            System.out.println(res);
            return;
        }
        int n=(int)(num.charAt(0)-'1')+1;
        find(num.substring(1),res+((char)('A'+n-1)));

        if (num.length()>=2){
            int no=Integer.parseInt(num.substring(0,2));
            find(num.substring(2),res+((char)('A'+no-1)));
        }
    }
}
