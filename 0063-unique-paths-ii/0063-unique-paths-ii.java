class Solution {
   static  int [][] dp=new int[101][101];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      int m= obstacleGrid.length;
      int n= obstacleGrid[0].length;
      if(obstacleGrid[0][0]==1||obstacleGrid[m-1][n-1]==1)
        return 0;
        for(int [] row : dp) 
            Arrays.fill(row,-1);
        return helper(obstacleGrid,m-1,n-1); 
    }
    public static int helper(int[][]  obstacleGrid,int i ,int j){
        if(i<0||j<0)
            return 0;
        if( obstacleGrid[i][j]==1)
            return 0;
            if(i == 0 && j == 0)
                 return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int left= helper( obstacleGrid,i-1,j);
        int right=helper( obstacleGrid,i,j-1);
        dp[i][j]=left+right;
        return dp[i][j];
    }
}