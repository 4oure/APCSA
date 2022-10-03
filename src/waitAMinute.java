public class waitAMinute {
    public static void main(String[] args) {
        int[] myNum = {101, 2, 92, 187, 56};
        String[] dogs = {"mutt", "shepherd", "lab", "collie"};
        int totalEvens = 0;
        for (int number : myNum) {
            if (number % 2 != 0) {
                System.out.println(number + " is odd.");
            }  else{
                totalEvens+=number;
            }

        }

        System.out.println("The total number of evens is" +totalEvens);
    }

}