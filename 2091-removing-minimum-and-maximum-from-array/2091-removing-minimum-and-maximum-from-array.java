class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minindex=0;
        int maxindex=0;
        for(int i =0;i<n;i++){
            if(nums[i]<nums[minindex])
                minindex=i;
             if(nums[i]>nums[maxindex])
                maxindex=i;  
        }
        int left=Math.min(minindex,maxindex);
        int right=Math.max(minindex,maxindex);
        int removeleft=right+1;
        int removeright=n-left;
        int removeboth=(left+1)+(n-right);
        return(Math.min(Math.min(removeleft,removeright),removeboth));
    }
}