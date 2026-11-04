class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length; 
        int i = 1;
        int k = 0;
        if(n == 0) return 0;
        while(i < n){
            if(nums[i] != nums[k]){
                k++;
                nums[k] = nums[i];
            }
            i++;
        }
        return k + 1;
    }
}