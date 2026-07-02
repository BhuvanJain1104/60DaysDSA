import java.util.*;

public class Max_Element_Subset {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> freq = new HashMap<>();

        for (int x : nums)
            freq.put((long) x, freq.getOrDefault((long) x, 0) + 1);

        int ans = 1;
        if(freq.containsKey(1L)) {
            int ones=freq.get(1);
            ans = Math.max(ans, ones % 2 == 0?ones-1:ones);
        }
        int len=0;
        for (long start : freq.keySet()){
            if(start==1)
                continue;
            long cur=start;
            len=1;
            while (freq.getOrDefault(cur,0)>=2){
                len+=2;
                if (cur > 1000000000L)
                    break;
                cur=cur*cur;

            }
            if(freq.getOrDefault(cur,0)==1)
                len++;
            else
                len--;
            ans=Math.max(ans,len);
        }

        return ans;
    }
}
