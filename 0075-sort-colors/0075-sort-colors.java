class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int mid = 0;
        int blue = nums.length - 1;
            while (mid <= blue) {
                if (nums[mid] == 0) {
                    int temp = nums[red];
                    nums[red] = nums[mid];
                    nums[mid] = temp;
                    red++;
                    mid++;
                } else if (nums[mid] == 1) {
                    mid++;
                } else {
                    int temp = nums[mid];
                    nums[mid] = nums[blue];
                    nums[blue] = temp;
                    blue--;
                }
            }
    }
}
        