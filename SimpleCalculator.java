import javax.swing.*;  
import java.awt.event.*;  
public class SimpleCalculator implements ActionListener{  
    JTextField tfDisplay;  
    JButton btnPlus,btnMinus,btnMult,btnDivide,btnSqr,btnClear,btnEqual;
    JButton btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09,btn00;
    SimpleCalculator(){  
        JFrame f = new JFrame("MDEE'S SIMPLE CALCULATOR");  
        tfDisplay = new JTextField();
        tfDisplay.setBounds(50,50,305,30);   
        btnPlus = new JButton("+");  
        btnPlus.setBounds(50,81,50,50);  
        btnMinus = new JButton("-");  
        btnMinus.setBounds(101,81,50,50);
        btnMult = new JButton("x");  
        btnMult.setBounds(152,81,50,50);
        btnDivide = new JButton("/");  
        btnDivide.setBounds(203,81,50,50);
        btnSqr = new JButton("Sr");  
        btnSqr.setBounds(254,81,50,50);
        btnClear = new JButton("C");  
        btnClear.setBounds(305,81,50,50);
        btn01 = new JButton("1");  
        btn01.setBounds(50,132,50,50);
        btn02 = new JButton("2");  
        btn02.setBounds(101,132,50,50);
        btn03 = new JButton("3");  
        btn03.setBounds(152,132,50,50);
        btn04 = new JButton("4");  
        btn04.setBounds(203,132,50,50);
        btn05 = new JButton("5");  
        btn05.setBounds(254,132,50,50);
        btn06 = new JButton("6");  
        btn06.setBounds(305,132,50,50);
        btn07 = new JButton("7");  
        btn07.setBounds(50,183,50,50);
        btn08 = new JButton("8");  
        btn08.setBounds(101,183,50,50);
        btn09 = new JButton("9");  
        btn09.setBounds(152,183,50,50);
        btn00 = new JButton("0");  
        btn00.setBounds(203,183,50,50);
        btnEqual = new JButton("=");  
        btnEqual.setBounds(254,183,100,50);

        btnPlus.addActionListener(this);  
        btnMinus.addActionListener(this); 
        btnMult.addActionListener(this);  
        btnDivide.addActionListener(this);
        btnSqr.addActionListener(this);  
        btnClear.addActionListener(this); 
        btn01.addActionListener(this);
        btn02.addActionListener(this);
        btn03.addActionListener(this);
        btn04.addActionListener(this);
        btn05.addActionListener(this);
        btn06.addActionListener(this);
        btn07.addActionListener(this);
        btn08.addActionListener(this);
        btn09.addActionListener(this);
        btn00.addActionListener(this);
        btnEqual.addActionListener(this);
        f.add(tfDisplay);f.add(btnPlus);f.add(btnMinus);f.add(btnMult);f.add(btnDivide);f.add(btnSqr);f.add(btnClear);
        f.add(btn01);f.add(btn02);f.add(btn03);f.add(btn04);f.add(btn05);f.add(btn06); 
        f.add(btn07);f.add(btn08);f.add(btn09);f.add(btn00);f.add(btnEqual);
        f.setSize(400,300);  
        f.setLayout(null);  
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {  
        // String s1 = tf1.getText();  
        // String s2 = tf2.getText();  
        // int a = Integer.parseInt(s1);  
        // int b = Integer.parseInt(s2);  
        // double c = 0;  
        // if(e.getSource()==b1){  
        //     c = a + b;  
        // }else if(e.getSource() == b2){  
        //     c = a - b;  
        // }else if(e.getSource() == b3){  
        //     c = a * b;  
        // }else if(e.getSource() == b4){  
        //     c = a / b; 
        // }
        // String result = String.valueOf(c);  
        // tf3.setText(result);  
    }  
    public static void main(String[] args) {  
        new SimpleCalculator();
    }
}
