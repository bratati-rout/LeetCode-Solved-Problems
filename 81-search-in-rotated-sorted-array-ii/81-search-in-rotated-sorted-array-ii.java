class Solution {
    public boolean search(int[] nums, int target) {
        boolean flag=false;
        int l=0;
        int h=nums.length-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]==target)
            {
                flag=true;
                return flag;
            }
            if(nums[l]<nums[mid])
            {
                if(target>=nums[l] && target <nums[mid])
                    h=mid-1;
                else
                    l=mid+1;
            }
            else if(nums[l]> nums[mid])
            {
                if(target>nums[mid] && target<=nums[h])
                    l=mid+1;
                else
                    h=mid-1;
            }
            else
                l++;
           
        }
        return flag;
        
    }
}