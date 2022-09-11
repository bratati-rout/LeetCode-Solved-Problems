class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        int left=0;
        int right=nums.length-1;
        int pos=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]<target)
                left=mid+1;
            else if(nums[mid]>target)
                right=mid-1;
            else
            {
                pos=mid;
                right=mid-1;
            }
          
        }
        res[0]=pos;
        left=0;
        pos=-1;
        right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]<target)
                left=mid+1;
            else if(nums[mid]>target)
                right=mid-1;
            else
            {
                pos=mid;
                left=mid+1;
            }
          
        }
        res[1]=pos;
        return res;
    }
}