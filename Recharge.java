package miniproject1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Recharge extends JFrame{

	JLabel labl1;
	JTextField fld1,fld2,fld3;
	
	JRadioButton box1,box2,box3,box4;
	JButton bttn1, bttn2;
	
	String item=" ",item1=" ";
	double amount=0.0;
	
	Recharge()
	{
		this.setTitle("Recharge Plans");
		labl1=new JLabel("Phone no");
		fld1=new JTextField();
		fld2=new JTextField();
		fld3=new JTextField();
	
		box1=new JRadioButton("Pack 1 --- RS.100");
		box2=new JRadioButton("Pack 2 --- RS.200");
		box3=new JRadioButton("Pack 3 --- RS.400");
		box4=new JRadioButton("Pack 4 --- RS.500");
		
		bttn1=new JButton("Add this pack");
		bttn2=new JButton("Exit");
		
		ButtonGroup obj=new ButtonGroup();
		obj.add(box1);
		obj.add(box2);
		obj.add(box3);
		obj.add(box4);
		
		this.add(labl1);
		this.add(fld1);
		this.add(box1);
		this.add(box2);
		this.add(box3);
		this.add(box4);
		this.add(fld2);
		this.add(fld3);
		this.add(bttn1);
		this.add(bttn2);
		box1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if (e.getStateChange() == 1) {
					amount = 100.00;
					item1=item.concat("Pack1 ");
				}
			}
			
		});
		
		box2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if (e.getStateChange() == 1) {
					item1=item.concat("Pack2 ");
					amount = 200.00;
				}
			}
			
		});
		
		box3.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if (e.getStateChange() == 1) {
					item1=item.concat("Pack3 ");
					amount = 400.00;
				}
			}
			
		});
		
		box4.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if (e.getStateChange() == 1) {
					item1=item.concat("Pack4 ");
					amount = 500.00;
				}
			}
			
		});
		
		bttn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String t1="Enter valid phone no";
				
				String st=fld1.getText();
				char[] ld=st.toCharArray();
				
				if(ld.length!=10)
				{
				fld2.setText(t1);
				JOptionPane.showConfirmDialog(null, "Enter your 10 digit phone number ", "Recharge unsucessfull", JOptionPane.OK_CANCEL_OPTION);
				}
				else {
					fld2.setText(item1 + " is added for recharge ");
					fld3.setText("Rs. "+amount);
					JOptionPane.showConfirmDialog(null, "Your Recharge has been sucessfully done. ", "Recharge sucessfull", JOptionPane.CANCEL_OPTION);
				}
				String n=" ";
				if(box1.isSelected())
				{
					n="Pack 1 ... RS.100";
				}else if(box2.isSelected())
				{
					n="Pack 2 ... RS.200";
				}else if(box3.isSelected())
				{
					n="Pack 3 ... RS.400";
				}else if(box4.isSelected())
				{
					n="Pack 4 ... RS.500";
				}
				System.out.println("Phone Number :"+fld2.getText());
				System.out.println("Type of Pack : "+n);
				System.out.println("Recharge is done");
			}
		});
		
		bttn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		this.setLayout(new GridLayout(5,2));
		this.setSize(450, 450);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new Recharge();

	}

}
