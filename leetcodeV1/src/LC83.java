import java.util.HashSet;
import java.util.Set;

public class LC83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }

        Set<Integer> set = new HashSet<>();
        ListNode pointer;
        ListNode prePointer;

        prePointer = head;
        pointer = head.next;
        
        set.add(head.val);

        while(pointer != null){
            if(set.contains(pointer.val)){
                pointer = pointer.next;
                prePointer.next = null;
            }else{
                set.add(pointer.val);
                prePointer.next = pointer;
                pointer = pointer.next;
                prePointer = prePointer.next;
            }
        }
        return head;
    }
}


// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }
