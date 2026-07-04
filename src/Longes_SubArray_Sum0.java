import java.util.HashMap;

public class Longes_SubArray_Sum0 {
    public  static int maxLen(int[] nums){
       int maxLen=0;
       int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
           if(map.containsKey(sum))
               maxLen=Math.max(maxLen,i-map.get(sum));
           else
               map.put(sum,i);
        }


        return maxLen;
    }

    static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10};
        System.out.println(maxLen(arr));
    }
}
