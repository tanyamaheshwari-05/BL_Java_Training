import java.util.*;
public class CharacterReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = sc.next();
        char[] custom = stringToChar(str);
        char[] builtIn = str.toCharArray();
        boolean res = comparison(custom, builtIn);
        if (res) {
            System.out.println("Both method return the same res");
        } else {
            System.out.println("Both method does not return the same res");
        }
    }

    static char[] stringToChar(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
            ;
        }
        return arr;
    }

    static boolean comparison(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}
