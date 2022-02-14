import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtMonto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ShoKatsuo\\GitHub\\Classroom\\Curso de Java\\CL1-Algoritmia\\Image\\dar-dinero.png"));
		setTitle("Reparto");
		setBounds(100, 100, 366, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(73, 77, 95));
		panel.setBounds(0, 0, 350, 307);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBackground(new Color(229, 234, 245));
		txtArea.setBounds(69, 93, 217, 127);
		panel.add(txtArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(160, 210, 235));
		panel_1.setBounds(0, 0, 431, 72);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monto");
		lblNewLabel.setBounds(115, 30, 46, 14);
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 12));
		
		txtMonto = new JTextField();
		txtMonto.setBounds(160, 28, 86, 20);
		panel_1.add(txtMonto);
		txtMonto.setBackground(new Color(208, 189, 244));
		txtMonto.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtMonto.setColumns(10);
		
		JButton btnProcess = new JButton("Procesar");
		btnProcess.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProcess.setBounds(130, 252, 89, 23);
		panel.add(btnProcess);
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Declarando variable
				double bellavista, la_punta, la_perla, mi_peru, ventanilla, monto;
				
				//Creando un objeto de la clase DecimalFormat
				DecimalFormat df=new DecimalFormat("##.00");
				
				//Entrada de datos
				monto = Double.parseDouble(txtMonto.getText());
				
				//Proceso
				bellavista = 0.10 * monto; //Bellavista recibe el 20% del monto
				la_punta = 0.15 * monto; //La punta recibe el 15 % del monto
				la_perla = 0.20 * monto; //La perla recibe el 20% del monto
				mi_peru = 0.15 * monto; // Mi Perú recibe el 15% del monto
				ventanilla = 0.40 * monto; // Ventanilla recibe el 40% del monto
				
				// Salida de datos
				txtArea.setText("Se enviará las siguientes cantidades: "+"\n"); //Un subtitulo que dará introduccón a una lista de resultados
				txtArea.append("Bellavista: "+"\t"+df.format(bellavista)+"\n"); //Se muestra en pantalla el importe de Bellavista
				txtArea.append("La Punta: "+"\t"+df.format(la_punta)+"\n"); //Se muestra en pantalla el importe de La Punta
				txtArea.append("La Perla: "+"\t"+df.format(la_perla)+"\n"); //Se muestra en pantalla el importe de La Perla
				txtArea.append("Mi Perú: "+"\t"+df.format(mi_peru)+"\n"); //Se muestra en pantalla el importe de Mi Perú
				txtArea.append("Ventanilla: "+"\t"+df.format(ventanilla)+"\n"); //Se muestra en pantalla el importe de Ventanilla
			}
		});
		btnProcess.setBackground(new Color(132, 88, 179));
		btnProcess.setForeground(new Color(255, 255, 255));
		btnProcess.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		//Se añade un botón de nombre Borrar, al cual se le modificará la tonalidad de la letra, fondo , tamaño y tipografia
		JButton btnDelete = new JButton("Borrar");
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMonto.setText("");
				txtArea.setText("");
			}
		});
		btnDelete.setBounds(10, 252, 89, 23);
		panel.add(btnDelete);
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBackground(new Color(132, 88, 179));
		btnDelete.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		//Se añade un botón de nombre cerrar, al cual se le modificará la tonalidad de la letra, fondo , tamaño y tipografia
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrar.setBounds(249, 252, 89, 23);
		panel.add(btnCerrar);
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setBackground(new Color(132, 88, 179));
		btnCerrar.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
