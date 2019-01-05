package merwin.NO43;

import java.util.Stack;

/**
 * Created by Administrator on 2018/12/9.
 */
public class Solution {
    public String ReverseSentence(String str) {
        if(str == null || str.length() == 0){
            return "";
        }
        Stack<String> stack = new Stack<>();
        char [] input = str.toCharArray();
        String temp = "";
        for (int i = 0; i < input.length; i++) {
            if(i == (input.length-1)){
                temp += input[i];
                stack.push(temp);
                break;
            }
            if(input[i] != ' '){
                temp += input[i];
            }else {
                stack.push(temp);
                temp = "";
            }
        }
        temp = "";
        while(!stack.isEmpty()){
            temp += stack.pop()+" ";
        }
        return temp.substring(0,temp.length()-1);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.ReverseSentence("I am a student"));
    }
}
