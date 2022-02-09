import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Empresa extends JFrame {

	private JPanel contentPane;
	private JTextField txtMonto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empresa frame = new Empresa();
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
	public Empresa() {
		setTitle("Empresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monto de dinero");
		lblNewLabel.setBounds(10, 25, 83, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea txtS = new JTextArea();
		txtS.setBounds(10, 53, 504, 197);
		contentPane.add(txtS);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(95, 22, 86, 20);
		contentPane.add(txtMonto);
		txtMonto.setColumns(10);
		
		JButton btnClose = new JButton("Cerrar");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(425, 21, 89, 23);
		contentPane.add(btnClose);
		
		JButton btnProcess = new JButton("Procesar");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double monto, contabilidad, marketing, informatica, produccion, soporte;
				monto = Double.parseDouble(txtMonto.getText());
				contabilidad = 0.25 * monto;
				marketing = 0.18 * monto;
				informatica = 0.31 * monto;
				produccion = 0.14 * monto;
				soporte = monto - (contabilidad + marketing + informatica + produccion);
				txtS.setText("Retiro de dinero "+"\n");
				txtS.append("Contabilidad	: "+"\t"+contabilidad+"\n");
				txtS.append("Marketing	: "+"\t"+marketing+"\n");
				txtS.append("Informatica	: "+"\t"+informatica+"\n");
				txtS.append("Producción	: "+"\t"+produccion+"\n");
				txtS.append("Soporte	: "+"\t"+soporte+"\n");
			}
		});
		btnProcess.setBounds(326, 21, 89, 23);
		contentPane.add(btnProcess);
		
		JButton btnDelete = new JButton("Borrar");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMonto.setText("");
				txtS.setText("");
			}
		});
		btnDelete.setBounds(227, 21, 89, 23);
		contentPane.add(btnDelete);
	}
}
