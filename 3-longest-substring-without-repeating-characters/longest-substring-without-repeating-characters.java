class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int left = 0;
        int max = 0;
        int[] freq = new int[128];
        for (int right = 0; right < n; right++) {
            freq[s.charAt(right)]++;
            while (freq[s.charAt(right)] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }
            int length = right - left + 1;
            max = Math.max(max, length);
        }
        return max;
    }
}