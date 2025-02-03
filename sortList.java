class Solution {
    public ListNode sortList(ListNode head) {
        // Base case: If the list is empty or has one element, it's already sorted
        if(head == null || head.next == null) {
            return head;
        }
        
        // Step 1: Split the list into two halves
        ListNode mid = get(head);
        ListNode right = mid.next;
        mid.next = null; // Split the list into two halves
        
        // Step 2: Recursively sort the two halves
        ListNode left = sortList(head);
        right = sortList(right);
        
        // Step 3: Merge the two sorted halves
        return merge(left, right);
    }
    
    // Merge two sorted lists into one sorted list
    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1); // Dummy node to start the merged list
        ListNode temp = dummy;
        
        // Merge the two lists by comparing their values
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        
        // Append the remaining nodes of the non-empty list
        temp.next = (head1 == null) ? head2 : head1;
        
        return dummy.next; // Return the merged list
    }
    
    // Find the middle node of the linked list using slow and fast pointers
    public ListNode get(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        
        // Move slow one step and fast two steps at a time
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow; // Return the middle node
    }
}