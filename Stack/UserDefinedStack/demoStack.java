package UserDefinedStack;

public class demoStack {


    public static void main(String[] args) {
        
        UserStack st = new UserStack();

        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(15);
        st.push(15);

        // st.display();
        // st.pop();
        st.display();

        System.out.println(st.size());

        System.out.println(st.capacity());


    }

}
