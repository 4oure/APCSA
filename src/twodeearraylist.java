import java.lang.reflect.Array;
import java.util.ArrayList;

public class twodeearraylist {
    public static void main(String[] args) {
        ArrayList<Object> hi = new ArrayList<>();
        ArrayList<Object> hello = new ArrayList<>();
        ArrayList<ArrayList<Object>> hi2 = new ArrayList<>();
        hi2.add(hi);
        ArrayList<ArrayList<Integer>> integerArrayL = new ArrayList<>();
        ArrayList<Integer> juan = new ArrayList<>();
        juan.add(1);
        juan.add(2);
        juan.add(3);
        ArrayList<Integer> teu = new ArrayList<>();
        teu.add(4);
        teu.add(5);
        teu.add(6);
        integerArrayL.add(juan);
        integerArrayL.add(teu);

        for (ArrayList<Object> objects : hi2) {
            for(Object item : objects){
                System.out.print(item +" ");
            }
        }


        for (ArrayList<Integer> row : integerArrayL){
            System.out.println();
            for(Integer col : row){
                System.out.print(col + " ");

            }

        }

        // sout(lists.get(2).get(4)); to get 2nd index row and 4 index of column
    }
}
