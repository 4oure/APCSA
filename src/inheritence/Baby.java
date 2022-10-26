package inheritence;

public class Baby extends FamilyMember {
    private int age;

    public String eat(){
        if(age > 3){
            return super.eat();
        }

        return "hands";
    }

    public Baby() {

    }

}
