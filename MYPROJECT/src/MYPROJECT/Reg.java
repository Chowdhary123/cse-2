package MYPROJECT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reg {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reg window = new Reg();
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
	public Reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(151, 11, 137, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(50, 61, 95, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(51, 102, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(50, 144, 69, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Programming");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(49, 180, 116, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(147, 60, 116, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "cse", "ECE", "MECH", "IT", "AIML", "DS", "PHM"}));
		cb1.setBounds(157, 91, 106, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(157, 135, 68, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(227, 135, 76, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JCheckBox c1 = new JCheckBox("Java");
		c1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		c1.setBounds(155, 178, 49, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("python");
		c2.setBounds(206, 178, 68, 23);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String b=(String) cb1.getSelectedItem();
		        String g;
		        if(r1.isSelected())
		        {
		        	g="Male";
		        }
		        else if(r2.isSelected())
		        {
		        	g="Female";
		        }
		        else
		        { 
		        	g="invalid";
		        }
		        String Pl="";
		        if(c1.isSelected())
		        {
		        	Pl=Pl+"Java";
		        }
		        if(c2.isSelected())
		        {
		        	Pl=Pl+"Python";
			    }
			    int res=0;
			    
			  res=JOptionPane.showConfirmDialog(btnNewButton, "Hello"+n+
			    		"\nplease confirm your details :\nBranch:"+b+
			    		"\n gender :"+g+"\n programming: "+Pl);
			  if(res==JOptionPane.YES_OPTION)
			  {
				  JOptionPane.showMessageDialog(btnNewButton, "Reg Done!");
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(btnNewButton, "Reg Cancelled!");
			  }
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(136, 225, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
