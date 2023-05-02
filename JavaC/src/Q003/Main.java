package Q003;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String string = "carr";

        //boolean unique = uniqueOne(string);
        //System.out.println(unique);
        boolean unique = uniqueTwo(string);
        System.out.println(unique);
    }

    public static boolean uniqueOne(String string) {
        boolean isUnique = true;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                isUnique = string.charAt(i) != string.charAt(j) && isUnique;
            }
        }
        return isUnique;
    }

    public static boolean uniqueTwo(String string) {
        char[] array = string.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : array) {
            set.add(c);
        }
        return array.length == set.size();
    }
}
