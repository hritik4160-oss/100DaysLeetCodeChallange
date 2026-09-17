class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        if(nums[0]!=nums[1])return nums[0];
        if(nums[n-1]!=nums[n-2])return nums[n-1];
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            int t=mid;
            int s=mid;
            if(nums[mid-1]==nums[mid]){
                t=mid-1;
            } 
            else {
                s=mid+1;
            }
            int leftcount=t-lo;
            int rghtcount=hi-s;
            if(leftcount%2==0)lo=s+1;
            else hi=t-1;
        }
        return 124;  
    }
}