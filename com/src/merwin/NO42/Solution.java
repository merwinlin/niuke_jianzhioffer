package merwin.NO42;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/12/9.
 */
public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str == null){
            return "";
        }
        if(str.length() == 0){
            return "";
        }
        String left = str.substring(n,str.length());
        String right = str.substring(0,n);
        return left+right;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.LeftRotateString(null,2));
    }
}
