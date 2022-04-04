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
import javax.swing.SpinnerNumberModel;

public class Emp_sueldo extends JDialog {
	
	//Declarar variables 
	int can_hora0, can_hora1, can_hora2, can_hora3;
	double imp_total0, imp_total1, imp_total2, imp_total3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp_sueldo dialog = new Emp_sueldo();
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
	public Emp_sueldo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ShoKatsuo\\GitHub\\Classroom\\Curso de Java\\CL3\\icon\\negocios-y-finanzas.png"));
		setTitle("Sueldo");
		setFont(new Font("Roboto", Font.PLAIN, 12));
		setLocationByPlatform(true);
		setBounds(100, 100, 438, 447);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30,30,93));
		panel.setBounds(0, 0, 422, 408);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setEditable(false);
		txtArea.setForeground(Color.DARK_GRAY);
		txtArea.setBackground(new Color(229,234,245));
		txtArea.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtArea.setBounds(38, 103, 342, 232);
		panel.add(txtArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255,134,146));
		panel_1.setBounds(0, 0, 422, 82);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Hora");
		lblNewLabel_1.setBounds(146, 57, 34, 14);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		JLabel lblNewLabel = new JLabel("Categoria");
		lblNewLabel.setBounds(134, 20, 57, 14);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		JComboBox cboCategoria = new JComboBox();
		cboCategoria.setBackground(new Color(146,165,253));
		cboCategoria.setBounds(191, 16, 86, 22);
		panel_1.add(cboCategoria);
		cboCategoria.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cboCategoria.setModel(new DefaultComboBoxModel(new String[] {" ", "A", "B", "C"}));
		cboCategoria.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		JSpinner spnHora = new JSpinner();
		spnHora.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spnHora.setBackground(new Color(146,165,253));
		spnHora.setFont(new Font("Roboto", Font.PLAIN, 11));
		spnHora.setBounds(190, 54, 87, 20);
		panel_1.add(spnHora);
		
		//Creando un objeto de la clase DecimalFormat
		DecimalFormat df=new DecimalFormat("##.00");
		
		JButton btnProcess = new JButton("Procesar");
		btnProcess.setForeground(Color.WHITE);
		btnProcess.setBackground(new Color(88,127,252));
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//variables locales
				int cate,can;
				double imp_pagar=0;
				cate=getCategoria();
				can=getCantidad();
				//condicional
				if(cate==0) {
					JOptionPane.showMessageDialog(null, "Seleccione un turno"); //Es lo que aparecerá por default, una parte en blanco para dar oportunidad al usuario de elegir un valor
					return;
				}
				if(can<1) {
					JOptionPane.showMessageDialog(null, "Seleccione una cantidad de horas mayor a cero"); //Es el mensaje que saldrá en caso el usuario elija una cantidad menor a 1
					spnHora.requestFocus();
					return;
				}
				imp_pagar=calcularImportePagar(cate,can);
				efectuarIncrementos(cate, can, imp_pagar);
				mostrarResultados(imp_pagar);
			}
			
			//entrada de datos de turno
			int getCategoria() {
				return cboCategoria.getSelectedIndex();//0,1,2
			}
			
			//entrada de datos de cantidad
			//conversion de spinner de value a string y luego a entero
			int getCantidad() {
				return Integer.parseInt(spnHora.getValue().toString());
			}
			
			//tp= categoria-parametro y chp = cantidad de horas-parametro
			double calcularImportePagar(int cp, int chp) {
				switch (cp) {
				case 0:
					return 0;//Es lo que aparecerá en caso el usuario no eliga valor
				case 1:
					return 25.0 * chp;
				case 2:
					return 20.5 * chp;
				default:
					return 15.0 * chp;
				}
			}
			//itp = parametro de sueldo bruto de categoria
			void efectuarIncrementos(int cp, double chp, double ipt) {
				switch (cp) {
				case 0:
					can_hora0=0;
					break;
				case 1:
					can_hora1+=chp;
					imp_total1+=ipt;
					break;
				case 2:
					can_hora2+=chp;
					imp_total2+=ipt;
					break;
				case 3:
					can_hora3+=chp;
					imp_total3+=ipt;
					break;
				}
			}
			//Mensaje de Salida y en algunos casos con formateo de decimal
				void mostrarResultados(double itp) {
					String mensaje = "";
					mensaje += "Informe de Sueldo \n\n";
					mensaje += "El sueldo bruto de la categoria seleccionada es: S/. "+ String.valueOf(df.format(itp))+"\n\n";
					mensaje += "Informe de Sueldo Total \n\n";
					mensaje += "Sueldo bruto total de categoria A: "+String.valueOf(df.format(imp_total1))+"\n";
					mensaje += "Sueldo bruto total de categoria B: "+String.valueOf(df.format(imp_total2))+"\n";
					mensaje += "Sueldo bruto total de categoria C: "+String.valueOf(df.format(imp_total3))+"\n\n";
					mensaje += "Cantidad total de horas trabajadas de: \n\n";
					mensaje += "Categoria A tiene: "+String.valueOf(can_hora1)+" horas trabajadas\n";
					mensaje += "Categoria B tiene: "+String.valueOf(can_hora2)+" horas trabajadas\n";
					mensaje += "Categoria C tiene: "+String.valueOf(can_hora3)+" horas trabajadas\n";
					txtArea.setText(mensaje);
			}
			
		});
		btnProcess.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProcess.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnProcess.setBounds(26, 358, 89, 23);
		panel.add(btnProcess);
		
		JButton btnDelete = new JButton("Borrar");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(new Color(88,127,252));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setText(""); //limpio txtArea
				spnHora.setValue(0); //limpio mi Spinner
				cboCategoria.setSelectedIndex(0); //Limpio mis combobox
			}
		});
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnDelete.setBounds(169, 358, 89, 23);
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
		btnClose.setBounds(303, 358, 89, 23);
		panel.add(btnClose);
		
		

	}
}
