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
      if(head == null||head.next == null||k==0){
        return head;
      }
      ListNode temp = head;
      int length = 1;
      while(temp.next!=null){
        temp = temp.next;
        length++;
      }
      temp.next = head;
      int K = k%length;
      ListNode newtail = head;
      for(int i = 1;i<length-K;i++){
        newtail = newtail.next;

      }
      ListNode newhead = newtail.next;
      newtail.next = null;
    return newhead;
        
    }
}