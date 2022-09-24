class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
       /* int len1=s.length();
        int len2=t.length();
        if(len1!=len2)
            return false;
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<len1;i++)
        {
            arr1[s.charAt(i)- 'a']++;
            arr2[t.charAt(i)- 'a']++;
        }
        for(int i=0;i<len1;i++)
        {
            if(arr1[s.charAt(i)-'a']!= arr2[t.charAt(i)-'a'])
                return false;
        }
        return true;*/
        char[] mapST = new char[256];
        char[] mapTS = new char[256];

        for (int i = 0; i < s.length(); i++)
        {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if (mapST[s1] == 0 && mapTS[t1] == 0) 
            {
                mapST[s1] = t1;
                mapTS[t1] = s1;
            }
            else if(mapST[s1] != t1)
            {
                return false;
            }
        }
        return true;
    }
}