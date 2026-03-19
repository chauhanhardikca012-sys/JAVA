import java.util.*;
class SortedList{
    public static void main(String []args){
        SortedSet<Integer> n = new TreeSet<>();

            n.add(10);
            n.add(9);
            n.add(8);
            n.add(7);
            n.add(6);

                System.out.println("Sorted List ");
                    for(Integer num : n ){
                        System.out.println(num);
                    }
    }
}