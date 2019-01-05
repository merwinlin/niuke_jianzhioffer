package merwin.NO18;

/**
 * Created by Administrator on 2018/12/1.
 */
public class Solution {
    public void Mirror(TreeNode root) {
        if(root == null){
            return;
        }
        TreeNode tem = root.left;
        root.left = root.right;
        root.right = tem;
        Mirror(root.left);
        Mirror(root.right);

    }
}
