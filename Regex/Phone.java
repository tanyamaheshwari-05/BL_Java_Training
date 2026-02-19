package Regex;

public class Phone {
    public static void main(String[] args) {
        String phone="8907645789";
        String regex="^[6-9][0-9]{9}$";
        System.out.println(phone.matches(regex));
    }
}
