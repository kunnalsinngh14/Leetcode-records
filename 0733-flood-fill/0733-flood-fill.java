class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int originalColor = image[sr][sc];

        // If the color is already the same, nothing needs to be done
        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    private void dfs(int[][] image, int r, int c, int originalColor, int color) {

        // Out of bounds
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) {
            return;
        }

        // Only fill pixels having the original color
        if (image[r][c] != originalColor) {
            return;
        }

        // Change current pixel
        image[r][c] = color;

        // Visit 4 adjacent pixels
        dfs(image, r - 1, c, originalColor, color); // UP
        dfs(image, r + 1, c, originalColor, color); // DOWN
        dfs(image, r, c - 1, originalColor, color); // LEFT
        dfs(image, r, c + 1, originalColor, color); // RIGHT
    }
}