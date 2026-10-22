class Solution {
public String convertToBase7(int num) {
if (num == 0) return "0";
    String ans = "";
    boolean neg = num < 0;
    num = Math.abs(num);

    while (num > 0) {
        int rem = num % 7;
        ans = rem + ans;
        num = num / 7;
    }

    if (neg) ans = "-" + ans;

    return ans;
}
}
