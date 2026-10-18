import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> a = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                num++;
            } else if (nums[i] > num) {
                a.add(num);
                num++;
                i--;
            }
        }
        while (num <= nums.length) {
            a.add(num);
            num++;
        }
        return a;
    }
}