package innerclass;

public class InnerClassTest {
    public static void main(String[] args) {
        //a class that has no name is known as an anonymous inner class in Java.
        Person person=new Person(){
            public void run(){
                System.out.println("person running!");
            }
        };
    }
}