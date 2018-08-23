import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest {

    public static void main(String[] args){

//        ActionListener listener = new TimerPrint();
//
///        Timer t = new Timer(1000, listener);
//
//        t.start();
        TimerTest.repeat("Hello",500);
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }

    public static void repeat(String text, int count){
        ActionListener listener = event->
        {
            System.out.println(text
            );
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(count, listener).start();
    }



}

class TimerPrint implements ActionListener{

    public void actionPerformed(ActionEvent e){
        System.out.println("At the tone ,the time is ..." + new Date());
        Toolkit.getDefaultToolkit().beep();
    }

}
