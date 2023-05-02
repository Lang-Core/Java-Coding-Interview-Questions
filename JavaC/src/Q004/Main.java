package Q004;

public class Main {
    public static void main(String[] args) {
        String string = "happy";

        char duplicate = findDuplicate(string);
        System.out.println(duplicate);
    }

    public static char findDuplicate(String string) {
        char duplicate = '0';
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if(string.charAt(i) == string.charAt(j)) {
                    duplicate = string.charAt(i);
                    break;
                }
            }
        }
        return duplicate;
    }
}
