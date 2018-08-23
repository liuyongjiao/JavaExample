import java.util.Arrays;

public class MaxHeapTest {

    public static void main(String[] args){
        int[] arr = {4,7,3,9,2,1,0};

        Heap heap = new Heap();
        heap.maxHeapify(arr,0);
        System.out.println(Arrays.toString(arr));

        heap.buildMaxHeap(arr);
        System.out.println(Arrays.toString(arr));

        heap.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Heap{

    private int heapSize;


    //维持节点的最大堆性质
    public void maxHeapify(int[] a, int i){
        //使得节点i维持最大堆的性质。

        if(i<0) return;

        int l = ileft(i);
        int r = iright(i);
        int largest = i;


        if(l < this.heapSize && a[l] > a[i]){
            largest = l;
        }
        else{
            largest = i;
        }

        if(r < this.heapSize && a[largest] < a[r]){
            largest = r;
        }
        if(largest != i) {
            swap(a, i, largest);
            maxHeapify(a,largest);
        }

    }

    //建立最大堆
    public void buildMaxHeap(int[] a){
        this.heapSize = a.length;
        if(a.length > 0 && a != null){
            int m = a.length / 2 - 1;
            for(int i = m; i >= 0; i--){
                maxHeapify(a, i);
            }
        }
    }

    //利用最大堆排序
    public void heapSort(int[] a){
        buildMaxHeap(a);

        for(int i = this.heapSize-1; i > 0; i--){
            swap(a,0, i);
            this.heapSize--;

            maxHeapify(a, 0);
        }
    }



    public int ileft(int i){
        return 2*i + 1;
    }

    public int iright(int i){
        return 2*i + 2;
    }

    public int iparent(int i){

        return (i - 1) / 2;
    }

    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}



