package miniproject1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ticketbooking extends JFrame{
	
	JLabel label1,label5;
	JTextField txt1,txt2,txt3,txt4;
	JButton btn;
	
	Ticketbooking()
	{
		new JFrame("Ticket Registration Portal");
		this.setLayout(null);
		
		label1=new JLabel("NAME");
		label1.setBounds(0, 30, 300, 30);
		txt1=new JTextField();
		txt1.setBounds(200, 30, 250, 30);
		
		JLabel label2=new JLabel("Email-id");
		label2.setBounds(0, 80, 300, 30);
		JTextField txt2=new JTextField();
		txt2.setBounds(200, 80, 250, 30);
		
		JLabel label3=new JLabel("Arrival");
		label3.setBounds(0, 130, 300, 30);
		
		String[] stg={"Chennai","Coimbatore","Madurai","Kaniyakumari","Tirichi","Tanjavur","Bangalore"};
		JComboBox txt3=new JComboBox(stg);
		txt3.setEditable(true);
		txt3.setBounds(200, 130, 250, 30);
		
		JLabel label4=new JLabel("Destination");
		label4.setBounds(0, 180, 300, 30);
		
		String[] stg1={"Chennai","Coimbatore","Madurai","Kaniyakumari","Tirichi","Tanjavur","Bangalore"};
		JComboBox txt4=new JComboBox(stg1);
		txt4.setEditable(true);
		txt4.setBounds(200, 180, 250, 30);
		
		JLabel label5=new JLabel("Age");
		label5.setBounds(0, 230, 300, 30);
		JTextField txt5=new JTextField();
		txt5.setBounds(200, 230, 250, 30);
		
		JLabel label6=new JLabel("Time");
		label6.setBounds(0, 280, 300, 30);
		
		String[] cmb2= {"1","2","3","4","5","6","7","8","9","10","11","12"};
		JComboBox <String> txtc=new JComboBox<>(cmb2);
		txtc.setEditable(true);
		txtc.setBounds(200, 280, 50, 30);
		
		String[] cmb= {"AM","PM"};
		JComboBox <String> txt6=new JComboBox<>(cmb);
		txt6.setEditable(true);
		txt6.setBounds(280, 280, 50, 30);
		
		JLabel label7=new JLabel("Contact Number");
		label7.setBounds(0, 330, 300, 30);
		JTextField txt7=new JTextField();
		txt7.setBounds(200, 330, 250, 30);
		
		JLabel label8=new JLabel("Date");
		label8.setBounds(0, 380, 300, 30);
		
		String[] d= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		JComboBox<String> c=new JComboBox<>(d);
		c.setEditable(true);
		c.setBounds(200, 380, 50, 30);
		
		String[] m= {"1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002"};
		JComboBox<String> i=new JComboBox<>(m);
		i.setEditable(true);
		i.setBounds(270, 380, 50, 30);
		
		String[] y= {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
		JComboBox<String> j=new JComboBox<>(y);
		j.setEditable(true);
		j.setBounds(340, 380, 100, 30);
		
		JLabel label9=new JLabel("Gender");
		label9.setBounds(0, 430, 300, 30);

		JRadioButton male=new JRadioButton("Male");
		JRadioButton fmale=new JRadioButton("Female");
		
		ButtonGroup gen=new ButtonGroup();
		
		gen.add(male);
		gen.add(fmale);
		male.setBounds(200, 430, 100, 30);
		fmale.setBounds(300, 430, 100, 30);
		
		btn=new JButton("Submit");
		btn.setBounds(0, 480, 150, 30);
		
		JButton btn2=new JButton("Exit");
		btn2.setBounds(220, 480, 150, 30);
		
		this.add(label1);
		this.add(txt1);
		this.add(label2);
		this.add(txt2);
		this.add(label3);
		this.add(txt3);
		this.add(label4);
		this.add(txt4);
		this.add(label5);
		this.add(txt5);
		this.add(label6);
		this.add(txt6);
		this.add(txtc);
		this.add(label7);
		this.add(txt7);
		this.add(label8);
		this.add(c);
		this.add(i);
		this.add(j);
		this.add(label9);
		this.add(male);
		this.add(fmale);
		this.add(btn);
		this.add(btn2);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(txt3.getSelectedItem()==txt4.getSelectedItem())
					JOptionPane.showConfirmDialog(null, "Arrival and Destination could not be the same", "Location Error", JOptionPane.ERROR_MESSAGE);
				
				String st1=txt5.getText();
				Double no=Double.parseDouble(st1);
				
				if(no<=18)
				{
				JOptionPane.showConfirmDialog(null, "Your Age should be Greater than 18 ", "Age Error", JOptionPane.ERROR_MESSAGE);
				}
				
				String st=txt7.getText();
				char[] ld=st.toCharArray();
				
				if(ld.length!=10)
				{
				JOptionPane.showConfirmDialog(null, "Enter your 10 digit phone number ", "Incorrect Phone number", JOptionPane.WARNING_MESSAGE);
				}
				
				String genr="";
				if(male.isSelected())
					genr="Male";
				else
					genr="Female";
				
				System.out.println("Name: "+txt1.getText());
				System.out.println("Mail: "+txt2.getText());
				System.out.println("Arrival from: "+txt3.getSelectedItem().toString());
				System.out.println("Departure from: "+txt4.getSelectedItem().toString());
				System.out.println("Age: "+txt5.getText());
				System.out.println("Time: "+txtc.getSelectedItem().toString()+" "+txt6.getSelectedItem().toString());
				System.out.println("Conatct no: "+txt7.getText());
				System.out.println("Date: "+c.getSelectedItem().toString()+" "+i.getSelectedItem().toString()+" "+j.getSelectedItem().toString());
				System.out.println("Gender: "+genr);
			}
			
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		
		
		this.setVisible(true);
		this.setSize(600,700);
	
	}

	public static void main(String[] args) {
		new Ticketbooking();

	}

}
