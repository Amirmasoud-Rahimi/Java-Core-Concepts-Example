package reflection;

public class Computer {
    private String model;
    private int generation;
    private int securedValue=777;

    private Computer() {

    }

    private Computer(String model, int generation) {
        this.model = model;
        this.generation = generation;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }
}