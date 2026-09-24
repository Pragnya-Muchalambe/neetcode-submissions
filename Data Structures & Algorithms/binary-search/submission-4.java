class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int mid = 0;
        if(nums.length == 1 && nums[0] == target)
            return 0;
        
        while(low<=high){

            mid = (low+high)/2;

            if(target == nums[mid])
                return mid;
            if(target > nums[mid])
                low = mid+1;
            else
                high = mid-1;
        }
    return -1;
    }
}
