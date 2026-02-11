
import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        
        //add
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Toyota");
        System.out.println(cars);

        cars.add(0, "Swift");
        System.out.println(cars);

        //delete
        cars.remove(0);
        System.out.println(cars);

        cars.clear();
        System.out.print(cars);

        //read
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Toyota");
        System.out.println(cars.get(0));

        //update
        cars.set(1,"Audi");
        System.out.println(cars);



    }
}