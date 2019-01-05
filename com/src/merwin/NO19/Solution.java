package merwin.NO19;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2018/12/1.
 */

/**
 * 思路就是循环的打印圈，圈数可以找规律算出来，结果是短边的长度除2向上取整。
 */
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int a = matrix.length;
        int b = matrix[0].length;
        if(a == 0 || b== 0){
            return null;
        }
        ArrayList<Integer> result = new ArrayList<>();
        if(a == 1){
            for (int i : matrix[0]) {
                result.add(i);
            }
            return result;
        }
        if(b == 1){
            for (int i = 0; i < a; i++) {
                result.add(matrix[i][0]);
            }
            return result;
        }
        int[][] flag = new int[a][b];

        //圈数：
        int circle = ((a > b ? b : a) + 1 ) / 2;
        for (int i = 0; i < circle; i++) {
            //打印从左到右的行
            for (int j = i; j< b-i; j++ ){
                result.add(matrix[i][j]);
            }

            //打印从上到下的行
            for (int j = i+1; j< a-i; j++){
                result.add(matrix[j][b-i-1]);
            }

            //打印从右到左的行
            for (int j = b-2-i; j>= i && a-i-1 != i; j--){
                result.add(matrix[a-1-i][j]);
            }

            //打印从下到上的行
            /**
             * 第三第四个循环的两个&&条件真鬼难啊
             */
            for (int j = a-2-i; j>= i+1 && b-i-1 != i; j--){
                result.add(matrix[j][i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] input = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        ArrayList<Integer> result = solution.printMatrix(input);
        System.out.println(result.size());
    }
}
