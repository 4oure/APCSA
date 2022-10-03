
public class City {
    private String name;
    private int population;
    private double area;
    private double latitude;
    private double longitude;
    private String mayor;
    private int numberOfNeighborhoods;

    static int cityCount;
    final double taxConstant = 4; // monthly per person

    public City(){

    }

    public City(String name, int population, double area, double latitude, double longitude, String mayor, int numberOfNeighborhoods){
        this.name = name;
        this.population = population;
        this.area = area;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mayor = mayor;
        this.numberOfNeighborhoods = numberOfNeighborhoods;
        cityCount++;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getMayor() {
        return mayor;
    }

    public int getNumberOfNeighborhoods() {
        return numberOfNeighborhoods;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    public void setNumberOfNeighborhoods(int numberOfNeighborhoods) { this.numberOfNeighborhoods = numberOfNeighborhoods; }
    @Override
    public String toString(){
        return this.name + " is a town located at latitude "+ this.latitude + " and at longitude " +this.longitude+". " + this.population+ " people live there, all housed within the luxurious " +this.numberOfNeighborhoods+ " neighborhoods. This beautiful community sits on " + this.area + " square miles of land, all governed by " +this.mayor + ", the mayor of our fine town! There are " +cityCount+ " subcities in our area.";
    }

    public double residentsPerSquareMile(){
        double retVal = 0.0;
        // checking for divide by 0
        if (area > 0) {
            return this.population / this.area;
        }
        return retVal;

    }


    public double monthlyRevenue(){

        return population * taxConstant;
    }

    public double estIndTaxRevenue(double percentOfPeopleWhoGenerateTaxableIncome){ // returns the amount of tax revenue gen per person per month 58.4 % of people generate taxable income (put in as argument)
        double realPercent = percentOfPeopleWhoGenerateTaxableIncome * .001;
        return  population * realPercent * taxConstant;

    }

    public void printCityRevenue(){
        System.out.println("The city of " +name+ " generates $" +estIndTaxRevenue(58.4)+ " dollars per month per walking adult." );
    }

    public static void main (String[] args){
        City Jonesville = new City("Jonesville", 40000, 41092, 202, 10, "John Idiot", 2828);
        System.out.println(Jonesville);

        City idk = new City();
        Jonesville.printCityRevenue();
    }
}
