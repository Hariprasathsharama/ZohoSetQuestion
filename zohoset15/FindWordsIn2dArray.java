package zohoset15;

public class FindWordsIn2dArray {
    public static void main(String[] args) {
        FindWordsIn2dArray findWordsIn2dArray=new FindWordsIn2dArray();
        findWordsIn2dArray.init();
    }
    private void  init(){
        char[][] matrix={
                {'a','z','o','l'},
                {'n','x','h','o'},
                {'v','y','i','v'},
                {'o','r','s','e'}
        };
        String[] dictionary = {"van", "zoho", "love", "are", "is"};
        for (int i = 0; i <dictionary.length ; i++) {
            if (isPresentInMatrix(dictionary[i].toCharArray(),matrix)){
                System.out.println(dictionary[i]);
            }
        }
    }
    private boolean isPresentInMatrix(char[] ch,char[][] m){
        boolean flag=true;
        for (int i = 0; i < m.length; i++) {
            flag=true;
            for (int j = 0; j < m.length; j++) {
                if (m[i][j]==(ch[i])){
                    int row=i;
                    int col=j;
                    for (int k = 1; k <ch.length ; k++) {
                        if (col<m.length && m[row][col+1]==ch[k]){
                            col++;
                        }
                        if (row<m.length && m[row+1][col]==ch[k]  ){
                            row++;
                        }
                        else {
                            flag=false;
                        }
                    }
                }
            }
        }
        if (flag)return true;
        return false;
    }
}
