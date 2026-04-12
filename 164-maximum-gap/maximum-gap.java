class Solution {
    public int maximumGap(int[] nums) {
        int n =nums.length;
        if(n<2) return 0;
        Arrays.sort(nums);
        int arr[] =new int[n];
        for(int i=0;i<n-1;i++){
           int sum=0;
            sum = nums[i+1]-nums[i];
            arr[i] =sum;
        
            
        }
        int max=0;
        for(int num:arr){
            if(max<num){
                max=num;
            }
        }
        return max;
    }
}