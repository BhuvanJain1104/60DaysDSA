public class Valid_PairSum {
    public  static  int maxValidPairSum(int[] nums, int k) {
        int n= nums.length;;
        int maxLeft=nums[0];
        int max=Integer.MIN_VALUE;
        for (int i = k; i <n ; i++) {
            maxLeft=Math.max(maxLeft,nums[i-k]);
            max=Math.max(max,nums[i]+maxLeft);
        }

        return max;

    }

    static void main(String[] args) {
       int [] nums = {1,3,5,2,8};
        System.out.println(maxValidPairSum(nums,2));
    }
}
