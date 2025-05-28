import java.util.*;
public class LambdaExpression {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Zara");

        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Sorted Names:");
        names.forEach(System.out::println);
    }
}
