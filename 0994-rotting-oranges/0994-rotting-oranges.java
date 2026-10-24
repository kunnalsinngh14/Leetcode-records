class Solution {
    public boolean checker(int[][]grid){
        for(int i = 0; i<grid.length; i++){
            for(int j =0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    return true;
                }
            }
        }
        return false;
    }
    public int orangesRotting(int[][] grid) {
        int maxtime = 0;
        boolean check = checker(grid);
        if(check==false){
            return 0;
        }
        int cntfresh = 0;
        Queue<Pair> q = new LinkedList<>();
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = true;
                }
                else{
                    vis[i][j] = false;
                }
                if(grid[i][j]==1){
                    cntfresh++;
                }
            }
        }
        while(!q.isEmpty()){
            Pair temp = q.poll();
            int r = temp.row;
            int c = temp.col;
            int t = temp.ts;
            if(r-1>=0 && grid[r-1][c]==1){
                grid[r-1][c] = 2;
                vis[r-1][c] = true;
                cntfresh--;
                q.add(new Pair(r-1,c,t+1));
                maxtime = Math.max(maxtime,t+1);
            }
            if(r+1<grid.length && grid[r+1][c]==1){
                grid[r+1][c] = 2;
                vis[r+1][c] = true;
                cntfresh--;
                q.add(new Pair(r+1,c,t+1));
                maxtime = Math.max(maxtime,t+1);
            }
            if(c+1<grid[0].length && grid[r][c+1]==1){
                grid[r][c+1] = 2;
                vis[r][c+1] = true;
                cntfresh--;
                q.add(new Pair(r,c+1,t+1));
                maxtime = Math.max(maxtime,t+1);
            }
            if(c-1>=0 && grid[r][c-1]==1){
                grid[r][c-1] = 2;
                vis[r][c-1] = true;
                cntfresh--;
                q.add(new Pair(r,c-1,t+1));
                maxtime = Math.max(maxtime,t+1);
            }
        }
        if(cntfresh!=0){
            return -1;
        }
        return maxtime;
    }
}
class Pair{
    int row;
    int col;
    int ts;
    Pair(int row, int col, int ts){
        this.row = row;
        this.col = col;
        this.ts = ts;
    }
}