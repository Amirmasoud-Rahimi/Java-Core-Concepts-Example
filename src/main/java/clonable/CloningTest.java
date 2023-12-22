package clonable;

//cloning is the process of creating an exact copy
public class CloningTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee("Amir", 1, new Department("Tosan", 7));
        Employee employee2 = (Employee) employee1.clone();

        System.out.println(employee1 == employee2);
        System.out.println("employee1.department.name= " + employee1.getDepartment().getName()
                           + " ## employee2.department.name= " + employee2.getDepartment().getName());

        employee2.getDepartment().setName("Tosan2");//Deep Copy

        System.out.println("employee1.department.name= " + employee1.getDepartment().getName()
                + " ## employee2.department.name= " + employee2.getDepartment().getName());
    }
}