import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable<Employee>, Cloneable{

    private String name ;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    //深层拷贝
    public Employee clone() throws CloneNotSupportedException{
        //object.clone()
        Employee cloned = (Employee) super.clone();

        //clone multable fields
        cloned.hireDay =  (Date) hireDay.clone();

        return cloned;
    }

    public void setHireDay(int year, int month, int day){
        Date newHireDay = new GregorianCalendar(year, month-1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent;
        salary += raise;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }

    public String toString(){
        return "Employee[name=" + name +", salary=" + salary + ", hireDay=" + hireDay + "]";
    }

}
