package codigo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio2 frame = new ejercicio2();
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
	public ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestionDePedidos = new JLabel("GESTI\u00D3N DE PEDIDOS");
		lblGestionDePedidos.setBounds(31, 22, 128, 22);
		contentPane.add(lblGestionDePedidos);
		
		JLabel lblUnidades = new JLabel("Unidades");
		lblUnidades.setBounds(33, 144, 46, 14);
		contentPane.add(lblUnidades);
		
		textField = new JTextField();
		textField.setBounds(91, 141, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(198, 144, 46, 14);
		contentPane.add(lblDestino);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Peninsula", "Canaria", "Extranjero"}));
		comboBox.setBounds(247, 141, 94, 20);
		contentPane.add(comboBox);
		
		JLabel lblTipoDeEnvio = new JLabel("Tipo de Envio");
		lblTipoDeEnvio.setBounds(367, 144, 86, 14);
		contentPane.add(lblTipoDeEnvio);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Urgente"}));
		comboBox_1.setBounds(445, 141, 79, 20);
		contentPane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(33, 220, 452, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		ButtonGroup migrupo = new ButtonGroup();
		
		JRadioButton rdbtnSistemaDeLocalizacion = new JRadioButton("Sistema de Localizacion -120");
		rdbtnSistemaDeLocalizacion.setBounds(31, 51, 196, 23);
		contentPane.add(rdbtnSistemaDeLocalizacion);
		migrupo.add(rdbtnSistemaDeLocalizacion);
		
		JRadioButton rdbtnCentroDeControl = new JRadioButton("Centro de Control - 60");
		rdbtnCentroDeControl.setBounds(31, 81, 146, 23);
		contentPane.add(rdbtnCentroDeControl);
		migrupo.add(rdbtnCentroDeControl);
		
		JRadioButton rdbtnModemGsm = new JRadioButton("Modem GSM - 45");
		rdbtnModemGsm.setBounds(31, 111, 146, 23);
		contentPane.add(rdbtnModemGsm);
		migrupo.add(rdbtnModemGsm);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			
			
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				float cant, sisloca, cencon, modem , peninsula , canarias , extra , normal , urge, total   ;
				
				cant = Float.parseFloat(textField.getText());
				
				String seleccionado = (String)comboBox.getSelectedItem(); 
				String seleccionado1 = (String)comboBox_1.getSelectedItem();
				
				sisloca = 120; 
				cencon = 60; 
				modem = 45; 
				peninsula = 20; 
				canarias = 25; 
				extra = 30; 
				normal = 3; 
				urge = 10; 
				
				
				
				
				
				
				
				if ( rdbtnSistemaDeLocalizacion.isSelected() & seleccionado1.equalsIgnoreCase("Normal") & seleccionado.equalsIgnoreCase("Peninsula")  )  {
					
					total = (cant * sisloca) + peninsula + normal; 
					
					textField_1.setText("" + total);
					
					
				}
				
                if ( rdbtnCentroDeControl.isSelected() & seleccionado1.equalsIgnoreCase("Normal") & seleccionado.equalsIgnoreCase("Peninsula")  )  {
					
					total = (cant * cencon) + peninsula + normal; 
					
					textField_1.setText("" + total);
					
					
				}
				
                if ( rdbtnModemGsm.isSelected() & seleccionado1.equalsIgnoreCase("Normal") & seleccionado.equalsIgnoreCase("Peninsula")  )  {
					
					total = (cant * modem) + peninsula + normal; 
					
					textField_1.setText("" + total);
					
					
				}
                
                if ( rdbtnSistemaDeLocalizacion.isSelected() & seleccionado1.equalsIgnoreCase("Urgente") & seleccionado.equalsIgnoreCase("Peninsula")  )  {
					
					total = (cant * sisloca) + peninsula + urge; 
					
					textField_1.setText("" + total);
					
					
				}
				
               if ( rdbtnCentroDeControl.isSelected() & seleccionado1.equalsIgnoreCase("Urgente") & seleccionado.equalsIgnoreCase("Peninsula")  )  {
					
					total = (cant * cencon) + peninsula + urge; 
					
					textField_1.setText("" + total);
					
					
				}
               
               if ( rdbtnModemGsm.isSelected() & seleccionado1.equalsIgnoreCase("Urgente") & seleccionado.equalsIgnoreCase("Peninsula")  )  {
					
					total = (cant * modem) + peninsula + urge; 
					
					textField_1.setText("" + total);
					
					
				}
               
               if ( rdbtnSistemaDeLocalizacion.isSelected() & seleccionado1.equalsIgnoreCase("Normal") & seleccionado.equalsIgnoreCase("Canaria")  )  {
					
					total = (cant * sisloca) + canarias + normal; 
					
					textField_1.setText("" + total);
					
					
				}
				
               if ( rdbtnCentroDeControl.isSelected() & seleccionado1.equalsIgnoreCase("Normal") & seleccionado.equalsIgnoreCase("Canaria")  )  {
					
					total = (cant * cencon) + canarias + normal; 
					
					textField_1.setText("" + total);
					
					
				}
				
               if ( rdbtnModemGsm.isSelected() & seleccionado1.equalsIgnoreCase("Normal") & seleccionado.equalsIgnoreCase("canaria")  )  {
					
					total = (cant * modem) + canarias + normal; 
					
					textField_1.setText("" + total);
					
					
				}
               
               if ( rdbtnSistemaDeLocalizacion.isSelected() & seleccionado1.equalsIgnoreCase("Urgente") & seleccionado.equalsIgnoreCase("canaria")  )  {
					
					total = (cant * sisloca) + canarias + urge; 
					
					textField_1.setText("" + total);
					
					
				}
				
              if ( rdbtnCentroDeControl.isSelected() & seleccionado1.equalsIgnoreCase("Urgente") & seleccionado.equalsIgnoreCase("canaria")  )  {
					
					total = (cant * cencon) + canarias + urge; 
					
					textField_1.setText("" + total);
					
					
				}
              
              if ( rdbtnModemGsm.isSelected() & seleccionado1.equalsIgnoreCase("Urgente") & seleccionado.equalsIgnoreCase("canaria")  )  {
					
					total = (cant * modem) + canarias + urge; 
					
					textField_1.setText("" + total);
					
					
				}
				
              if ( rdbtnSistemaDeLocalizacion.isSelected() & seleccionado1.equalsIgnoreCase("Normal") & seleccionado.equalsIgnoreCase("extranjero")  )  {
					
					total = (cant * sisloca) + extra + normal; 
					
					textField_1.setText("" + total);
					
					
				}
				
             if ( rdbtnCentroDeControl.isSelected() & seleccionado1.equalsIgnoreCase("Normal") & seleccionado.equalsIgnoreCase("extranjero")  )  {
					
					total = (cant * cencon) + extra + normal; 
					
					textField_1.setText("" + total);
					
					
				}
				
             if ( rdbtnModemGsm.isSelected() & seleccionado1.equalsIgnoreCase("Normal") & seleccionado.equalsIgnoreCase("extranjero")  )  {
					
					total = (cant * modem) + extra + normal; 
					
					textField_1.setText("" + total);
					
					
				}
             
             if ( rdbtnSistemaDeLocalizacion.isSelected() & seleccionado1.equalsIgnoreCase("Urgente") & seleccionado.equalsIgnoreCase("extranjero")  )  {
					
					total = (cant * sisloca) + extra + urge; 
					
					textField_1.setText("" + total);
					
					
				}
				
            if ( rdbtnCentroDeControl.isSelected() & seleccionado1.equalsIgnoreCase("Urgente") & seleccionado.equalsIgnoreCase("extranjero")  )  {
					
					total = (cant * cencon) + extra + urge; 
					
					textField_1.setText("" + total);
					
					
				}
            
            if ( rdbtnModemGsm.isSelected() & seleccionado1.equalsIgnoreCase("Urgente") & seleccionado.equalsIgnoreCase("extranjero")  )  {
					
					total = (cant * modem) + extra + urge; 
					
					textField_1.setText("" + total);
					
					
				}
				
            else if (rdbtnModemGsm.isSelected()==false & rdbtnCentroDeControl.isSelected()==false & rdbtnSistemaDeLocalizacion.isSelected()==false ) {
            	
            	
            	JOptionPane.showMessageDialog(null, "Seleccione un campo");
            	
            	
            	
            	
            }
				
				
				
				
				
				
            
			
			
			
			
			
			
			}
			
			
			
		});
		btnCalcular.setBounds(31, 185, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			
			
			
			
			
			public void actionPerformed(ActionEvent e) {
				
				
				textField.setText("");
				textField_1.setText("");
				
				migrupo.clearSelection();
				
				
				
				
				
			}
			
			
			
			
			
		});
		btnLimpiar.setBounds(138, 186, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
				
			}
			
			
			
		});
		btnSalir.setBounds(238, 186, 89, 23);
		contentPane.add(btnSalir);
		
		
	}
}
