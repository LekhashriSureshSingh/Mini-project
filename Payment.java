package miniproject1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Payment extends JFrame{
	JLabel l1;
	JButton b1,b2,b3,b4;
	
	Payment()
	{
		new JFrame("Payment Window");
		this.setLayout(null);
		l1=new JLabel("Enter the payment method");
		l1.setBounds(50, 50, 150, 30);
		
		b1=new JButton("Recharge");
		b2=new JButton("Ticket Booking");
		b3=new JButton("Add Amount");
		b4=new JButton("Exit");		
		
		b1.setBounds(50, 150, 100, 50);
		b2.setBounds(250, 150, 100, 50);
		b3.setBounds(50, 250, 100, 50);
		b4.setBounds(250, 250, 100, 50);
		
		this.add(l1);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		
		this.setSize(480, 480);
		this.setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {			
				Recharge rec1=new Recharge();
				rec1.setVisible(true);
			}			
		});		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Ticketbooking tic=new Ticketbooking();
				tic.setVisible(true);
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				AddAmount am=new AddAmount();
				am.setVisible(true);
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Payment();

	}

}
