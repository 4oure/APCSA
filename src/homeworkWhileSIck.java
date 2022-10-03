public class homeworkWhileSIck {
    /* Inrepl.it and using the two arrays below



Use both the 'for' loop and the 'enhanced for' loop for each of the above

Paste your output in the dropbox
Your output should look exactly like this:
101 is odd
187 is odd

101 is odd
187 is odd

The sum of all even numbers is 150

The sum of all even numbers is 150

shepherd
collie

shepherd
collie

Print all odd numbers in the array myNum
Print the sum of all even numbers in the array myNum
Print all the dog breed names in dogs that contain an 'e'

     */
    public static void main(String[] args) {
        int[] myNum = {101, 2, 92, 187, 56};
        String[] dogs = {"mutt", "shepherd", "lab", "collie"};
        int totalEvens1 = 0;
        int totalEvens2 = 0;

        for(int x = 0; x < myNum.length; x++) {
            if (myNum[x] % 2 != 0) {
                System.out.println(myNum[x] + " is odd");

            }

        }
        System.out.println();
        for (int number : myNum) {
            if (number % 2 != 0) {
                System.out.println(number + " is odd");
            }
        }



        for(int x = 0; x < myNum.length; x++){
            if(myNum[x] % 2 == 0){
                totalEvens1+= myNum[x];
            }
        }
        System.out.println(" \nThe sum of all even numbers is "+totalEvens1);

        for (int number : myNum){
            if(number % 2 == 0){
                totalEvens2 += number;
            }
        }
        System.out.println();
        System.out.println("The sum of all even numbers is " +totalEvens2 + "\n");


        for(int x=0; x<dogs.length; x++){
            if (dogs[x].contains("e")){
                System.out.println((dogs[x]));
            }
        }
        System.out.println();

        for(String dog : dogs) {
            if (dog.contains("e")) {
                System.out.println(dog);
            }
        }

    }


}
