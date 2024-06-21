package UserDefinedStack;

public class demoLLStack {


    public static void main(String[] args) {
        
        LLStack st = new LLStack();

        st.push(14);

        st.display();
        System.out.println(st.isEmpty());

        System.out.println(st.size());
        st.pop();
        st.display();

        System.out.println(st.size());

        System.out.println(st.isEmpty());

    }
}
