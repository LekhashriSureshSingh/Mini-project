package miniproject1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddAmount extends JFrame{
	JLabel acc,amt,ifsc,lbl;
	JTextField txt1,txt2,txt3,txt4;
	JButton bt1,bt2;
	
	AddAmount(){
		new JFrame("Add Amount");
		this.setLayout(null);
		
		lbl=new JLabel("Enter the details to deposite amount");
		lbl.setBounds(30, 50, 300, 50);
		acc=new JLabel("Account number");
		acc.setBounds(30, 140, 150, 50);
		txt1=new JTextField();
		txt1.setBounds(200, 140, 150, 50);
		
		amt=new JLabel("Amount to deposit");
		amt.setBounds(30, 210, 150, 50);
		txt2=new JTextField();
		txt2.setBounds(200, 210, 150, 50);
		
		ifsc=new JLabel("IFSC");
		ifsc.setBounds(30, 280, 150, 50);
		txt3=new JTextField();
		txt3.setBounds(200, 280, 150, 50);
		
		txt4=new JTextField();
		txt4.setBounds(30, 350, 320, 50);
		
		bt1=new JButton("Submit");
		bt1.setBounds(30, 420, 150, 50);
		bt2=new JButton("Exit");
		bt2.setBounds(200, 420, 150, 50);
		
		this.add(lbl);
		this.add(acc);
		this.add(txt1);
		this.add(amt);
		this.add(txt2);
		this.add(ifsc);
		this.add(txt3);
		this.add(txt4);
		this.add(bt1);
		this.add(bt2);

		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String ab=txt1.getText();
				char[] n=ab.toCharArray();
				if(n.length!=16)
				{
					JOptionPane.showConfirmDialog(null, "Enter valid Digits of Account Number", "AccNo Error", JOptionPane.OK_CANCEL_OPTION);
				}
				txt4.setText("Your Amount has been Successfully added to the Account.");
				System.out.println("Account Number : "+txt1.getText());
				System.out.println("Amount Added : "+txt2.getText());
				JOptionPane.showConfirmDialog(null, "Amount Added to the Account.", "Amount Details", JOptionPane.OK_CANCEL_OPTION);
			}
		});
		
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}	
		});
		
		this.setSize(480,540);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
			new AddAmount();

	}

}
