import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("Employee");

//        Class employeeClass2 = Employee.class;
//        Employee employee = new Employee();
//        Class employeeClass3 = employee.getClass();

        System.out.println("=============== Fields ===============");
        Field empField = employeeClass.getField("id");
        System.out.println("Type of field id => " + empField.getType());
        System.out.println("*******");

        Field[] arrayFields = employeeClass.getFields();
//      System.out.println(Arrays.toString(arrayFields));
        for(Field field : arrayFields){
            System.out.println("Type of " + field.getName() + " <==> " + field.getType());
        }

        System.out.println("*******");

        Field[] allFields = employeeClass.getDeclaredFields();
        for(Field field : allFields){
            System.out.println("Type of " + field.getName() + " <==> " + field.getType());
        }

        System.out.println("=============== Methods ===============");

        Method method =  employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of methods increaseSalary => " + method.getReturnType()
                + ", parameters of method => " + Arrays.toString(method.getParameterTypes()));

        System.out.println("*******");

        Method method1 =  employeeClass.getDeclaredMethod("changeDepartment", String.class);
        System.out.println("Return type of methods changeDepartment => " + method1.getReturnType()
                + ", parameters of method => " + Arrays.toString(method1.getParameterTypes() ));

        System.out.println("*******");

        Method[] methods = employeeClass.getMethods();
        for(Method m : methods) {
            System.out.println("Name of method => " + m.getName() + ", " +
                    "return type " + m.getReturnType() +
                    ", parameters of method => " + Arrays.toString(m.getParameterTypes()));
        }

        System.out.println("*******");

        Method[] allMethods = employeeClass.getDeclaredMethods();
        for(Method m : allMethods) {
            System.out.println("Name of method => " + m.getName() + ", " +
                    "return type " + m.getReturnType() +
                    ", parameters of method => " + Arrays.toString(m.getParameterTypes()));
        }

        System.out.println("*******");

        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        for(Method m : allMethods2) {
            if (Modifier.isPublic(m.getModifiers())) {
                System.out.println("Name of method => " + m.getName() + ", " +
                        "return type " + m.getReturnType() +
                        ", parameters of method => " + Arrays.toString(m.getParameterTypes()));
            }
        }
            System.out.println("=============== Constructor ===============");

           Constructor constructor =  employeeClass.getConstructor();
            System.out.println("Name of constructor => " + constructor.getName() +
                    ", Parameters of constructor => " + Arrays.toString(constructor.getParameterTypes()));

        System.out.println("*******");

        Constructor constructor2 =  employeeClass.getConstructor(int.class , String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() +
                " parameters , their type are : " + Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("*******");

        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor c : constructors){
            System.out.println("Constructor " + c.getName() + " has " + c.getParameterCount()
                    + " their type are " + Arrays.toString(c.getParameterTypes()) );
        }
    }
 }

