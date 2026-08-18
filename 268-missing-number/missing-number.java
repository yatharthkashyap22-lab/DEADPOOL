class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(int num : nums){
            ans.add(num);
        }
        int n = nums.length;
        for(int i=0;i<=n;i++){
            if(!ans.contains(i)){
                return i;
            }
        }
        return -1;
    }
}