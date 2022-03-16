import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class Uni_Mediterraneo extends JFrame {
	
	//Declarando variables globales
	double descuento, imp_descuento, imp_pagar;
	int curso, costo_curso, turno;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uni_Mediterraneo frame = new Uni_Mediterraneo();
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
	public Uni_Mediterraneo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ShoKatsuo\\GitHub\\Classroom\\Curso de Java\\CL2-Algoritmia\\icon\\universidad.png"));
		setTitle("Universidad Mediterr\u00E1neo ");
		setFont(new Font("Roboto", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel fondo = new JPanel();
		fondo.setBackground(new Color(166,166,164)); //color de fondo
		fondo.setBounds(0, 0, 407, 319);
		contentPane.add(fondo);
		fondo.setLayout(null);
		
		JPanel fondo_sup = new JPanel();
		fondo_sup.setBackground(new Color(236, 231, 173));
		fondo_sup.setBounds(0, 0, 407, 115);
		fondo.add(fondo_sup);
		fondo_sup.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cursos");
		lblNewLabel.setBounds(31, 43, 46, 14);
		fondo_sup.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		JComboBox cboCurso = new JComboBox();
		cboCurso.setBounds(80, 39, 120, 22);
		fondo_sup.add(cboCurso);
		cboCurso.setFont(new Font("Roboto", Font.PLAIN, 11));
		cboCurso.setBackground(new Color(173, 224, 217)); //cambio el color de mi combobox
		cboCurso.setModel(new DefaultComboBoxModel(new String[] {" ","Base de datos", "Programaci\u00F3n", "Bizagi"}));
		
		JLabel lblNewLabel_1 = new JLabel("Turno");
		lblNewLabel_1.setBounds(31, 78, 46, 14);
		fondo_sup.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		JComboBox cboTurno = new JComboBox();
		cboTurno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cboTurno.setBounds(80, 72, 120, 22);
		fondo_sup.add(cboTurno);
		cboTurno.setForeground(Color.BLACK);
		cboTurno.setFont(new Font("Roboto", Font.PLAIN, 11));
		cboTurno.setBackground(new Color(173, 224, 217));
		cboTurno.setModel(new DefaultComboBoxModel(new String[] {" ","Diurno", "Nocturno"}));
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBackground(Color.WHITE);
		txtArea.setFont(new Font("Roboto", Font.PLAIN, 13));
		txtArea.setBounds(84, 157, 246, 57);
		fondo.add(txtArea);
		
		JButton btnClose = new JButton("Cerrar");
		btnClose.setBackground(new Color(238, 204, 202));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnClose.setBounds(284, 266, 89, 23);
		fondo.add(btnClose);
		
		JButton btnProcess = new JButton("Procesar");
		btnProcess.setBackground(new Color(238, 204, 202));
		btnProcess.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				curso = cboCurso.getSelectedIndex();//0,1,2
				turno = cboTurno.getSelectedIndex();//0,1
				//Proceso
				switch (curso) {
				case 0: JOptionPane.showMessageDialog(null, "Seleccione un curso");break;
				case 1: costo_curso = 360;break; //En caso el cliente elija el 1er curso se tomará el valor de este
				case 2: costo_curso = 250;break; //De esta manera será con el resto de opciones (case 1 y case 2)
				default: costo_curso = 150;break; //Eh obviado escribir case 3 porque el usuario solo podrá controlr las opciones prestablecidas asi que usé default en su lugar
				}
				switch (turno) {
				case 0: JOptionPane.showMessageDialog(null, "Seleccione un turno");break;
				case 1: descuento = 0.25;break; //El valor del descuento dependerá del turno que el usuario elija
				default: descuento = 0.15;break; // Se obvio el case 2 porque al tener los valores predefinidos, la terminal entenderá que en caso no se elija el case0 solo quedará por elegir el case 1
				}
				imp_descuento = costo_curso * descuento; //En caso el cliente elija alguno de los cursos y turnos. Para saber importe del descuento se multiplicará el valor del curso por el descuento aplicado del turno
				imp_pagar = costo_curso - imp_descuento; //El valor del importe a pagar es el valor del curso restado por el importe del descuento
				
				//Salida
				if (curso > 0 && turno > 0) { //Solo saldrá un mensaje de salida en caso el usuario eliga un turno y curso con un valor diferente de 0 o el primer valor de la lista
					txtArea.setText("El importe de descuento es "+imp_descuento+" soles"+"\n");
					txtArea.append("Usted pagará "+imp_pagar+" soles"+"\n");
				}else {
					txtArea.append(" ");
				}
				//JOptionPane.showMessageDialog(null,"El importe de descuento es "+imp_descuento+" soles. Usted pagará "+imp_pagar+" soles"); //Mensaje flotante indicando el resultado
			}

		});
		btnProcess.setBounds(35, 266, 89, 23);
		fondo.add(btnProcess);
		
		JButton btnDelete = new JButton("Borrar");
		btnDelete.setBackground(new Color(238, 204, 202));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//para poder limpiar los valores
				txtArea.setText(""); //limpio txtArea
				cboTurno.setSelectedIndex(0); //Limpio mis combobox
				cboCurso.setSelectedIndex(0);
			}
		});
		btnDelete.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnDelete.setBounds(160, 266, 89, 23);
		fondo.add(btnDelete);
		
	
		

		
	}
}
