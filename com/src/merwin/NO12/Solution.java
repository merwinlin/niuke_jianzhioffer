package merwin.NO12;

/**
 * Created by Administrator on 2018/11/29.
 */

/**
 * 1.指数为0的情况
 * 2.指数为负数的情况
 * 3.怎么判断底数为0（double）
 * 4.求幂算法的优化
 *  （常规算法：o(n)
 *    递归:指数为奇数偶or偶数分别怎么处理
 *    二分快速幂：时间复杂度最低的方法）
 */
public class Solution {
    /**
     * 时间复杂度：o(n);
     */
//    public double Power(double base, int exponent) {
//        if(exponent == 0) {return 1;}
//        double result=1;
//        boolean flag = false;
//        if(exponent < 0){
//            exponent = -exponent;
//            flag = true;
//        }
//        for (int i = 0; i < exponent; i++) {
//            result = result * base;
//        }
//        if(flag){
//            result = 1/result;
//        }
//        return result;
//    }

    public double Power(double base, int exponent) {
        if(exponent == 0) {return 1;}
        double result=1;
        boolean flag = false;
        if(exponent < 0){
            exponent = -exponent;
            flag = true;
        }
        double tem = base;
        while(exponent > 0){
            if((exponent&1) == 1) {
                result = result * tem;
            }
            exponent = exponent >> 1;
            tem = tem * base;
        }
        if(flag){
            result = 1/result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.Power(2.0,3));
    }
}
