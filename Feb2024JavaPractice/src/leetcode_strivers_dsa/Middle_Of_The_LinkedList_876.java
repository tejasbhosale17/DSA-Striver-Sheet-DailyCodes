package leetcode_strivers_dsa;

public class Middle_Of_The_LinkedList_876 {
	   public ListNode middleNode(ListNode head) {
	        int mid=0;
	        int i=0;
	        ListNode temp=head;
	        while(temp!=null)
	        {
	            i++;
	            temp=temp.next;
	            mid=Math.abs(i/2)+1;
	        }
	        System.out.println("mid is:"+mid);
	        ListNode ntemp= head;
	        while(mid!=1){
	            ntemp = ntemp.next;
	            mid--;
	        }
	        return ntemp;
	   }
}
