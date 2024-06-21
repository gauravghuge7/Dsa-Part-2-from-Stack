package Basics;

import java.util.Stack;

public class printingStack {

    public static void printReverseStack(Stack<Integer> st) {

        Stack<Integer> gt = new Stack<>();


        while(st.size() > 0){
            
            int top = st.pop();

            System.out.print(top + " ");

            gt.push(top);
            

        }

        while (gt.size() > 0)  {
            
            int top = gt.pop();
            st.push(top);
        }


    }


    public static void printStack(Stack<Integer> st) {

        Stack<Integer> gt = new Stack<>();

        while(st.size() > 0) {
            
            int top = st.pop();
            // System.out.print(top +" ");
            gt.push(top); 
        }

        while (gt.size() > 0) {
            int top = gt.pop();
            System.out.print(top+" ");
            st.push(top);
        }
    }


    public static void insertBottom(Stack<Integer> st, int n) {

        Stack<Integer> gt = new Stack<>();

        while(st.size() > 0) {
            gt.push(st.pop());
        }

        st.push(n);

        while(gt.size() > 0) {
            st.push(gt.pop());
        }

    }


    public static void insertAtAnyIndex(Stack<Integer> st, int n, int index) {

        Stack<Integer> gt = new Stack<>();

        while (st.size() > index) {
            
            gt.push(st.pop());
        }

        st.push(n);

        while (gt.size() > 0) {

            st.push(gt.pop());
        }



    }

    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // System.out.println(st);
        // printReverseStack(st);

        insertBottom(st, 134);

        printStack(st);
        System.out.println();

        insertAtAnyIndex(st, 25, 1);  /// for check change index at any position in the stack
        printStack(st);
        

    }
}
