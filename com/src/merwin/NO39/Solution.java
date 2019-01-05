package merwin.NO39;


/**
 * 判断是否为平衡二叉树
 */
public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
}
