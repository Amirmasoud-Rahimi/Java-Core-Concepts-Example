package clonable;

public class Department implements Cloneable {
    private String name;
    private int number;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Department() {

    }

    public Department(String name, int number) {
        this.name = name;
        this.number = number;
    }

    //Shallow Copy is the “default implementation” in Java
    //Shallow Copy is suitable for primitives and immutable
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}