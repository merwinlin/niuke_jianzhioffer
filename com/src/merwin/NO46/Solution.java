package merwin.NO46;

/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 思路：不能用乘法，所以公式不行；循环也不行，那只能用递归，递归的结束条件是<1,但是不能用if,
 * 所以需要用逻辑与的短路原理来实现递归结束判断（&&时左边不成立则右边直接不执行）.
 */
public class Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (n>0) && (sum += Sum_Solution(n-1))>0;
        return sum;
    }
}
