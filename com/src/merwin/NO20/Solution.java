package merwin.NO20;

/**
 * Created by Administrator on 2018/12/1.
 */
/**
 * 思路：这题的难度在于如何解决元素pop出去的元素刚好是min的情况，方法是除了存元素的stack1，用另一个stack2来存放min,
 * 每次push的时候，如果node是更小的值，stack2就push(node),否则就push(stack2.peek()).
 */

import java.util.Stack;

public class Solution {
    private Stack<Integer> s = new Stack<>();
    private Stack<Integer> ms = new Stack<>();


    public void push(int node) {
        s.push(node);
        if(ms.size() == 0 || node < min()){
            ms.push(node);
        }else{
            ms.push(min());
        }
    }

    public void pop() {
        s.pop();
        ms.pop();
    }

    public int top() {
        return s.peek();
    }

    public int min() {
        return ms.peek();
    }
}
