class Solution {
    public int findMiddleIndex(int[] nums){
        int lsum = 0;
        int tsum = 0;
        for(int i = 0; i < nums.length; i++){
            tsum += nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            int rsum = tsum - lsum - nums[i];
            if(rsum == lsum){
                return i;
            }else{
                lsum += nums[i];
            }
        }
        return -1;
    }
}