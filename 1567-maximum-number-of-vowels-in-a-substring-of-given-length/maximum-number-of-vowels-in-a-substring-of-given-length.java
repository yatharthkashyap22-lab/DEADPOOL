class Solution {
    public int maxVowels(String s, int k) {

        int n = s.length();
        int count = 0;
        for (int i = 0; i < k; i++) {

            if (s.charAt(i) == 'a' ||
                s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' ||
                s.charAt(i) == 'o' ||
                s.charAt(i) == 'u') {

                count++;
            }
        }

        int max = count;
        for (int right = k; right < n; right++) {

            if (s.charAt(right) == 'a' ||
                s.charAt(right) == 'e' ||
                s.charAt(right) == 'i' ||
                s.charAt(right) == 'o' ||
                s.charAt(right) == 'u') {

                count++;
            }
            if (s.charAt(right - k) == 'a' ||
                s.charAt(right - k) == 'e' ||
                s.charAt(right - k) == 'i' ||
                s.charAt(right - k) == 'o' ||
                s.charAt(right - k) == 'u') {

                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}