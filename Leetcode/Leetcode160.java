/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int m=0;
        int n=0;
        while(tempA!=null){
            m++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            n++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        if(m>n){
            for(int i=1;i<=m-n;i++){
                tempA=tempA.next;
            }
        }
        else if(n>m){
            for(int i=1;i<=n-m;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=null && tempB !=null){
            if(tempA==tempB){
                return tempA;
            }
            else {
                tempA=tempA.next;
                tempB=tempB.next;
            }
        }
        return null;
    }
}