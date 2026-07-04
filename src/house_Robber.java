public class house_Robber {
    public int rob(int[] nums) {
     int prev1=0;
     int prev2=0;
     for( int num : nums){
         int curr=Math.max(prev1,prev2+num);
         prev2=prev1;
         prev1=curr
     }
    return prev1;
    }
    public int rob2(int[] nums) {
        int [] dp = new int[nums.length];
        int n = nums.length;
        if(n==1) return nums[0];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<n;i++){
            dp[i]= Math.max(nums[i]+dp[i-2], dp[i-1]);
            System.out.println(dp[i]);
        }
        return dp[n-1];

    }
}
