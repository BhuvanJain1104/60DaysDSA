import java.util.Arrays;

public class reverseWord {
    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return String.join(" ", arr);
    }

    static void main(String[] args) {
        System.out.println("the sky is blue"
        );;
    }
}
