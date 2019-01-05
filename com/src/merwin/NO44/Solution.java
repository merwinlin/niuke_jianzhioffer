package merwin.NO44;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2018/12/12.
 */
public class Solution {
    public boolean isContinuous(int [] numbers) {

        if(numbers.length == 0){
            return false;
        }
        int sumOfKing = 0;
        Arrays.sort(numbers);
        int noZero = 0;
        for (; noZero < numbers.length; noZero++) {
            if(numbers[noZero] == 0){
                sumOfKing ++;
            }else{
                break;
            }
        }
        int i = noZero + 1;
        for (; i < numbers.length; i++) {
            if(numbers[i] == numbers[i-1]){
                return false;
            }
            if((numbers[i] - numbers[i-1]-1) <= sumOfKing && sumOfKing >= 0){
                sumOfKing -= (numbers[i] - numbers[i-1]-1);
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] input = {1,3,2,5,4};
        System.out.println(solution.isContinuous(input));
    }
}
