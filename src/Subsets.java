import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        helper(nums, 0, new ArrayList<>(), result);

        return result;
    }

    private void helper(int[] nums, int index,
                        List<Integer> current,
                        List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            current.add(nums[i]);

            helper(nums, i + 1, current, result);

            current.remove(current.size() - 1);
        }
    }
    public List<List<Integer>> subset(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

}
