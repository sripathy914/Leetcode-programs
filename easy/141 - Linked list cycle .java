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
public class Solution 
{
    public boolean hasCycle(ListNode head) 
    {
        ListNode tort=head;
        ListNode hare=head;
        ListNode curr=head;

        if(curr==null || curr.next==null)
            return false;
        else
        {
            while(hare!=null && hare.next!=null)
            {
                tort=tort.next;
                hare=hare.next.next;

                if(hare==tort)
                    return true;
            }
        }
        return false;
    }
}
