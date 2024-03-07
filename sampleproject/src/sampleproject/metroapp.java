package sampleproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metroapp {

	private JFrame frame;
	private JTextField TB1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroapp window = new metroapp();
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
	public metroapp() {
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
		lblNewLabel.setBounds(83, 42, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SOURCE");
		lblNewLabel_1.setBounds(83, 89, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DESTINATION");
		lblNewLabel_2.setBounds(83, 126, 103, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NOOFTICKETS");
		lblNewLabel_3.setBounds(83, 175, 84, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton S = new JButton("SUBMIT");
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NAME=TB1.getText();
				String SOURCE=(String) C1.getSelectedItem();
				String DESTINATION=(String) C2.getSelectedItem();
				String NOOFTICKETS=(String) N.getSelectedItem();
				int NOOFTICKETS1=Integer.parseInt(NOOFTICKETS);
				int bill=0;
				if(SOURCE.equals(DESTINATION))
				{
					JOptionPane.showMessageDialog(S,"please check stations");
				}
				else
				{
				   bill=bill+50*NOOFTICKETS1;
				 
				   JOptionPane.showConfirmDialog(s,"Name"+NAME+"\n SOURCE"+SOURCE+ "\n destination" +DESTINATION+"\n numberof tickets"+NOOFTICKETS+"\n BILL"+BILL);


			}
		});
		S.setBounds(173, 227, 89, 23);
		frame.getContentPane().add(S);
		
		JLabel lblNewLabel_4 = new JLabel("METROAPP");
		lblNewLabel_4.setBounds(173, 11, 142, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		TB1 = new JTextField();
		TB1.setBounds(210, 39, 86, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		JComboBox C1 = new JComboBox();
		C1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "JBS PARIDE", "GANDHI STATION", "CHILAKAPUDU", "MIYAPUR", "MGBS"}));
		C1.setBounds(210, 70, 105, 22);
		frame.getContentPane().add(C1);
		
		JComboBox C2 = new JComboBox();
		C2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "SECUNDRABAD", "JBS PARIDE", "HAYTHNAGAR"}));
		C2.setBounds(212, 122, 103, 22);
		frame.getContentPane().add(C2);
		
		JComboBox N = new JComboBox();
		N.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5"}));
		N.setBounds(210, 175, 121, 14);
		frame.getContentPane().add(N);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Downloads\\images.jfif"));
		lblNewLabel_5.setBounds(10, 14, 402, 239);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
