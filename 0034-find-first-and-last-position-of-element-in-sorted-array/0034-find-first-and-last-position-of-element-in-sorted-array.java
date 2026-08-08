class Solution {
       public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static int search(int[] arry, int target, boolean findIndexofStart) {
        int ans = -1;
        int start = 0;
        int end = arry.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arry[mid]) {
                end = mid - 1;
            } else if (target > arry[mid]) {
                start = mid + 1;

            } else {
                ans = mid;
                if (findIndexofStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return ans;
    }
}