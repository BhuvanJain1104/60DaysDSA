import java.util.*;

public class Majority_Element {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int c1 = 0;
        int c2 = 0;
        int count1 = 0;
        int count2 = 0;
        int n = nums.length;
        ;
        for (int num : nums) {
            if (num == c1)
                count1++;
            else if (num == c2) {
                count2++;
            } else if (count1 == 0) {
                c1 = num;
                count1 = 1;
            }

            else if (count2 == 0) {
                c2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count2 = 0;
        count1 = 0;
        for (int num : nums) {
            if (num == c1)
                count1++;
            else if (num == c2) {
                count2++;
            }
        }
        if (count1 > n / 3)
            result.add(c1);
        if (count2 > n / 3)
            result.add(c2);
        return result;
    }

}
