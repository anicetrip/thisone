public class LC206 {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode pointer;
        ListNode prePointer;
        ListNode tmp;

        prePointer = head;
        pointer = head.next;

        prePointer.next = null;

        while(pointer != null){
            tmp = prePointer;
            prePointer = pointer;
            pointer = pointer.next;
            prePointer.next = tmp;
        }

        return prePointer;

    }
}



// class ListNode {
//          int val;
//          ListNode next;
//          ListNode() {}
//          ListNode(int val) { this.val = val; }
//          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//      }