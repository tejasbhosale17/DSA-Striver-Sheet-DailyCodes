package leetcode_strivers_dsa;

import java.util.Stack;

public class Palindrome_Linked_list_234 {
    public boolean isPalindrome(ListNode head) {
    	 ListNode temp =head;
         Stack <Integer> stk = new Stack<>();
         int count=0;
         while(temp!=null){
             count++;
             temp=temp.next;
         }
         temp=head;
         // if(count==0){return true;}
         if(count/2==0) {
        	 if(count<2){return true;}
             
             if(stk.isEmpty()) {
             		stk.push(temp.val);
             		temp=temp.next;
             }
             while(temp!=null) {
             	if(stk.lastElement()==temp.val) {
             		stk.pop();
             	}else {
             		stk.push(temp.val);
             	}
                 temp=temp.next;
             }
              
         }else {
        	 if(count<2){return true;}
             
             if(stk.isEmpty()) {
             		stk.push(temp.val);
             		temp=temp.next;
             }
             while(temp!=null) {
             	if(stk.lastElement()==temp.val) {
             		stk.pop();
             	}else {
             		stk.push(temp.val);
             		continue;
             	}
             	
                 temp=temp.next;
             }
             
         }
         
         
        
         if(stk.isEmpty()) {
         	return true;
         }else {
         	return false;
         }
    }
}
