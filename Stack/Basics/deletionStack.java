package Basics;

import java.util.Stack;

public class deletionStack {


    public static void deleteAtAnyIndex(Stack<Integer> st, int index) {

        Stack <Integer> gt = new Stack<>();


        while (st.size() > index) {
        
            gt.push(st.pop());


        }

        st.pop();

        while (gt.size() > 0)  {
            
            st.push(gt.pop());
        }

    }



    public static void main(String[] args) {
        
        System.out.println();

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


        
        deleteAtAnyIndex(st, 5);

        System.out.println(st);
        




    }
}
