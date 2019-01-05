package merwin.NO36;

/**
 * 输入两个链表，找出它们的第一个公共结点
 */

/**
 * 思路：找出2个链表的长度，然后让长的先走两个链表的长度差，然后再一起走
 （因为2个链表用公共的尾部）
 */
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        int lenght1 = 1;
        int lenght2 = 1;
        while(p1.next != null){
            lenght1 ++;
            p1 = p1.next;
        }
        while(p2.next != null){
            lenght2 ++;
            p2 = p2.next;
        }
        if(lenght1 > lenght2){
            pHead1 = move(pHead1,lenght1-lenght2);
        } else {
            pHead2 = move(pHead2,lenght2-lenght1);
        }
        while(pHead1 != pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;

    }

    private ListNode move(ListNode p, int i) {
        while(i>0){
            p = p.next;
            i--;
        }
        return p;
    }
}
