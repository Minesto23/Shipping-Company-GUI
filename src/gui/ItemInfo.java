/**
 *	Made by :
 *
 *	- Miguel Ernesto Morales Molina
	- Karim Moluh Seidou
	- Hadi Mustafa
	- Rayan Bou Hassan
	- Arman Islam

 * 
 **/

package gui;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JLabel;



public class ItemInfo extends JDialog {
	
	private final JPanel contentPanel = new JPanel();

	public ItemInfo(ArrayList<String> itemdata) {
		
		setTitle(itemdata.get(0) + " Information");
		setBounds(100, 100, 450, 277);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel ItemInfoLabel = new JLabel(itemdata.get(0)+" Information");
			ItemInfoLabel.setBounds(94, 12, 258, 30);
			ItemInfoLabel.setForeground(Color.WHITE);
			ItemInfoLabel.setFont(new Font("Arial", Font.BOLD, 25));
			contentPanel.add(ItemInfoLabel);
		}
		
		JLabel itemlabel1 = new JLabel(itemdata.get(1));
		itemlabel1.setForeground(Color.WHITE);
		itemlabel1.setFont(new Font("Arial", Font.PLAIN, 14));
		itemlabel1.setBounds(23, 67, 382, 17);
		contentPanel.add(itemlabel1);
		
		JLabel itemlabel2 = new JLabel(itemdata.get(2));
		itemlabel2.setForeground(Color.WHITE);
		itemlabel2.setFont(new Font("Arial", Font.PLAIN, 14));
		itemlabel2.setBounds(23, 96, 382, 17);
		contentPanel.add(itemlabel2);
		
		JLabel itemlabel3 = new JLabel(itemdata.get(3));
		itemlabel3.setForeground(Color.WHITE);
		itemlabel3.setFont(new Font("Arial", Font.PLAIN, 14));
		itemlabel3.setBounds(23, 125, 382, 17);
		contentPanel.add(itemlabel3);
		
		JLabel itemlabel4 = new JLabel(itemdata.get(4));
		itemlabel4.setForeground(Color.WHITE);
		itemlabel4.setFont(new Font("Arial", Font.PLAIN, 14));
		itemlabel4.setBounds(23, 154, 382, 17);
		contentPanel.add(itemlabel4);
		
		JLabel itemlabel5 = new JLabel(itemdata.get(5));
		itemlabel5.setForeground(Color.WHITE);
		itemlabel5.setFont(new Font("Arial", Font.PLAIN, 14));
		itemlabel5.setBounds(23, 183, 382, 17);
		contentPanel.add(itemlabel5);
		
		JLabel itemlabel6 = new JLabel(itemdata.get(6));
		itemlabel6.setForeground(Color.WHITE);
		itemlabel6.setFont(new Font("Arial", Font.PLAIN, 14));
		itemlabel6.setBounds(23, 212, 382, 17);
		contentPanel.add(itemlabel6);
	}
}
