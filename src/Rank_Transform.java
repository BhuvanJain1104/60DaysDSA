import java.util.Arrays;
import java.util.HashMap;

public class Rank_Transform {
    public int[] arrayRankTransform(int[] arr) {
        int [] nums=arr.clone();
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] rank = new int [arr.length];
        Arrays.sort(nums);
        map.put(nums[0],1);
        int curr=1;
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i]==nums[i-1])
                continue;
            else{
                map.put(nums[i],curr+1);
                curr++;
            }

        }
        for (int i = 0; i < arr.length ; i++) {
            rank[i]= map.get(arr[i]);
        }
        return rank;
    }
}
