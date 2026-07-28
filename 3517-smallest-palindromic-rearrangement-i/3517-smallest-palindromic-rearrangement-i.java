class Solution {
       public String smallestPalindrome(String s) {
    if(s.length()<=1)
        return s;
    char[] chars = s.toCharArray();
    int[] freq= new int[26];
    for (char ch : chars)
        freq[ch - 'a']++;

    StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++){
            int count = freq[i] / 2;

            while (count-- > 0) {
                result.append((char)('a' + i));
            }
    }
        char mid = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                mid = (char)('a' + i);
                break;
            }
        }
        String second = new StringBuilder(result).reverse().toString();



if (mid == 0)
    return result.toString() + second;
else
    return result.toString() + mid + second;
    }
}