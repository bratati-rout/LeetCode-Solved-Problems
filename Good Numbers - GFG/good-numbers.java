//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            int D = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.goodNumbers(L, R, D);
            for (int i : ans) System.out.print(i + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> goodNumbers(int L, int R, int D) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=L;i<=R;i++)
        {
            int num=i;
            
            if(isValid(num,D))
                l.add(num);
            
        }
        return l;
    }
    public boolean isValid(int num,int D)
    {
        
        
        int digit=num%10;
                
        if(digit==D)
            return false;
        int sum=digit;

        num=num/10;
        while(num!=0)
        {
            digit=num%10;
            if(digit==D ||digit<=sum)
                return false;
            else
            {
                sum+=digit;
                num=num/10;
            }
        }
        return true;
    }
    
}