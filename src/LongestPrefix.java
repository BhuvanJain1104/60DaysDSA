import java.util.HashSet;

public class LongestPrefix {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen=0;
        for(int num: arr1)
        {
            while (num>0){
                set.add(num);
                num=num/10;
            }
        }
        for(int num:arr2){
            while (num>0){
                if(set.contains(num)){
                    maxLen=Math.max(maxLen,String.valueOf(num).length());
                    break;
                }
                num=num/10;
            }


        }
        return maxLen;
    }
}
class Solution1 {

}