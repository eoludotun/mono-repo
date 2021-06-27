import javax.swing.JFrame;  //Importing class JFrame
import javax.swing.JLabel;  //Importing class JLabel
public class HelloWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame();          
        frame.setTitle("Example!");                 
        frame.add(new JLabel("Example Lane For Jenkins Changeset Entegration"));
        frame.pack();                          
        frame.setLocationRelativeTo(null);     
        frame.setVisible(true);                
    }
}