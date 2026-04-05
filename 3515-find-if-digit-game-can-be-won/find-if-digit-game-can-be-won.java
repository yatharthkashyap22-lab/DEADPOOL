class Solution {
    public boolean canAliceWin(int[] nums) {
        int n = nums.length;
        int sum=0;
        int sum1=0;
        for(int num:nums){
            if(num<10){
                sum+=num;
            }
            else{
                sum1+=num;
            }
        }
        if(sum!=sum1){
            return true;
        }
        return false;
    }
}