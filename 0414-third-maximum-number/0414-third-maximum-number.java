class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;
        boolean found = false;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]) max = nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(smax < nums[i] && nums[i] != max) smax = nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(tmax < nums[i] && nums[i] != smax && nums[i] != max) {
            tmax = nums[i];
            found = true;
            }
        }
        if(found)
            return (int)tmax;
        else
            return (int)max;
    }
}