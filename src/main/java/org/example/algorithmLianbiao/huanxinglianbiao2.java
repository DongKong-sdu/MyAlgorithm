package org.example.algorithmLianbiao;

public class huanxinglianbiao2 {
    static public  ListNode huanxinglianbiao2(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode node1=fast;
                ListNode node2=head;
                while(node1!=node2){
                    node1=node1.next;
                    node2=node2.next;
                }
                return node1;
            }
        }
        return null;
    }
}
