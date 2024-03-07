package sampleproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField P1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel tg = new JLabel("name");
		tg.setFont(new Font("Times New Roman", Font.BOLD, 11));
		tg.setBounds(124, 53, 146, 30);
		frame.getContentPane().add(tg);
		
		tb1 = new JTextField();
		tb1.setBounds(240, 58, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=tb1.getText();
				String password=P1.getText();
				if(name.equals("bhargavi") && password.equals("1234"))
				{
				   JOptionPane.showMessageDialog(btnNewButton,"valid login");
			    }
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"invalid login");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton.setForeground(new Color(0, 0, 160));
		btnNewButton.setBackground(new Color(100, 100, 100));
		btnNewButton.setBounds(197, 215, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		P1 = new JPasswordField();
		P1.setBounds(240, 100, 86, 20);
		frame.getContentPane().add(P1);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_2.setBounds(103, 103, 84, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("STUDENT LOGIN");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(132, 11, 138, 20);
		frame.getContentPane().add(lblNewLabel_4);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
