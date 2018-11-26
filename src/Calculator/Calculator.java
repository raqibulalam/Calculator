package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setBackground(Color.GRAY);
		frmCalculator.setForeground(new Color(64, 64, 64));
		frmCalculator.setBackground(new Color(0, 0, 205));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 473, 552);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 19));
		textField.setBackground(new Color(211, 211, 211));
		textField.setBounds(25, 13, 423, 51);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frmCalculator.getContentPane().setLayout(null);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(216, 191, 216));
		btn7.setBounds(27, 182, 81, 30);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Enternumber = textField.getText() + btn7.getText();
				textField.setText(Enternumber);
			}
		});
		btn7.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBackground(new Color(216, 191, 216));
		btn8.setBounds(120, 182, 83, 30);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Enternumber = textField.getText() + btn8.getText();
				textField.setText(Enternumber);
			}
		});
		btn8.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBackground(new Color(216, 191, 216));
		btn9.setBounds(215, 182, 81, 30);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Enternumber = textField.getText() + btn9.getText();
				textField.setText(Enternumber);
			}
		});
		btn9.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.setBackground(new Color(216, 191, 216));
		btnplus.setBounds(322, 182, 90, 30);
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="+";
			}
			
		});
		btnplus.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btnplus);
		
		btn4 = new JButton("4");
		btn4.setBackground(new Color(216, 191, 216));
		btn4.setBounds(27, 250, 81, 30);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Enternumber = textField.getText() + btn4.getText();
				textField.setText(Enternumber);
			}
		});
		btn4.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(216, 191, 216));
		btn5.setBounds(120, 250, 83, 30);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Enternumber = textField.getText() + btn5.getText();
				textField.setText(Enternumber);
			}
		});
		btn5.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(216, 191, 216));
		btn6.setBounds(215, 250, 81, 30);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Enternumber = textField.getText() + btn6.getText();
				textField.setText(Enternumber);
			}
		});
		btn6.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btn6);
		
		JButton btnminus = new JButton("-");
		btnminus.setBackground(new Color(216, 191, 216));
		btnminus.setBounds(322, 250, 90, 30);
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="-";
			}
		});
		btnminus.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btnminus);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(216, 191, 216));
		btn1.setBounds(27, 315, 81, 30);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Enternumber = textField.getText() + btn1.getText();
				textField.setText(Enternumber);
			}
		});
		btn1.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(216, 191, 216));
		btn2.setBounds(120, 315, 83, 30);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber = textField.getText() + btn2.getText();
				textField.setText(Enternumber);
			}
		});
		btn2.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(216, 191, 216));
		btn3.setBounds(215, 315, 81, 30);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Enternumber = textField.getText() + btn3.getText();
				textField.setText(Enternumber);
			}
		});
		btn3.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnmult = new JButton("*");
		btnmult.setBackground(new Color(216, 191, 216));
		btnmult.setBounds(322, 315, 90, 30);
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="*";
			}
		});
		btnmult.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btnmult);
		
		JButton btnzero = new JButton("0");
		btnzero.setBackground(new Color(216, 191, 216));
		btnzero.setBounds(25, 373, 81, 30);
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber = textField.getText() + btnzero.getText();
				textField.setText(Enternumber);
			}
		});
		btnzero.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btnzero);
		
		JButton btndot = new JButton(".");
		btndot.setBackground(new Color(216, 191, 216));
		btndot.setBounds(118, 373, 83, 30);
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Enternumber = textField.getText() + btndot.getText();
				textField.setText(Enternumber);
			}
		});
		btndot.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btndot);
		
		JButton btnequal = new JButton("=");
		btnequal.setBackground(new Color(216, 191, 216));
		btnequal.setBounds(25, 428, 393, 64);
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
			}
		});
		btnequal.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btnequal);
		
		JButton btndiv = new JButton("/");
		btndiv.setBackground(new Color(216, 191, 216));
		btndiv.setBounds(320, 373, 90, 30);
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="/";
			}
		});
		btndiv.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btndiv);
		
		JButton btnAC = new JButton("Power");
		btnAC.setBackground(new Color(216, 191, 216));
		btnAC.setBounds(25, 77, 144, 30);
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(null);
			}
		});
		btnAC.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btnAC);
		
		JButton btndel = new JButton("Clear");
		btndel.setBackground(new Color(216, 191, 216));
		btndel.setBounds(322, 77, 126, 30);
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String btndel=null;
				if(textField.getText().length() >0) {
					StringBuilder strB= new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					btndel = strB.toString();
					textField.setText(btndel);
				}
				
			}
		});
		btndel.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		frmCalculator.getContentPane().add(btndel);
		
		JButton button = new JButton("% ");
		button.setFont(new Font("Blade Runner Movie Font", Font.PLAIN, 24));
		button.setBackground(new Color(216, 191, 216));
		button.setBounds(213, 377, 81, 25);
		frmCalculator.getContentPane().add(button);
	}
}


