package merwin.NO32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Administrator on 2018/12/6.
 */
public class Solution {
    public String PrintMinNumber(int [] numbers){
        String [] str = new String[numbers.length];
        for (int i = 0; i < str.length; i++) {
            str[i] = numbers[i]+"";
        }
        Comparator<? super String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o1+o2).compareTo(o2+o1));
            }
        };
        Arrays.sort(str,comparator);
        String result = "";
        for (int i = 0; i < str.length; i++) {
            result += str[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result =  (o1+o2).compareTo(o2+o1);
                return result;
            }
        };

        ArrayList<String> list = new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        int [] input = {132,222,33,154,74};
//        Arrays.sort(str,comparator);
        Solution solution = new Solution();
        String str = solution.PrintMinNumber(input);
        System.out.println(str);;
    }
}
