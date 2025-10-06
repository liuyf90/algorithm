//https://leetcode.cn/problems/partition-list/description/
//给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
//你应当 保留 两个分区中每个节点的初始相对位置。
public class Algorithm_012_PartitionList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        head = partition(head, 3);
        while(head!=null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        
        
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode partition(ListNode head, int x) {
        // 要有左头、左尾、右头、右尾的概念，这个概念在链表中非常重要
        ListNode lhead=null, ltail=null, rhead=null, rtail=null,next=null;
        while(head!=null){
            next=head.next;
            head.next=null;
            if(head.val<x){
                if(lhead==null){
                    lhead=head;
                }else{
                    ltail.next=head;
                }
                ltail=head;
            }else{
                if(rhead==null){
                    rhead=head;
                }else{
                    rtail.next=head; 
                }
                rtail=head;
            } 
            head=next;
        }
        if(lhead==null){
            return rhead;
        }
        ltail.next=rhead;
        return lhead;
    }
    
}