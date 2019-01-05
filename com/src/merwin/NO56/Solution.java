package merwin.NO56;

/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/

/**
 * https://cuijiahua.com/blog/2018/01/basis_56.html
 */
public class Solution {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null || pHead.next ==  null){
            return pHead;
        }
        ListNode p = pHead;
        ListNode pre = pHead;
        ListNode pnext ;
        while(p != null){
            if(p.next!= null && p.val == p.next.val){
                pnext = p.next;
                while(pnext.next != null && pnext.val == pnext.next.val){
                    pnext = pnext.next;
                }
                if(p == pHead){
                    pHead = pnext.next;
                }else{
                    pre.next = pnext.next;
                }
                p = pnext.next;
            }else{
                pre = p;
                p = p.next;
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(solution.deleteDuplication(a));
    }
}
