//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> result=new ArrayList<>();
        findAll("(",1,0,result,n);
        return result;
    }
    public void findAll(String current, int o,int c, List<String> result, int n )
    {
        if(current.length()==2*n)
        {
            result.add(current);
            return;
        }
        if(o<n)
        {
            findAll(current+"(",o+1,c,result,n);

        }
        if(c<o)
        {
            findAll(current+")",o,c+1,result,n);
        }
    }
    
}