package sampleproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Loginnew {

	private JFrame frame;
	private JTextField TB1;
	private JLabel lblNewLabel_1;
	private JPasswordField P1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginnew window = new Loginnew();
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
	public Loginnew() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(124, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		TB1 = new JTextField();
		TB1.setBounds(220, 60, 86, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(125, 111, 67, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		P1 = new JPasswordField();
		P1.setBounds(220, 108, 86, 20);
		frame.getContentPane().add(P1);
		
		JButton L = new JButton("LOGIN");
		L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NAME=TB1.getText();
				String PASSWORD=P1.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					PreparedStatement stn=con.prepareStatement("select NAME,PASSWORD from users where  NAME=? and PASSWORD=?");
					stn.setString(1, NAME);
					stn.setString(2,PASSWORD);
					ResultSet rs=stn.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(L,"valid user");
					 }
					 else
					 {
						JOptionPane.showMessageDialog(L,"invalid user");
					 }
				  }
				     catch(SQLException e1)
				     {
					  e1.printStackTrace();
				     }
				
			      }
		});
		L.setBounds(174, 201, 89, 23);
		frame.getContentPane().add(L);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN PAGE");
		lblNewLabel_2.setBounds(162, 11, 67, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
