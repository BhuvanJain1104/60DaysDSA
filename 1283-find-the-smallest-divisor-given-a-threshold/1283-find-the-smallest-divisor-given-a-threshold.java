
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int maxNum = 0;

        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }
        int low=1;
        int high=maxNum;
        while(low<high){
        int mid=low + (high-low)/2;
          int sum = 0;

            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }
        if(sum<=threshold)
            high=mid;
        else
            low=mid+1;
        
        
        }
        return low;
        

    }
}
