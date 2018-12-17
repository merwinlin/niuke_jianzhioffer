package std66.NO1;

/**
 * Created by mlin4 on 2018/11/26.
 */
public class Solution {
    /**
     * solution1
     * rumtime:220ms memory:18024k
     */
    public boolean Find(int target, int[][] array) {
        int line = array.length;
        int column = array[0].length;
        for (int i = line-1, j = 0; i >= 0 && j < column; ) {
            int find = array[i][j];
            if (find == target) {
                return true;
            } else if (find > target) {
                i--;
            } else {
                j++;
            }
        }
        return false;
    }

    /**
     * solution 2
     *
     */
    public boolean Find2(int target, int[][] array) {
        for (int[] ints : array) {
            int start = 0;
            int end = ints.length-1;
            while(start <= end){
                int mid = (start+end)/2;
                if(ints[mid] == target){
                    return true;
                } else if(ints[mid] < target){
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution o = new Solution();
        int[][] array = {{3, 7, 9, 11}, {4, 8, 10, 12}, {5, 9, 12, 13}};
        System.out.println(o.Find(10,array));
    }
}



