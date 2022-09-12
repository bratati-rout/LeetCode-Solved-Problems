class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l= 0, h= nums.length-1;
        while(l < h)
        {
                int mid = l + (h - l)/2;
                if((mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid % 2 == 1 && nums[mid]                                ==nums[mid - 1]))
                    l = mid + 1;
                else
                    h = mid;
        }
        return nums[l];
        
        
    }
}