
public class LC21 {


    public static void main(String[] args) {

        // [1,2,5]
        // [1,3,4]

        ListNode head1 = new ListNode(5);
        // ListNode tmp1 = head1;
        // tmp1.next = new ListNode(2);
        // tmp1 = tmp1.next;
        // tmp1.next = new ListNode(5);


        ListNode head2 = new ListNode(1);
        ListNode tmp2 = head2;
        tmp2.next = new ListNode(3);
        tmp2 = tmp2.next;
        tmp2.next = new ListNode(4);

        ListNode m = new LC21().mergeTwoLists(head1, head2);

        ListNode pointer = m;
        while(pointer != null){
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);

        ListNode pointer = head;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                pointer.next = list1;
                list1 = list1.next;
            }else{
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }
        pointer.next = list1 != null ? list1:list2;

        return head.next;
    }


















    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }

        if(list1.val > list2.val){
            return mergeTwoLists(list2, list1);
        }

        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode head = new ListNode(list1.val);
        ListNode pointer = head;
        l1 = list1.next;

        while(l1 != null || l2 != null){
            if(l1 == null){
                pointer.next = new ListNode(l2.val);
                l2 = l2.next;
            }else if(l2 == null){
                pointer.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                if(l1.val < l2.val){
                    pointer.next = new ListNode(l1.val);
                    l1 = l1.next;
                }else{
                    pointer.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
            }
            pointer = pointer.next;
        }

        return head;
    }
}


