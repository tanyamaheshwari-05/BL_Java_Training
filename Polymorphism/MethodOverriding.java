package Polymorphism;
public class MethodOverriding {
    public static void main(String[] args) {
        Calculator calc1= new Calculator();
        AdvanceCalculator calc2= new AdvanceCalculator();
        System.out.println("Sum Result of calculator 1: "+calc1.mySum(3, 5));
        System.out.println("Diff Result of calculator 1: "+calc1.myDiff(3, 5));
        System.out.println("Sum Result of calculator 2: "+calc2.mySum(3, 5));
        System.out.println("Diff Result of calculator 2: "+calc2.myDiff(3, 5));
    }

}
class Calculator{
    int mySum(int a,int b){
        return a+b;
    }
    int myDiff(int a,int b){
        return a-b;
    }
}
class AdvanceCalculator extends Calculator{
        @Override
        int mySum(int a,int b){
            return a+b+5;
        }
        int myDiff(int a,int b){
            return a-b-2;
        }
}

