public class Minimum_Cost_Operations {
    public int minimumCost(int[] nums, int k) {

        long MOD = 1_000_000_007L;

        long resources = k;
        long totalCost = 0;

        long operationsDone = 0;

        for (int num : nums) {

            if (resources < num) {

                long deficit = num - resources;

                long ops = (deficit + k - 1) / k;

                long cost =
                        ops * (2 * operationsDone + ops + 1) / 2;

                totalCost = (totalCost + cost) % MOD;

                operationsDone += ops;

                resources += ops * (long) k;
            }

            resources -= num;
        }

        return (int) totalCost;
    }
}
