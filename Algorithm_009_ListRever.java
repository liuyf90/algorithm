public class Algorithm_009_ListRever{



    public static void main(String[] args) {
        
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
// 反转单链表 https://leetcode.cn/problems/UHnkqh/
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre=null;
            ListNode next=null;
            while(head!=null){
                next=head.next;
                head.next=pre;
                pre=head;
                head=next;      
            }
            return pre;
    
        }
    }

    public static class DoubleListNode{
        int val;
        DoubleListNode next;
        DoubleListNode pre;
        DoubleListNode(int x) { val = x; }
    }

    // 反转双链表
    public static DoubleListNode reverseDoubleList(DoubleListNode head) {
        DoubleListNode pre =null;
        DoubleListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            head.pre=next;
            pre=head;
            head=next;
        }
        return pre;
    }
}