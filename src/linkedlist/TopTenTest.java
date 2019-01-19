package linkedlist;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static linkedlist.TopTen.*;
import static org.junit.jupiter.api.Assertions.*;

class TopTenTest {
    static ListNode head = null;
    static ListNode single = new ListNode(1);
    static ListNode twoElem = null;

    @BeforeAll
    static void initializeList(){
        head = addFront(head,5);
        head = addFront(head,4);
        head = addFront(head,3);
        head = addFront(head,2);
        head = addFront(head,1);

        twoElem = addFront(twoElem,2);
        twoElem = addFront(twoElem,1);
    }

    @Test
    void reverseList_test() {
        // head is 1,2,3,5,4,5
        ListNode rev =  reverseList(head);
        assertEquals("5,4,3,2,1,null",rev.toString());
        assertNull(reverseList(null));
        assertEquals("1,null",reverseList(single).toString());
        assertEquals("2,1,null",reverseList(twoElem).toString());
    }

    @Test
    void doesCycleExist_test(){
        assertFalse(doesCycleExist(head));
        assertFalse(doesCycleExist(single));
        assertFalse(doesCycleExist(null));
        assertFalse(doesCycleExist(twoElem));

        ListNode cycle1 = new ListNode(1);
        cycle1.next = cycle1;
        ListNode cycle2 = new ListNode(1);
        cycle2.next = new ListNode(2);
        cycle2.next.next = cycle2;

        assertTrue(doesCycleExist(cycle1));
        assertTrue(doesCycleExist(cycle2));
    }

    @Test
    void intersect_test(){
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);


        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(2);

        assertNull(intersect(l1,l2));

        // merged lists
        l2.next = l1.next;
        assertEquals(1,intersect(l1,l2).val);

        // One linear list with two pointer in
        l2.next = l1;
        assertEquals(0,intersect(l1,l2).val);

        assertNull(intersect(null,l1));
        assertNull(intersect(l1,null));
    }

}