public class MaxWords {
    public int rearrangeCharacters(String s, String target) {
        int[] freq = new int[256];

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int[] reqfreq = new int[256];

        for (char ch : target.toCharArray()) {
            reqfreq[ch]++;
        }

        int ans = Integer.MAX_VALUE;

        for (char ch : target.toCharArray()) {
            if (reqfreq[ch] > 0) {
                ans = Math.min(ans, freq[ch] / reqfreq[ch]);
                reqfreq[ch] = 0;
            }
        }

        return ans;
    }
}
