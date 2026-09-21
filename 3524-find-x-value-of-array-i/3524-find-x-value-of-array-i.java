class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] dp = new long[k];
        long[] result = new long[k];
        for(int num : nums) {
            long[] newDp = new long[k];
            newDp[num % k] = 1;
            for(int r = 0; r < k; r++){
                int newRemainder = (r * (num % k)) % k;
                newDp[newRemainder] += dp[r];
            }
            for(int r = 0; r < k; r++){
                result[r] += newDp[r];
            }
            dp = newDp;
        }
        return result;
    }
}