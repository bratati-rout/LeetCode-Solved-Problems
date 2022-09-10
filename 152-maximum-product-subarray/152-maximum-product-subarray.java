class Solution {
    public int maxProduct(int[] nums) {
       int min=nums[0],max=nums[0],finalMax=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int tempMax=nums[i]*max;
            int tempMin=nums[i]*min;
            max=Math.max(Math.max(tempMax,tempMin),nums[i]);
            min=Math.min(Math.min(tempMax,tempMin),nums[i]);
            finalMax=Math.max(finalMax,max);
        }
        return finalMax;
    }
}