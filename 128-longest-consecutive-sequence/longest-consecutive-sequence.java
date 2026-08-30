import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int index = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                index++;
            }
            else if (nums[i] == nums[i - 1]) {
                continue;
            }
            else {
                index = 1;
            }
            if (index > max) {
                max = index;
            }
        }
        return max;
    }
}