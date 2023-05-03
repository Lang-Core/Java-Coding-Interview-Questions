package Q005;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String stringOne = "abcdx";
        String stringTwo = "badcx";

        boolean status = permutationCheck(stringOne, stringTwo);
        System.out.println(status);
    }

    public static boolean permutationCheck(String stringOne, String stringTwo) {
        boolean isPermutation; //false

        String remove = stringTwo;
        char[] one = stringOne.toCharArray();
        for (char c : one) {
            remove = remove.replace(String.valueOf(c), "");
        }

        isPermutation = remove.length() == 0;

        return isPermutation;
    }
}
