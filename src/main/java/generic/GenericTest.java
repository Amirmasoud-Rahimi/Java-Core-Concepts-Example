package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Generics Advantages
 * Type-safety
 * Type casting is not required
 * Compile-Time Checking
 * reusable code
 * */

public class GenericTest {
    public static void main(String[] args) {
        GenericComputer<Double> computer1 = new GenericComputer<>(1, 2.44D, "Seventh");
        GenericComputer<Integer> computer2 = new GenericComputer<>(2, 3, "eighth");

        List<? extends Computer> genericComputers = new ArrayList<Computer>() {{
            add(computer1);
            add(computer2);
        }};

        printGenericObjects(genericComputers);
        isNumber(12.35);
        isNumber("string");

        //Wildcard in Collections -> ? unknown type
        List<? super Integer> lowerBoundedList = new ArrayList<>();
        List<? extends Number> upperBoundedList = new ArrayList<>();

        Map<Integer, ? extends Computer> namesMap = getNamesMap(genericComputers);
        Map<Integer, Computer> coedMap = getCoedMap(genericComputers);
    }

    //Generic Methods
    public static <T> void isNumber(T genericValue) {
        System.out.println(genericValue.toString() + " isNumber = " + (genericValue instanceof Number));
    }

    public static <T> void printGenericObjects(List<T> genericObjects) {
        for (T t : genericObjects) {
            System.out.println(t.toString());
        }
    }

    // Show Difference Between Wildcard and Generic Type
    public static <T extends Computer> Map<Integer, T> getNamesMap(List<T> computerList) {
        Map<Integer, T> codesMap = new HashMap<>();
        computerList.forEach(c -> codesMap.put(c.getCode(), c));
        return codesMap;
    }

    public static Map<Integer, Computer> getCoedMap(List<? extends Computer> computers) {
        Map<Integer, Computer> codesMap = new HashMap<>();
        computers.forEach(c -> codesMap.put(c.getCode(), c));
        return codesMap;
    }
}