import java.util.Arrays;

public class intDataClassworkAssignment {
    public static void main(String[] args) {
        int[][] data = {  { 12, 41, 1867, 234 },  { 70, 0, 714, 0 },  { 43, 59, 81, 28 },  { 209, 8, 963, 99 } };
       sumOfDiagonals(data);
        System.out.println();
        printArrayInReverseOrder(data);
        // 10 x 4
    }

    // print the sum of the diagonals
    public static void sumOfDiagonals(int[][] stuff){
        int sum = 0;
//           int topLeft = stuff[0][0];
//           int topRight = stuff[0][stuff[0].length-1];
//           int bottomLeft = stuff[stuff.length-1][0];
//           int bottomRight = stuff[stuff.length-1][stuff[0].length-1];
//        System.out.println(topLeft+bottomRight);
//        System.out.println(topRight+bottomLeft);

        for(int i = 0; i < stuff.length ; i++){
            for(int x = 0; x < stuff[0].length; x++){
                if (i == x){
                    sum += stuff[i][x];
                } if (i + x == stuff.length-1){
                    sum+=stuff[i][x];
                }
            }
            }
        System.out.println(sum);

        }
        //go to last row first column and then last row and last column
        //print the array in reverse order
        public static void printArrayInReverseOrder(int[][] stuff){
            for(int i = stuff.length-1; i >= 0; i--){
                System.out.println();
                for(int x = stuff[i].length-1; x >= 0; x--){
                    System.out.print(stuff[i][x] + " ");
                }
            }

        }
    }



