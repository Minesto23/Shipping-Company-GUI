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
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Result extends JDialog{

	private final JPanel contentPanel = new JPanel();
	
	
	public Result(ArrayList<String> result) {
		setBounds(100, 100, 620, 358);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel ResultLabel = new JLabel("Shipping Result");
			ResultLabel.setBounds(183, 27, 258, 30);
			ResultLabel.setForeground(Color.WHITE);
			ResultLabel.setFont(new Font("Arial", Font.BOLD, 25));
			contentPanel.add(ResultLabel);
		}
		
		JLabel resultlabel1 = new JLabel(result.get(0));
		resultlabel1.setBounds(34, 112, 382, 20);
		resultlabel1.setForeground(Color.WHITE);
		resultlabel1.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPanel.add(resultlabel1);
		
		JLabel resultlabel2 = new JLabel(result.get(1));
		resultlabel2.setBounds(34, 141, 382, 20);
		resultlabel2.setForeground(Color.WHITE);
		resultlabel2.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPanel.add(resultlabel2);
		
		JLabel resultlabel3 = new JLabel(result.get(2));
		resultlabel3.setBounds(34, 170, 382, 20);
		resultlabel3.setForeground(Color.WHITE);
		resultlabel3.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPanel.add(resultlabel3);
		
		JLabel resultlabel4 = new JLabel(result.get(3));
		resultlabel4.setBounds(34, 199, 382, 20);
		resultlabel4.setForeground(Color.WHITE);
		resultlabel4.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPanel.add(resultlabel4);
		
		JLabel resultlabel5 = new JLabel(result.get(4));
		resultlabel5.setBounds(34, 228, 382, 20);
		resultlabel5.setForeground(Color.WHITE);
		resultlabel5.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPanel.add(resultlabel5);

		
		JLabel imageLabel = new JLabel();
		Image img=new ImageIcon(this.getClass().getResource("/image.png")).getImage();
		imageLabel.setIcon(new ImageIcon(img));
		imageLabel.setBounds(419, 99, 181, 150);
		contentPanel.add(imageLabel);
		
		JLabel resultlabel6 = new JLabel(result.get(5));
		resultlabel6.setForeground(Color.WHITE);
		resultlabel6.setFont(new Font("Arial", Font.PLAIN, 23));
		resultlabel6.setBounds(154, 285, 382, 24);
		contentPanel.add(resultlabel6);
	}

}
