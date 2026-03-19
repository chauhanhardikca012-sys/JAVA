import java.util.*;

class QueueList{
    public static void main(String []args){
        Queue<Integer> qu = new LinkedList<>();

        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);

            System.out.println("After Add "+qu);

            int remove = qu.remove();
            System.out.println("Remove "+remove);

            System.out.println("After Remove List "+qu);

        }
}