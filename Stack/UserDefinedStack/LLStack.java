package UserDefinedStack;

class Node {
    int val;

    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class LLStack {

    private Node head = null;
    private int index = 0;

    void push(int val) {

        Node temp = new Node(val);

        temp.next = head;
        index++;
        head = temp;
    }

    int peek() {

        return head.val;
    }

    int pop() {

        int top = head.val;

        head = head.next;
        index--;
        return top;
    }

    int size() {
        return index;
    }

    boolean isEmpty() {
        if(head == null) return true;

        return false;
    }

    void display() {

        Node temp = head ;

        System.out.print("[");
        while (temp!= null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.print("]");
        System.out.println();
    }
}
