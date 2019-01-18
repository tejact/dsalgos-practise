package linkedlist;

import org.junit.jupiter.api.Test;

import static linkedlist.TopTen.addFront;
import static linkedlist.TopTen.printList;
import static linkedlist.TopTen.reverseList;
import static org.junit.jupiter.api.Assertions.*;

class TopTenTest {
    ListNode head = null;
    void initializeList(){
        head = addFront(head,5);
        head = addFront(head,4);
        head = addFront(head,3);
        head = addFront(head,2);
        head = addFront(head,1);
    }

    @Test
    void reverseList_test() {
       ListNode rev =  reverseList(head);
       printList(rev);
    }
}