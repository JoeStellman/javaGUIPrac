import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mousey extends JFrame implements MouseListener, MouseMotionListener{
    
    private JLabel label;
    
    public Mousey(){
        
    //JFrame stuff
    setSize(400, 400);
    setTitle("Mousey");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    //initialize and setup label
    label = new JLabel(" ", JLabel.CENTER);
    Container pane = this.getContentPane();
    pane.setLayout(new FlowLayout());
    pane.add(label);
    pane.addMouseListener(this);
    pane.addMouseMotionListener(this);
    
    //make visible
    setVisible(true);
    }
    
    //five methods for mouseListener
    public void mousePressed(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        label.setText("Mouse Pressed at " + x + ", " + y);
    }
    
    public void mouseReleased(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        label.setText("Mouse Released at " + x + ", " + y);
    }
    
    public void mouseClicked(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        int b = e.getButton();
        label.setText("Mouse Clicked at ("+x+", "+y+"), Button "+b);
    }
    
    public void mouseEntered(MouseEvent e){
        label.setText("Mouse entered form.");
    }
    
    public void mouseExited(MouseEvent e){
        label.setText("Mouse exited form.");
    }
    
    //two method for mouseMotionListener
    public void mouseMoved(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        label.setText("Mouse moved to ("+x+", "+y+")");
    }
    
    public void mouseDragged(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        label.setText("Mouse dragged to ("+x+", "+y+")");
    }
    
    public static void main(String[] args){
        Mousey m = new Mousey();
    }
}
