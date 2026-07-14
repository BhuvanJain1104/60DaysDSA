import java.util.HashSet;

public class Longest_Substring {
    public static int substring(String s){
        int maxLen=0;
        int left =0;
        HashSet<Character> set = new HashSet<Character>(256);
        for (int right = 0; right <s.length() ; right++) {
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
        }
        //LeetCode 395 Merge and Conquer Approch
    public int longestSubstring(String s, int k) {
    return solve(s,0,s.length(),k);
    }
    private static int solve(String s, int start, int end , int k){
        if(end-start<k){
            return 0;
        }
        int [] freq = new int[26];
        for (int i = start; i <end ; i++) {
            freq[s.charAt(i)-'a']++;
        }
        for (int mid = start; mid <end ; mid++) {
            if(freq[s.charAt(mid)-'a']>=k){
               continue;
            }
            int next=mid+1;
            while (next<end&& freq[s.charAt(next) - 'a'] < k){
                next++;
            }
            return Math.max(solve(s,start,mid,k),solve(s,next,end,k));

        }
    return end-start;
    }
    // Brute Force
    public int longestSubstring3(String s, int k) {

        int n = s.length();
        int ans = 0;

        for (int start = 0; start < n; start++) {

            int[] freq = new int[26];

            for (int end = start; end < n; end++) {

                freq[s.charAt(end) - 'a']++;

                boolean valid = true;

                for (int i = 0; i < 26; i++) {

                    if (freq[i] > 0 && freq[i] < k) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    ans = Math.max(ans, end - start + 1);
                }
            }
        }

        return ans;
    }
    // Sliding Window Approch
    public int longestSubstring2(String s, int k) {

        int ans = 0;

        for (int targetUnique = 1; targetUnique <= 26; targetUnique++) {

            int[] freq = new int[26];

            int left = 0;
            int right = 0;

            int unique = 0;
            int countAtLeastK = 0;

            while (right < s.length()) {

                int idx = s.charAt(right) - 'a';

                if (freq[idx] == 0)
                    unique++;

                freq[idx]++;

                if (freq[idx] == k)
                    countAtLeastK++;

                right++;

                while (unique > targetUnique) {

                    idx = s.charAt(left) - 'a';

                    if (freq[idx] == k)
                        countAtLeastK--;

                    freq[idx]--;

                    if (freq[idx] == 0)
                        unique--;

                    left++;
                }

                if (unique == targetUnique &&
                        countAtLeastK == targetUnique) {

                    ans = Math.max(ans, right - left);
                }
            }
        }

        return ans;
    }

    static void main(String[] args) {
        int r= substring("aabcdaddabkj");
        System.out.println(r);
    }
    }

