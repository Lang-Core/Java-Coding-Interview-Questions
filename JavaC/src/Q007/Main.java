package Q007;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {5, 3, 4, 2, 8};
        int smallest = findSmallest(list);
        System.out.println(smallest);
        int largest = findLargest(list);
        System.out.println(largest);
    }

    public static int findSmallest(int[] list) {
        Arrays.sort(list);
        return list[0];
    }

    public static int findLargest(int[] list) {
        Arrays.sort(list);
        return list[list.length - 1];
    }
}
