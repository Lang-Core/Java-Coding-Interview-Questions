package Q008;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        separateOddEven(numbers);
    }

    public static void separateOddEven(int[] numbers) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if(i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
    }
}
