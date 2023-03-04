import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class employee = Class.forName("Employee");

        Constructor<Employee> constructor = employee.getConstructor();
        Employee emp1 = constructor.newInstance();

        Constructor<Employee> constructor2 = employee.getConstructor(int.class, String.class, String.class);
        Employee emp2 = constructor2.newInstance(5, "Paul", "IT");
        System.out.println(emp2);

        Method method = employee.getMethod("setSalary", double.class);
        method.invoke(emp2, 950.0);
        System.out.println(emp2);
    }
}
