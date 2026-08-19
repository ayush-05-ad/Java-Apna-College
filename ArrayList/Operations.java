import java.util.ArrayList;

public class Operations {
    public static void main (String arg []){
        ArrayList <Integer> list = new ArrayList<> ();

        list.add(1);// O(n)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list); // [1, 2, 3, 4, 5]

        //Get Operation
        int element = list.get(2);
        System.out.println(element);

        //Delete
        list.remove(2);
        System.out.println(list); //o/p: [1, 3, 4, 5]

        //set
        list.set(2, 10); //O(n)
        System.out.println(list);// [1, 3, 10, 4, 5]

        System.out.println(list.contains(1));
        System.out.println(list.contains(2));

        list.add(1, 9); //O(n)
        System.out.println(list); //[1, 9, 3, 10, 4, 5]
    }
}