import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueTest {

    public static void main(String[] args){

//        Comparator<String> cmp = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        };
        Comparator<String> cmp = (first,second)->second.compareTo(first);
        Queue<String> queue = new PriorityQueue<>(cmp);


        System.out.println("数字个数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            String s = Integer.toString(sc.nextInt());
            queue.add(s);
        }

        String str = "";
        while(!queue.isEmpty()){
            str += queue.poll();
        }

        System.out.println(str);




    }
}
