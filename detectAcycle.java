/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow_pointer = head;
        ListNode fast_pointer = head;

        while(fast_pointer!=null && fast_pointer.next!=null ){
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;

             if(fast_pointer == slow_pointer){
                return true;
             }
        }return false;
    }
}