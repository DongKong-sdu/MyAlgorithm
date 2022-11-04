package org.example.algorithmLianbiao;

public class fanzhuanlianbiao {
    static public ListNode reverseList(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        ListNode temp=null;
        while(cur!=null){
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
}
