class Solution {
    
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Diameter passing through current root
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int currentDiameter = leftHeight + rightHeight;

        // Diameter entirely in left subtree
        int leftDiameter = diameterOfBinaryTree(root.left);

        // Diameter entirely in right subtree
        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(currentDiameter, 
               Math.max(leftDiameter, rightDiameter));
    }

    // Calculates height of a tree
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(
            height(root.left),
            height(root.right)
        );
    }
}