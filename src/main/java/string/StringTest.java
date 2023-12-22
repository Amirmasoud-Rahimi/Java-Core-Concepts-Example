package string;

import java.util.Arrays;
import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        String literalStr1 = "literal";
        String literalStr2 = "literal";
        System.out.println("literalStr1 == literalStr2 -> " + (literalStr1 == literalStr2));
        System.out.println("literal.length() = " + literalStr1.length());

        String newStr1 = literalStr1.replace('a', '@');
        System.out.println(newStr1);

        String heapStr = new String("strHeap");
        String constantPoolStr = heapStr.intern();

        List<String> stringList = Arrays.asList("Hello", "World", "2024");
        String msg = String.join("*", stringList);
        System.out.println(msg);


        StringBuilder builderStr = new StringBuilder("stringBuilderTest");
        StringBuffer bufferStr = new StringBuffer("stringBufferTest");

        System.out.println(builderStr);
        System.out.println(bufferStr);
    }
}