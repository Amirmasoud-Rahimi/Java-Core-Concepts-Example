package comparator;

public class Country {
    private long population;
    private String name;
    private Double area;

    public Country() {
    }

    public Country(long population, String name, Double area) {
        this.population = population;
        this.name = name;
        this.area = area;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String toString() {
        return "Country{" +
                "name=" + this.name + '/' +
                "population=" + this.population + '/' +
                "area=" + this.area +
                '}';
    }
}