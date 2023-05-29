/*import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;*/

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;

public class converter 
{

	JFrame frame;
	JTextField amountfield,resultfield;
    JLabel header,from,to,amount;
    JPanel panel,panel_1;
	JComboBox<?> fromcombo,tocombo;

	public converter() 
	{
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setResizable(false);
		frame.setBounds(100, 100, 553, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Currency  Converter");
		
		header = new JLabel("Currency  Converter");
		header.setForeground(new Color(255, 0, 0));
		header.setFont(new Font("Times New Roman", Font.BOLD, 30));
		header.setBounds(140, 10, 278, 77);
		frame.getContentPane().add(header);
		
		panel = new JPanel();
		panel.setBackground(new Color(51, 204, 153));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(57, 89, 427, 488);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		amount = new JLabel("Enter Amount :");
		amount.setFont(new Font("Times New Roman", Font.BOLD, 18));
		amount.setBounds(23, 64, 126, 35);
		panel.add(amount);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 102));
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(34, 132, 323, 189);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
	    fromcombo = new JComboBox();
		fromcombo.setFont(new Font("Tahoma", Font.BOLD, 13));
		fromcombo.setModel(new DefaultComboBoxModel(new String[] {"USD", "Nepali rupees", "Indian rupee", "Pakistani rupee", "Euro"}));
		fromcombo.setBounds(158, 23, 155, 39);
		panel_1.add(fromcombo);
		
		tocombo = new JComboBox();
		tocombo.setModel(new DefaultComboBoxModel(new String[] {"Nepali rupees", "USD", "Indian rupee", "Pakistani rupee", "Euro"}));
		tocombo.setFont(new Font("Tahoma", Font.BOLD, 13));
		tocombo.setBounds(158, 115, 155, 39);
		panel_1.add(tocombo);
		
		from = new JLabel("From  :");
		from.setFont(new Font("Times New Roman", Font.BOLD, 20));
		from.setBounds(46, 27, 75, 35);
		panel_1.add(from);
		
		to = new JLabel("To      :");
		to.setFont(new Font("Times New Roman", Font.BOLD, 20));
		to.setBounds(46, 115, 75, 35);
		panel_1.add(to);
		
		resultfield = new JTextField();
		resultfield.setForeground(new Color(255, 0, 0));
		resultfield.setBackground(new Color(204, 255, 255));
		resultfield.setBounds(118, 381, 163, 41);
		panel.add(resultfield);
		resultfield.setColumns(10);
		
		amountfield = new JTextField();
		amountfield.addKeyListener(new KeyAdapter() {
			
			public void keyReleased(KeyEvent e)
			{
				double value;
				double amount =Double.parseDouble(amountfield.getText());
				
				//conversion from USD to others
				if(fromcombo.getSelectedItem().toString() == "USD" && tocombo.getSelectedItem().toString() == "Nepali rupees")
				{
					value = amount * 132.32;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "USD" && tocombo.getSelectedItem().toString() == "Indian rupee")
				{
					value = amount * 82.61;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "USD" && tocombo.getSelectedItem().toString() == "Pakistani rupee")
				{
					value = amount * 285.53;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "USD" && tocombo.getSelectedItem().toString() == "Euro")
				{
					value = amount * 0.93;
					resultfield.setText(" " +value);
				}
				
				
				//conversion from nepali rupees to others
				else if(fromcombo.getSelectedItem().toString() == "Nepali rupees" && tocombo.getSelectedItem().toString() == "USD")
				{
					value = amount * 0.0076;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "Nepali rupees" && tocombo.getSelectedItem().toString() == "Indian rupee")
				{
					value = amount * 0.62;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "Nepali rupees" && tocombo.getSelectedItem().toString() == "Pakistani rupee")
				{
					value = amount * 0.216;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "Nepali rupees" && tocombo.getSelectedItem().toString() == "Euro")
				{
					value = amount * 0.0070;
					resultfield.setText(" " +value);
				}
				
				
				//conversion from indian rupee to others
				else if(fromcombo.getSelectedItem().toString() == "Indian rupee" && tocombo.getSelectedItem().toString() == "USD")
				{
					value = amount * 0.012;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "Indian rupee" && tocombo.getSelectedItem().toString() == "Nepali rupees")
				{
					value = amount * 1.60;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "Indian rupee" && tocombo.getSelectedItem().toString() == "Pakistani rupee")
				{
					value = amount * 3.46;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "Indian rupee" && tocombo.getSelectedItem().toString() == "Euro")
				{
					value = amount * 0.011;
					resultfield.setText(" " +value);
				}
				
				
				//convrsion from pakistani rupee to others
				else if(fromcombo.getSelectedItem().toString() == "Pakistani rupee" && tocombo.getSelectedItem().toString() == "USD")
				{
					value = amount * 0.0035;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "Pakistani rupee" && tocombo.getSelectedItem().toString() == "Nepali rupees")
				{
					value = amount * 0.46;
					resultfield.setText(" " +value);
				}
				
				else if(fromcombo.getSelectedItem().toString() == "Pakistani rupee" && tocombo.getSelectedItem().toString() == "Euro")
				{
					value = amount * 0.0033;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "Pakistani rupee" && tocombo.getSelectedItem().toString() == "Indian rupee")
				{
					value = amount * 0.29;
					resultfield.setText(" " +value);
				}
				
				
				//conversion from euro to others
				else if(fromcombo.getSelectedItem().toString() == "Euro" && tocombo.getSelectedItem().toString() == "USD")
				{
					value = amount * 1.07;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "Euro" && tocombo.getSelectedItem().toString() == "Nepali rupees")
				{
					value = amount * 142.02;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "Euro" && tocombo.getSelectedItem().toString() == "Indian rupee")
				{
					value = amount * 88.68;
					resultfield.setText(" " +value);
				}
				else if(fromcombo.getSelectedItem().toString() == "Euro" && tocombo.getSelectedItem().toString() == "Pakistani rupee")
				{
					value = amount * 324.49;
					resultfield.setText(" " +value);
				}
				
			}
		});
		amountfield.setBounds(175, 64, 184, 35);
		panel.add(amountfield);
		amountfield.setColumns(10);				
		
		JLabel lblConvertedAmount = new JLabel("Converted Amount");
		lblConvertedAmount.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblConvertedAmount.setBounds(118, 336, 163, 35);
		panel.add(lblConvertedAmount);
	}
	
	
public static void main(String[] args)
{
	converter window = new converter();
	window.frame.setVisible(true);
   }
}