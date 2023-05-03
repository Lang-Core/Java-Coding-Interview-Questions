package Q006;

public class Main {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String string = "happy";

        boolean status = findVowels(vowels, string);
        System.out.println(status);
    }

    public static boolean findVowels(char[] vowels, String string) {
        boolean isPresent = false;

        for (char vowel : vowels) {
            for (int i = 0; i < string.length(); i++) {
                if(vowel == string.charAt(i)) {
                    isPresent = true;
                }
            }
        }
        return isPresent;
    }
}
