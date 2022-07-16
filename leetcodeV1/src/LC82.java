public class LC82 {

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(4);
        ListNode a6 = new ListNode(4);
        ListNode a7 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        new LC82().deleteDuplicates(a1);
    }


    public ListNode deleteDuplicates(ListNode head) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode cur = preHead;
        while(cur.next != null && cur.next.next != null){
            if(cur.next.val == cur.next.next.val){
                int val = cur.next.val;
                while(cur.next!= null && cur.next.val == val){
                    cur.next = cur.next.next;
                }
            }else{
                cur = cur.next;
            }

        }
        return preHead.next;
    }















        // if (head == null) {
        //     return head;
        // }
        
        // ListNode dummy = new ListNode(0, head);

        // ListNode cur = dummy;
        // while (cur.next != null && cur.next.next != null) {
        //     if (cur.next.val == cur.next.next.val) {
        //         int x = cur.next.val;
        //         while (cur.next != null && cur.next.val == x) {
        //             cur.next = cur.next.next;
        //         }
        //     } else {
        //         cur = cur.next;
        //     }
        // }

        // return dummy.next;









        // ListNode cur = new ListNode(0);
        // cur.next = head;
        // ListNode preHead = cur;
        // while(cur.next != null && cur.next.next != null){
        //     if(cur.next.val == cur.next.next.val){
        //         int val = cur.next.val;
        //         while(cur.next.val == val){
        //             cur.next = cur.next.next;
        //           }
        //     }else{
        //         cur = cur.next;
        //     }



        // }
        // return preHead.next;
    // }
}
