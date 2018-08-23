import java.util.Arrays;

public class MergeSortTest {

    public static void main(String[] args){
        int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
        mergeSort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }
    //在问题的规模较小时，采用插入排序较好。
    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];

        int i = low;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=high){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=high){
            temp[k++] = arr[j++];
        }

        for(int m = 0; m < temp.length; m++){
            arr[m+low] = temp[m];
        }
    }

    public static void mergeSort(int[] arr, int low, int high){

        int mid = (low + high) / 2;
        if(low < high){
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
}
