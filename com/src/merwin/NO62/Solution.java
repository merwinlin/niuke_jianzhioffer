package merwin.NO62;


import java.util.ArrayList;

public class Solution {
    ArrayList<TreeNode> list = new ArrayList<>();
    int size = 0;
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot == null || k <=0){
            return null;
        }
        this.treeToList(pRoot);
        if(k > size){
            return null;
        }
        return list.get(k-1);
    }

    private void treeToList(TreeNode pRoot) {
        if(pRoot == null){
            return;
        }
        treeToList(pRoot.left);
        list.add(pRoot);
        size++;
        treeToList(pRoot.right);
    }


}