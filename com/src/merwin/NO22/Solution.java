package merwin.NO22;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/12/2.
 */

/**
 * 二叉树的层次遍历：借助队列实现，本题中只能用ArrayList
 * https://blog.csdn.net/hansionz/article/details/81947834
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if(root == null){
            return result;
        }
        queue.add(root);
        while(queue.size() > 0){
            TreeNode tem = queue.remove(0);
            if(tem.left != null){
                queue.add(tem.left);
            }
            if(tem.right != null){
                queue.add(tem.right);
            }
            result.add(tem.val);
        }
        return result;
    }
}
