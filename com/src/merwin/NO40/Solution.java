package merwin.NO40;

import java.util.ArrayList;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(list.contains(array[i])){
                list.remove(new Integer(array[i]));
            }else{
                list.add(array[i]);
            }
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] num1 = new int[1];
        int [] num2 = new int[1];
        int [] array = {2,4,3,6,3,2,5,5};
        solution.FindNumsAppearOnce(array,num1,num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
