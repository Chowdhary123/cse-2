package MYPROJECT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class REGISTRATIONPAGE {

	private JFrame frame;
	private JTextField n1;
	private JTextField e1;
	private JTextField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGISTRATIONPAGE window = new REGISTRATIONPAGE();
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
	public REGISTRATIONPAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(132, 23, 316, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(72, 91, 77, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(60, 112, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("EMAIL-ID");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(72, 126, 108, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PHN NO");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(72, 163, 108, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		n1 = new JTextField();
		n1.setBounds(185, 90, 133, 20);
		frame.getContentPane().add(n1);
		n1.setColumns(10);
		
		e1 = new JTextField();
		e1.setBounds(185, 125, 133, 20);
		frame.getContentPane().add(e1);
		e1.setColumns(10);
		
		p1 = new JTextField();
		p1.setBounds(185, 162, 133, 20);
		frame.getContentPane().add(p1);
		p1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un=n1.getText();
				String email =e1.getText();
				if(!email.contains("@gmail")) {
					JOptionPane.showMessageDialog(btnNewButton, "Invalid gmail");
				}
				else {
					//JOptionPane.showMessageDialog(btnNewButton, "hello "+un+" \n your mail id is "+email);
					Login l=new Login();
					  l.setVisible(true);
					  frame.setVisible(false);
				}
				
				
				//JOptionPane.showMessageDialog(btnNewButton, "your mail id is "+email);
				String phn =p1.getText();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(197, 211, 102, 23);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
