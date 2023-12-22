package calculater;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, BiFunction<Integer, Integer, Integer>> calculatorMap = new HashMap<>();
        calculatorMap.put("+", Integer::sum);
        calculatorMap.put("-", (Integer a, Integer b) -> a - b);
        calculatorMap.put("*", (Integer a, Integer b) -> a * b);
        calculatorMap.put("/", (Integer a, Integer b) -> a / b);

        System.out.println("please Enter first Number: ");
        Integer firstInput = scanner.nextInt();
        System.out.println("please Enter Operation: ");
        String key = scanner.next();
        System.out.println("please Enter second Number: ");
        Integer secondInput = scanner.nextInt();

        System.out.println(calculatorMap.get(key).apply(firstInput, secondInput));
    }
}