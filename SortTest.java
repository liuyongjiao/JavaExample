import java.util.Arrays;

public class SortTest {

    public static void main(String[] args){
        String s = "abc";
        String other = "abd";
        int res = s.compareTo(other);
        System.out.println("result of comparable : " + res);

        Integer num = 12;
        System.out.println("Integer comparable result:" + num.compareTo(12));

        String[] strs = new String[3];
        strs[0] = "aa";
        strs[1] = "bb";
        strs[2] = "ab";

        Arrays.sort(strs);
        System.out.println("After sort...");
        for(String str: strs){
            System.out.println(str);
        }

        int[] num_lst = {9,8,4,5,7,3,2,1};
        Arrays.sort(num_lst);
        for(int n: num_lst){
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();



    }
}


