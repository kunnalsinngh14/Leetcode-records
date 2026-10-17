/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        Queue<TreeNode>q = new LinkedList<>();
        StringBuilder s = new StringBuilder();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp==null){
                s.append("null").append(",");
                continue;
            }
            s.append(temp.val).append(",");
            q.offer(temp.left);
            q.offer(temp.right);
        }
        return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("")){
            return null;
        }
        String[] arr = data.split(",");
        Queue<TreeNode>q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.offer(root);
            int i = 1;
            while(!q.isEmpty()&& i < arr.length){
                TreeNode temp = q.poll();
                if(i<arr.length && !arr[i].equals("null")){
                    temp.left = new TreeNode(Integer.parseInt(arr[i]));
                    q.offer(temp.left);
                }
                i++;
                if(i<arr.length&&!arr[i].equals("null")&&i<arr.length){
                    temp.right = new TreeNode(Integer.parseInt(arr[i]));
                    q.offer(temp.right);
                }
                i++;
            }
        return root;
    }
   
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;