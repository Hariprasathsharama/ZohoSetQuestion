package zohoremainingproblems;

import java.util.HashSet;
import java.util.Set;

public class Search2dArray {
    public static void main(String[] args) {
            new Search2dArray().init();
    }

    private void init() {
        char[][] ch = {{'a', 'z', 'o', 'l'},
                {'n', 'x', 'h', 'o'},
                {'v', 'y', 'i', 'v'},
                {'o', 'r', 's', 'e'}
        };
        Set<String> Dictionary = new HashSet<>();
        Dictionary.add("van");
        Dictionary.add("zoho");
        Dictionary.add("are");
        Dictionary.add("is");
        Dictionary.add("love");
        findWords(ch, Dictionary);
    }

    private void findWords(char[][] ch, Set<String> Dictionary) {
        int row = ch.length;
        int col = ch[0].length;
        for (String word : Dictionary) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (foundInMatrix(ch, word, i, j, 0)) {
                        System.out.println(word);
                        break;
                    }
                }
            }
        }
    }

    private boolean foundInMatrix(char[][] ch, String words, int row, int col, int index) {
        if (index == words.length()) {
            return true;
        }
        if (row < 0 || row >= ch.length || col < 0 || col >= ch[0].length || ch[row][col] != words.charAt(index)) {
            return false;
        }
        return foundInMatrix(ch,words,row+1,col,index+1) || foundInMatrix(ch,words,row,col+1,index+1);
    }
}