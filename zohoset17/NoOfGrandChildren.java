package zohoset17;
import java.util.*;
public class NoOfGrandChildren {
    public static void main(String[] args) {
        String[][] familyRelation = {
                {"Ram", "Syam"},
                {"Akil", "Syam"},
                {"Nikil", "Ram"},
                {"Subhash", "Ram"},
                {"Karthik", "Akil"}
        };
        System.out.println(family(familyRelation, "Syam"));
    }


    public static int family(String[][] familyRelation, String name) {
        int GrandChildren  = 0;
        List<String> children = new ArrayList<>();
        for (String[] strings : familyRelation) {
            if (name.equals(strings[1]))
                children.add(strings[0]);
        }
        for(String names : children) {
            for (String[] strings : familyRelation) {
                if (names.equals(strings[1]))
                    GrandChildren++;
            }
        }
        return GrandChildren;
    }
}

