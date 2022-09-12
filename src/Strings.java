public class Strings {
    public static void main(String[] args){
        System.out.println("Hello");
        String name = "Gavin";
        System.out.println(name.substring(0,3));
        // prints Gav
        // [ ) first is inclusive, second isnt
        System.out.println(name.indexOf("av"));

        // use the substring method of any string and then write the substirng that returns the last character of the string
        System.out.println(name.charAt(name.length()-1));
    }
}
