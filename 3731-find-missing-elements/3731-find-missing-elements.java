class Solution {
public List<Integer> findMissingElements(int[] nums) {
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;

    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
        smallest = Math.min(smallest, num);
        largest = Math.max(largest, num);
        set.add(num);
    }

    List<Integer> result = new ArrayList<>();

    for (int i = smallest + 1; i < largest; i++) {
        if (!set.contains(i)) {
            result.add(i);
        }
    }

    return result;
}
}