public class First_Occurence_String {
    public static int strStr(String haystack, String needle) {

        int len = haystack.length();
        int n = needle.length();

        if (n == 0)
            return 0;

        if (len < n)
            return -1;

        int i = 0;
        int end = n;

        while (end <= len) {
            if (haystack.substring(i, end).equals(needle)) {
                return i;
            }
            i++;
            end++;
        }

        return -1;
    }

    static void main(String[] args) {
        System.out.println(strStr("abc", "c"));
    }
}
