package generic;

//Generic Class
public class GenericComputer<T extends Number> extends Computer {
    private T processClock;
    private String generation;

    public GenericComputer(int code, T processClock, String generation) {
        super(code);
        this.processClock = processClock;
        this.generation = generation;
    }

    public T getProcessClock() {
        return processClock;
    }

    public void setProcessClock(T processClock) {
        this.processClock = processClock;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "GenericComputer{" +
                "code=" + super.getCode() +
                " processClock=" + processClock +
                ", generation='" + generation + '\'' +
                '}';
    }
}