package merwin.NO23;

/**
 * Created by Administrator on 2018/12/2.
 */

/**
 * 这道题的难度主要是怎样搭建递归的框架去一层一层地判断是否满足LRD
 *
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0 ){
            return false;
        }
        if(sequence.length == 1){
            return true;
        }
        return LRD(sequence,0,sequence.length-1);
    }

    /**
     * 这个方法是用于判断一个序列满不满足后序遍历
     * @param sequence
     * @param s
     * @param e
     * @return
     */
    public boolean LRD(int [] sequence, int s, int e){
        if(s >= e){
            return true;
        }
        int root = sequence[e];
        int rIndex ;
        for (rIndex = s; rIndex < e; rIndex++) {
            if(sequence[rIndex] > root){
                break;
            }
        }
        for (int j = rIndex; j < e; j++) {
            if(sequence[j] < root){
                return false;
            }
        }
        return LRD(sequence,s,rIndex-1) && LRD(sequence,rIndex,e-1);

    }

    public static void main(String[] args) {
        int [] s = {4,8,6,12,16,14,10};
        Solution solution = new Solution();
        System.out.println(solution.VerifySquenceOfBST(s));
    }
}
