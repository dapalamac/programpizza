package codigo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio1 frame = new ejercicio1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxBacon = new JCheckBox("Bacon");
		chckbxBacon.setBounds(32, 26, 97, 23);
		contentPane.add(chckbxBacon);
		
		JCheckBox chckbxAnchoas = new JCheckBox("Anchoas");
		chckbxAnchoas.setBounds(32, 52, 97, 23);
		contentPane.add(chckbxAnchoas);
		
		JCheckBox chckbxCebolla = new JCheckBox("Cebolla");
		chckbxCebolla.setBounds(32, 78, 97, 23);
		contentPane.add(chckbxCebolla);
		
		JCheckBox chckbxPimiento = new JCheckBox("Pimiento");
		chckbxPimiento.setBounds(32, 105, 97, 23);
		contentPane.add(chckbxPimiento);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 136, 147);
		panel.setBorder(new TitledBorder(null, "Ingredientes", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(156, 11, 136, 147);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tama\u00F1o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		ButtonGroup migrupo = new ButtonGroup();
		
		JRadioButton rdbtnPequea = new JRadioButton("Peque\u00F1a");
		rdbtnPequea.setBounds(21, 35, 109, 23);
		panel_1.add(rdbtnPequea);
		migrupo.add(rdbtnPequea);
		
		JRadioButton rdbtnMediana = new JRadioButton("Mediana");
		rdbtnMediana.setBounds(21, 61, 109, 23);
		panel_1.add(rdbtnMediana);
		migrupo.add(rdbtnMediana);
		
		JRadioButton rdbtnFamiliar = new JRadioButton("Familiar");
		rdbtnFamiliar.setBounds(21, 87, 109, 23);
		panel_1.add(rdbtnFamiliar);
		migrupo.add(rdbtnFamiliar);
		
		textField = new JTextField();
		textField.setBounds(10, 206, 282, 23);
		textField.setBackground(Color.WHITE);
		textField.setForeground(new Color(128, 0, 0));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setBounds(10, 160, 89, 23);
		btnTotal.addActionListener(new ActionListener() {
			
			
			
			
			public void actionPerformed(ActionEvent arg0) {
				
			float pizpe, pizme, pizfa , total , bacon, anchoas, cebolla, pimiento; 
			
			pizpe = 7000; 
			pizme = 9000; 
			pizfa = 11000; 
			bacon = 1500;
			anchoas = 1800; 
			cebolla = 1000;
			pimiento = 1200; 
			
			
			

			
			
			
			if (chckbxBacon.isSelected() & rdbtnPequea.isSelected() ) {
				
			total = pizpe+bacon; 
			
			textField.setText  ("__________________________");
			textField_1.setText("|************PIZZA DELI***********|");
			textField_2.setText("|***********David Palacio*********|");
			textField_3.setText("|_________________________|");
            textField_4.setText("Total: " + total);	
				
			}
			
			if (chckbxBacon.isSelected() & chckbxAnchoas.isSelected() & rdbtnPequea.isSelected() ) {
				
			total = pizpe+bacon+anchoas; 
				
			textField.setText  ("__________________________");
			textField_1.setText("|************PIZZA DELI***********|");
			textField_2.setText("|***********David Palacio*********|");
			textField_3.setText("|_________________________|");
	        textField_4.setText("Total: " + total);	
					
			}
			
			if (chckbxBacon.isSelected() & chckbxAnchoas.isSelected() & chckbxCebolla.isSelected() & rdbtnPequea.isSelected()   ) {
				
			total = pizpe+bacon+anchoas+cebolla; 
					
			textField.setText  ("__________________________");
			textField_1.setText("|************PIZZA DELI***********|");
			textField_2.setText("|***********David Palacio*********|");
			textField_3.setText("|_________________________|");
		    textField_4.setText("Total: " + total);	
						
			}
			
			if (chckbxBacon.isSelected() & chckbxAnchoas.isSelected() & chckbxCebolla.isSelected() & chckbxPimiento.isSelected() & rdbtnPequea.isSelected()   ) {
				
			total = pizpe+bacon+anchoas+cebolla+pimiento; 
						
			textField.setText  ("__________________________");
			textField_1.setText("|************PIZZA DELI***********|");
			textField_2.setText("|***********David Palacio*********|");
			textField_3.setText("|_________________________|");
			textField_4.setText("Total: " + total);	
							
			}
			
			if (chckbxBacon.isSelected() & rdbtnMediana.isSelected() ) {
				
				total = pizme+bacon; 
				
				textField.setText  ("__________________________");
				textField_1.setText("|************PIZZA DELI***********|");
				textField_2.setText("|***********David Palacio*********|");
				textField_3.setText("|_________________________|");
	            textField_4.setText("Total: " + total);	
					
			}
			
			if (chckbxBacon.isSelected() & chckbxAnchoas.isSelected() & rdbtnMediana.isSelected() ) {
				
				total = pizme+bacon+anchoas; 
					
				textField.setText  ("__________________________");
				textField_1.setText("|************PIZZA DELI***********|");
				textField_2.setText("|***********David Palacio*********|");
				textField_3.setText("|_________________________|");
		        textField_4.setText("Total: " + total);	
						
			}
				
			if (chckbxBacon.isSelected() & chckbxAnchoas.isSelected() & chckbxCebolla.isSelected() & rdbtnMediana.isSelected()   ) {
				
				total = pizme+bacon+anchoas+cebolla; 
						
				textField.setText  ("__________________________");
				textField_1.setText("|************PIZZA DELI***********|");
				textField_2.setText("|***********David Palacio*********|");
				textField_3.setText("|_________________________|");
			    textField_4.setText("Total: " + total);	
							
			}
			
			if (chckbxBacon.isSelected() & chckbxAnchoas.isSelected() & chckbxCebolla.isSelected() & chckbxPimiento.isSelected() & rdbtnMediana.isSelected()   ) {
				
				total = pizme+bacon+anchoas+cebolla+pimiento; 
							
				textField.setText  ("__________________________");
				textField_1.setText("|************PIZZA DELI***********|");
				textField_2.setText("|***********David Palacio*********|");
				textField_3.setText("|_________________________|");
				textField_4.setText("Total: " + total);	
								
			}	
			
            if (chckbxBacon.isSelected() & rdbtnFamiliar.isSelected() ) {
				
				total = pizfa+bacon; 
				
				textField.setText  ("__________________________");
				textField_1.setText("|************PIZZA DELI***********|");
				textField_2.setText("|***********David Palacio*********|");
				textField_3.setText("|_________________________|");
	            textField_4.setText("Total: " + total);	
					
			}
			
            if (chckbxBacon.isSelected() & chckbxAnchoas.isSelected() & rdbtnFamiliar.isSelected() ) {
				
				total = pizfa+bacon+anchoas; 
					
				textField.setText  ("__________________________");
				textField_1.setText("|************PIZZA DELI***********|");
				textField_2.setText("|***********David Palacio*********|");
				textField_3.setText("|_________________________|");
		        textField_4.setText("Total: " + total);	
						
			}	
			
            if (chckbxBacon.isSelected() & chckbxAnchoas.isSelected() & chckbxCebolla.isSelected() & rdbtnFamiliar.isSelected()   ) {
				
				total = pizfa+bacon+anchoas+cebolla; 
						
				textField.setText  ("__________________________");
				textField_1.setText("|************PIZZA DELI***********|");
				textField_2.setText("|***********David Palacio*********|");
				textField_3.setText("|_________________________|");
			    textField_4.setText("Total: " + total);	
							
			}
            
            if (chckbxBacon.isSelected() & chckbxAnchoas.isSelected() & chckbxCebolla.isSelected() & chckbxPimiento.isSelected() & rdbtnFamiliar.isSelected()   ) {
				
				total = pizfa+bacon+anchoas+cebolla+pimiento; 
							
				textField.setText  ("__________________________");
				textField_1.setText("|************PIZZA DELI***********|");
				textField_2.setText("|***********David Palacio*********|");
				textField_3.setText("|_________________________|");
				textField_4.setText("Total: " + total);	
								
			}	
            
            
			
             
            
            
            
            
				
				
			}
			
			
			
			
			
		});
		contentPane.add(btnTotal);
		
		JLabel lblPizza = new JLabel("PIZZA DELI");
		lblPizza.setBounds(0, 305, 311, 110);
		lblPizza.setBackground(new Color(255, 255, 224));
		lblPizza.setForeground(new Color(128, 0, 0));
		lblPizza.setHorizontalAlignment(SwingConstants.CENTER);
		lblPizza.setFont(new Font("Baskerville Old Face", Font.PLAIN, 50));
		contentPane.add(lblPizza);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 228, 282, 23);
		textField_1.setForeground(new Color(128, 0, 0));
		textField_1.setBackground(Color.WHITE);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 250, 282, 23);
		textField_2.setForeground(new Color(128, 0, 0));
		textField_2.setBackground(Color.WHITE);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 272, 282, 23);
		textField_3.setForeground(new Color(128, 0, 0));
		textField_3.setBackground(Color.WHITE);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 294, 282, 23);
		textField_4.setForeground(new Color(128, 0, 0));
		textField_4.setBackground(Color.WHITE);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				
				chckbxBacon.setSelected(false);
				chckbxAnchoas.setSelected(false);
				chckbxCebolla.setSelected(false);
				chckbxPimiento.setSelected(false);
				
				migrupo.clearSelection();
				
				
				
			}
			
			
			
			
		});
		btnLimpiar.setBounds(111, 160, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			
			
	
			   
			public void actionPerformed(ActionEvent e) {
				
				 
			
				String opc = JOptionPane.showInputDialog("Desea salir");
				
				if (opc.equalsIgnoreCase("si")) {
					
					
					System.exit(0); 	
					
				}
				
				else {
					
					
					
					
				}
				
				
			}
			
			
			
			
			
			
		});
		btnSalir.setBounds(210, 160, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ejercicio1.class.getResource("/iconos/depositphotos_49203401-stock-illustration-pizza-background.jpg")));
		lblNewLabel.setBounds(0, 0, 305, 393);
		contentPane.add(lblNewLabel);
	}
}
