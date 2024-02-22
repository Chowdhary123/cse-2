package MYPROJECT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ecom {

	private JFrame frame;
	int=

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecom window = new Ecom();
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
	public Ecom() {
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
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(174, 0, 137, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\on line\\Desktop\\515TnG3kNxL._AC_UY218_.jpg"));
		lblNewLabel_1.setBounds(36, 43, 120, 135);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\on line\\Desktop\\71QKQ9mwV7L._AC_UY218_.jpg"));
		lblNewLabel_2.setBounds(234, 42, 91, 135);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("180/-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(71, 189, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("120/-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(244, 188, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lb1 = new JLabel("CART:0");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb1.setBounds(361, 30, 63, 14);
		frame.getContentPane().add(lb1);
		
		JButton bt1 = new JButton("Add To Cart");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb1.setText("Cart :"+i);
				String bill = bill+180;
				lb2.setText("Bill :"+bill);
				
			}
		});
		bt1.setForeground(Color.RED);
		bt1.setBackground(Color.WHITE);
		bt1.setFont(new Font("Tahoma", Font.BOLD, 14));
		bt1.setBounds(36, 213, 120, 23);
		frame.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("Add To Cart");
		bt2.setForeground(Color.RED);
		bt2.setFont(new Font("Tahoma", Font.BOLD, 14));
		bt2.setBounds(236, 213, 120, 23);
		frame.getContentPane().add(bt2);
		
		JLabel lb2 = new JLabel("Bill:0");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb2.setBounds(361, 61, 46, 14);
		frame.getContentPane().add(lb2);
	}
}
