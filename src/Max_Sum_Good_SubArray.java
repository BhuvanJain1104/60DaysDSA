import java.util.*;

public class Max_Sum_Good_SubArray {
    public long maximumSubarraySumGooD(int[] nums, int k) {//3026

        Map<Integer, Long> map = new HashMap<>();

        long prefix = 0;
        long ans = Long.MIN_VALUE;

        for (int x : nums) {

            if (map.containsKey(x - k))
                ans = Math.max(ans, prefix + x - map.get(x - k));

            if (map.containsKey(x + k))
                ans = Math.max(ans, prefix + x - map.get(x + k));

            map.put(x, Math.min(map.getOrDefault(x, Long.MAX_VALUE), prefix));

            prefix += x;
        }

        return ans == Long.MIN_VALUE ? 0 : ans;
    }
    public long maximumSubarraySum(int[] nums, int k) {//2461

        Map<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long ans = 0;

        // Build first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k)
            ans = sum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {

            // Remove left element
            sum -= nums[i - k];

            map.put(nums[i - k], map.get(nums[i - k]) - 1);

            if (map.get(nums[i - k]) == 0)
                map.remove(nums[i - k]);

            // Add right element
            sum += nums[i];

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Check if all elements are distinct
            if (map.size() == k)
                ans = Math.max(ans, sum);
        }

        return ans;
    }
}
