public class LC203 {
    public static void main(String[] args) {

        // [1,2,5]
        // [1,3,4]

        ListNode head1 = new ListNode(1);
        ListNode tmp1 = head1;
        tmp1.next = new ListNode(6);
        tmp1 = tmp1.next;
        tmp1.next = new ListNode(5);
        tmp1 = tmp1.next;
        tmp1.next = new ListNode(6);
        tmp1.next = new ListNode(3);
        tmp1.next = new ListNode(4);
        tmp1 = tmp1.next;
        tmp1.next = new ListNode(5);
        tmp1 = tmp1.next;
        tmp1.next = new ListNode(6);
        tmp1 = tmp1.next;
        tmp1.next = new ListNode(6);

        ListNode m = new LC203().removeElements(head1, 6);
        
        ListNode pointer = m;
        while(pointer != null){
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
    }
    
    
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            if (head.val == val) {
                return null;
            } else {
                return head;
            }
        }

        while (head.val == val) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }
        ListNode pointer;
        ListNode prePointer;

        prePointer = head;
        pointer = head.next;

        while (pointer != null) {
            if (pointer.val == val) {
                prePointer.next = null;
                pointer = pointer.next;
            }else{
                prePointer.next = pointer;
                pointer = pointer.next;
                prePointer = prePointer.next;
            }

        }
        return head;

    }
}

final class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}