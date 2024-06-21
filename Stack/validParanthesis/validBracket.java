package validParanthesis;

import java.util.Scanner;
import java.util.Stack;

public class validBracket {

    public static boolean validParanthesis(String s) {


        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(') {
                st.push(ch);
            }

            else if(ch == ')') {

                if(st.size() == 0) return false;

                if(st.peek() == '(') {

                    st.pop();

                }
            }

        }

        if(st.size() > 0) return false;

        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 

        String s = scan.nextLine();

        System.out.println(validParanthesis(s));

        
    }
}
