package merwin.NO41;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        if(array.length == 0){
            return result;
        }
        for(int i=0,j=array.length-1;i<=j;){
            if(array[i] + array[j] == sum){
                result.add(array[i]);
                result.add(array[j]);
                break;
            }else if(array[i] + array[j] > sum){
                j--;
            }else if(array[i] + array[j] < sum){
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] input = {1,2,4,7,11,15};
        ArrayList<Integer> result = solution.FindNumbersWithSum(input,15);
        System.out.println(result.get(0));
        System.out.println(result.get(1));
    }
}
