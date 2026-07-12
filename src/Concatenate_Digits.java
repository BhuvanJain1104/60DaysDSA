public class Concatenate_Digits {
    public int[] sumAndMultiply(String s, int[][] queries) {
        char[] nums = s.toCharArray();

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int x = 0;
            int sum = 0;

            for (int j = queries[i][0]; j <= queries[i][1]; j++) {   // if r is inclusive

                if (nums[j] == '0')
                    continue;

                int digit = nums[j] - '0';

                x = x * 10 + digit;
                sum += digit;
            }

            result[i] = x * sum;
        }

        return result;
    }
}
