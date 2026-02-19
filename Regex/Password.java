package Regex;

public class Password {
    public static void main(String[] args) {
        String password="TA@23abs";
        String regex="^[A-Z]{2}+[!@#$%^&*]{1}+[0-9]{2}+[a-z]{3}$";
        System.out.println(password.matches(regex));
    }
}
