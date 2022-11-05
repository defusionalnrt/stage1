import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class calculator extends JFrame{
    public calculator(){
        super("Easy Calculator");
        TitledBorder border = new TitledBorder("************");

        setLayout(new GridLayout(2,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTextField leftOp = new JTextField("12",JTextField.CENTER);
        leftOp.setBorder(border);
        leftOp.setHorizontalAlignment(JTextField.CENTER);

        final JTextField rightOp = new JTextField("2",JTextField.CENTER);
        rightOp.setBorder(border);
        rightOp.setHorizontalAlignment(JTextField.CENTER);

        final JLabel operator = new JLabel("",JLabel.CENTER);
        operator.setBorder(border);
        operator.setHorizontalAlignment(JTextField.CENTER);

        final JLabel equal = new JLabel("=", JLabel.CENTER);
        equal.setBorder(border);
        equal.setHorizontalAlignment(JTextField.CENTER);

        final JLabel calRes = new JLabel("",JLabel.CENTER);
        calRes.setBorder(border);
        calRes.setHorizontalAlignment(JTextField.CENTER);
        
        JButton[] opButtons = new JButton[5];

        opButtons[0] = new JButton("+");
        opButtons[0].addActionListener(new ActionListener(){
			@Override
            public void actionPerformed(ActionEvent e){
                operator.setText("+");
            }
        });

        opButtons[1] = new JButton("-");
        opButtons[1].addActionListener(new ActionListener(){
			@Override
            public void actionPerformed(ActionEvent e){
                operator.setText("-");
            }
        });

        opButtons[2] = new JButton("*");
        opButtons[2].addActionListener(new ActionListener(){
			@Override
            public void actionPerformed(ActionEvent e){
                operator.setText("*");
            }
        });

        opButtons[3] = new JButton("/");
        opButtons[3].addActionListener(new ActionListener(){
			@Override
            public void actionPerformed(ActionEvent e){
                operator.setText("/");
            }
        });

        opButtons[4] = new JButton("=");
        opButtons[4].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double left = Double.parseDouble(leftOp.getText());
                double right = Double.parseDouble(rightOp.getText());
                String resText = "";
                if(operator.getText().equals("+")){              	
                    resText = (left + right) + "";
                }
                else if(operator.getText().equals("-")){
                    resText = (left - right) + "";
                }
                else if(operator.getText().equals("*")){
                    resText = (left * right) + "";
                }
                else if(operator.getText().equals("/")){
                    if(right == 0.0){
                        resText = "div by 0 err";
                    }
                    else{
                        resText = (left / right) + "";
                    }
                }
                calRes.setText(resText);
            }
        });

        add(leftOp);
        add(operator);
        add(rightOp);
        add(equal);
        add(calRes);
        for(int i = 0; i < 5; i++){
        	add(opButtons[i]);
        }

        pack(); 
        setSize(500,200); 
        setLocation(200,200);  
        setVisible(true);    
    }
    public static void main(String[] args) {
        System.out.println("calculator start");
        new calculator();
    }
}