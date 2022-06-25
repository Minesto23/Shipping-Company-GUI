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

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ErrorMessage extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public ErrorMessage() {
		setTitle("Wrong Format");
		setBounds(100, 100, 482, 182);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Error");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 19));
		lblNewLabel.setBounds(101, 40, 276, 23);
		contentPanel.add(lblNewLabel);
		
		JLabel lblPleaseInputDe = new JLabel("Please input de data in a correct format");
		lblPleaseInputDe.setForeground(Color.WHITE);
		lblPleaseInputDe.setFont(new Font("Arial", Font.PLAIN, 19));
		lblPleaseInputDe.setBounds(101, 73, 329, 36);
		contentPanel.add(lblPleaseInputDe);
		
		JLabel imageLabel = new JLabel("X");
		imageLabel.setForeground(Color.RED);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imageLabel.setFont(new Font("Arial", Font.BOLD, 45));
		imageLabel.setBounds(12, 40, 82, 82);
		contentPanel.add(imageLabel);
	}
}
