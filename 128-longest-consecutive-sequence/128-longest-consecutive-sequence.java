class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set=new HashSet<>();
        for(int a:nums)
        {
            set.add(a);
        }
        int longestStreak=0;
        for(int a:nums)
        {
            if(!set.contains(a-1))
            {
                int currentNum=a;
                int currentStreak=1;
                while(set.contains(currentNum+1))
                {
                    currentNum+=1;
                    currentStreak+=1;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }
}