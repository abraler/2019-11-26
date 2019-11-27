import java.util.*;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main1 {
    public static ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode Big=new ListNode(1);
        ListNode head=Big;
        ListNode Sm=new ListNode(1);
        ListNode head1=Sm;
        while(pHead!=null){
            if(pHead.val<x){
                Big.next=new ListNode(pHead.val);
                Big=Big.next;
                pHead=pHead.next;
            }else{
                Sm.next=new ListNode(pHead.val);
                Sm=Sm.next;
                pHead=pHead.next;
            }

        }
        Big.next=head1.next;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(2);
        ListNode b=new ListNode(1);
        ListNode c=new ListNode(6);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(9);
        ListNode f=new ListNode(7);
        ListNode g=new ListNode(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        ListNode p= partition(a,4);
        while(p!=null){
            System.out.println(p.val);
            p=p.next;
        }
    }
}