public class Mammal{

    private boolean vertebrate;
    private boolean milkProducer;
    private String hairColor;

    public boolean isVertebrate(){
        return vertebrate;
    }

    public boolean isMilkProducer(){
        return milkProducer;
    }
    public String getHairColor(){
        return hairColor;
    }

    public void setHairColor(String color){
        this.hairColor = color;
    }

    public Mammal(){
        vertebrate = true;
        milkProducer = true;
    }
    public Mammal(String color){
        vertebrate = true;
        milkProducer = true;
        hairColor = color;
    }

}