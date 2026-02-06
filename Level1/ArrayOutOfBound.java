import java.util.*;
public class ArrayOutOfBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of name user want to insert :");
        int num = sc.nextInt();
        sc.nextLine();
        String name[] = new String[num];
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextLine();
        }
        try {
            generateException(name);
        } catch (Exception e) {
            System.out.println("Program revoked due to exception generated");
        }
        hanleException(name);
    }
    static void generateException(String[] name) {
        System.out.println("Generating exception");
        System.out.println("Names: " + name[name.length]);
    }
    static void hanleException(String[] name) {
        try {
            System.out.println("Name at index: " + name[name.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error occured: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime exception: " + e.getMessage());
        }
    }
}
