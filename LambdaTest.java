import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


public class LambdaTest {
    public static void main(String[] args){

        String[] planets = new String[]{"Mercury","Venus","Earth",
                "Mars","Jupiter"};

        String[] names = new String[]{"JiaYaWEI","JiaNa","ZHuyi","Liuyongjiao"};


        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");

        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted by length:");
        //lambda
        Arrays.sort(planets, (first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(planets));

        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

        Timer t = new Timer(1000, event->{
            System.out.println("At the tone, the time is:" + new Date());
            Toolkit.getDefaultToolkit().beep();
        });
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);


    }


}


