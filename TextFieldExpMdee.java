import javax.swing.*;  
import java.awt.event.*;  
public class TextFieldExpMdee implements ActionListener{  
    JTextField tf1,tf2,tf3;  
    JButton b1,b2,b3,b4;  
    TextFieldExpMdee(){  
        JFrame f = new JFrame("SIMPLE CALCULATOR");  
        tf1 = new JTextField();  
        tf1.setBounds(50,50,290,30);  
        tf2 = new JTextField();  
        tf2.setBounds(50,100,290,30);  
        tf3 = new JTextField();  
        tf3.setBounds(50,150,290,30);  
        tf3.setEditable(false);   
        b1 = new JButton("Add");  
        b1.setBounds(50,200,60,50);  
        b2 = new JButton("Minus");  
        b2.setBounds(110,200,70,50);
        b3 = new JButton("Multiply"); 
        b3.setBounds(180,200,80,50); 
        b4 = new JButton("Divide"); 
        b4.setBounds(260,200,75,50); 
        b1.addActionListener(this);  
        b2.addActionListener(this); 
        b3.addActionListener(this);  
        b4.addActionListener(this);  
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);  
        f.setSize(400,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1 = tf1.getText();  
        String s2 = tf2.getText();  
        int a = Integer.parseInt(s1);  
        int b = Integer.parseInt(s2);  
        double c = 0;  
        if(e.getSource()==b1){  
            c = a + b;  
        }else if(e.getSource() == b2){  
            c = a - b;  
        }else if(e.getSource() == b3){  
            c = a * b;  
        }else if(e.getSource() == b4){  
            c = a / b; 
        }
        String result = String.valueOf(c);  
        tf3.setText(result);  
    }  
    public static void main(String[] args) {  
        new TextFieldExpMdee();
    }
}
