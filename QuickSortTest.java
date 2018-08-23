import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSortTest{

    public  int partition(int[] a, int p, int r){
        int key = a[r];
        int i = p-1;
        int j = p;
        while(j < r){
            if(a[j] < key){
                i++;
                swap(a, i, j);
            }
            j++;
        }
        swap(a, i+1, r);
        return i+1;
    }

    public void quickSort(int[] a, int p, int q){
        if(p < q){
            int m = partition(a, p, q);
            quickSort(a, p, m-1);
            quickSort(a, m+1, q);
        }
    }

    public void swap(int[] a, int p, int q){
        int temp = a[p];
        a[p] = a[q];
        a[q] = temp;
    }

    public static void main(String[] args){
        int[] array = {10,20,15,0,6,7,2,1,-5,8};
        System.out.println(Arrays.toString(array));

        QuickSortTest qst = new QuickSortTest();
        int m = qst.partition(array, 0, array.length-1);
        System.out.println(m);
        System.out.println(Arrays.toString(array));
        qst.quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));


    }






}