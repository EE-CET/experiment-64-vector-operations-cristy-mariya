import java.util.*;

public class VectorOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> v = new Vector<>();

        while (true) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Add
                    String name = sc.next();
                    v.add(name);
                    System.out.println("Added");
                    break;

                case 2: // Insert at position (1-based)
                    String name2 = sc.next();
                    int index = sc.nextInt();
                    v.add(index - 1, name2); // convert to 0-based
                    System.out.println("Inserted");
                    break;

                case 3: // Remove
                    String name3 = sc.next();
                    v.remove(name3);
                    System.out.println("Removed");
                    break;

                case 4: // Display
                    System.out.println(v);
                    break;

                case 5: // Exit
                    sc.close();
                    return;
            }
        }
    }
}
