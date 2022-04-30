import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Graphics;

public class Painter extends JFrame implements MouseMotionListener{
    
    private int x = -10, y = -10; //x and y location of our mouse
    
    public Painter(){
        
        //JFrame stuff
        setSize(800, 600);
        setTitle("Painter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //setup layout
        JLabel instructions = new JLabel("Drag the mouse to draw", JLabel.RIGHT);
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(instructions, BorderLayout.SOUTH);
        
        //configure mouse 
        c.addMouseMotionListener(this);
        
        //make visible
        setVisible(true);
    }
    
    public void mouseMoved(MouseEvent e){
        //nothing
    }
    
    public void mouseDragged(MouseEvent e){
        x = e.getX(); y = e.getY();
        repaint(); //will call on the paint method with a special parameter  
    }

    public void paint(Graphics g){
        g.fillOval(x-2, y+22, 4, 4);
    }
    
    public static void main(String[] args){
        Painter p = new Painter();
    }
}
