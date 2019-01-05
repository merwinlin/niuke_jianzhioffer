package merwin.NO8;

/**
 * Created by Administrator on 2018/11/27.
 */
public class Solution {
    /**
     * 1 2 3
     *
     * 得到规律之后，使用循环效率更高，开销更少。
     */
    public int JumpFloor(int target){
        if(target == 2){return 2;}
        if(target == 1){
            return 1;
        }
        //return JumpFloor(target-1)+JumpFloor(target-2);
        int[] a = new int[target+3];
        a[1] = 1;
        a[2] = 2;
        for(int i=3; i<=target; i++){
            a[i] = a[i-1] + a[i-2];
        }
        return a[target];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.JumpFloor(8));
    }
}
