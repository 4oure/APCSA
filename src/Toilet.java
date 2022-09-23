// link to repl.it: https://replit.com/@DavidFleniken/APCSA#Main.java



class Main {
    public static void main(String[] args) {
        double money = 100000;
        Toilet dyson = new Toilet(5, 5, "white");
        System.out.println(dyson.getColor());

    }
}

class Toilet {
    private final double waterCapacity;
    private double filledAmount;
    private boolean isFull;
    private boolean isEmpty;
    private boolean isClean;
    private String color;


    //waterCap must be greater than 0
    public Toilet(double waterCap, double fillAmount, String whatColor) {
        waterCapacity = waterCap;
        filledAmount = fillAmount;
        color = whatColor;
        if (waterCap < 0) {
            System.out.println("How is there a negative amount of water in your toilet? Ew!");
        }
        if (waterCap == fillAmount) {
            isFull = true;
            isEmpty = false;
        } else {
            isFull = false;
            if (fillAmount == 0) {
                isEmpty = true;
            }

        }
    }

    public void flushToilet() {
        isFull = false;
        isEmpty = true;
        filledAmount = 0;
    }

    public void setColor(String toiletColor) {
        color = toiletColor;
    }

    public String getColor() {
        return color;
    }

    public void setCleanliness(Boolean isItClean) {
        isClean = isItClean;
    }

}
  