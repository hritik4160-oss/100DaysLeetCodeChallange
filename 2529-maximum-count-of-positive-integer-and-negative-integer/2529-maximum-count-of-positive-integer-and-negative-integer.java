class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int left = 0, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= 0) {
                left = mid + 1;
            } 
            else {
                right = mid;
            }
        }
        int positive = n - left;
        left = 0;
        right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } 
            else {
                right = mid;
            }
        }
        int negative = left;
        return Math.max(positive, negative);
    }
}