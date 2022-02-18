import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotaDel extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtNota4;
	private JButton btnDelete;
	private JButton btnClose;
	private JButton btnProcess;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotaDel frame = new NotaDel();
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
	public NotaDel() {
		setFont(new Font("Roboto", Font.PLAIN, 12));
		setLocationByPlatform(true);
		setTitle("Promedio de notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nota 1");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel.setBounds(20, 45, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNota1 = new JTextField();
		txtNota1.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtNota1.setBounds(82, 42, 86, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 2");
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(20, 88, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNota2 = new JTextField();
		txtNota2.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtNota2.setBounds(82, 82, 86, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 3");
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(20, 128, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNota3 = new JTextField();
		txtNota3.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtNota3.setBounds(82, 125, 86, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 4");
		lblNewLabel_3.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(20, 168, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtNota4 = new JTextField();
		txtNota4.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtNota4.setBounds(82, 165, 86, 20);
		contentPane.add(txtNota4);
		txtNota4.setColumns(10);
		
		btnDelete = new JButton("Borrar");
		btnDelete.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNota1.setText("");
				txtNota2.setText("");
				txtNota3.setText("");
				txtNota4.setText("");
			}
		});
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setBounds(206, 41, 89, 23);
		contentPane.add(btnDelete);
		
		btnClose = new JButton("Cerrar");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnClose.setBounds(206, 164, 89, 23);
		contentPane.add(btnClose);
		
		btnProcess = new JButton("Procesar");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Definir Variables
				double nota1, nota2, nota3, nota4, promedio;
				
				//Ingresar datos
				nota1 = Double.parseDouble(txtNota1.getText()); // Guardaremos los datos ingresados de txtNota1 en la variable nota 1
				nota2 = Double.parseDouble(txtNota2.getText());
				nota3 = Double.parseDouble(txtNota3.getText());
				nota4 = Double.parseDouble(txtNota4.getText());
				
				//Procesar Datos
				if (nota1 >= 0 && nota1 < nota2 && nota1 < nota3 && nota1 < nota4) { //Si nota 1 es menor que el resto de notas
					promedio = (nota2 + nota3 + nota4) / 3; //Entonces solo se promediará las tres notas mayores
					JOptionPane.showMessageDialog(null, "La nota excluida es "+nota1+" y su promedio es "+promedio); //lanzará el resultado
				}else if (nota2 >= 0 && nota2 < nota1 && nota2 < nota3 && nota2 < nota4) {
					promedio = (nota1 + nota3 + nota4) / 3;
					JOptionPane.showMessageDialog(null, "La nota excluida es "+nota2+" y su promedio es "+promedio);
				}else if (nota3 >= 0 && nota3 < nota1 && nota3 < nota2 && nota3 < nota4) {
					promedio = (nota1 + nota2 + nota4) / 3;
					JOptionPane.showMessageDialog(null, "La nota excluida es "+nota3+" y su promedio es "+promedio);
				}else if (nota4 >= 0 && nota4 < nota1 && nota4 < nota2 && nota4 < nota3) {
					promedio = (nota1 + nota2 + nota3) / 3;
					JOptionPane.showMessageDialog(null, "La nota excluida es "+nota4+" y su promedio es "+promedio);
				}else {
					JOptionPane.showMessageDialog(null, "Por favor ingrese una nota correcta.");
				}
			}
		});
		btnProcess.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProcess.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnProcess.setBounds(206, 104, 89, 23);
		contentPane.add(btnProcess);
	}

}
