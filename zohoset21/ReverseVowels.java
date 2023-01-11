package zohoset21;

import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        ReverseVowels reverseVowels=new ReverseVowels();
        reverseVowels.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String result=modify(s);
        System.out.println(result);
    }
      private  String modify (String s)
        {
            // your code here
            char[] ch=s.toCharArray();
            int i=0,j=ch.length-1;
            while(i<j){
                if(!isVowel(ch[i])){
                    i++;
                }
                if(!isVowel(ch[j])){
                    j--;
                }
                if(isVowel(ch[i]) && isVowel(ch[j])){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                    i++;
                    j--;
                }
            }
            String res=new String(ch);
            return res;

        }
        private boolean isVowel(char c){
            if(c=='a'||c=='o'||c=='i'||c=='e'||c=='u')return true;
            return false;
        }

    }
