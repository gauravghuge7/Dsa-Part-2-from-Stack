package circularQueue;

public class demo {
    
    public static class queue {
        
        private int[] arr = new int[5];
        
        int n = arr.length;

        int front = -1;
        int rear = -1;
        private int size = 0;




        void add(int val) {

            if(size == n) return;

            if(size == 0) {

                front = rear = 0;
                arr[0] = val;
                size++;
                return;
            }

            if(rear == n-1) {
                rear = 0;
                arr[rear] = val;
                size++;
                return;
            }

            if(front == n-1) {
                front = 0;
                arr[front] = val;
                size++;
                return;
            }

            arr[++rear] = val;
            size++;



        }

        int remove() throws Exception {
            
            if(size == 0) {

                throw new Exception("Size is 0 of queue");  // do not need of write return in this block


             
            }

            if(rear == 0) {
                int top = arr[rear];
                arr[rear] =0;
                rear = n-1;
                return top;
            }

            int top = arr[rear];
            arr[rear] =0;

            rear--;
            return top;

        }

        int element() {
            return arr[front];
        }

        void display() {

            if(front < rear) {

                for(int i=front; i<=rear; i++) {
                    System.out.print(arr[i]+" ");
                }
            }

            else {

                // front to rear printing
                for(int i=front; i<n; i++) {
                    System.out.print(arr[i]+" ");
                }


                // 0 to rear printing
                for(int i=0; i<=rear; i++) {
                    System.out.print(arr[i]+" ");
                    
                }
            }
      
        }
 


    }

    public static void main(String[] args) throws Exception {
        
        queue q = new queue();

        q.add(10);
        q.add(12);
        q.add(14);
        q.add(16);
        q.add(17);
        q.add(18);


        q.remove();

        System.out.println(q.element());

        q.display();


    }

}
