public class Majority_Element_Subarrays {
    public int countMajoritySubarrays1(int[] nums, int target) {

        int ans=0;
        for (int i = 0; i <nums.length ; i++) {
            int targetCount=0;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]==target)
                    targetCount++;
                int len=j-i+1;
                if(2*targetCount>len)
                    ans++;
            }

        }
        return ans;
    }
    public long countMajoritySubarrays(int[] nums, int target) {
        int[] arry=new int[nums.length];
        long ans=0;
        int n= nums.length;
        int [] prefix=new int[nums.length+1];
        prefix[0]=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target)
                arry[i]=1;
            else
                arry[i]=-1;
            prefix[i+1]=prefix[i]+arry[i];
        }
        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {

                if (prefix[r + 1] > prefix[l])
                    ans++;
            }
        }


        return ans;
    }
}
