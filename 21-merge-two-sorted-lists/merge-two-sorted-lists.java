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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current = new ListNode(-1);
        ListNode n = current;
      
        while(list1!=null&&list2!=null){
          ListNode t1 = list1.next;
          ListNode t2  = list2.next;
          if(list1.val<list2.val){
            n.next = list1;
            list1 = t1;
          }else{
            n.next = list2;
            list2 = t2;
          }
          n = n.next;
        }
        if(list1!=null){
          n.next = list1;
        }else{
          n.next = list2;
        }
        return current.next;
    }
}