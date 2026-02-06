import java.util.*;
public class LowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        String ch=Conversion(str);
        String u1=str.toLowerCase();
        System.out.println(ch);
        System.out.println(u1);
        if(ch.equals(u1)){
            System.out.println("Both String are same");
        }
        else{
             System.out.println("Both String are not same");
        }
    }
    static String Conversion(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>=65 && c<=90){
                char res=(char)(c+32);
                ans+=res;
            }
        }
        return ans;
    }
}
