class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums==null ||nums.length==0)
            return res;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                long sum=nums[i]+nums[j];
                long target_2=target-sum;
                int front=j+1;
                int back=n-1;
                while(front<back)
                {
                    int two_sum=nums[front]+nums[back];
                    if(two_sum < target_2)
                        front++;
                    else if(two_sum >target_2)
                        back--;
                    else
                    {
                        List<Integer> quad=new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        res.add(quad);
                        while(front<back && nums[front]==nums[front+1])
                            front++;
                        while(front<back && nums[back]==nums[back-1])
                            back--;
                        
                        front++;
                        back--;
                            
                    }
                }
                while(j<n-1 && nums[j+1]==nums[j])
                    j++;
                
            }
            while(i<n-1 && nums[i+1]==nums[i])
                    i++;
        }
        return res;
        
    }
}