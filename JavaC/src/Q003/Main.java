package Q003;

public class Main {
    public static void main(String[] args) {
        String string = "car";

        boolean unique = unique(string);
        System.out.println(unique);
    }

    public static boolean unique(String string) {
        boolean isUnique = true;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                isUnique = string.charAt(i) != string.charAt(j) && isUnique;
            }
        }
        return isUnique;
    }
}
