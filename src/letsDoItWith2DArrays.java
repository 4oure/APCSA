
class letsDoItWith2DArrays{
    public static void main(String[] args) {
        /*
      Nathan	88	98	89
Nolan	70	76	74
Adrian	81	74	81
Cameron	84	80	93
Santiago	96	100	98
Savannah	78	75	72
Valentina	94	73	80
Kennedy	89	70	91
Madelyn	99	82	94
Josephine	98	96	99 */

        String[] names = {"Nathan", "Nolan", "Adrian", "Cameron", "Santaigo", "Savannah", "Valentina", "Kennedy", "Madelyn", "Josephine" };
        int[][] scores = {
                {88, 98, 89}, {70,76,74}, {81,74,81}, {84, 80, 93}, {96, 100, 98}, {96,100,98}, {78, 75, 72}, {94, 73, 80}, {89, 70, 91}, {99, 82, 94}, {98,96,99}
        };

        for (int[] score : scores) {
            for (int i : score) {
                System.out.print(i + " ");
            }
            System.out.println();
        }






    }
}