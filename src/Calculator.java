import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends JFrame implements ActionListener {
    private  JButton b0 = new JButton("0");
    private  JButton b1 = new JButton("1");
    private  JButton b2 = new JButton("2");
    private  JButton b3 = new JButton("3");
    private  JButton b4 = new JButton("4");
    private  JButton b5 = new JButton("5");
    private  JButton b6 = new JButton("6");
    private  JButton b7 = new JButton("7");
    private  JButton b8 = new JButton("8");
    private  JButton b9 = new JButton("9");
    private  JButton bMinus = new JButton();
    private  JButton bMul = new JButton();
    private  JButton bDivision = new JButton();
    private  JButton bPlus = new JButton();
    private  JButton bEqual = new JButton("=");
    private JButton bClear = new JButton();

    private double value1=0;
    private double value2=0;
    private int sign=0;
    double result = 0;
    Object preSource=null;


    private JTextArea textField = new JTextArea(1, 30);

    public Calculator(){

        b0.setBackground(Color.decode("#505050"));
        b0.setForeground(Color.white);
        b0.setFont(new Font("Dialog", 1, 22));

        b1.setBackground(Color.decode("#505050"));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Dialog", 1, 22));

        b2.setBackground(Color.decode("#505050"));
        b2.setForeground(Color.white);
        b2.setFont(new Font("Dialog", 1, 22));

        b3.setBackground(Color.decode("#505050"));
        b3.setForeground(Color.white);
        b3.setFont(new Font("Dialog", 1, 22));

        b4.setBackground(Color.decode("#505050"));
        b4.setForeground(Color.white);
        b4.setFont(new Font("Dialog", 1, 22));

        b5.setBackground(Color.decode("#505050"));
        b5.setForeground(Color.white);
        b5.setFont(new Font("Dialog", 1, 22));

        b6.setBackground(Color.decode("#505050"));
        b6.setForeground(Color.white);
        b6.setFont(new Font("Dialog", 1, 22));

        b7.setBackground(Color.decode("#505050"));
        b7.setForeground(Color.white);
        b7.setFont(new Font("Dialog", 1, 22));

        b8.setBackground(Color.decode("#505050"));
        b8.setForeground(Color.white);
        b8.setFont(new Font("Dialog", 1, 22));

        b9.setBackground(Color.decode("#505050"));
        b9.setForeground(Color.white);
        b9.setFont(new Font("Dialog", 1, 22));

        bPlus.setFont(new Font("Dialog", 2, 28));
        bPlus.setText("+");
        bPlus.setBackground(Color.decode("#FF9500"));
        bPlus.setForeground(Color.white);

        bMinus.setFont(new Font("Dialog", 2, 28));
        bMinus.setText("-");
        bMinus.setBackground(Color.decode("#FF9500"));
        bMinus.setForeground(Color.white);


        bMul.setFont(new Font("Dialog", 2, 28));
        bMul.setText("*");
        bMul.setBackground(Color.decode("#FF9500"));
        bMul.setForeground(Color.white);

        bDivision.setFont(new Font("Dialog", 2, 28));
        bDivision.setText("/");
        bDivision.setBackground(Color.decode("#FF9500"));
        bDivision.setForeground(Color.white);

        bEqual.setFont(new Font("Dialog", 3, 28));
        bEqual.setBackground(Color.decode("#FF9500"));
        bEqual.setForeground(Color.white);

        bClear.setFont(new Font("Dialog", 3, 28));
        bClear.setText("Clear");
        bClear.setBackground(Color.decode("#FF9500"));
        bClear.setForeground(Color.white);


        textField.setBackground(Color.decode("#505050"));
        textField.setForeground(Color.white);
//        textField.setFont(new Font("Dialog", 3, 40));
        textField.setPreferredSize(new Dimension(580,100));
        textField.setEditable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bEqual.addActionListener(this);
        bClear.addActionListener(this);
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMul.addActionListener(this);
        bDivision.addActionListener(this);

        JPanel northPanel = new JPanel();
        JPanel eastPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        add(centerPanel,"Center");
        add(northPanel,"North");
        add(eastPanel,"East");

        centerPanel.setLayout(new GridLayout(4,3,5,5));
        eastPanel.setLayout(new GridLayout(4,1,5,5));
        eastPanel.setPreferredSize(new Dimension(150,450));
        eastPanel.setBorder(new EmptyBorder(0, 10, 0, 0));


        centerPanel.add(b1);
        centerPanel.add(b2);
        centerPanel.add(b3);
        centerPanel.add(b4);
        centerPanel.add(b5);
        centerPanel.add(b6);
        centerPanel.add(b7);
        centerPanel.add(b8);
        centerPanel.add(b9);
        centerPanel.add(bEqual);
        centerPanel.add(b0);
        centerPanel.add(bClear);

        northPanel.add(textField);

        eastPanel.add(bPlus);
        eastPanel.add(bMinus);
        eastPanel.add(bMul);
        eastPanel.add(bDivision);




        setTitle("Calculator");
        setBackground(Color.decode("#505050"));
        setSize(600,600);
        addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
    }

    public void clear() {
        textField.setText("");
        value1=0;
        value2=0;
        sign=0;
        result=0;
    }

    public String textAreaValue(){
        return textField.getText().toString();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == b1) {
            if (preSource==bEqual){
                preSource=null;
                textField.setText("");
            }
            textField.append("1");
        }
        if (source == b2) {
            if (preSource==bEqual){
                preSource=null;
                textField.setText("");
            }
            textField.append("2");
        }
        if (source == b3) {
            if (preSource==bEqual){
                preSource=null;
                textField.setText("");
            }
            textField.append("3");
        }
        if (source == b4) {
            if (preSource==bEqual){
                preSource=null;
                textField.setText("");
            }
            textField.append("4");
        }
        if (source == b5) {
            if (preSource==bEqual){
                preSource=null;
                textField.setText("");
            }
            textField.append("5");
        }
        if(source == b6){
            if (preSource==bEqual){
                preSource=null;
                textField.setText("");
            }
            textField.append("6");
        }
        if(source == b7){
            if (preSource==bEqual){
                preSource=null;
                textField.setText("");
            }
            textField.append("7");
        }
        if(source == b8){
            if (preSource==bEqual){
                preSource=null;
                textField.setText("");
            }
            textField.append("8");
        }
        if(source == b9){
            if (preSource==bEqual){
                preSource=null;
                textField.setText("");
            }
            textField.append("9");
        }
        if (source == bPlus) {
            preSource = e.getSource();// addition button
            setValue1(Double.parseDouble(textField.getText()));
            textField.setText("");
            sign=1;
        }
        if(source == bMinus){// subtraction button
            preSource = e.getSource();
            setValue1(Double.parseDouble(textField.getText()));
            textField.setText("");
            sign=2;
        }
        if(source == bMul){// multiplication button
            preSource = e.getSource();
            setValue1(Double.parseDouble(textField.getText()));
            textField.setText("");
            sign=3;
        }
        if(source == bDivision){ // division button
            preSource = e.getSource();
            setValue1(Double.parseDouble(textField.getText()));
            textField.setText("");
            sign=4;
        }
        if(source == bClear){
            preSource = e.getSource();// clear button
            clear();
        }
        if(source == bEqual){
            preSource = e.getSource();
            setValue2(Double.parseDouble(textField.getText()));
            textField.setText("");// when equal sign (=) is pressed.
            result();
        }
        if(source == b0){
            if (preSource==bEqual){
                preSource=null;
                textField.setText("");
            }
            textField.append("0");
        }
    }
    public void result(){
        if (sign==1){
            result = add(value1,value2);
        } else if (sign==2){
            result = subtract(value1,value2);
        } else if (sign==3){
            result = multiply(value1,value2);
        } else if (sign==4){
            result = divide(value1,value2);
        }else if(sign==0){
            result=0;
        }
        textField.setText(Double.toString(result));
        sign=0;
    }

    private double add(double v1,double v2){
        return v1+v2;
    }
    private double subtract(double v1,double v2){
        return v1-v2;
    }
    private double multiply(double v1,double v2){
        return v1*v2;
    }
    private double divide(double v1,double v2){
        return v1/v2;
    }

    public void setValue1(double value){
        value1=value;
    }

    public void setValue2(double value){
        value2=value;
    }

    public void setOperator(int o){
        sign=o;
    }

}
