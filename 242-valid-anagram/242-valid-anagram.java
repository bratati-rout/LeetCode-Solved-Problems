class Solution {
    public boolean isAnagram(String s, String t) 
    {
        int len1=s.length();
        int len2=s.length();
        if(len1==len2)
        {
            char[] ch1=s.toCharArray();
            char[] ch2=t.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2))
                return true;
            else
                return false;
        }

            return false;
        
    }
}