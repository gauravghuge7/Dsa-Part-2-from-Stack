package UserDefined;

public class demoLLQueue {
    
    public static class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }


    public static class queue {

        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val) {
            Node temp = new Node(val);

            if(head == null)  head = tail = temp;

            size++;
            tail.next = temp;
            tail = temp;
        }


        void display() {

            if(head == null) {
                System.out.println("Stack is empty");
                return;
            }

            Node temp = head; 
 
            while(temp!= null) {
                System.out.print(temp.val+ " ");
                temp = temp.next;
            }

        }


        int remove() {

            if(size == 0) {
                System.out.println("Stack is empty");
                return -1;
            }

            size--;
            int val = head.val;
            head = head.next;

            return val;
        }
 
        int peek() {
            if(size == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
 
    }


    public static void main(String[] args) {
        
        queue st = new queue();

        st.add(12);
        st.add(13);
        st.add(14);
        st.add(15);

        st.display();
        

    }
}
