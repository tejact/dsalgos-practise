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

        ListNode reversed = reverseList(head);
        printList(reversed);
        System.out.println(reversed);
    }

    // Reverse Linked List Iterative
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next; // no need to assign value as this is not used in condition OR not in right hand side or expressions initially
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    //TODO: Work on this
    public static ListNode reverseRecursive(ListNode head){
        //base case
        if(head == null){
            return null;
        }
        return null;
    }

    public static boolean doesCycleExist(ListNode head){
        // 0 or 1 element
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = slow.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static int findKthNodeFromLast_twoPointer(ListNode head, int k){
        ListNode slow = head;
        ListNode fast = head;
        // start at 0 and stop at k - 1, so total of k-1 steps.
        // will stop at kth node.
        int i = 0;
        while(i < k-1 && fast != null){
            fast = fast.next;
        }
        // k is large than the length of the list
        if(fast == null){
           throw new IllegalArgumentException("K is larger than the length of the list");
        }
        //need to stop at the last node, not after the last node.
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }

    public static int findKthNodeFromLast_twoPass(ListNode head, int k){
        int len = 0;
        ListNode current = head;
        while(current != null){
            current = current.next;
            len++;
        }

        int i = 0;
        current = head;

        if(k > len){
            throw new IllegalArgumentException("K is larger than the length of the list");
        }

        while(i < (len - k)){
            current = current.next;
            i++;
        }
        return  current.val;
    }


    public static ListNode intersect(ListNode l1, ListNode l2){
        if(l1 == null || l2 == null){
            return null;
        }
        int len1 = 0;
        int len2 = 0;
        ListNode curr = l1;
        while(curr != null){
            curr = curr.next;
            len1++;
        }

        curr = l2;
        while(curr != null){
            curr = curr.next;
            len2++;
        }

        if(len1 > len2){
            // move l1 for l1 - l2
            int i = 0;
            int diff = len1 - len2;
            while(i < diff){
                l1 = l1.next;
                i++;
            }
        }

        if(len2 > len1){
            int i = 0;
            int diff = len2 -  len1;
            while(i < diff){
                l2 = l2.next;
                i++;
            }
        }

        //both l1 and l2 are at same distance from the intersection point. (If exists)
        while( l1 != null && l2 != null){
            if(l1 == l2){
                return l1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return null;
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
