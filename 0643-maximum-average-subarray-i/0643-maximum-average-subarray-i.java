class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        avg = (double) sum / k;
        double maxAvg = avg;
        for(int i = k; i < nums.length; i++){
            int newsum = sum - nums[i - k] + nums[i];
            sum = newsum;
            avg = (double) sum / k;
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;
    }
}