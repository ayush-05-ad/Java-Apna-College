import java.util.*;

public class Maximum {
    public static void main(String args []){
        ArrayList <Integer> List = new ArrayList <> ();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);

        //O(n)
        int max = Integer.MIN_VALUE;

        for(int i=0; i< List.size(); i++){
            if(max < List.get(i)) {
                max = List.get(i);
            }

            //int max = Math.max(max, list.get(i));
        }

        
        System.out.println(max); // 9
        
    } 
}