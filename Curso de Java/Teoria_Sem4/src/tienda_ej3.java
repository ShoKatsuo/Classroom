import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class tienda_ej3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtUnidades;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tienda_ej3 frame = new tienda_ej3();
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
	public tienda_ej3() {
		setFont(new Font("Roboto", Font.PLAIN, 12));
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JComboBox box1 = new JComboBox();
		box1.setFont(new Font("Roboto", Font.PLAIN, 11));
		box1.setBounds(327, 24, 79, 22);
		contentPane.add(box1);
		box1.addItem("P1");
		box1.addItem("P2");
		box1.addItem("P3");
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(22, 69, 384, 112);
		contentPane.add(txtArea);
		
		JLabel lblNewLabel = new JLabel("Unidades adquiridas:");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel.setBounds(22, 28, 114, 14);
		contentPane.add(lblNewLabel);
		
		txtUnidades = new JTextField();
		txtUnidades.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtUnidades.setBounds(133, 25, 86, 20);
		contentPane.add(txtUnidades);
		txtUnidades.setColumns(10);
		
		JButton btnDelete = new JButton("Borrar");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setText("");
			}
		});
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnDelete.setBounds(10, 216, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnClose = new JButton("Cerrar");
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnClose.setBounds(335, 216, 89, 23);
		contentPane.add(btnClose);
		
		JButton btnProcess = new JButton("Procesar");
		btnProcess.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProcess.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Declarar variables
				double P1, P2, P3, descuento, descuento2, descuento3;
				int unidades;
				String producto;
				
				//Ingresar datos
				unidades = Integer.parseInt(txtUnidades.getText());
				producto = box1.getSelectedItem().toString();
				
				
				//Procesar datos
				P1 = 17.50;
				P2 = 25.00;
				P3 = 15.50;
				if (producto.equalsIgnoreCase("P1")) {
					if (unidades >= 1 && unidades <= 10) {
						descuento = 0.05 * P1 * unidades;
						txtArea.setText("Usted pagará "+descuento+" soles");
					}else if (unidades >= 11 && unidades <= 20) {
						descuento = 0.075 * P1 * unidades;
						txtArea.setText("Usted pagará "+descuento+" soles");
					}else if (unidades >= 21) {
						descuento = 0.1 * P1 * unidades;
						txtArea.setText("Usted pagará "+descuento+" soles");
					}else {
						JOptionPane.showMessageDialog(null, "Su unidad adquirida es erronea, intente nuevamente.");
					}
				}else if (producto.equalsIgnoreCase("P2")) {
					if (unidades >= 1 && unidades <= 10) {
						descuento = 0.05 * P2 * unidades;
						txtArea.setText("Usted pagará "+descuento+" soles");
					}else if (unidades >= 11 && unidades <= 20) {
						descuento = 0.075 * P2 * unidades;
						txtArea.setText("Usted pagará "+descuento+" soles");
					}else if (unidades >= 21) {
						descuento = 0.1 * P2 * unidades;
						txtArea.setText("Usted pagará "+descuento+" soles");
					}else {
						JOptionPane.showMessageDialog(null, "Su unidad adquirida es erronea, intente nuevamente.");
					}
				}else if (producto.equalsIgnoreCase("P3")) {
					if (unidades >= 1 && unidades <= 10) {
						descuento = 0.05 * P3 * unidades;
						txtArea.setText("Usted pagará "+descuento+" soles");
					}else if (unidades >= 11 && unidades <= 20) {
						descuento = 0.075 * P3 * unidades;
						txtArea.setText("Usted pagará "+descuento+" soles");
					}else if (unidades >= 21) {
						descuento = 0.1 * P3 * unidades;
						txtArea.setText("Usted pagará "+descuento+" soles");
					}else {
						JOptionPane.showMessageDialog(null, "Su unidad adquirida es erronea, intente nuevamente.");
					}
				}/*else {
					JOptionPane.showMessageDialog(null, "Su unidad adquirida es erronea, intente nuevamente.");
				}*/
				}
			}
		);
		btnProcess.setBounds(175, 216, 89, 23);
		contentPane.add(btnProcess);

	}
}
