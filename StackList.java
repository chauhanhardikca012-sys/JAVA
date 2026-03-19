import java.util.*;
 
public class StackList{
    public static void main(String []args){
        Stack<Integer> st = new Stack<>();

            st.push(7);
            st.push(9);
            st.push(12);

                System.out.println("Pushing Element ");
                System.out.println(st);

                int remove = st.pop();
                System.out.println("Pop Element "+remove);

                System.out.println("After Pop ");
                System.out.println(st);
    }
}