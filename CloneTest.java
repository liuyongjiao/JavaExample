public class CloneTest {

    public static void main(String[] args){

        try{
            Employee original = new Employee("Harry", 5000);
            original.setHireDay(2008, 6, 20);

            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 6, 20);
            System.out.println("Original:" + original);
            System.out.println("copy: " + copy);
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }


    }
}
