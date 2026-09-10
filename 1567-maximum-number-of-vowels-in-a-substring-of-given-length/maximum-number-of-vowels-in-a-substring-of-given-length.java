class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch))
                count++;
        }
        maxCount = count;
        for (int i = k; i < n; i++) {
            char rch = s.charAt(i);
            if (isVowel(rch))
                count++;
            char lch = s.charAt(i - k);
            if (isVowel(lch))
                count--;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' ||
               ch == 'i' || ch == 'o' ||
               ch == 'u';
    }
}