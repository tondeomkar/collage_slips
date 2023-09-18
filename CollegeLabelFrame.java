//java Write a java program to display Label with text "Dr. D Y Patil", background color Red and font size 20 on the frame
import javax.swing.*;
import java.awt.*;

public class CollegeLabelFrame {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("College Label Example");

        // Create a JLabel with the specified text
        JLabel label = new JLabel("Dr. D Y Patil College");

        // Set the background color to red
        label.setBackground(Color.RED);
        label.setOpaque(true); // Make the label opaque to see the background color

        // Set the font size to 20
        Font labelFont = label.getFont();
        label.setFont(new Font(labelFont.getName(), Font.PLAIN, 20));

        // Add the label to the content pane of the frame
        frame.getContentPane().add(label);

        // Set frame properties
        frame.setSize(300, 100); // Set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the frame is closed
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setLayout(new FlowLayout()); // Use a simple flow layout manager

        // Make the frame visible
        frame.setVisible(true);
    }
}
