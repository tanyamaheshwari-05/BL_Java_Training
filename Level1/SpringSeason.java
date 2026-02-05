import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the date from 1-31: ");
        int date = sc.nextInt();
        System.out.print("Enter the month from 1-12: ");
        int month = sc.nextInt();
        System.out.println("Is it spring season? : "+springSeason(date,month));

    }
    static boolean springSeason(int date,int month){
        if(month==3 && date>=20 ||month ==4 || month==5|| month ==6 && date<=20){
            return true;
        }
        return false;
    }
}
