import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Toolkit;

public class Empresa_Transporte extends JFrame {
	
	//Declarando variables
	double precio_pasaje, imp_compra, imp_descuento, imp_pagar;
	int turno, cantidad_caramelos, cantidad_pasaje, caramelo_obs;

	private JPanel contentPane;
	private JTextField txtPasaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empresa_Transporte frame = new Empresa_Transporte();
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
	public Empresa_Transporte() {
		setLocationByPlatform(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ShoKatsuo\\GitHub\\Classroom\\Curso de Java\\CL2-Algoritmia\\icon\\van_106619.png"));
		setTitle("Empresa de Transporte");
		setFont(new Font("Roboto", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel fondo = new JPanel();
		fondo.setBackground(new Color(212, 217, 197));
		fondo.setBounds(0, 0, 390, 293);
		contentPane.add(fondo);
		fondo.setLayout(null);
		
		JPanel fondo_sup = new JPanel();
		fondo_sup.setBackground(new Color(239, 167, 127));
		fondo_sup.setBounds(0, 0, 390, 95);
		fondo.add(fondo_sup);
		fondo_sup.setLayout(null);
		
		JComboBox cboTurno = new JComboBox();
		cboTurno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cboTurno.setBackground(new Color(191, 182, 165));
		cboTurno.setBounds(68, 51, 76, 22);
		fondo_sup.add(cboTurno);
		cboTurno.setModel(new DefaultComboBoxModel(new String[] {" ", "Ma\u00F1ana", "Tarde", "Noche"}));
		cboTurno.setSelectedIndex(0); // Selecciono el valor por defecto
		cboTurno.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		txtPasaje = new JTextField();
		txtPasaje.setBackground(new Color(191, 182, 165));
		txtPasaje.setBounds(68, 20, 86, 20);
		fondo_sup.add(txtPasaje);
		txtPasaje.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtPasaje.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Turno");
		lblNewLabel_1.setBounds(12, 55, 46, 14);
		fondo_sup.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		JLabel lblNewLabel = new JLabel("Pasajes");
		lblNewLabel.setBounds(12, 23, 46, 14);
		fondo_sup.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 11));	
		
		JTextArea txtArea = new JTextArea();
		txtArea.setFont(new Font("Roboto", Font.PLAIN, 13));
		txtArea.setBounds(70, 125, 251, 88);
		fondo.add(txtArea);
		
		JButton btnProcess = new JButton("Procesar");
		btnProcess.setForeground(Color.WHITE);
		btnProcess.setBackground(new Color(228, 99, 67));
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ingresar datos
				cantidad_pasaje = Integer.parseInt(txtPasaje.getText());
				turno = cboTurno.getSelectedIndex();//0,1,2,3
				
				//Proceso de datos
				switch (turno) {
				case 0: JOptionPane.showMessageDialog(null, "Seleccione un turno");break; //Es lo que aparecerá por default, una parte en blanca para dar oportunidad al usuario de elegir un valor
				case 1: precio_pasaje = 30.0;break; //En el primer caso corresponde al turno mañana, el precio dependerá del turno elegido
				case 2: precio_pasaje = 35.0;break; //El segundo caso es para el turno tarde
				default: precio_pasaje = 42.5;break; // Se obvió el case 3 porque al tener los valores predefinidos, la terminal lo sobreentiende. Este ultimo es para el turno noche
				}
				
				if (cantidad_pasaje > 7 && turno == 3) { //Si la cantidad es mayor a 7 y es del turno noche entonces
					imp_descuento = 0.05 * (cantidad_pasaje*precio_pasaje);//se aplicará un descuento
				}else if (cantidad_pasaje < 7 && cantidad_pasaje > 0 && turno == 3) {
					imp_descuento = 0 * (cantidad_pasaje*precio_pasaje);
				}else if (cantidad_pasaje < 7 && cantidad_pasaje > 0 && turno == 2) {
					imp_descuento = 0 * (cantidad_pasaje*precio_pasaje);
				}else if (cantidad_pasaje >7 && turno == 2) {
					imp_descuento = 0.05 * (cantidad_pasaje*precio_pasaje);
				}else if (cantidad_pasaje <= 3 && turno == 2) { //En caso la cantidad de pasaje sea menor o igual a 3 y el turno sea tarde, 
					caramelo_obs = 3 * cantidad_pasaje; //entonces la cantidad de caramelo de obsequio será 3 caramelos por cantidad de pasaje
				}else if (cantidad_pasaje >3 && cantidad_pasaje <=6 && turno == 2) {
					caramelo_obs = 4 * cantidad_pasaje;
				}else if (cantidad_pasaje > 6 && turno == 2) {
					caramelo_obs = 5 * cantidad_pasaje;
				}else if (cantidad_pasaje <= 3 && turno == 1) {
					caramelo_obs = 3 * cantidad_pasaje;
				}else if (cantidad_pasaje >3 && cantidad_pasaje <=6 && turno == 1) {
					caramelo_obs = 4 * cantidad_pasaje;
				}else if (cantidad_pasaje > 6 && turno == 1) {
					caramelo_obs = 5 * cantidad_pasaje;
				}else {
					JOptionPane.showMessageDialog(null, "Escribió una cantidad no valida");
				}
				
				//calculamos los impores
				imp_compra = cantidad_pasaje * precio_pasaje;
				imp_pagar = imp_compra - imp_descuento;
				//Salida
				if (turno > 0 && cantidad_pasaje > 0 ) { //Solo saldrá el mensaje de salida si el usuario elige un valor diferente de (blank,null o cero) al igual que la cantidad de pasaje
					txtArea.setText("El importe de su compra es "+imp_compra+" soles"+"\n");
					txtArea.append("El importe del descuento es "+imp_descuento+" soles"+"\n");
					txtArea.append("Usted pagará "+imp_pagar+" soles"+"\n");
					txtArea.append("Usted recibirá "+caramelo_obs+" caramelos"+"\n");
				}else {
					txtArea.append(" ");
				}

			}
		});
		btnProcess.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProcess.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnProcess.setBounds(30, 245, 89, 23);
		fondo.add(btnProcess);
		
		JButton btnDelete = new JButton("Borrar");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(new Color(228, 99, 67));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPasaje.setText("");
				txtArea.setText("");
				cboTurno.setSelectedIndex(0);
			}
		});
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnDelete.setBounds(153, 245, 89, 23);
		fondo.add(btnDelete);
		
		JButton btnClose = new JButton("Cerrar");
		btnClose.setForeground(Color.WHITE);
		btnClose.setBackground(new Color(228, 99, 67));
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();//para cerrar
			}
		});
		btnClose.setBounds(277, 245, 89, 23);
		fondo.add(btnClose);
		

	}

}
