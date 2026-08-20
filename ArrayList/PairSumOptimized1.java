import java.util.ArrayList;

public class PairSumOptimized1 {

    public static boolean pairSum (ArrayList <Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while (lp != rp) {
            //case1
            if(list.get(lp) + list.get(rp) == target ){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            else{
                rp--;
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
