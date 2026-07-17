class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int d = 1; // start with day 1
            int current = 0;

            for (int w : weights) {

                if (current + w > mid) {
                    d++;
                    current = w;
                } else {
                    current += w;
                }
            }
            if (d <= days)
                high = mid;
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}