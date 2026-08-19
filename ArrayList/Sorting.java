import java.util.*;

public class Sorting {
    public static void main(String args []){
        ArrayList <Integer> List = new ArrayList <> ();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);

        System.out.println("List before sorting: " + List); // [2, 5, 9, 3, 6]

        //O(n)
        Collections.sort(List);

        System.out.println("List after sorting in ascending order: " + List); // [2, 3, 5, 6, 9]
        

        Collections.sort(List, Collections.reverseOrder());

        System.out.println("List after sorting in descending order: " + List); // [9, 6, 5, 3, 2]
        
    } 
}