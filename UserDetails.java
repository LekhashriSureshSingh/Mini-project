package miniproject1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class UserDetails {
	JFrame frame;
	JLabel l1,l2,l3;
	JTextField tf1;
	JPasswordField psd;
	JButton btn1,btn2;
	UserDetails()
	{
		frame=new JFrame("User Login");
		frame.setLayout(null);
		l3=new JLabel("Enter your Login Details");
		l3.setBounds(30, 0, 150, 20);
		
		l1=new JLabel("Name");
		l1.setBounds(30, 30, 100, 20);
		tf1=new  JTextField();
		tf1.setBounds(120, 30, 100, 20);
		
		l2=new JLabel("Password");
		l2.setBounds(30, 60, 100, 20);
		psd=new  JPasswordField();
		psd.setBounds(120, 60, 100, 20);
		
		btn1=new JButton("Submit");
		btn1.setBounds(30, 90, 100, 20);
		btn2=new JButton("Exit");
		btn2.setBounds(120, 90, 100, 20);
		
		frame.add(l3);
		frame.add(l1);
		frame.add(l2);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(tf1);
		frame.add(psd);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String a=tf1.getText();
				char[] c=a.toCharArray();
				char[] b=psd.getPassword();
				if(c.equals(b)==true)
				{
					JOptionPane.showConfirmDialog(null, "Enter valid details", "Incorrect id", JOptionPane.CLOSED_OPTION);
				}
				else 
				{
					Payment p1=new Payment();
					p1.setVisible(true);
				}
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}		
		});
		frame.setSize(400,380);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new UserDetails();

	}

}
