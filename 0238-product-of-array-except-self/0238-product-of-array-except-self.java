class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] x = new int[nums.length];
        int prefix = 1;
        for(int i = 0; i < nums.length; i++){
            x[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            x[i] *= suffix;
            suffix *= nums[i];
        }
        return x;
    }
}