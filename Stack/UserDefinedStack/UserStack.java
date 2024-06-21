package UserDefinedStack;

//   implement stack using the array
public class UserStack {
    
    private int[] arr = new int[5];
    private int index = 0;


    void push(int val) {

        if(isFull()) {
            System.out.println(" Stack id Fulled !");
            return;
        }

        arr[index] = val;
        index++;
    }


    void display() {
        System.out.print("[");
        for(int i=0; i<index; i++) {
            System.out.print(arr[i]+", "); 
        }
        System.out.print("]");
        System.out.println();
    }

    int pop() {

        int top = arr[index];


        arr[index] = 0;
        index--;
        return top;
        
    }
    

    int peek() {

        return arr[index];
        
    }

    int size() {
        return index;
    }
     
    int capacity() {
        return arr.length;
    }
     
    boolean isEmpty() {
        if(index == 0) return true;

        return false;
    }

    boolean isFull() {

        if(index == arr.length) return true;

        return false;
    }
     

}
