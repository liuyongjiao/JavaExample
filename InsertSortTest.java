import java.util.Arrays;

public class InsertSortTest {

    public static void insertSort(int[] a){
        if(a.length != 0 && a != null){

            for(int j = 1; j < a.length; j++){

                int temp = a[j];

                int i = j - 1;
                while(i >= 0 && temp < a[i]){
                    a[i+1] = a[i];
                    i = i - 1;
                }
                a[i+1] = temp;
                System.out.println(j+": "+Arrays.toString(a));
            }
        }
    }

    public static void main(String[] args){
        int[] a = {5,2,4,6,1,3};
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }


}
