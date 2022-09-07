class Solution {
    public void rotate(int[][] matrix) {
       
        int n=matrix.length;
     
    // first rotation
    // with respect to main diagonal
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<i;++j)
            {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
         // Second rotation
    // with respect to middle column
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n/2;++j)
            {
                int temp =matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
 
    
    }
}