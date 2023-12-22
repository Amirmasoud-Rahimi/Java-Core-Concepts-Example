package polymorphism;

public class Child extends Parent {
    private Double age;

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Child(String name, int number, Double age) {
        super(name, number); // invoke parent constructor
        this.age = age;
    }

    @Override
    public void printName() {
        System.out.println("I am child. MyAge= " + (this.age != null ? this.age : "undefined"));
    }
}