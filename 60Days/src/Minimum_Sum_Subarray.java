import java.util.Stack;

public class Minimum_Sum_Subarray {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        int[] dp = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){

            while(!stack.isEmpty() && arr[stack.peek()] > arr[i])
                stack.pop();

            if(stack.isEmpty())
                dp[i] = arr[i] * (i + 1);
            else{
                int prev = stack.peek();
                dp[i] = dp[prev] + arr[i] * (i - prev);
            }

            stack.push(i);
            sum += dp[i];
        }

        return sum;
    }
}
