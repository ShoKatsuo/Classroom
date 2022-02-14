import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App_Rombo extends JFrame {

	private JPanel contentPane;
	private JTextField txtDmayor;
	private JTextField txtDmenor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App_Rombo frame = new App_Rombo();
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
	public App_Rombo() {
		setTitle("Rombo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(10, 96, 529, 154);
		contentPane.add(txtArea);
		
		JLabel lblNewLabel = new JLabel("Diagonal mayor");
		lblNewLabel.setBounds(29, 11, 83, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Diagonal menor");
		lblNewLabel_1.setBounds(29, 45, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		txtDmayor = new JTextField();
		txtDmayor.setBounds(116, 8, 86, 20);
		contentPane.add(txtDmayor);
		txtDmayor.setColumns(10);
		
		txtDmenor = new JTextField();
		txtDmenor.setBounds(116, 42, 86, 20);
		contentPane.add(txtDmenor);
		txtDmenor.setColumns(10);
		
		JButton btnProcess = new JButton("Procesar");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dmayor, dmenor, area;
				dmayor = Double.parseDouble(txtDmayor.getText());
				dmenor = Double.parseDouble(txtDmenor.getText());
				
				//Proceso
				area = (dmayor*dmenor)/2;
				
				//Salida
				txtArea.setText("Area : "+area);
				JOptionPane.showMessageDialog(null, "Area: "+area);
			}
		});
		btnProcess.setBounds(252, 23, 89, 23);
		contentPane.add(btnProcess);
		
		JButton btnDelete = new JButton("Borrar");
		btnDelete.setBounds(351, 23, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnClose = new JButton("Cerrar");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(450, 23, 89, 23);
		contentPane.add(btnClose);
	}

}
