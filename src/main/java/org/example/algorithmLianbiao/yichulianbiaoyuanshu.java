package org.example.algorithmLianbiao;

public class yichulianbiaoyuanshu {
    static public ListNode removeElements(ListNode head,int val){
        ListNode dummy=new ListNode(-1,head);
        ListNode pre=dummy;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
            }else {
                pre=cur;
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}