public class Algorithm_010_MergeTwoLists{
//合并两个有序链表
//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//https://leetcode.cn/problems/merge-two-sorted-lists/description/
public static void main(String[] args) {
    
}    



public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}



public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if(l1==null || l2==null){
        return l1==null? l2: l1;
    }
    ListNode head = l1.val<=l2.val? l1: l2;
    ListNode cur1= head.next;
    ListNode cur2= head==l1? l2: l1;
    // pre=head,用于记录当前链表的前一个节点，以便下一步将cur1或cur2的节点连接到pre后面
    ListNode pre=head;
    while(cur1!=null && cur2!=null){
        if(cur1.val<=cur2.val){
            pre.next=cur1;
            cur1=cur1.next;             
        }else{
            pre.next=cur2;
            cur2=cur2.next;
        }
        pre=pre.next;
    }
    pre.next=cur1!=null? cur1:cur2;
    return head;

}
}