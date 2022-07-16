import java.util.Stack;

public class LC25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        Stack<ListNode> stack = new Stack<>();
        ListNode preStageNode = preHead;
        ListNode newStagePreFirstNode = head;
        ListNode cur = head;
        boolean flag = false;
        while(cur != null){
            for (int i = 0; i < k; i++) {
                if(cur == null){
                    flag = true;
                    break;
                }
                stack.push(cur);
                cur = cur.next;
            }
            if(flag == true){
                break;
            }
            for(int i = 0;i < k;i++){
                preStageNode.next = stack.pop();
                preStageNode = preStageNode.next;
            }
            newStagePreFirstNode = cur;
        }

        preStageNode.next = newStagePreFirstNode;
        return preHead.next;
    }
}
