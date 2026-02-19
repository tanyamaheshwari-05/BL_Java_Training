package Regex;

public class RegexReplace {
    public static void main(String[] args) {
         String j="Tanya234 ";
        String result=j.replaceAll("\\d+"," ");
        System.out.println(result);
    }

}

