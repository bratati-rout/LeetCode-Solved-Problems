class Solution {
    public String largestOddNumber(String num) 
    {
        /*int nu=Integer.parseInt(num);
        int max=Integer.MIN_VALUE;
        char ch[]=num.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int n=Integer.parseInt(String.valueOf(ch[i]));
            max=Math.max(max,n);
        }
        String m=Integer.toString(max);
        //System.out.println(m);
        if(nu%2!=0)
            return num;
        else if(max%2!=0)
            return m;
        
        return "";*/
        int n=0;
        String m="";
        for(int i=num.length()-1;i>=0;i--)
        {
            n=Character.getNumericValue(num.charAt(i));
            if(n%2==1)
            {  
                m=num.substring(0,i+1);
                break;
            }

         }
        return m;
    }
}