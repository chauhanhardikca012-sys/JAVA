import java.util.*;
public class LinkedListEX{
    public static void main(String []args){
        LinkedList<String> list = new LinkedList<>();

        list.add("Ram");
        list.add("Sita");
        list.add("Lakshman");

            //list.add(1,"Bharat");

            list.remove("Lakshman");

                System.out.println("List of ");
                    for(String name : list){
                        System.out.println(name);
                    }
    }
}