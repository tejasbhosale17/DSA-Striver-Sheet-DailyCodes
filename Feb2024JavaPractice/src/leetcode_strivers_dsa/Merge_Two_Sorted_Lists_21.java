package leetcode_strivers_dsa;

public class Merge_Two_Sorted_Lists_21 {
//    ListNode head;
    public void mergeTwoLists(ListNode list1, ListNode list2) {
    	ListNode temp1 = list1.head;
    	ListNode temp2= list2.head;
    	ListNode n = new ListNode();
    	if(n==null) {
    		n=list1;
    	}else {
        	while(temp1!=null || temp2!=null) {
        		if(temp1.val<=temp2.val) {
//        			ListNode n = new ListNode();
        			n.val=temp1.val;
        			n.next=temp2;
        			temp1=temp1.next;  
        			System.out.println("List1: "+n.val);
        		}else {
//        			ListNode n = new ListNode();
        			n.val = temp2.val;
        			n.next=temp1;
        			temp2=temp2.next;
        			System.out.println("List2:"+n.val);
        		}
        	}
        	

    	}

    }
}
