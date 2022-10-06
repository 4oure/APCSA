import java.lang.reflect.Array;
import java.util.ArrayList;

public class createArrayListssssss {
    public static void updateMulThreeToZero(ArrayList<Integer> numbers){
        for (Integer number : numbers){
            if(number % 3 == 0){
               numbers.set(number-1, 0);
            }
        } System.out.println("Adjusting for any number that is divisible by three being set to zero, here is your new ArrayList: " +numbers);
    }
    public static void greaterThanIndex(ArrayList<Integer> numbers){
        for(int x = 0; x < numbers.size(); x++){
            if(numbers.get(x) > x){
                numbers.set(x, 10);
            }

        }
        System.out.println(numbers);
    }
    public void swapOddtoEven(ArrayList<Integer> numbers){

    }

    public static void main(String[] args) {
        ArrayList<Integer> hi = new ArrayList<Integer>();
        for(int x = 1; x <= 10;x++){
            hi.add(x);

        }
        System.out.println(hi);
        greaterThanIndex(hi);
    }
}
