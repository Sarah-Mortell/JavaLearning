//Create a GUI clock

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock extends JFrame {
    //Declare Variables
    private JFrame frame;
    private JPanel panel;
    private JLabel timeLabel;
    private JLabel dayLabel;
    private JLabel dateLabel;
    private String time;
    private String day;
    private String date;
    private SimpleDateFormat timeFormat;
    private SimpleDateFormat dayFormat;
    private SimpleDateFormat dateFormat;

    //Create constructor that contains objects to make the GUI frame and its contents
    public Clock() {
        frame = new JFrame();

            timeFormat = new SimpleDateFormat("HH:mm:ss ");
            timeLabel = new JLabel();
            timeLabel.setFont(new Font("Verdana", Font.PLAIN, 60));
            timeLabel.setForeground(Color.white);
            timeLabel.setBackground(Color.black);
            timeLabel.setOpaque(true);

            dayFormat = new SimpleDateFormat("EEEE");
            dayLabel = new JLabel();
            dayLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
            dayLabel.setForeground(Color.black);
            dayLabel.setBackground(Color.white);
            dayLabel.setOpaque(true);

            dateFormat = new SimpleDateFormat(" dd, MMMMM, yyyy");
            dateLabel = new JLabel();
            dateLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
            dateLabel.setForeground(Color.black);
            dateLabel.setBackground(Color.white);
            dateLabel.setOpaque(true);


        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setSize(350,220);
        panel.add(timeLabel);
        panel.add(dayLabel);
        panel.add(dateLabel);


        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Digital Clock");
        frame.setSize(350,220);
        frame.setVisible(true);

        //Create method setTime and define setTime method below
        setTime();
    }
    /*
        Update time every second to mirror exact time
        Update day of the week to mirror exact day
        Update date to mirror exact date
     */
    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
        //Call on constructor to run the method
        public static void main (String[]args){
            new Clock();
        }
}

