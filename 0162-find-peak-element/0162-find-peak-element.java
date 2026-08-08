class Solution {
    public int findPeakElement(int[] nums) {
        
        return search(nums);
    }
    static int search(int[] arry) {
        int start = 0;
        int end = arry.length - 1;
        while (start != end) {
            int mid = start + (end - start) / 2;

            if (arry[mid] < arry[mid+1]) {
                start= mid + 1;
            } else  {
                end  = mid;

            }


        }
        return start;
    }
}