package linkedlist;

public class TopTen {
    public static void main(String[] args) {
        // sample list
        ListNode head = null;
        head = addFront(head,5);
        head = addFront(head,4);
        head = addFront(head,3);
        head = addFront(head,2);
        head = addFront(head,1);
        printList(head);
        System.out.println("\nLength of list is "+length(head));
    }

    // utility methods
    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + ",");
            curr = curr.next;
        }
    }

    public static int length(ListNode head){
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        return length;
    }

    public static ListNode addFront(ListNode head, int val){
        if(head == null){
            return new ListNode(val);
        }
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        return head;
    }
}
