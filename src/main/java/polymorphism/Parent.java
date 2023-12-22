package polymorphism;

public class Parent {
    private String name;
    private int number;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //Constructor Overloading

    // 1 -> Parent()
    public Parent() {
    }

    // 2 -> Parent()
    public Parent(String name) {
        this.name = name;
    }

    // 3 -> Parent()
    public Parent(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void printName() {
        System.out.println("I am parent. MyName= " + (this.name != null ? this.name : "undefined"));
    }
}