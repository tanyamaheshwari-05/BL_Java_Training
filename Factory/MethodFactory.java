package Factory;

public class MethodFactory {
    
    public static void main(String[] args) {
       Employee e1=EmployeeFactory.getEmployee(new AndroidDevFactory());
       System.out.println(e1.name()+" and salary is " + e1.salary());
    }
}
class EmployeeFactory{
    public static Employee  getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }

}
interface Employee {
    int salary();

    String name();
}

class WebDeveloper implements Employee {
    public int salary() {
        System.out.println("Getting salary of web developer");
        return 50000;
    }

    public String name() {
        System.out.println("Getting name of Web developer");
        return "Tanya";
    }
}

class AndroidDeveloper implements Employee {
    public int salary() {
        System.out.println("Getting salary of Android developer");
        return 40000;
    }

    public String name() {
        System.out.println("Getting name of Android developer");
        return "Sanya";
    }
}

abstract class EmployeeAbstractFactory {
    public abstract Employee createEmployee();
}

class WebDevFactory extends EmployeeAbstractFactory{
    public Employee createEmployee(){
        return new WebDeveloper();
    }
}

class AndroidDevFactory extends EmployeeAbstractFactory{
    public Employee createEmployee(){
        return new AndroidDeveloper();
    }
}
