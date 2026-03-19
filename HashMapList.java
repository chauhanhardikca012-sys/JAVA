import java.util.*;

class HashMapList{
    public static void main(String []args){
        HashMap<Integer,Integer> studmark = new HashMap<>();

            studmark.put(1,100);
            studmark.put(2,99);
            studmark.put(3,98);
            studmark.put(4,97);
            studmark.put(5,96);

            System.out.println("Adding list ");
            System.out.println(studmark);

            studmark.put(3,93);

            System.out.println("After Update ID 3 ");
            System.out.println(studmark);

            studmark.remove(5);
            System.out.println("\nAfter Remove ID 5");
            System.out.println(studmark);

            System.out.println("Student ID and Marks ");
                for(Integer id : studmark.keySet()){
                    System.out.println("ID "+ id +"Marks "+studmark.get(id));
                }
    }
}