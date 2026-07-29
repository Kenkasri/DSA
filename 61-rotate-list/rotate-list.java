/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
     if(k==0||head==null||head.next==null) {
      return head;

     }

     ListNode a=head;
     int b=0;
     while(a!=null){
      b++;
      a=a.next;
     }  
     
      int K=k%b;
     
     int c=b-K;
     ListNode temp = head;
     while(temp.next!=null){
      temp = temp.next;
     }
     temp.next = head;
     ListNode t1 = head;
     for(int i = 1;i<c;i++){
        t1 = t1.next;
     }
     ListNode newhead = t1.next;
     t1.next = null;

     return newhead;
    }
}