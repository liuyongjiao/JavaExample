import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;

public class BubbleSortTest {

    public static void bubbleSort(int[] a){
        for(int i = 0; i < a.length; i++){
            int k = a.length - 1 - i;
            int j = 0;
            for(; j < k; j++){
                if(a[j] >a[j+1]) swap(a, j, j+1);
            }
        }
    }

    public static void swap(int[] a, int p, int q){
        int temp = a[p];
        a[p] = a[q];
        a[q] = temp;
    }

    public static void main(String[] args){
        int[] a = {9,2,3,1,10,4,6};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
