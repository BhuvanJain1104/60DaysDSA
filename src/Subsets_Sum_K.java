import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Subsets_Sum_K {

    public static int findWays(int[] nums, int tar) {

        HashMap<List<Integer>, Integer> outer = new HashMap<>();

        int count = 0;

        outer.put(new ArrayList<>(), 0);

        for (int num : nums) {
            List<Integer> sums = new ArrayList<>();

            sums.add(0);
            int n = outer.size();

            List<List<Integer>> subsets =
                    new ArrayList<>(outer.keySet());

            for (int i = 0; i < n; i++) {

                List<Integer> internal =
                        new ArrayList<>(subsets.get(i));

                internal.add(num);

                int sum = outer.get(subsets.get(i)) + num;

                outer.put(internal, sum);

                if (sum == tar) {
                    count++;
                }
            }
        }

        return count;
    }
}
