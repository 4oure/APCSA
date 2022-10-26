package inheritence;

public class Baby extends FamilyMember {
    private int age;

    public String eat(){
        if(age > 3){
            return super.eat();
        }

        return "hands";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Baby(int age) {
        setAge(age);

    }
    public Baby(){

    }

}
