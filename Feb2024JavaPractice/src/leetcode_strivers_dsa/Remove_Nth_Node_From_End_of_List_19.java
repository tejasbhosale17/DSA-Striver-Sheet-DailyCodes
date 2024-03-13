package leetcode_strivers_dsa;

public class Remove_Nth_Node_From_End_of_List_19 {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode temp =head;
	        ListNode prev=head;
	        ListNode ntemp = head;
	        int count=1;
	        while(ntemp.next!=null){
	            
	            ntemp=ntemp.next;
	            count++;
	        }
	        if((count-n)==0){
	            head=head.next;
	            return head;
	        }


	        if(count>1){
	        // System.out.println(count);
	        int i=0;
	        while(i!=(count-n) && temp.next!=null){
	            prev=temp;
	            temp=temp.next;
	            i++;
	        }
	        prev.next=temp.next;
	        return head;
	        }else{
	            return null;
	        }
	        
	    }
}
