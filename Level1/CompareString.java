import java.util.*;
public class CompareString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1= sc.next();
        System.out.println("Enter string 2");
        String str2= sc.next();
        boolean customMethod=compareString(str1, str2);
        boolean builtIn= str1.equals(str2);
        System.out.println("Custom Method says they are equal: " + customMethod);
    System.out.println("Built-in Method says they are equal: " + builtIn);
        if(builtIn==customMethod){
            System.out.println("Both method return same output");
        }
        else{
             System.out.println("Both method does not return same output");
        }

    }
    static boolean compareString(String str1,String str2){
        if(str1==null|| str2==null ||str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    
}
