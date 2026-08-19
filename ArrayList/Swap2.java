import java.util.*;

public class Swap2 {
    public static void main(String args []){
        ArrayList <Integer> List = new ArrayList <> ();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);

        System.out.println("List before swapping: " + List); // [2, 5, 9, 3, 6]

        //O(n)
        Collections.swap(List, 1, 3);

        System.out.println("List after swapping: " + List); // [2, 3, 9, 5, 6]
        
        //Another way to swap elements in an ArrayList is to create a custom method that takes the list and the indices of the elements to be swapped as parameters. Here's an example of how you can implement this:
        System.out.println("List before swapping using custom method: " + List); // [2, 3, 9, 5, 6]
        swap(List, 0, 4);
        System.out.println("List after swapping using custom method: " + List); // [6, 3, 9, 5, 2]
    } 

    public static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}