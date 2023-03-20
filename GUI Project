//Graphical User Interface

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

   private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    //Create Constructor, Constructor is treated like a method
    public GUI(){
        //Create Objects to make GUI frame
        frame = new JFrame();//Window for GUI

        //Create a Button
        //Set up the button to listen to click events to increase number of clicks
        JButton button = new JButton("Click Me");
        button.addActionListener(this);//"This" Goes to the GUI Class

        label = new JLabel("Number of Clicks:0");

        //Create the object for the GUI Layout
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel);// Add the panel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Set what happens when the frame is closed
        frame.setTitle("My GUI");//Set the Title of the window
        frame.pack();//Set the window to match a particular size
        frame.setVisible(true);//Set the window to be visible and in focus

    }
    public static void main(String[] args) {
        //Creates GUI object from GUI class above
        new GUI();
    }

    //ActionPerformed listener is tied to the button object which allows clicks to increase
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks:" + count);
    }
}
