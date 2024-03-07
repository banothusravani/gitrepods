package sampleproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Moviebooking {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField TB1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Moviebooking window = new Moviebooking();
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
	public Moviebooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(85, 52, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Movie");
		lblNewLabel_1.setBounds(85, 83, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NO OF TICKETS");
		lblNewLabel_2.setBounds(71, 138, 91, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		TB1 = new JTextField();
		TB1.setBounds(159, 49, 86, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MR.PERFECT", "RRR"}));
		CB1.setBounds(140, 86, 106, 14);
		frame.getContentPane().add(CB1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5"}));
		c2.setBounds(172, 134, 105, 14);
		frame.getContentPane().add(c2);
		
		JButton s = new JButton("submit");
		s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=TB1.getText();
				String movie=(String) CB1.getSelectedItem();
				String NOOFTICKETS=(String) c2.getSelectedItem();
				int NOOFTICKETS1=Integer.parseInt(NOOFTICKETS);
				int bill=0;
				if(movie.equals("MR PERFECT"))
				{
				    bill=bill+150*NOOFTICKETS1;
				}
				if(movie.equals("RRR"))
				{
				    bill=bill+200*NOOFTICKETS1;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(s,"Name"+name+"\n movie"+movie+"\n number of tickets"+NOOFTICKETS+"\n amount"+bill);
				if(res==YES_OPTION) 
				{
			        JOptionPane.showMessageDialog(s,"booking confirmed");
				}
				else
				{
					JOptionPane.showMessageDialog(s,"booking not confirmed");
					
				}
			}
			
		});
		s.setBounds(142, 214, 89, 23);
		frame.getContentPane().add(s);
		
		JLabel CB2 = new JLabel("New label");
		CB2.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Desktop\\download 2.jpg"));
		CB2.setBounds(10, 11, 409, 230);
		frame.getContentPane().add(CB2);
	}
}
