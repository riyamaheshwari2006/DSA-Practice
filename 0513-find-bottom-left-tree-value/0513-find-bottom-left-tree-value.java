class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans = root.val;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.right != null){
                queue.offer(node.right);
            }
            if (node.left != null){
                queue.offer(node.left);
            }
            ans = node.val;
        }
        return ans;
    }
}
