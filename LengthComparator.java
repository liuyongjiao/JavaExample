import java.util.Comparator;
import java.util.*;
public class LengthComparator {
    public static void main(String[] args){
        //Comparator<String> com = new LengthCompare();
        LengthComparator temp = new LengthComparator();
        Scanner scan = new Scanner(System.in);
        System.out.println("输入总个数：");
        int n = scan.nextInt();
        int[] arr = new int[n];


        int i = 0;
        int j = 0;

        while(i<n){
            System.out.println("输入每堆个数：");
            arr[i] = scan.nextInt();
            i += 1;
        }
        System.out.println("shuru chaxungeshu:");
        int m = scan.nextInt();
        int[] arr2 = new int[m];
        while(j<m){
            System.out.println("every:");
            arr2[j] = scan.nextInt();
            j += 1;
        }

        int[] sum = new int[n];
        int k = 0;
        int single_sum = 0;
        while(k<n){
            single_sum += arr[k];
            sum[k] = single_sum;
            k += 1;
        }
        for(int a: sum){
            System.out.println("sum :"+a);

        }

        for(int num: arr2){
           int result = temp.search(sum, num);
            System.out.println(result);
        }
        

    }
    public int search(int[] arr, int res){
        int high = arr.length - 1;
        int low = 0;


        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == res){
                return mid+1;
            }
            else if(arr[mid] < res){
                low = mid + 1;
            }
            else if(arr[mid] > res && mid == 0){
                return mid+1;
            }
            else if(arr[mid] > res && mid >= 1 && arr[mid-1] > res){
                high = mid - 1;
            }
            else if(arr[mid] > res && mid >= 1 && arr[mid-1] < res){
                return mid+1;
            }
        }
        return -1;
    }


}


//class LengthCompare implements Comparator<String>{
//    public int compare(String first, String second){
//        return first.length() - second.length();
//    }
//}
