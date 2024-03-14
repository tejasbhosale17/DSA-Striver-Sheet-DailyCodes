package leetcode_strivers_dsa;

public class Delete_Node_in_Lined_List_237 {
	 public void deleteNode(ListNode node) {
	        // int n=node.val;
	        // ListNode temp = node;
	        // ListNode prev= node;
	        // while(temp.val!=n){
	        // prev=temp;
	        // temp=temp.next;
	        // }
	        // prev.next=temp.next;
	        node.val = node.next.val;
	        node.next=node.next.next;
	    }
}
