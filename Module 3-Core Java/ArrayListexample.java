import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListexample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names.add(sc.nextLine());
        }
        System.out.println("Student Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
