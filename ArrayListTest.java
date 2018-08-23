import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

    public static void main(String[] args){
        ArrayList<Employee> lst = new ArrayList<>();
        int i = 2;
        while(i>=0){
            lst.add(new Employee("Marry"+i, 2000+i));
            i -= 1;
        }

        Employee[] staff = new Employee[5];
        lst.toArray(staff);

        System.out.println("array length:" + staff.length);
        System.out.println(staff.getClass().getName());
        System.out.println("array list size:" + lst.size() );
        System.out.println(staff.getClass().getName()); 
        System.out.println("list to array:" + Arrays.toString(staff));

        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0; j<=3; j++){
            list.add(j * j);
        }
        //ArrayList.removeIf():移除列表中的某个元素
        list.removeIf(num -> num <= 3);
        //列表中的元素可以直接打印；数组中的元素，通过toString方法，一起打印出来。
        System.out.println("After remove some numbers: " + list);

        String str = "19";
        //transform number's string to int
        int x = Integer.parseInt(str);
        System.out.println("string to integer:" + x);

        //Arrays.toString(),将数组以字符串的形式输出
        String[] names = new String[]{"Lili", "Hanmei","Marry","Frunk"};
        System.out.println(Arrays.toString(names));

        //sort string by dictionary
        Arrays.sort(names);
        System.out.println("After sorted by dictionary"+Arrays.toString(names));

        //sort string by length
        Arrays.sort(names,(String first, String second) -> first.length() - second.length());
        System.out.println("Sorted by length:" + Arrays.toString(names));

        int[] numbers = {5,4,3,2,1,8};
        String s = Arrays.toString(numbers);
        System.out.printf("initial int array length: %d",numbers.length);
        System.out.println();
        System.out.printf("After toString,array length: %d",s.length());
        System.out.println();

        //numbers sort
        Arrays.sort(numbers);
        System.out.println("Sort numbers:" + Arrays.toString(numbers));
    }
}
