
public class LC2 {

    public static void main(String[] args) {
        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(3);
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        b1.next = b2;
        b2.next = b3;

        new LC2().addTwoNumbers(a1, b1);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;

        while(pointer1.next != null && pointer2.next != null){
            int res = pointer1.val + pointer2.val + c;
            pointer1.val = res % 10;
            c = res / 10;
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        };
        int res = pointer1.val + pointer2.val + c;
        pointer1.val = res % 10;
        c = res / 10;

        if(pointer1.next != null){

        }else if(pointer2.next != null){
            pointer1.next = pointer2.next;
        }

        if(pointer1.next != null){
            pointer1 = pointer1.next;
            while(pointer1.next != null){
                res = pointer1.val + c;
                pointer1.val = res % 10;
                c = res / 10; 
                pointer1 = pointer1.next;
            };
            res = pointer1.val + c;
            pointer1.val = res % 10;
            c = res / 10;
        }


        if(c == 1){
            ListNode finalVal = new ListNode(1);
            pointer1.next = finalVal;
        }

        return l1;

    }


        // while((pointer1.next != null) && (pointer2.next != null)){
        //     int n1 = pointer1.val;
        //     int n2 = pointer2.val;
        //     pointer1.val = (n1 + n2 + c) % 10; 
        //     c = (n1 + n2 + c) / 10;
        //     pointer1 = pointer1.next;
        //     pointer2 = pointer2.next;
        // }
        // int n1 = pointer1.val;
        //     int n2 = pointer2.val;
        //     pointer1.val = (n1 + n2 + c) % 10; 
        //     c = (n1 + n2 + c) / 10;

        // if(pointer1.next != null){
        // }else if(pointer2.next != null){
        //     pointer1.next = pointer2.next;
        // }
    //     while(pointer1.next != null){
    //         n1 = pointer1.val;
    //         pointer1.val = (n1 + c) % 10; 
    //         c = (n1 + n2 + c) / 10;
    //         pointer1 = pointer1.next;
    //     }

    //         n1 = pointer1.val;
    //         pointer1.val = (n1 + c) % 10; 
    //         c = (n1 + c) / 10;
    //     if(c == 1){
    //         ListNode finalVal = new ListNode(1);
    //         pointer1.next = finalVal;
    //     }

    //     return l1;
    
}
