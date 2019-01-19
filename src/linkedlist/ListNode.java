package linkedlist;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }

    @Override
    public String toString() {
        return  val + ","+ next;
    }

}
