package inheritence;

public class Baby extends FamilyMember {
    private int age = 0;

    public String eat(){
        if(age > 3){
            return super.eat();
        }

        return "hands";
    }

    public Baby(int age) {

    }
    public Baby(){

    }

}
