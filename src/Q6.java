import javax.swing.*;

/**
 * Created by t00193720 on 21/09/2017.
 */
public class Q6 {
    public static void main(String[] args) {
       // new JTextArea(2, 12);
        double length = 0, breadth = 0, area, cost = 33.50, totalCost;
        String userInput="Continue";

        while ("Continue".equals(userInput)); {
        length = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the room:"));


        if (length > 0) {
            JOptionPane.showMessageDialog(null,"The Length is:" + length);

        } else {
            JOptionPane.showMessageDialog(null,"Invalid! - Please enter a number","ERROR", JOptionPane.ERROR_MESSAGE);
        }

        JOptionPane.showInputDialog("Please enter the breadth of the room:");

            breadth= Double.parseDouble(JOptionPane.showInputDialog("Please enter the breath of the room:"));
        if (breadth > 0) {
               JOptionPane.showMessageDialog(null,"The breadth is:" + breadth);

               } else {
               JOptionPane.showMessageDialog(null,"Invalid! - Please enter a number","", JOptionPane.ERROR_MESSAGE);
               }
               area = length*breadth;
               JOptionPane.showMessageDialog(null,"The area is:" + area);



               totalCost = area * cost;
               JOptionPane.showMessageDialog(null,"Total cost is:" + totalCost);

               userInput=JOptionPane.showInputDialog("Do you want to continue? (Continue)");

               }

               }
               }
