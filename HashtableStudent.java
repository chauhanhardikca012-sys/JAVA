import java.util.*;

class HashtableStudent{
    public static void main(String []args){
        Hashtable<Integer,String> stud = new Hashtable<>();

        stud.put(1,"Hardik");
        stud.put(2,"Darshan");
        stud.put(3,"Pradip");
        stud.put(4,"Jayendra");
        stud.put(5,"Harshad");

        System.out.println("Students ");
        show(stud);

        stud.remove(5);

        System.out.println("\nStudents Remove 5 ");
        show(stud);
    }
    public static void show(Hashtable<Integer,String>table){
        for(Map.Entry<Integer,String>entry : table.entrySet()){
            System.out.println("Roll no "+entry.getKey());
            System.out.println("Name "+entry.getValue());
        }
    }
}