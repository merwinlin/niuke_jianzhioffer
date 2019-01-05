package merwin.NO16;

/**
 * Created by Administrator on 2018/11/30.
 */
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode head1 = new ListNode(-1);
        ListNode head = head1;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        if(list1 != null){
            head.next = list1;
        }
        if(list2 != null){
            head.next = list2;
        }
        return head1.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
//        ListNode d = new ListNode(4);
//        ListNode e = new ListNode(5);
//        ListNode f = new ListNode(6);
//        a.next = c;
//        c.next = f;
//        b.next = d;
//        d.next = e;
        ListNode result = solution.Merge(a,b);
        System.out.println("");
    }
}
