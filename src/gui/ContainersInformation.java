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
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import containers.BigContainer;
import containers.SmallContainer;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ContainersInformation extends JDialog {

	private final JPanel contentPanel = new JPanel();

	
	public ContainersInformation() {
		
		SmallContainer small = new SmallContainer();
		BigContainer big  = new BigContainer();
		
		ArrayList <String> smallList = new ArrayList<>();
		ArrayList <String> bigList = new ArrayList<>();
		
		smallList = small.printContainerInfo();
		bigList =  big.printContainerInfo();		
		
		setTitle("Container Info");
		setBounds(100, 100, 450, 526);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel BigContainerLabel = new JLabel("Big Container");
			BigContainerLabel.setFont(new Font("Arial", Font.BOLD, 16));
			BigContainerLabel.setForeground(Color.WHITE);
			BigContainerLabel.setBounds(23, 73, 113, 17);
			contentPanel.add(BigContainerLabel);
		}
		{
			JLabel lblContainerInformation = new JLabel("Container Information");
			lblContainerInformation.setBounds(94, 12, 258, 30);
			lblContainerInformation.setForeground(Color.WHITE);
			lblContainerInformation.setFont(new Font("Arial", Font.BOLD, 25));
			contentPanel.add(lblContainerInformation);
		}
		
		JLabel SmallContainerLabel = new JLabel("Small Container");
		SmallContainerLabel.setForeground(Color.WHITE);
		SmallContainerLabel.setFont(new Font("Arial", Font.BOLD, 16));
		SmallContainerLabel.setBounds(23, 264, 175, 17);
		contentPanel.add(SmallContainerLabel);
		
		JLabel bclabel1 = new JLabel(bigList.get(0));
		bclabel1.setForeground(Color.WHITE);
		bclabel1.setFont(new Font("Arial", Font.PLAIN, 14));
		bclabel1.setBounds(23, 102, 382, 17);
		contentPanel.add(bclabel1);
		
		JLabel bclabel2 = new JLabel(bigList.get(1));
		bclabel2.setForeground(Color.WHITE);
		bclabel2.setFont(new Font("Arial", Font.PLAIN, 14));
		bclabel2.setBounds(23, 131, 382, 17);
		contentPanel.add(bclabel2);
		
		JLabel bclabel3 = new JLabel(bigList.get(2));
		bclabel3.setForeground(Color.WHITE);
		bclabel3.setFont(new Font("Arial", Font.PLAIN, 14));
		bclabel3.setBounds(23, 160, 382, 17);
		contentPanel.add(bclabel3);
		
		JLabel bclabel4 = new JLabel(bigList.get(3));
		bclabel4.setForeground(Color.WHITE);
		bclabel4.setFont(new Font("Arial", Font.PLAIN, 14));
		bclabel4.setBounds(23, 189, 382, 17);
		contentPanel.add(bclabel4);
		
		JLabel bclabel5 = new JLabel(bigList.get(4));
		bclabel5.setForeground(Color.WHITE);
		bclabel5.setFont(new Font("Arial", Font.PLAIN, 14));
		bclabel5.setBounds(23, 218, 382, 17);
		contentPanel.add(bclabel5);
		
		JLabel sclabel1 = new JLabel(smallList.get(0));
		sclabel1.setForeground(Color.WHITE);
		sclabel1.setFont(new Font("Arial", Font.PLAIN, 14));
		sclabel1.setBounds(23, 293, 382, 17);
		contentPanel.add(sclabel1);
		
		JLabel sclabel2 = new JLabel(smallList.get(1));
		sclabel2.setForeground(Color.WHITE);
		sclabel2.setFont(new Font("Arial", Font.PLAIN, 14));
		sclabel2.setBounds(23, 322, 382, 17);
		contentPanel.add(sclabel2);
		
		JLabel sclabel3 = new JLabel(smallList.get(2));
		sclabel3.setForeground(Color.WHITE);
		sclabel3.setFont(new Font("Arial", Font.PLAIN, 14));
		sclabel3.setBounds(23, 351, 382, 17);
		contentPanel.add(sclabel3);
		
		JLabel sclabel4 = new JLabel(smallList.get(3));
		sclabel4.setForeground(Color.WHITE);
		sclabel4.setFont(new Font("Arial", Font.PLAIN, 14));
		sclabel4.setBounds(23, 380, 382, 17);
		contentPanel.add(sclabel4);
		
		JLabel sclabel5 = new JLabel(smallList.get(4));
		sclabel5.setForeground(Color.WHITE);
		sclabel5.setFont(new Font("Arial", Font.PLAIN, 14));
		sclabel5.setBounds(23, 409, 382, 17);
		contentPanel.add(sclabel5);
		
		JLabel sclabel6 = new JLabel(smallList.get(5));
		sclabel6.setForeground(Color.WHITE);
		sclabel6.setFont(new Font("Arial", Font.PLAIN, 14));
		sclabel6.setBounds(23, 438, 382, 17);
		contentPanel.add(sclabel6);
	}

}
