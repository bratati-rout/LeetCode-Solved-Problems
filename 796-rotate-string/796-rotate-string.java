class Solution {
    public boolean rotateString(String s, String goal)
    {
        if(s.length() == goal.length())
        {
            String ans = s+s;
            if(ans.indexOf(goal) != -1)
            {
                return true;
            }
        }
        return false;
    }
}