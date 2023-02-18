import javax.swing.JOptionPane;

public class Doraemon {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello who are you?", "Doraemon", JOptionPane.QUESTION_MESSAGE);

        String data = JOptionPane.showInputDialog(null, "Hello, my name is :", "ME", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Oh! hi, " + data , "Doraemon" , JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "What can I do for you?", "Doraemon", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, "I want to go to the future.", "ME", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Of course, what is the present year?", "Doraemon", JOptionPane.QUESTION_MESSAGE);

        String now = JOptionPane.showInputDialog(null, "It is :", "ME", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "OK. How many years do you want to travel?", "Doraemon", JOptionPane.QUESTION_MESSAGE);

        String future = JOptionPane.showInputDialog(null, "I want to go for :", "ME", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "OK. Lets goooo!", "Doraemon" , JOptionPane.INFORMATION_MESSAGE);

        int futureyear = Integer.parseInt(now) + Integer.parseInt(future);

        JOptionPane.showMessageDialog(null, "Hello, welcome to " + futureyear, "Doraemon", JOptionPane.INFORMATION_MESSAGE);

    }
}