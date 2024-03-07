package sampleproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Studentdata {

	private JFrame frame;
	private JTextField TB2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentdata window = new Studentdata();
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
	public Studentdata() {
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
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setBounds(125, 11, 162, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(57, 73, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextField TB1 = new JTextField();
		TB1.setHorizontalAlignment(SwingConstants.LEFT);
		TB1.setBounds(137, 70, 86, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setBounds(57, 110, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		TB2 = new JTextField();
		TB2.setBounds(137, 107, 86, 20);
		frame.getContentPane().add(TB2);
		TB2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setBounds(57, 154, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "DS", "IOT", "AIML", "CIVIL"}));
		CB1.setBounds(137, 150, 81, 22);
		frame.getContentPane().add(CB1);
		
		JButton S = new JButton("SUBMIT");
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=TB1.getText();
				int ID=Integer.parseInt(roll);
			    String NAME=TB2.getText();
			    String BRANCH=(String) CB1.getSelectedItem();
			    try {
			    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
			    	String q="insert into students values('"+ID+"','"+NAME+"','"+BRANCH+"')";
			    	Statement stn=con.createStatement();
			    	stn.executeUpdate(q);
			    	JOptionPane.showMessageDialog(S,"record inserted");
			    	con.close();
			    }
			    catch(SQLException e1)
			    {
			    	e1.printStackTrace();			    }
			    }
		});
		S.setBounds(145, 227, 89, 23);
		frame.getContentPane().add(S);
	}
}
