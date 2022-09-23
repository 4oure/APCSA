
public class City {
    private String name;
    private int population;
    private double area;
    private double latitude;
    private double longitude;
    private String mayor;
    private int numberOfNeighborhoods;

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

    public void setNumberOfNeighborhoods(int numberOfNeighborhoods) {
        this.numberOfNeighborhoods = numberOfNeighborhoods;
    }

    public String toString(){
        return this.name + " is a town located at latitude "+ this.latitude + " and at longitude " +this.longitude+". " + this.population+ " people live there, all living within the luxurious " +this.numberOfNeighborhoods+ " neighborhoods. This beautiful community sits on " + this.area + " square miles of land, all governed by " +this.mayor + ".";
    }

    public double residentsPerSquareMile(){
        return this.population / this.area;

    }

    public static void main (String[] args){
        City jonesville = new City("jonesville", 40000, 41092, 202, 10, "John Idiot", 2828);
        System.out.println(jonesville.toString());
    }
}
