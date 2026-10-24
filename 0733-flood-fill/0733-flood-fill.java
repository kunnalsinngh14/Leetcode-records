class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        int startcolor = image[sr][sc];
        image[sr][sc] = color;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr,sc));
        while(!q.isEmpty()){
            Pair temp = q.poll();
            int r = temp.row;
            int c = temp.col;
            if(r-1>=0 && image[r-1][c] ==startcolor){
                image[r-1][c] = color;
                q.add(new Pair(r-1,c));
            }
            if(r+1<image.length && image[r+1][c] == startcolor){
                image[r+1][c] = color;
                q.add(new Pair(r+1,c));
            }
            if(c-1>=0 && image[r][c-1] ==startcolor){
                image[r][c-1] = color;
                q.add(new Pair(r,c-1));
            }
            if(c+1<image[0].length && image[r][c+1] == startcolor){
                image[r][c+1] = color;
                q.add(new Pair(r,c+1));
            }
        }
        return image;
    }
}
class Pair{
    int row;
    int col;
    Pair(int r, int c){
        this.row = r;
        this.col = c;
    }
}