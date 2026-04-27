class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode current = root;
        while(current != null){
            if(current.left!=null){
                
                TreeNode pred = current.left;
            while(pred.right != null && pred.right != current){
                pred = pred.right;
            }
            if(pred.right == null){  //link
                pred.right = current;
                current = current.left;
            }
            else{ // pred.right == current   // unlink
                ans.add(current.val);
                current = current.right;
                pred.right = null;
            }
            }

            else{
                 ans.add(current.val);
                current = current.right;                
            }
        }

     return ans;
    }
}