package leetcode_strivers_dsa;


public class Reverse_LinkedList_206 {
	 public ListNode reverseList(ListNode head) {
	        
			ListNode temp=head;
			ListNode prev=null;
			ListNode nnext=null;
			
			while(temp!=null)
			{
				nnext=temp.next;
				temp.next=prev;
				prev=temp;
				temp=nnext;
			}
			head=prev;
         return head;
 }
}

