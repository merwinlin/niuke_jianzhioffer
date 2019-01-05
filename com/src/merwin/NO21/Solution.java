package merwin.NO21;

import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(popA.length == 0 || pushA.length == 0){
            return false;
        }
        Stack<Integer> stack = new Stack<>();

        for (int i = 0,j=0; i < pushA.length; i++) {
            stack.add(pushA[i]);
            while(j < popA.length && popA[j] == stack.peek()){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
