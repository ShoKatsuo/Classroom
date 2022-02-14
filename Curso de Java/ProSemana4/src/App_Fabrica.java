import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class App_Fabrica extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrice;
	private JTextField txtAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App_Fabrica frame = new App_Fabrica();
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
	public App_Fabrica() {
		setTitle("Fabrica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Precio");
		lblNewLabel.setBounds(24, 34, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setBounds(24, 59, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(74, 31, 86, 20);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		txtAmount = new JTextField();
		txtAmount.setBounds(74, 56, 86, 20);
		contentPane.add(txtAmount);
		txtAmount.setColumns(10);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(10, 94, 479, 156);
		contentPane.add(txtArea);
		
		JButton btnProcess = new JButton("Procesar");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Declarar variables
				double descuento, imp_compra, imp_pagar, precio, imp_descuento;
				int cantidad;
				
				//Entrada
				precio = Double.parseDouble(txtPrice.getText());
				cantidad = Integer.parseInt(txtAmount.getText());
				
				//Proceso
				imp_compra = precio * cantidad;
				imp_descuento = imp_compra * 0.07;
				imp_pagar = imp_compra - imp_descuento;
				
				//formato decimal
				DecimalFormat f = new DecimalFormat("#0.00");
				
				// Salida
				txtArea.setText("Importe compra : "+f.format(imp_compra)+"\n");
				txtArea.append("Importe de descuento: "+f.format(imp_descuento)+"\n");
				txtArea.append("Impuesto a pagar: "+f.format(imp_pagar)+"\n");
			}
		});
		btnProcess.setBounds(202, 30, 89, 23);
		contentPane.add(btnProcess);
		
		JButton btnDelete = new JButton("Borrar");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setText("");
				txtAmount.setText("");
				txtPrice.setText("");
			}
		});
		btnDelete.setBounds(301, 30, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnClose = new JButton("Cerrar");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(400, 30, 89, 23);
		contentPane.add(btnClose);
	}
}
