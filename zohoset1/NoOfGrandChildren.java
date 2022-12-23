package zohoset1;

import java.util.HashMap;
import java.util.Map;

public class NoOfGrandChildren {
    public static void main(String[] args) {
        // Array of strings representing the parent-child relationships
        String[][] array = {{"luke", "shaw"}, {"wayne", "rooney"}, {"rooney", "ronaldo"}, {"shaw", "rooney"}};
        String name = "rooney";
        String child = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i][1].equals(name)) {
                child = array[i][0];
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][1].equals(child)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
