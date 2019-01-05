package merwin.NO37;

/**
 * Created by Administrator on 2018/12/8.
 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int time = 0;
        if(array== null || array.length == 0){
            return time;
        }
        int s = 0;
        int e = array.length-1;
        int m = (s+e)/2;
        while(s <= e){
            m = (s+e)/2;
            if(array[m] == k){
                break;
            }
            else if(array[m] > k){
                e = m-1;
            } else {
                s = m+1;
            }
        }
        if(s <= e){
            time ++;
            for (int i = m-1; i >=0 ; i--) {
                if(array[i] != k ){
                    break;
                }
                time++;
            }
            for (int i = m+1 ; i < array.length; i++) {
                if(array[i] != k){
                    break;
                }
                time++;
            }
        }
        return time;

    }
}
