package inheritence;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Dog peter = new Dog("black" , "Peter");
        System.out.println(peter.talk());
        System.out.println();

        // break
        FamilyMember mom = new FamilyMember();
        Baby junior = new Baby();
        SporkUser auntSue = new SporkUser();

        System.out.println(mom.drink());
        System.out.println(junior.drink());
        System.out.println(auntSue.drink());
        System.out.println(mom.eat());
        System.out.println(junior.eat());
        System.out.println(auntSue.eat());

        ArrayList<FamilyMember> family = new ArrayList<FamilyMember>();

        family.add(mom);
        family.add(junior);
        family.add(auntSue);

        for(FamilyMember member: family){
            System.out.println(member.drink());
            System.out.println(member.eat());
            System.out.println();

        }

/* Dog myDog1 = new Dog();
System.out.println(myDog1.getName());
System.out.println(myDog1.getHairColor());
System.out.println(myDog1.isVertebrate());
System.out.println(myDog1.isMilkProducer());
System.out.println();

Dog myDog2 = new Dog("Brown", "Bella");
System.out.println(myDog2.getName());
System.out.println(myDog2.getHairColor());
System.out.println(myDog2.isVertebrate());
System.out.println(myDog2.isMilkProducer());
System.out.println(myDog2.talk());
*/

    }

}
