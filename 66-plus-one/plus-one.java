class Solution {
    public int[] plusOne(int[] digits) {
        int n= digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int []ans = new int[n+1];//make new array to to take the condition of 9 -->so we plus one +1 array size😎
        ans[0]=1;
        return ans;
}
}