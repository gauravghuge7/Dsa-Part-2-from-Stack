package UserDefined;

public class demoQueue {
    

    public static class queue {

        int f = -1;
        int r = -1;

        int size = 0;
        int[] arr = new int[10];


        void add(int val) {
            if(r == arr.length-1) {
                System.out.println("Queue Overflow");
                return;
            }

            if(size == 0 ) {
                f=0;
                r=0;
                arr[0] = val;
            }
            else {
                arr[r+1] = val;
                r++;
            }
            size++;


        }

        void display() {

            System.out.print("[");
            for(int i=f; i<=r; i++) {

                System.out.print(arr[i]+ ", ");
            }

            System.out.print("]");
        }

        int remove() {

            if(size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            }



            f++;


            return arr[f-1];
        }

        int peek() {
            if(size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            }

            return arr[f];
        }

    }


    public static void main(String[] args) {
    
        queue st = new queue();

        st.add(12);
        st.add(13);
        st.add(14);
        st.add(15);

        st.remove();
        st.display();

        
        System.out.println(st.peek());

        
        

    }
}
