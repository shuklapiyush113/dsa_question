class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {
        
        int m=grid.length;
        int n=grid[0].length;
        ArrayList<int[]> list=new ArrayList<>();
        for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
                boolean ans=false;
                if(word.charAt(0)==grid[i][j])
                {
                    for(int k=1;k<=8;k++)
                    ans=ans||search(grid,m,n,word,k,i,j,0);
                    
                    if(ans)
                        list.add(new int[]{i,j});
                }
            }
         }
        return list.toArray(new int[list.size()][]);
    }
    
    boolean search(char [][] grid , int m, int n,String word ,int dir,int i,int j, int k)
    {
        if(i>=m||i<0)
        return false;
        if(j>=n||j<0)
        return false;
        
        if(k==word.length()-1 && grid[i][j]==word.charAt(k))
        return true;
        if(grid[i][j]!=word.charAt(k))
        return false;
       
        boolean l1=false;
        if(dir==1)
        l1=search(grid,m,n,word,1,i-1,j,k+1);  
        else if(dir==2)
        l1=search(grid,m,n,word,2,i+1,j,k+1);
        else if(dir==3)
        l1=search(grid,m,n,word,3,i,j-1,k+1);
        else if(dir==4)
        l1=search(grid,m,n,word,4,i,j+1,k+1);
        else if(dir==5)
        l1=search(grid,m,n,word,5,i-1,j+1,k+1);
        else if(dir==6)
        l1=search(grid,m,n,word,6,i-1,j-1,k+1);
        else if(dir==7)
        l1=search(grid,m,n,word,7,i+1,j+1,k+1);
        else if(dir==8)
        l1=search(grid,m,n,word,8,i+1,j-1,k+1);
        
        return l1;
        
    }
}


//solve in all possible direction 
