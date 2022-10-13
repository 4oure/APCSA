import java.sql.Array;
import java.util.*;
import java.util.ArrayList;
    class help {
        public static void main(String[] args) {
            ArrayList<Integer> scores1 = new ArrayList<Integer>();
            ArrayList<Integer> scores2 = new ArrayList<Integer>();
            ArrayList<Integer> scores3 = new ArrayList<Integer>();
            ArrayList<String> names = new ArrayList<String>();
            scores1.add(88);
            scores1.add(70);
            scores1.add(81);
            scores1.add(84);
            scores1.add(96);
            scores1.add(78);
            scores1.add(94);
            scores1.add(89);
            scores1.add(99);
            scores1.add(98);
            scores2.add(98);
            scores2.add(76);
            scores2.add(74);
            scores2.add(80);
            scores2.add(100);
            scores2.add(75);
            scores2.add(73);
            scores2.add(70);
            scores2.add(82);
            scores2.add(96);
            scores3.add(89);
            scores3.add(74);
            scores3.add(81);
            scores3.add(93);
            scores3.add(98);
            scores3.add(72);
            scores3.add(80);
            scores3.add(91);
            scores3.add(94);
            scores3.add(99);
            names.add("Nathan");
            names.add("Nolan");
            names.add("Adrian");
            names.add("Cameron");
            names.add("Santiago");
            names.add("Savannah");
            names.add("Valentina");
            names.add("Kennedy");
            names.add("Madelyn");
            names.add("Josephine");

            average(scores1);


            public void average(ArrayList<Integer> x){
                for(int num : nums){
                    double counter = 0;
                    counter += num;
                    double avg =num / nums.size();
                    System.out.println(avg);

                }
            }

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






        }
    }

