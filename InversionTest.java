public class InversionTest {
    //逆序对
    //if i>j,then a[i] < a[j]

    public static int InversePairs(int[] a, int start, int end){
        int len = (end - start + 1) / 2;
        int left = 0;
        int right = 0;
        int mid = start + len;
        if(start < mid) left = InversePairs(a, start, mid);
        if(mid+1 < end) right = InversePairs(a, mid+1, end);
        int count = InverseMerge(a, start, mid, end);
        return left+right+count;
    }

    public static int InverseMerge(int[] a, int low, int mid, int high){

        int i = mid;
        int j = high;
        int count = 0;

        while(i >= low && j >= mid+1){
            if(a[i] > a[j]){

                count += j - mid;
                i--;
            }
            else if(a[i] <= a[j]){
                j--;
            }

        }
        return count;
    }

    public static void main(String[] args){
        int[] a = {5,7,4,6};
        int res = InversePairs(a, 0, a.length-1);
        System.out.println(res);

    }


}
