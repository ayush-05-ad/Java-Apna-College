import java.util.*;

public class Size {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> ();
        list.add(1);
        list.add(3);
        list.add(10);
        list.add(4);
        list.add(5);

        System.out.println(list.size());

        //print the arrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");// 1 3 10 4 5
        }
        System.out.println();
    }
}