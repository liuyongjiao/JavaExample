import java.util.*;

public class Main
{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       String temp = scanner.nextLine();
       String[] strings = temp.split(",");
       int[] nums = new int[strings.length];

       for(int i=0; i<strings.length; i++){
           nums[i] = Integer.parseInt(strings[i]);
       }

       Main m = new Main();
       int res = m.candy(nums);

       System.out.println(res);


   }

   public int candy(int[] candy){

       if(candy.length == 0 || candy == null){
           return 0;
       }

       int n = candy.length;
       int[] nums = new int[n];
       Arrays.fill(nums, 1);

       for(int i = 0; i < n; i++){
           if(i != n-1 && candy[i] > candy[i+1] && nums[i] <= nums[i+1]){
               nums[i] = nums[i+1] + 1;
           }
           if(i > 0 && candy[i] > candy[i-1] && nums[i] <=
                   nums[i-1]){
               nums[i] = nums[i-1] + 1;
           }
       }

       int res = 0;
       for(int num: nums){
           res += num;
       }
       return res;

   }
}


