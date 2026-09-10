class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }
        maxcount = count;
        for (int i = k; i < n; i++) {
            char lch = s.charAt(i - k);
            char rch = s.charAt(i);
            if (isVowel(lch)) {
                count--;
            }
            if (isVowel(rch)) {
                count++;
            }
            maxcount = Math.max(count, maxcount);
        }
        return maxcount;
    }
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }
}