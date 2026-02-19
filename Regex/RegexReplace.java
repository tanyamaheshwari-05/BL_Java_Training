package Regex;

public class RegexReplace {
    public static void main(String[] args) {
         String j="java123 is456 fun";
        String result=j.replaceAll("\\d+"," ");
        System.out.println(result);
    }

}

