import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Multa extends JFrame {
	
	int xMouse, yMouse;

	private JPanel contentPane;
	private JTextField txtVelocidad;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Multa frame = new Multa();
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
	public Multa() {
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Velocidad");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel.setBounds(27, 24, 68, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(27, 63, 401, 91);
		contentPane.add(txtArea);
		
		txtVelocidad = new JTextField();
		txtVelocidad.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtVelocidad.setBounds(89, 21, 86, 20);
		contentPane.add(txtVelocidad);
		txtVelocidad.setColumns(10);
		
		JButton btnDelete = new JButton("Borrar");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVelocidad.setText("");
				txtArea.setText("");
			}
		});
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnDelete.setBounds(27, 172, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnProcess = new JButton("Procesar");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//declarar variable
				int velocidad;
				
				//Entrada de datos
				velocidad = Integer.parseInt(txtVelocidad.getText()) ;
				
				//Proceso
				if (velocidad > 0 && velocidad <= 70) {
					txtArea.setText("Su velocidad es "+velocidad+" km/h. No tiene multa");
				}else if (velocidad >= 70 && velocidad <= 90){
					txtArea.setText("Su velocidad es "+velocidad+" km/h. Tiene una multa de 100 euros");
				}else if (velocidad >= 91 && velocidad <= 100){
					txtArea.setText("Su velocidad es "+velocidad+" km/h. Tiene una multa de 140 euros");
				}else if (velocidad >= 101){
					txtArea.setText("Su velocidad es "+velocidad+" km/h. Tiene una multa de 200 euros");
				}else {
					txtArea.setText("Su velocidad es erronea. Por favor, colocar nuevamente su velocidad."+"\n");
				}
			}
		});
		btnProcess.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnProcess.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProcess.setBounds(185, 172, 89, 23);
		contentPane.add(btnProcess);
		
		JButton btnClose = new JButton("Cerrar");
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnClose.setBounds(339, 172, 89, 23);
		contentPane.add(btnClose);
	}
}
