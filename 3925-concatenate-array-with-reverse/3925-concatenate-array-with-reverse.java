class Solution {
    public int[] concatWithReverse(int[] nums) {
    int [] ans= new int[2*nums.length];
    int i=0;
    for(int num: nums ){
        ans[i]=num;
        i++;
    }
    
    for(int j=nums.length-1;j>=0;j--){
        ans[i]=nums[j];
        i++;
    }
    return ans;
    }
}