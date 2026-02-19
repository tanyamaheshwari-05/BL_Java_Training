package Regex;

import java.util.regex.*;

public class Email {
    public static void main(String[] args) {
        String email = "tanya123@gmail.com";
        String regex = "^[a-zA-Z0-9.%+@-_]+@[a-zA-Z.]+\\.[a-zA-Z]{2,}$";
        System.out.println(email.matches(regex));
    }
}
