package leetcode_strivers_dsa;

public class Linked_List_Cycle_141 {
    public boolean hasCycle(ListNode head) {
        // ListNode temp =head;
        // try{
        //      while(temp.next!=null){
        //       temp = temp.next;
        //     }
        // }catch(Exception e){
        //     return true; 
        // }
       
        // if(temp.next!=null){
        //     return true;
        // }else{
        //     return false;
        // }
     ListNode prev =  head, temp = head;

      while(temp != null && temp.next != null) {

          prev = prev.next;
          temp = temp.next.next;

      if(prev == temp){
        return true;
      } 
      }
      return false;
    }
}
