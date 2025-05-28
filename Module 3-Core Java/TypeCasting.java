public class TypeCasting {
    public static void main(String[] args) {
    double v2 = 9.75;
    int v1 = (int) v2; // Explicit casting

    System.out.println("Double value: " + v2);
    System.out.println("Converted to int: " + v1);

    int a1 = 50;
    double convertedDouble = a1; // Implicit casting

    System.out.println("Int value: " + a1);
    System.out.println("Converted to double: " + convertedDouble);
}
}
