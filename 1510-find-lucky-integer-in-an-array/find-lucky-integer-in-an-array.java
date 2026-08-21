class Solution {
    public int findLucky(int[] arr) {
        int answer=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(arr[i]==count){
                answer=Math.max(answer,arr[i]);
            }
        }
        return answer;
    }
}