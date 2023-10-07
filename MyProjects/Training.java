import javax.swing.JOptionPane;

public class Training{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        String favFood = JOptionPane.showInputDialog("Enter your favourite food: ");

        JOptionPane.showMessageDialog(null, "Hello "+name);
        JOptionPane.showMessageDialog(null, "You Are "+age+" years old.");
        JOptionPane.showMessageDialog(null,"Your favourite food is "+favFood);
    }
}