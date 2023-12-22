package clonable;

public class Employee implements Cloneable {
    private String name;
    private int code;
    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee() {
    }

    public Employee(String name, int code, Department department) {
        this.name = name;
        this.code = code;
        this.department = department;
    }

    //Deep Copy used when we have reference to other classes -> ex:department
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        //employee.getDepartment().clone() -> set new reference for department
        employee.setDepartment((Department) employee.getDepartment().clone());
        return employee;
    }
}