class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list=new ArrayList<>();
         int i, c = 0, l = 0;
       
        int n=matrix.length;
        int m=matrix[0].length;
        /* k - starting row index
            m - ending row index
            l - starting column index
            n - ending column index
            i - iterator
        */
     
        while (c < n && l < m) {
            /* check the first row from
                the remaining rows */
            for (i = l; i < m; ++i) {
               
     
                    list.add(matrix[c][i]);
            }
            c++;
     
            /* check the last column
            from the remaining columns */
            for (i = c; i < n; ++i) {

     
                list.add(matrix[i][m - 1]);
            }
            m--;
     
            /* check the last row from
                    the remaining rows */
            if (c < n) {
                for (i = m - 1; i >= l; --i) {
                  
     
                   list.add(matrix[n - 1][i]);
                }
                n--;
            }
     
            /* check the first column from
                    the remaining columns */
            if (l < m) {
                for (i = n - 1; i >= c; --i) {
                   
                        list.add(matrix[i][l]);
                }
                l++;
            }
	    }
	    return list;
        
    }
}