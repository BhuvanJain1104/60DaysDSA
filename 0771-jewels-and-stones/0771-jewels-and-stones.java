class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       char[] chars= stones.toCharArray();
       int[] freq = new int[128];
       for(char ch : chars){
        freq[ch -'A']++;
       }
       int ans=0;
       for(int i=0;i<jewels.length();i++){
        if(freq[jewels.charAt(i)-'A']>0)
            ans+=freq[jewels.charAt(i)-'A'];
       }
       return ans;
    }
}