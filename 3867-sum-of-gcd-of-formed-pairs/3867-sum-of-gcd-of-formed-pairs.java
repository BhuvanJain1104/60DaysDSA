class Solution {
    public long gcdSum(int[] nums) {
     int [] prefixGcd= new int[nums.length];
     prefixGcd[0]=nums[0];
     long sum=0;
     

int maxSoFar = nums[0];

for (int i = 0; i < nums.length; i++) {

    maxSoFar = Math.max(maxSoFar, nums[i]);

    prefixGcd[i] = gcd(nums[i], maxSoFar);
}
     Arrays.sort(prefixGcd);
     int left=0;
     int right=nums.length-1;
     while(left<right){
        sum+=gcd(prefixGcd[left],prefixGcd[right]);
        left++;
        right--;
     }
     return sum;
    }
    public int gcd(int a, int b) {

    while (b != 0) {

        int temp = a % b;

        a = b;

        b = temp;
    }

    return a;
}
}