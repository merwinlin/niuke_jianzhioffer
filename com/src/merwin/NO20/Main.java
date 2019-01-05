package merwin.NO20;

/**
 * Created by Administrator on 2018/12/2.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(3);
        System.out.println(solution.min());
        solution.push(4);
        System.out.println(solution.min());
        solution.push(2);
        System.out.println(solution.min());
        solution.push(3);
        System.out.println(solution.min());
        solution.pop();
        System.out.println(solution.min());
        solution.pop();
        System.out.println(solution.min());
        solution.pop();
        System.out.println(solution.min());
        solution.push(0);
        System.out.println(solution.min());
    }
}
