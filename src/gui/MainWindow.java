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

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import items.CubeItem;
import items.CylinderItem;
import items.PentagonItem;
import items.RectanguleItem;
import methods.Calculation;

public class MainWindow {
	
private JFrame mainWindow;
	
	
	public MainWindow(Calculation order){
		
		mainWindow = new JFrame();
		mainWindow.setResizable(false);
		mainWindow.setBackground(Color.DARK_GRAY);
		mainWindow.setTitle("Best Shipping Option");
		mainWindow.setBounds(100, 100, 1000, 600);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.getContentPane().setLayout(null);
		mainWindow.setLocationRelativeTo(null);
		
		
		JPanel main_panel = new JPanel();
		main_panel.setBackground(Color.DARK_GRAY);
		main_panel.setBounds(0, 0, 1000, 600);
		mainWindow.getContentPane().add(main_panel);
		main_panel.setLayout(null);
		
		JLabel labelTitle = new JLabel("Welcome to your Best Shipping Option");
		labelTitle.setBounds(165, 72, 661, 42);
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setForeground(Color.WHITE);
		labelTitle.setFont(new Font("Arial", Font.BOLD, 36));
		main_panel.add(labelTitle);
		
		JButton btnContainersInformation = new JButton("Containers Information");
		btnContainersInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContainersInformation dialog = new ContainersInformation();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		});
		btnContainersInformation.setForeground(Color.WHITE);
		btnContainersInformation.setFont(new Font("Arial", Font.BOLD, 17));
		btnContainersInformation.setBackground(Color.GRAY);
		btnContainersInformation.setBounds(558, 269, 268, 107);
		main_panel.add(btnContainersInformation);
		
		JButton btnNewOrder = new JButton("New Order");
		btnNewOrder.setForeground(Color.WHITE);
		btnNewOrder.setFont(new Font("Arial", Font.BOLD, 17));
		btnNewOrder.setBackground(Color.GRAY);
		btnNewOrder.setBounds(165, 269, 268, 107);
		main_panel.add(btnNewOrder);
		
	
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBackground(Color.DARK_GRAY);
		inputPanel.setBounds(0, 0, 992, 568);
		mainWindow.getContentPane().add(inputPanel);
		inputPanel.setLayout(null);
		inputPanel.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("Add Produt Section");
		lblNewLabel.setBounds(327, 35, 332, 42);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel.setForeground(Color.WHITE);
		inputPanel.add(lblNewLabel);
		
		JLabel productNameLabel = new JLabel("Product Name");
		productNameLabel.setFont(new Font("Arial", Font.BOLD, 22));
		productNameLabel.setForeground(Color.WHITE);
		productNameLabel.setBounds(32, 98, 183, 17);
		inputPanel.add(productNameLabel);
		
		JTextField productNameTextField = new JTextField();
		productNameTextField.setBackground(Color.LIGHT_GRAY);
		productNameTextField.setFont(new Font("Arial", Font.BOLD, 16));
		productNameTextField.setBounds(32, 127, 245, 21);
		inputPanel.add(productNameTextField);
		productNameTextField.setColumns(10);
		
		JComboBox<String> productShapeComboBox = new JComboBox<String>();
		productShapeComboBox.setFont(new Font("Arial", Font.BOLD, 15));
		productShapeComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Cylinder", "Cube", "Rectangule", "Pentagon"}));
		productShapeComboBox.setBounds(32, 193, 245, 26);
		inputPanel.add(productShapeComboBox);
		
		
		JLabel itemshapeLabel = new JLabel("Item Shape");
		itemshapeLabel.setForeground(Color.WHITE);
		itemshapeLabel.setFont(new Font("Arial", Font.BOLD, 22));
		itemshapeLabel.setBounds(32, 163, 183, 26);
		inputPanel.add(itemshapeLabel);
		
		JPanel RectangulePanel = new JPanel();
		RectangulePanel.setBounds(44, 247, 245, 247);
		inputPanel.add(RectangulePanel);
		RectangulePanel.setLayout(null);
		RectangulePanel.setBackground(Color.DARK_GRAY);
		RectangulePanel.setVisible(false);
		
		JLabel lengthLabel = new JLabel("Length");
		lengthLabel.setForeground(Color.WHITE);
		lengthLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lengthLabel.setBounds(12, 50, 114, 17);
		RectangulePanel.add(lengthLabel);
		
		JTextField LengthTextField = new JTextField();
		LengthTextField.setBackground(Color.LIGHT_GRAY);
		LengthTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		LengthTextField.setFont(new Font("Arial", Font.BOLD, 16));
		LengthTextField.setColumns(10);
		LengthTextField.setBounds(12, 74, 195, 21);
		RectangulePanel.add(LengthTextField);
		
		JLabel rectanguleHeightLabel = new JLabel("Height");
		rectanguleHeightLabel.setForeground(Color.WHITE);
		rectanguleHeightLabel.setFont(new Font("Arial", Font.BOLD, 16));
		rectanguleHeightLabel.setBounds(12, 107, 114, 17);
		RectangulePanel.add(rectanguleHeightLabel);
		
		JTextField heightTextField = new JTextField();
		heightTextField.setBackground(Color.LIGHT_GRAY);
		heightTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		heightTextField.setFont(new Font("Arial", Font.BOLD, 16));
		heightTextField.setColumns(10);
		heightTextField.setBounds(12, 131, 195, 21);
		RectangulePanel.add(heightTextField);
		
		JLabel shapeLabel_2 = new JLabel("Shape dimentions");
		shapeLabel_2.setForeground(Color.WHITE);
		shapeLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		shapeLabel_2.setBounds(12, 21, 174, 17);
		RectangulePanel.add(shapeLabel_2);
		
		JLabel widthLabel = new JLabel("Width");
		widthLabel.setForeground(Color.WHITE);
		widthLabel.setFont(new Font("Arial", Font.BOLD, 16));
		widthLabel.setBounds(12, 164, 114, 17);
		RectangulePanel.add(widthLabel);
		
		JTextField widthTextField = new JTextField();
		widthTextField.setBackground(Color.LIGHT_GRAY);
		widthTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		widthTextField.setFont(new Font("Arial", Font.BOLD, 16));
		widthTextField.setColumns(10);
		widthTextField.setBounds(12, 188, 195, 21);
		RectangulePanel.add(widthTextField);
		
		JPanel CylinderPanel = new JPanel();
		CylinderPanel.setBackground(Color.DARK_GRAY);
		CylinderPanel.setBounds(44, 247, 245, 184);
		inputPanel.add(CylinderPanel);
		CylinderPanel.setLayout(null);
		CylinderPanel.setVisible(false);
		
		JLabel RadiusLabel = new JLabel("Radius");
		RadiusLabel.setForeground(Color.WHITE);
		RadiusLabel.setFont(new Font("Arial", Font.BOLD, 16));
		RadiusLabel.setBounds(12, 50, 114, 17);
		CylinderPanel.add(RadiusLabel);
		
		JTextField RadiusTextField = new JTextField();
		RadiusTextField.setBackground(Color.LIGHT_GRAY);
		RadiusTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		RadiusTextField.setFont(new Font("Arial", Font.BOLD, 16));
		RadiusTextField.setBounds(12, 74, 195, 21);
		CylinderPanel.add(RadiusTextField);
		RadiusTextField.setColumns(10);
		
		JLabel heightLabel = new JLabel("Height");
		heightLabel.setForeground(Color.WHITE);
		heightLabel.setFont(new Font("Arial", Font.BOLD, 16));
		heightLabel.setBounds(12, 107, 114, 17);
		CylinderPanel.add(heightLabel);
		
		JTextField cylindertextField = new JTextField();
		cylindertextField.setBackground(Color.LIGHT_GRAY);
		cylindertextField.setHorizontalAlignment(SwingConstants.RIGHT);
		cylindertextField.setFont(new Font("Arial", Font.BOLD, 16));
		cylindertextField.setColumns(10);
		cylindertextField.setBounds(12, 131, 195, 21);
		CylinderPanel.add(cylindertextField);
		
		JLabel shapeLabel = new JLabel("Shape dimentions");
		shapeLabel.setForeground(Color.WHITE);
		shapeLabel.setFont(new Font("Arial", Font.BOLD, 18));
		shapeLabel.setBounds(12, 21, 174, 17);
		CylinderPanel.add(shapeLabel);
		
		JPanel cubePanel = new JPanel();
		cubePanel.setBounds(44, 247, 245, 184);
		inputPanel.add(cubePanel);
		cubePanel.setLayout(null);
		cubePanel.setBackground(Color.DARK_GRAY);
		cubePanel.setVisible(false);
		
		JLabel sideLabel = new JLabel("Side");
		sideLabel.setForeground(Color.WHITE);
		sideLabel.setFont(new Font("Arial", Font.BOLD, 16));
		sideLabel.setBounds(12, 50, 114, 17);
		cubePanel.add(sideLabel);
		
		JTextField sideTextField = new JTextField();
		sideTextField.setBackground(Color.LIGHT_GRAY);
		sideTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		sideTextField.setFont(new Font("Arial", Font.BOLD, 16));
		sideTextField.setColumns(10);
		sideTextField.setBounds(12, 74, 195, 21);
		cubePanel.add(sideTextField);
		
		JLabel shapeLabel_1 = new JLabel("Shape dimentions");
		shapeLabel_1.setForeground(Color.WHITE);
		shapeLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		shapeLabel_1.setBounds(12, 21, 174, 17);
		cubePanel.add(shapeLabel_1);
		
		JPanel PentagonPanel = new JPanel();
		PentagonPanel.setBounds(32, 247, 245, 184);
		inputPanel.add(PentagonPanel);
		PentagonPanel.setLayout(null);
		PentagonPanel.setBackground(Color.DARK_GRAY);
		PentagonPanel.setVisible(false);
		
		JLabel PentagonSideLabel = new JLabel("Side");
		PentagonSideLabel.setForeground(Color.WHITE);
		PentagonSideLabel.setFont(new Font("Arial", Font.BOLD, 16));
		PentagonSideLabel.setBounds(12, 50, 114, 17);
		PentagonPanel.add(PentagonSideLabel);
		
		JTextField PentagonSideTextField = new JTextField();
		PentagonSideTextField.setBackground(Color.LIGHT_GRAY);
		PentagonSideTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		PentagonSideTextField.setFont(new Font("Arial", Font.BOLD, 16));
		PentagonSideTextField.setColumns(10);
		PentagonSideTextField.setBounds(12, 74, 195, 21);
		PentagonPanel.add(PentagonSideTextField);
		
		JLabel shapeLabel_1_1 = new JLabel("Shape dimentions");
		shapeLabel_1_1.setForeground(Color.WHITE);
		shapeLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		shapeLabel_1_1.setBounds(12, 21, 174, 17);
		PentagonPanel.add(shapeLabel_1_1);
		
		JLabel PentagonHeightLabel = new JLabel("Height");
		PentagonHeightLabel.setForeground(Color.WHITE);
		PentagonHeightLabel.setFont(new Font("Arial", Font.BOLD, 16));
		PentagonHeightLabel.setBounds(12, 103, 114, 17);
		PentagonPanel.add(PentagonHeightLabel);
		
		JTextField PentagonHeighTextField = new JTextField();
		PentagonHeighTextField.setBackground(Color.LIGHT_GRAY);
		PentagonHeighTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		PentagonHeighTextField.setFont(new Font("Arial", Font.BOLD, 16));
		PentagonHeighTextField.setColumns(10);
		PentagonHeighTextField.setBounds(12, 127, 195, 21);
		PentagonPanel.add(PentagonHeighTextField);
		
		JLabel productQuantityLabel = new JLabel("Quantity");
		productQuantityLabel.setForeground(Color.WHITE);
		productQuantityLabel.setFont(new Font("Arial", Font.BOLD, 22));
		productQuantityLabel.setBounds(307, 127, 183, 17);
		inputPanel.add(productQuantityLabel);
		
		JTextField QuantityTextField = new JTextField();
		QuantityTextField.setFont(new Font("Arial", Font.BOLD, 16));
		QuantityTextField.setColumns(10);
		QuantityTextField.setBackground(Color.LIGHT_GRAY);
		QuantityTextField.setBounds(307, 156, 245, 21);
		QuantityTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		inputPanel.add(QuantityTextField);
		
		JLabel WeighLabel = new JLabel("Weight");
		WeighLabel.setForeground(Color.WHITE);
		WeighLabel.setFont(new Font("Arial", Font.BOLD, 22));
		WeighLabel.setBounds(307, 193, 183, 17);
		inputPanel.add(WeighLabel);
		
		JTextField weighText = new JTextField();
		weighText.setFont(new Font("Arial", Font.BOLD, 16));
		weighText.setColumns(10);
		weighText.setHorizontalAlignment(SwingConstants.RIGHT);
		weighText.setBackground(Color.LIGHT_GRAY);
		weighText.setBounds(307, 222, 245, 21);
		inputPanel.add(weighText);
		
		JLabel informationlabel = new JLabel("Select a item in the list for more information");
		informationlabel.setFont(new Font("Arial", Font.BOLD, 17));
		informationlabel.setForeground(Color.WHITE);
		informationlabel.setBounds(612, 100, 344, 17);
		inputPanel.add(informationlabel);
		inputPanel.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(612, 134, 344, 354);
		inputPanel.add(panel);
		panel.setLayout(null);
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
		JList<String> list = new JList(listModel);
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setForeground(Color.WHITE);
		list.setFont(new Font("Arial", Font.PLAIN, 15));
		list.setBackground(Color.DARK_GRAY);
		list.setBounds(12, 12, 320, 334);

		panel.add(list);
		
		JButton addButton = new JButton("Add Item");
		addButton.setEnabled(false);
		addButton.setBackground(Color.GRAY);
		addButton.setFont(new Font("Arial", Font.BOLD, 18));
		addButton.setForeground(Color.WHITE);
		addButton.setBounds(344, 268, 171, 27);
		inputPanel.add(addButton);
		
		JButton itemInfoButton = new JButton("Item Info");
		itemInfoButton.setForeground(Color.WHITE);
		itemInfoButton.setFont(new Font("Arial", Font.BOLD, 18));
		itemInfoButton.setEnabled(false);
		itemInfoButton.setBackground(Color.GRAY);
		itemInfoButton.setBounds(703, 507, 171, 27);
		inputPanel.add(itemInfoButton);
		inputPanel.setVisible(true);
		
		JButton resultbutton = new JButton("Summit order");
		resultbutton.setForeground(Color.WHITE);
		resultbutton.setFont(new Font("Arial", Font.BOLD, 18));
		resultbutton.setEnabled(false);
		resultbutton.setBackground(Color.GRAY);
		resultbutton.setBounds(344, 312, 171, 27);
		inputPanel.add(resultbutton);
		inputPanel.setVisible(true);
		
		JButton backButton = new JButton("Back");
		backButton.setForeground(Color.WHITE);
		backButton.setFont(new Font("Arial", Font.BOLD, 18));
		backButton.setBackground(Color.GRAY);
		backButton.setBounds(898, 12, 82, 27);
		inputPanel.add(backButton);
		
		
		productShapeComboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		        String shape = productShapeComboBox.getSelectedItem().toString().toLowerCase();
		        if(shape.equals("cube")) {
		        	cubePanel.setVisible(true);
		        	PentagonPanel.setVisible(false);
		        	CylinderPanel.setVisible(false);
		        	RectangulePanel.setVisible(false);
		        }
		        else if(shape.equals("cylinder")) {
		        	CylinderPanel.setVisible(true);
		        	PentagonPanel.setVisible(false);
		        	cubePanel.setVisible(false);
		        	RectangulePanel.setVisible(false);
		        }
		        else if(shape.equals("rectangule")) {
		        	RectangulePanel.setVisible(true);
		        	PentagonPanel.setVisible(false);
		        	cubePanel.setVisible(false);
		        	CylinderPanel.setVisible(false);
		        }
		        else if(shape.equals("pentagon")) {
		        	PentagonPanel.setVisible(true);
		        	CylinderPanel.setVisible(false);
		        	cubePanel.setVisible(false);
		        	RectangulePanel.setVisible(false);
		        }
		        
		        addButton.setEnabled(true);;
		        	
		    }
		});
		
		btnNewOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				main_panel.setVisible(false);
				inputPanel.setVisible(true);
				
			}
		});
		
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				
				try {
					
					if (productNameTextField.getText() != "" && weighText.getText() != "" && QuantityTextField.getText() != "") {
						
						if(productShapeComboBox.getSelectedItem().toString().toLowerCase().equals("cylinder")) {
							order.add_item(new CylinderItem(productNameTextField.getText(), Integer.parseInt(QuantityTextField.getText()), 
									Double.parseDouble(weighText.getText()), Double.parseDouble(RadiusTextField.getText()), Double.parseDouble(cylindertextField.getText())));
						}
						if(productShapeComboBox.getSelectedItem().toString().toLowerCase().equals("cube")) {
							order.add_item(new CubeItem(productNameTextField.getText(), Integer.parseInt(QuantityTextField.getText()), 
									Double.parseDouble(weighText.getText()), Double.parseDouble(sideTextField.getText())));
						}
						if(productShapeComboBox.getSelectedItem().toString().toLowerCase().equals("rectangule")) {
							order.add_item(new RectanguleItem(productNameTextField.getText(), Integer.parseInt(QuantityTextField.getText()), 
									Double.parseDouble(weighText.getText()), Double.parseDouble(LengthTextField.getText()), Double.parseDouble(widthTextField.getText()),Double.parseDouble(heightTextField.getText())));
						}
						if(productShapeComboBox.getSelectedItem().toString().toLowerCase().equals("pentagon")) {
							order.add_item(new PentagonItem(productNameTextField.getText(), Integer.parseInt(QuantityTextField.getText()), 
									Double.parseDouble(weighText.getText()), Double.parseDouble(PentagonSideTextField.getText()), Double.parseDouble(PentagonHeighTextField.getText())));
						}
						
						int index = order.order_getter().size()-1;
						
						listModel.addElement(order.printOrderInformation().get(index));
						
						itemInfoButton.setEnabled(true);
						resultbutton.setEnabled(true);
						
					}
					
				}catch (Exception e){
					try {
						ErrorMessage dialog = new ErrorMessage();
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception i) {
						e.printStackTrace();
					}
				}
				
				
	
				
				productNameTextField.setText(null);
				weighText.setText(null);
				QuantityTextField.setText(null);
				sideTextField.setText(null);
				cylindertextField.setText(null);
				heightTextField.setText(null);
				LengthTextField.setText(null);
				PentagonHeighTextField.setText(null);
				PentagonSideTextField.setText(null);
				widthTextField.setText(null);
				
				cubePanel.setVisible(false);
				RectangulePanel.setVisible(false);
				PentagonPanel.setVisible(false);
				CylinderPanel.setVisible(false);
				
			}
		});
		
		itemInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent y) {
				int i;
				
				i = list.getSelectedIndex();
				ArrayList <String> itemdata = new ArrayList<>();
				
				itemdata = order.printItemInformation(i);
				try {
					ItemInfo dialog = new ItemInfo(itemdata);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
	
	resultbutton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent x) {
			try {
				Result result = new Result(order.best_shipping());
				result.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				result.setVisible(true);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
		}
	});
	
	
	backButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent x) {
			inputPanel.setVisible(false);
			itemInfoButton.setEnabled(false);
			resultbutton.setEnabled(false);
			addButton.setEnabled(false);
			
			productNameTextField.setText(null);
			weighText.setText(null);
			QuantityTextField.setText(null);
			sideTextField.setText(null);
			cylindertextField.setText(null);
			heightTextField.setText(null);
			LengthTextField.setText(null);
			PentagonHeighTextField.setText(null);
			PentagonSideTextField.setText(null);
			widthTextField.setText(null);
			
			cubePanel.setVisible(false);
			RectangulePanel.setVisible(false);
			PentagonPanel.setVisible(false);
			CylinderPanel.setVisible(false);
			
			
			for(int i=order.order_getter().size(); i > 0; i--) {
				order.order_getter().remove(i-1);
				listModel.remove(i-1);
			}
			
			main_panel.setVisible(true);
			
		}
	});
		
	}

	
	public void visible() {
		mainWindow.setVisible(true);
	}

}
