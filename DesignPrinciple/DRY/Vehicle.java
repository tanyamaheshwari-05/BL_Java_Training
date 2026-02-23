package DesignPrinciple.DRY;

public class Vehicle {
    public static void main(String[] args) {
        Vehicle vservice = new Vehicle();
        vservice.carService();
        System.out.println("---------------------------------");
        vservice.busService();
    }
    public void carService(){
        System.out.println("Routine Checkup");
        System.out.println("Let check the tyre");
        System.out.println("Change the engine oil");
        // System.out.println("Wash and clean it");
        this.wash();
    }
    public void busService(){
        System.out.println("Dismental the bus");
        // System.out.println("Wash and clean it"); // here the line is repeat same as CarSerice 4 line.
        this.wash();
        System.out.println("Repaint the bus");
        System.out.println("Checkup and deliver the vehicle");
    }
    private void wash(){
        System.out.println("Wash and clean it");
    }
}
