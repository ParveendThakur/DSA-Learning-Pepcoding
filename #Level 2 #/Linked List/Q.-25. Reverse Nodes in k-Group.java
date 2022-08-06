/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nbr = curr.next;
            curr.next= prev;
            prev = curr;
            curr = nbr;     
        }
        return prev;
    }
    
    
    public ListNode reverseKGroup(ListNode head , int k){
        ListNode temp = head;
         int s =0;
         while (temp!=null){
             temp = temp.next;
             s++;   
         }
        int wk = s/k;
        ListNode dummy = new ListNode(0);
        ListNode p1 = dummy ;
        ListNode curr = head;
        ListNode prev= head;
        while(wk-->0){
            int time = k-1;
            while(time-->0) curr = curr.next;
            ListNode nbr = curr.next;
            curr.next= null;
            
            ListNode rev = reverse(prev);
            p1.next = curr;
            p1 = prev;
            curr = prev = nbr;
        }
        p1.next = curr;
        return dummy.next;
    }
}