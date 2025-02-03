class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1 && nums[0]==0) return 0;
        int inc=1;
        int preI=Integer.MIN_VALUE;
        int dec=1;
        int preD=Integer.MAX_VALUE;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                inc++;
            }else{
                inc=1;
            }
            max=Math.max(max,inc);
            if(nums[i-1]>nums[i]){
                dec++;
            }else{
                dec=1;
            }
            max=Math.max(max,dec);
           
        }
       
        return max;

    }
}