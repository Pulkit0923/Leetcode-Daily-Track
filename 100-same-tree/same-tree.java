class Solution {
    public boolean stree(TreeNode p , TreeNode q){
        if(p==null && q == null)return true;
        if(p==null || q == null)return false;
        if(p.val != q.val) return false;
        if(!stree(p.left,q.left))return false;
        if(!stree(p.right,q.right))return false;
        return true;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return stree(p,q);
    }
}