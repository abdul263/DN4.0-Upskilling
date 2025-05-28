public class OperatorPrecedence {
    public static void main(String[] args) {
        int r1 = 10 + 5 * 2;
        int r2 = (10 + 5) * 2;
        System.out.println("Result1 (10 + 5 * 2) = " + r1);
        System.out.println("Result2 ((10 + 5) * 2) = " + r2);
    }
}
