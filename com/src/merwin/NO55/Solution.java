package merwin.NO55;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * 思路：用两个指向头结点的指针p1,p2。p1每次走一步，p2每次走两步，在p1 p2重合时，假设p1走的路程为n，
 * 则2n = n + x; x为环的节点数。之后让p1重新指向头结点，p1，p2每次走一步，p1,p2再次重合时，p1就为环的起点。
 */
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return null;
        }
        ListNode p1,p2;
        p1 = pHead;
        p2 = pHead;
        int len = 0;
        while(p1 != null){
            len ++;
            p1 = p1.next;
        }
        p1 = pHead;
        int index = 1;
        p1 = pHead.next;
        p2 = pHead.next.next;
        while(index <= len && p1 != p2){
            p1 = p1.next;
            p2 = p2.next.next;
            index++;
        }
        if(p1 != p2){
            return null;
        }
        p1 = pHead;
        while(len - index > 0 ){
            p1 = p1.next;
        }
        return p1;

    }
}
