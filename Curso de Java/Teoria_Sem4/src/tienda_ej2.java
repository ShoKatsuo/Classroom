import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tienda_ej2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtUnid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tienda_ej2 frame = new tienda_ej2();
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
	public tienda_ej2() {
		setTitle("Tinda Ejercicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 289);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Unidades adquiridas");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel.setBounds(23, 32, 105, 14);
		contentPane.add(lblNewLabel);
		
		txtUnid = new JTextField();
		txtUnid.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtUnid.setBounds(128, 29, 86, 20);
		contentPane.add(txtUnid);
		txtUnid.setColumns(10);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(33, 61, 366, 134);
		contentPane.add(txtArea);
		
		JButton btnDelete = new JButton("Borrar");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUnid.setText("");
				txtArea.setText("");
			}
		});
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnDelete.setBounds(10, 216, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnClose = new JButton("Cerrar");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnClose.setBounds(335, 216, 89, 23);
		contentPane.add(btnClose);
		
		JButton btnProcess = new JButton("Procesar");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Declarar variables
				double precio;
				int unidades;
				
				//Introducir variables
				unidades = Integer.parseInt(txtUnid.getText());
				
				// Proceso
				if (unidades >= 1 && unidades <=50) {
					precio = 0.5 * unidades;
					txtArea.setText("Las unidades adquiridas es "+unidades+" y el precio unitario es S/. "+precio);
				}else if (unidades >= 51 && unidades <= 100) {
					precio = 0.15 * unidades;
					txtArea.setText("Las unidades adquiridas es "+unidades+" y el precio unitario es S/. "+precio);
				}else if (unidades >= 101 && unidades <= 150) {
					precio = 0.15 * unidades;
					txtArea.setText("Las unidades adquiridas es "+unidades+" y el precio unitario es S/. "+precio);
				}else if (unidades >= 151) {
					precio = 0.15 * unidades;
					txtArea.setText("Las unidades adquiridas es "+unidades+" y el precio unitario es S/. "+precio);
				}else {
					JOptionPane.showMessageDialog(null, "Su unidad adquirida es erronea, intente nuevamente.");
				}
			}
		});
		btnProcess.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProcess.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnProcess.setBounds(172, 216, 89, 23);
		contentPane.add(btnProcess);
	}
}
