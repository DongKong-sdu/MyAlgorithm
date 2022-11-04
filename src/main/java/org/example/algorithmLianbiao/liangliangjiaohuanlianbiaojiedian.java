package org.example.algorithmLianbiao;

public class liangliangjiaohuanlianbiaojiedian {
    static public ListNode swapPairs(ListNode head){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;
        while(cur.next!=null&&cur.next.next!=null){
            ListNode temp=cur.next;
            ListNode temp1=cur.next.next.next;

            cur.next=cur.next.next;
            cur.next.next=temp;
            temp.next=temp1;

            cur=cur.next.next;
        }
        return dummy.next;
    }
}
