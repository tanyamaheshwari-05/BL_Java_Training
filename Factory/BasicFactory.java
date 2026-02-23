package Factory;

public class BasicFactory {
    public static void main(String[] args) {
        Employee emp = EmployeeFactory.getEmployee("AndroidDeveloper");
        System.out.println(emp);
        System.out.println(emp.salary());
        Employee emp1 = EmployeeFactory.getEmployee("WebDeveloper");
        System.out.println(emp1);
        System.out.println(emp1.salary());
    }
}

interface Employee {
    int salary();
}

class WebDeveloper implements Employee {
    public int salary() {
        System.out.println("Getting salary of Web Developer: ");
        return 50000;
    }

}

class AndroidDeveloper implements Employee {
    public int salary() {
        System.out.println("Getting salary of Android Developer: ");
        return 30000;
    }
}

class EmployeeFactory {
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("AndroidDeveloper")) {
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("WebDeveloper")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
