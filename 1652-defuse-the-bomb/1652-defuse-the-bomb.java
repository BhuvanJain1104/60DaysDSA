class Solution {
    public int[] decrypt(int[] code, int k) {
     int l = code.length;
int[] ans = new int[l];

// If k == 0, we can return early because the array is already filled with 0s
if (k == 0) {
    return ans;
}

for (int i = 0; i < l; i++) {
    if (k > 0) {
        // Sum the next k elements
        for (int n = 1; n <= k; n++) {
            ans[i] += code[(i + n) % l];
        }
    } else {
        // Sum the previous |k| elements
        int p = Math.abs(k);
        for (int n = 1; n <= p; n++) {
            // Adding 'l' before modulo handles negative wrapping smoothly
            ans[i] += code[(i - n + l) % l];
        }
    }
}
return ans;

    }
}