import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import java.awt.Toolkit;

public class Emp_transporte extends JDialog {
	
	//Declarar variables 
	int can_ven0, can_ven1, can_ven2, ven1, ven2;
	double imp_total0, imp_total1, imp_total2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp_transporte dialog = new Emp_transporte();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Emp_transporte() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ShoKatsuo\\GitHub\\Classroom\\Curso de Java\\CL3\\icon\\transporte-publico.png"));
		setTitle("Transporte");
		setFont(new Font("Roboto", Font.PLAIN, 12));
		setLocationByPlatform(true);
		setBounds(100, 100, 438, 425);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30,30,93));
		panel.setBounds(0, 0, 422, 386);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setEditable(false);
		txtArea.setForeground(Color.DARK_GRAY);
		txtArea.setBackground(new Color(229,234,245));
		txtArea.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtArea.setBounds(38, 103, 342, 209);
		panel.add(txtArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255,134,146));
		panel_1.setBounds(0, 0, 422, 82);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setBounds(136, 57, 44, 14);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		JLabel lblNewLabel = new JLabel("Turno");
		lblNewLabel.setBounds(134, 20, 46, 14);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		JComboBox cboTurno = new JComboBox();
		cboTurno.setBackground(new Color(146,165,253));
		cboTurno.setBounds(191, 16, 86, 22);
		panel_1.add(cboTurno);
		cboTurno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cboTurno.setModel(new DefaultComboBoxModel(new String[] {" ", "Ma\u00F1ana", "Noche"}));
		cboTurno.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		JSpinner spnCantidad = new JSpinner();
		spnCantidad.setBackground(new Color(146,165,253));
		spnCantidad.setFont(new Font("Roboto", Font.PLAIN, 11));
		spnCantidad.setBounds(190, 54, 87, 20);
		panel_1.add(spnCantidad);
		
		//Creando un objeto de la clase DecimalFormat
		DecimalFormat df=new DecimalFormat("##.00");
		
		JButton btnProcess = new JButton("Procesar");
		btnProcess.setForeground(Color.WHITE);
		btnProcess.setBackground(new Color(88,127,252));
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//variables locales
				int turn,can;
				double imp_pagar=0;
				turn=getTurno();
				can=getCantidad();
				//condicional
				if(turn==0) {
					JOptionPane.showMessageDialog(null, "Seleccione un turno"); //Es lo que aparecerá por default, una parte en blanco para dar oportunidad al usuario de elegir un valor
					return;
				}
				if(can<1) {
					JOptionPane.showMessageDialog(null, "Seleccione una cantidad mayor a cero"); //Es el mensaje que saldrá en caso el usuario elija una cantidad menor a 1
					spnCantidad.requestFocus();
					return;
				}
				imp_pagar=calcularImportePagar(turn,can);
				efectuarIncrementos(turn, can, imp_pagar);
				mostrarResultados(imp_pagar);
			}
			
			//entrada de datos de turno
			int getTurno() {
				return cboTurno.getSelectedIndex();//0,1,2
			}
			
			//entrada de datos de cantidad
			//conversion de spinner de value a string y luego a entero
			int getCantidad() {
				return Integer.parseInt(spnCantidad.getValue().toString());
			}
			
			//tp= turno-parametro y cp = cantidad-parametro
			double calcularImportePagar(int tp, int cp) {
				switch (tp) {
				case 0:
					return 0;//Es lo que aparecerá en caso el usuario no eliga valor
				case 1:
					return 50.0 * cp;
				default:
					return 40.0 * cp;
				}
			}
			//itp = parametro de importe del turno
			void efectuarIncrementos(int tp, double cp, double ipt) {
				switch (tp) {
				case 0:
					can_ven0=0;
					break;
				case 1:
					can_ven1+=cp;
					ven1+=1;
					imp_total1+=ipt;
					break;
				case 2:
					can_ven2+=cp;
					ven2+=1;
					imp_total2+=ipt;
					break;
				}
			}
			
				void mostrarResultados(double itp) {
					String mensaje = "";
					mensaje += "Informe de ventas \n\n";
					mensaje += "Importe a pagar por el turno seleccionado es: S/. "+ String.valueOf(df.format(itp))+"\n\n";
					mensaje += "Cantidad total de pasajes vendidos por cada turno \n\n";
					mensaje += "Turno mañana tiene: "+String.valueOf(can_ven1)+" pasajes vendidos \n";
					mensaje += "Turno noche tiene: "+String.valueOf(can_ven2)+" pasajes vendidos \n";
					mensaje += "Turno mañana tiene: "+String.valueOf(ven1)+" ventas \n";
					mensaje += "Turno noche tiene: "+String.valueOf(ven2)+" ventas \n";
					mensaje += "Importe total vendidos del turno mañana: "+String.valueOf(df.format(imp_total1))+"\n";
					mensaje += "Importe total vendidos del turno noche: "+String.valueOf(df.format(imp_total2))+"\n\n";
					txtArea.setText(mensaje);
			}
			
		});
		btnProcess.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProcess.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnProcess.setBounds(28, 338, 89, 23);
		panel.add(btnProcess);
		
		JButton btnDelete = new JButton("Borrar");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(new Color(88,127,252));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setText(""); //limpio txtArea
				spnCantidad.setValue(0); //limpio mi Spinner
				cboTurno.setSelectedIndex(0); //Limpio mis combobox
			}
		});
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnDelete.setBounds(169, 338, 89, 23);
		panel.add(btnDelete);
		
		JButton btnClose = new JButton("Cerrar");
		btnClose.setForeground(Color.WHITE);
		btnClose.setBackground(new Color(88,127,252));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnClose.setBounds(303, 338, 89, 23);
		panel.add(btnClose);
		
		

	}
}
