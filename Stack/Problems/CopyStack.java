package Problems;

import java.util.Stack;

public class CopyStack {
    
    public static void main(String[] args) {
        
        Stack<Integer> sc = new Stack<>();

        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);

        System.out.println(sc);

        Stack<Integer> gt = new Stack<>();

        while(sc.size() > 0) {

            int x = sc.peek();
            gt.push(x);
            sc.pop();
        }

        System.out.println(gt);

        Stack<Integer> st = new Stack<>();

        while (gt.size() > 0) {

            int x = gt.peek();
            st.push(x);
            gt.pop();
        } 

        System.out.println(st);
        


        
    }
}
