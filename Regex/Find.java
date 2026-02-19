package Regex;
import java.util.regex.*;
public class Find {
    public static void main(String[] args) {
        String text="My phone number is :9605467845";
        String regex="\\d+";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        if(matcher.find()){
            System.out.println("Found: "+matcher.group());
        }
        else{
            System.out.println("Not found");
        }

    }
}
