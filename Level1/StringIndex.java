import java.util.*;

public class StringIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
         try {
            generateException(str);
        } catch (Exception e) {
            System.out.println("Program stopped due to Runtime Exception.");
        }
        hanleException(str);
    }

    public static void generateException(String str) {
        System.out.println("Generating String index out of bound exception");
        char ch = str.charAt(str.length());
        System.out.println("Character of position " + str.length() + "is: " + ch);
    }

    public static void hanleException(String str) {
        System.out.println("Handling exception");
        try {
            char ch = str.charAt(str.length());
            System.out.println("Character of position " + str.length() + "is: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occured: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Some Runtime exception: " + e.getMessage());
        }
    }
}
