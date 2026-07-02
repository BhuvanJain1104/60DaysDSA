import java.util.ArrayList;

public class Closest_Pair {

    static ArrayList<Integer> findClosestPair(int[] arr1, int[] arr2, int x) {

        int i = 0;
        int j = arr2.length - 1;

        int minDiff = Integer.MAX_VALUE;
        int a = 0, b = 0;

        while (i < arr1.length && j >= 0) {

            int sum = arr1[i] + arr2[j];
            int diff = Math.abs(sum - x);

            if (diff < minDiff) {
                minDiff = diff;
                a = arr1[i];
                b = arr2[j];
            }

            if (sum > x) {
                j--;   // decrease sum
            } else {
                i++;   // increase sum
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(b);

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40};
        int x = 32;

        ArrayList<Integer> ans = findClosestPair(arr1, arr2, x);

        System.out.println(ans);   // Output: [1, 30]
    }
}
