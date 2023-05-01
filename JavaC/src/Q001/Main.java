package Q001;

public class Main {
    public static void main(String[] args) {
        String string = "hello World";

        //String reversed = reverseOne(string);
        //System.out.println(reversed);

        String reversed = reversedTwo(string);
        System.out.println(reversed);
    }

    public static String reverseOne(String string) {
        String reversed = "";
        for (int i = string.length() -1; i >= 0 ; i--) {
            reversed = reversed + string.charAt(i);
        }
        return reversed;
    }

    public static String reversedTwo(String string) {
        return new StringBuilder(string).reverse().toString();
    }

}


