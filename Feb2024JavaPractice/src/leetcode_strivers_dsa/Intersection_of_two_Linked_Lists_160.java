package leetcode_strivers_dsa;

public class Intersection_of_two_Linked_Lists_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        // while(temp1.next!=null && temp2.next!=null){
        //     if(temp1.val!=temp2.val){
        //         temp2=temp2.next;
        //         temp1=temp1.next;
        //     }else{
        //         return temp1;
        //     }
        // }
        // return null;


        //--------------------Second Approach----------------
        // if(temp1==null ||temp2==null){
        //     return null;
        // }
        // while(temp1.val!=temp2.val){
        //     if (temp1 == null) {
        //         temp1 = headB;
        //     } else {
        //         temp1 = temp1.next;
        //     }
        //     if (temp2 == null) {
        //         temp2 = headB;
        //     } else {
        //         temp2 = temp2.next;
        //     }
        // }
        // return temp1;

        // --------------------- 3rd------------------
        // while(temp1 != null )
        // {
        //     while( temp2 != null )
        //     {
        //         if(temp1 == temp2)
        //             return temp1 ;
        //         temp2 = temp2.next ;
        //     }
        //     temp1 = temp1.next ;
        //     temp2 = headB ;
        // }
        // return null ; 
    

//----------------- Best Runtime Answer-------------------
 ListNode curr1=headA;
        ListNode curr2=headB;
        int cnt1=0;
        int cnt2=0;
        while(curr1!=null){
            curr1=curr1.next;
            cnt1++;
        }
        while(curr2!=null){
            curr2=curr2.next;
            cnt2++;
        }
        while(cnt1 > cnt2){
            headA=headA.next;
            cnt1--;
        }
        while(cnt1 < cnt2){
            headB=headB.next;
            cnt2--;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headB;

    }
}
