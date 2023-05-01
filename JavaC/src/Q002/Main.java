package Q002;

public class Main {
    public static void main(String[] args) {
        String stringOne = "heart";
        String stringTwo = "earth";

        boolean isAnagram = anagramOne(stringOne, stringTwo);
        System.out.println(isAnagram);
    }

    public static boolean anagramOne(String stringOne, String stringTwo) {
        boolean isAnagram = false;
        if(stringOne.length() == stringTwo.length()) {
            for (int i = 0; i < stringOne.length(); i++) {
                stringTwo = stringTwo.replace(String.valueOf(stringOne.charAt(i)), "");
            }
            isAnagram = stringTwo.isEmpty();
        }
        return isAnagram;
    }
}
