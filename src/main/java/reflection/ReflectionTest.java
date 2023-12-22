package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

//Use Reflection to manipulate classes, interfaces, constructors, methods, and fields at run time
public class ReflectionTest {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        String name = Computer.class.getName();
        System.out.println("Class Name= " + name);
        Method[] methods = Computer.class.getMethods();
        System.out.println("Class Methods= " + Arrays.toString(methods));
        //Computer computer=new Computer(); //'Computer()' has private access in 'reflection.Computer'
        Constructor<?>[] declaredConstructors = Computer.class.getDeclaredConstructors();
        System.out.println("Class Constructors= " + Arrays.toString(declaredConstructors));
        declaredConstructors[1].setAccessible(true); // Change Access Modifiers Using Reflection
        Computer computer = (Computer) declaredConstructors[1].newInstance("Intel", 13);
        System.out.println("Computer.generation= " + computer.getGeneration());
        System.out.println(Arrays.toString(computer.getClass().getDeclaredFields()));
        Field privateValue = computer.getClass().getDeclaredField("securedValue");
        //Class reflection.ReflectionTest can not access a member of class reflection.Computer with modifiers "private"
        privateValue.setAccessible(true); // Change Access Modifier using reflection
        System.out.println("securedValue= " + (int) privateValue.get(computer));

        //Change Computer.generation using reflection
        Method method = computer.getClass().getMethod("setGeneration", int.class);
        method.invoke(computer, 12);
        System.out.println("Computer.generation= " + computer.getGeneration());
    }
}