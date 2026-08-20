import java.util.ArrayList;

public class PairSum1 {

    public static boolean pairSum (ArrayList <Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String args []){
        ArrayList <Integer> List = new ArrayList <> ();

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);

        int target = 5;

        System.out.println(pairSum(List, target));
    }
}
