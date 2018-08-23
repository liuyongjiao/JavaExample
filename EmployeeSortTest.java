import java.util.Arrays;


public class EmployeeSortTest {
    public static  void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry", 3500);
        staff[1] = new Employee("Carl", 2500);
        staff[2] = new Employee("Marry", 3000);

        Arrays.sort(staff);
        for(Employee e: staff){
            System.out.println("Name=" + e.getName() + ", salary=" + e.getSalary());
        }



    }
}

