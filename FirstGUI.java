import javax.swing.JFrame;

public class FirstGUI extends JFrame{
    
    public FirstGUI(){
        setSize(500, 200);
        setTitle("My first GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        FirstGUI first = new FirstGUI();
    }
}
