class Solution {
    public int maxFrequencyElements(int[] nums) {

        int maxFreq = 0;
        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
            }
        }
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == maxFreq) {
                answer++;
            }
        }

        return answer;
    }
}