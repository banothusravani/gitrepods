package sampleproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Metrotrainapp {

	private JFrame frame;
	private JTextField TB1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metrotrainapp window = new Metrotrainapp();
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
	public Metrotrainapp() {
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
		
		JLabel lblNewLabel = new JLabel("METROAPP");
		lblNewLabel.setBounds(159, 25, 62, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(53, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		TB1 = new JTextField();
		TB1.setBounds(135, 50, 86, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setBounds(41, 91, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox C1 = new JComboBox();
		C1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MGBS", "KOTI", "JBS"}));
		C1.setBounds(145, 87, 76, 22);
		frame.getContentPane().add(C1);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setBounds(41, 130, 68, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox C2 = new JComboBox();
		C2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MGBS", "KOTI", "JBS"}));
		C2.setBounds(155, 126, 86, 22);
		frame.getContentPane().add(C2);
		
		JLabel lblNewLabel_4 = new JLabel("NT");
		lblNewLabel_4.setBounds(53, 165, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox N = new JComboBox();
		N.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4"}));
		N.setBounds(159, 159, 82, 22);
		frame.getContentPane().add(N);
		
		JButton S = new JButton("SUBMIT");
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NAME=TB1.getText();
				String SOURCE=(String) C1.getSelectedItem();
				String DESTINATION=(String) C2.getSelectedItem();
				String NT=(String) N.getSelectedItem();
				int NOOFTICKETS1=Integer.parseInt(NT);
				int bill=0;
				if(SOURCE.equals(DESTINATION))
				{
					JOptionPane.showMessageDialog(S,"please check stations");
				}
				else
				{
				   bill=bill+50*NOOFTICKETS1;
				 
				   JOptionPane.showConfirmDialog(S,"Name"+NAME+"\n SOURCE"+SOURCE+ "\n destination" +DESTINATION+"\n numberof tickets"+NT+"\n BILL"+bill);
				}

			}
		});
		S.setBounds(132, 216, 89, 23);
		frame.getContentPane().add(S);
	}
}
