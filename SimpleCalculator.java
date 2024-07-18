import javax.swing.*;
import java.awt.Color;
import java.awt.event.*; 
import java.awt.Font; 
public class SimpleCalculator implements ActionListener{  
    JTextField tfDisplay;  
    JButton btnPlus,btnMinus,btnMult,btnDivide,btnSqr,btnClear,btnEqual;
    JButton btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09,btn00;
    String Operand1 = "", Operand2 = "";
    Boolean Operator = false;
    double a = 0, b = 0, c = 0;
    int op = 0;
    SimpleCalculator(){
        JFrame f = new JFrame("MDEE'S SIMPLE CALCULATOR");
        f.setResizable(false);
        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        tfDisplay = new JTextField();
        tfDisplay.setBounds(15,15,305,30);  
        tfDisplay.setBackground(Color.GRAY);
        tfDisplay.setForeground(Color.WHITE); 
        tfDisplay.setFont(font1);
        btnPlus = new JButton("+");  
        btnPlus.setBounds(15,50,50,50);  
        btnMinus = new JButton("-");  
        btnMinus.setBounds(66,50,50,50);
        btnMult = new JButton("x");  
        btnMult.setBounds(117,50,50,50);
        btnDivide = new JButton("/");  
        btnDivide.setBounds(168,50,50,50);
        btnSqr = new JButton("Sr");  
        btnSqr.setBounds(219,50,50,50);
        btnClear = new JButton("C");  
        btnClear.setBounds(270,50,50,50);
        btn01 = new JButton("1");  
        btn01.setBounds(15,101,50,50);
        btn02 = new JButton("2");  
        btn02.setBounds(66,101,50,50);
        btn03 = new JButton("3");  
        btn03.setBounds(117,101,50,50);
        btn04 = new JButton("4");  
        btn04.setBounds(168,101,50,50);
        btn05 = new JButton("5");  
        btn05.setBounds(219,101,50,50);
        btn06 = new JButton("6");  
        btn06.setBounds(270,101,50,50);
        btn07 = new JButton("7");  
        btn07.setBounds(15,152,50,50);
        btn08 = new JButton("8");  
        btn08.setBounds(66,152,50,50);
        btn09 = new JButton("9");  
        btn09.setBounds(117,152,50,50);
        btn00 = new JButton("0");  
        btn00.setBounds(168,152,50,50);
        btnEqual = new JButton("=");  
        btnEqual.setBounds(219,152,100,50);

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
        f.setSize(365,269);
        f.setLayout(null); 
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {  
        if (e.getSource() == btn01){
            tfDisplay.setText(tfDisplay.getText() + "1");
        }else if (e.getSource() == btn02){
            tfDisplay.setText(tfDisplay.getText() + "2");
        }else if (e.getSource() == btn03){
            tfDisplay.setText(tfDisplay.getText() + "3");
        }else if (e.getSource() == btn04){
            tfDisplay.setText(tfDisplay.getText() + "4");
        }else if (e.getSource() == btn05){
            tfDisplay.setText(tfDisplay.getText() + "5");
        }else if (e.getSource() == btn06){
            tfDisplay.setText(tfDisplay.getText() + "6");
        }else if (e.getSource() == btn07){
            tfDisplay.setText(tfDisplay.getText() + "7");
        }else if (e.getSource() == btn08){
            tfDisplay.setText(tfDisplay.getText() + "8");
        }else if (e.getSource() == btn09){
            tfDisplay.setText(tfDisplay.getText() + "9");
        }else if (e.getSource() == btn00){
            tfDisplay.setText(tfDisplay.getText() + "0");
        }

        if (e.getSource() == btnClear){
            Operand1 = "";
            Operand2 = "";
            Operator = false;
            tfDisplay.setText("");
        }else if (e.getSource() == btnPlus){
            op = 1;
            Operator = true;
            Operand1 = tfDisplay.getText();
            a = Double.parseDouble(Operand1);
            tfDisplay.setText("");
        }else if (e.getSource() == btnMinus){
            op = 2;
            Operator = true;
            Operand1 = tfDisplay.getText();
            a = Double.parseDouble(Operand1);
            tfDisplay.setText("");
        }else if (e.getSource() == btnMult){
            op = 3;
            Operator = true;
            Operand1 = tfDisplay.getText();
            a = Double.parseDouble(Operand1);
            tfDisplay.setText("");
        }else if (e.getSource() == btnDivide){
            op = 4;
            Operator = true;
            Operand1 = tfDisplay.getText();
            a = Double.parseDouble(Operand1);
            tfDisplay.setText("");
        }else if (e.getSource() == btnSqr){
            Operand1 = tfDisplay.getText();
            a = Double.parseDouble(Operand1);
            tfDisplay.setText(String.valueOf(Math.sqrt(a)));
        }else if (e.getSource() == btnEqual){
            if (Operator == true){
                Operator = false;
                Operand2 = tfDisplay.getText();
                b = Double.parseDouble(Operand2);
                if(op == 1){
                    c = a + b;
                }else if(op == 2){
                    c = a - b;
                }else if(op == 3){
                    c = a * b;
                }else if(op == 4){
                    c = a / b;
                }
            }
            String result = String.valueOf(c);
            tfDisplay.setText(result); 
        }
    }  
    public static void main(String[] args) {  
        new SimpleCalculator();
    }
}
