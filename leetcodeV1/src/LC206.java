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

