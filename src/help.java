
import java.lang.reflect.Array;
import java.util.ArrayList;
class help {

    public static double average(ArrayList<Integer> x) {
        int len = x.size();
        double counter = 0;
        for (int num : x) {

            counter += num;



        }
        return counter / len;
    }

    public static void namePrinter(ArrayList<String> x) {
        for (String person : x) {

            System.out.println(person);
        }
    }

    public static void averageForStudent(ArrayList<Integer> one, ArrayList<Integer> two, ArrayList<Integer> three, ArrayList<String> name, String who){
        int indexOfWho = name.indexOf(who);
        int scoreOne = one.get(indexOfWho);
        int scoreTwo = two.get(indexOfWho);
        int scoreThree = three.get(indexOfWho);
        double average = (scoreOne + scoreTwo + scoreThree) / 3;
        System.out.println("The average for "+who+ " is " +average);

    }

    public static void highestScore(ArrayList<Integer> one, ArrayList<Integer> two, ArrayList<Integer> three, ArrayList<String> name, String who){
        int indexOfWhoever = name.indexOf(who);
        int testOneScore = one.get(indexOfWhoever);
        int testTwoScore = two.get(indexOfWhoever);
        int testThreeScore = three.get(indexOfWhoever);
        System.out.println(testThreeScore);
        System.out.println(testTwoScore);
        System.out.println(testOneScore);
        if(testTwoScore > testOneScore && testTwoScore> testThreeScore){
            System.out.println(who + "'s highest score is " +testTwoScore);
        }
        if(testOneScore > testTwoScore && testOneScore> testThreeScore){
            System.out.println(who + "'s highest score is " +testOneScore);
        }
        if(testThreeScore > testTwoScore && testThreeScore> testOneScore){
            System.out.println(who + "'s highest score is " +testThreeScore);
        }
    }

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



        averageForStudent(scores1, scores2, scores3, names,"Nathan");
        averageForStudent(scores1, scores2, scores3, names,"Nolan");
        averageForStudent(scores1, scores2, scores3, names,"Adrian");
        averageForStudent(scores1, scores2, scores3, names,"Cameron");
        averageForStudent(scores1, scores2, scores3, names,"Santiago");
        averageForStudent(scores1, scores2, scores3, names,"Savannah");
        averageForStudent(scores1, scores2, scores3, names,"Valentina");
        averageForStudent(scores1, scores2, scores3, names,"Kennedy");
        averageForStudent(scores1, scores2, scores3, names,"Madelyn");
        averageForStudent(scores1, scores2, scores3, names,"Josephine");
        System.out.println("The average for test 1 is " +average(scores1));
        System.out.println("The average for test 2 is " +average(scores2));
        System.out.println("The average for test 3 is " +average(scores3));
        highestScore(scores1,scores2,scores3,names, "Valentina");






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


