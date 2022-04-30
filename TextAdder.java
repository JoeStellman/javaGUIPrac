import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.GridLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextAdder extends JFrame implements ActionListener {
    
    private JLabel labelPlus, labelSum;
    private JButton buttonEquals;
    private JTextField text1, text2;
    
    // ______ + _______ = [         ]
    
    public TextAdder(){
        setSize(500, 100);
        setTitle("Text Adder");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        labelPlus = new JLabel("+", JLabel.CENTER);
        labelSum = new JLabel("", JLabel.CENTER);
        buttonEquals = new JButton("=");
        text1 = new JTextField();
        text2 = new JTextField();
        
        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(1, 5));
        
        pane.add(text1);
        pane.add(labelPlus);
        pane.add(text2);
        pane.add(buttonEquals);
        pane.add(labelSum);
        
        buttonEquals.addActionListener(this);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("=")){
            int num1 = Integer.parseInt(text1.getText());
            int num2 = Integer.parseInt(text2.getText());
            labelSum.setText(String.valueOf(num1 + num2));
        }
            
    }
    
    public static void main(String[] args){
        TextAdder t = new TextAdder();
    }
}
