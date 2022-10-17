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

        Object[][] o = new Object[10][10];

        o[0][0] = 1;
        o[0][1] ="hello";

        System.out.println(o[0][0]);
        System.out.println(o[0][1]);
    }
}