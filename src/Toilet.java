class Main{
    public static void main(String[] args){
        double money = 100000;
        Toilet dyson = new Toilet();

    }
}

class Toilet {
    private double waterCapacity;
    private double filledAmount;
    private boolean isFull;
    private boolean isEmpty;
    private boolean isClean;
    private String color;

    //waterCap must be greater than 0
    public void Toilet(double waterCap, double fillAmount){
        waterCapacity = waterCap;
        filledAmount = fillAmount;
        if (waterCap < 0){
            System.out.println("How is there a negative amount of water in your toilet? Ew!");
        }
        if(waterCap == fillAmount){
            isFull = true;
            isEmpty = false;
        }else{
            isFull = false;
            if(fillAmount == 0){
                isEmpty = true;
            }

        }



    }
    public void flushToilet(){
        isFull = false;
        isEmpty = true;
        filledAmount = 0;
    }

    public void setColor(String toiletColor){
        color = toiletColor;
    }

    public String getColor(){
        return color;
    }
    public void setCleanliness(Boolean isItClean){
        isClean = isItClean;
    }

}
  