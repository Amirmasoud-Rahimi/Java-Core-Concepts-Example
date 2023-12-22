package polymorphism;

public class PolymorphismTest {
    public static void main(String[] args) {
        // Overloading (Compile-Time Polymorphism)
        Parent parent1=new Parent();
        Parent parent2=new Parent("Aban");
        Parent parent3=new Parent("Dey",3);

        // Overriding (Run-Time Polymorphism)
        Parent parent4=new Parent("Aban");
        parent4.printName();

        Parent child=new Child("Bahman",9,7.5);
        child.printName();
    }
}