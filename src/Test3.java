import java.lang.reflect.Field;

public class Test3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10,"Victor","HR");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (Double) field.get(employee);
        System.out.println(salaryValue);
        field.set(employee, 1700.0);
        System.out.println(employee);
    }
}
