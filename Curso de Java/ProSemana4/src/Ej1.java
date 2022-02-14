import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;

public class Ej1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej1 frame = new Ej1();
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
	public Ej1() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Ejercicio_1");
		setBounds(100, 100, 542, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		panel.setBounds(0, 0, 526, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Velocidad");
		lblNewLabel.setBounds(21, 39, 80, 14);
		panel.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.text);
		textArea.setBounds(21, 89, 477, 161);
		panel.add(textArea);
		
		JButton btnProcess = new JButton("Procesar");
		btnProcess.setBackground(SystemColor.menu);
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProcess.setBounds(229, 35, 89, 23);
		panel.add(btnProcess);
		
		JButton btnClose = new JButton("Cerrar");
		btnClose.setBackground(SystemColor.menu);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(427, 35, 89, 23);
		panel.add(btnClose);
		
		textField = new JTextField();
		textField.setBounds(81, 36, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnDelete = new JButton("Borrar");
		btnDelete.setBackground(SystemColor.menu);
		btnDelete.setBounds(328, 35, 89, 23);
		panel.add(btnDelete);
	}

}
