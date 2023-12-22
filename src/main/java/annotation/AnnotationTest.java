package annotation;

public class AnnotationTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Amirmasoud", 433);
        CompanyInfo companyInfo = employee.getClass().getAnnotation(CompanyInfo.class);
        System.out.println("Employee Name= " + employee.getName() + " * Employee Code= " + employee.getCode());
        System.out.println("Company Name= " + companyInfo.name() + " * Company Address=" + companyInfo.address());

        //@Inherited
        EmployeeChild employeeChild = new EmployeeChild("Amir", 444);
        CompanyInfo childCompanyInfo = employeeChild.getClass().getAnnotation(CompanyInfo.class);
        System.out.println("EmployeeChild Name= " + employeeChild.getName() + " * EmployeeChild Code= " + employeeChild.getCode());
        System.out.println("ChildCompany Name= " + childCompanyInfo.name() + " * ChildCompany Address=" + childCompanyInfo.address());

        //@Repeatable
        RepeatableCompany[] repeatableCompanies = RepeatableEmployee.class.getAnnotationsByType(RepeatableCompany.class);
        for (RepeatableCompany rc : repeatableCompanies) {
            System.out.println(rc.name());
        }
    }
}