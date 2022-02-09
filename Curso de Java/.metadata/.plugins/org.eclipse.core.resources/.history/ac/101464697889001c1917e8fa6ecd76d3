import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Cilindro extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-33,119
	 */
	private final JButton button = new JButton("New button");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cilindro frame = new Cilindro();
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
	public Cilindro() {
		setTitle("Cilindro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Radio");
		lblNewLabel.setBounds(10, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setBounds(10, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JEditorPane txtRadio = new JEditorPane();
		txtRadio.setBounds(66, 23, 107, 20);
		contentPane.add(txtRadio);
		
		JEditorPane txtAltura = new JEditorPane();
		txtAltura.setBounds(66, 54, 107, 20);
		contentPane.add(txtAltura);
		
		JTextArea txtS = new JTextArea();
		txtS.setBounds(10, 98, 480, 141);
		contentPane.add(txtS);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//agregar nuestro codigo
				//1 Declarar variables tipo nativo double, int, string
				double r,h,abase,alate,atotal;
				//Creando un objeto de la clase DecimalFormat
				DecimalFormat f=new DecimalFormat("##.00");
				
				//2 Entrada de datos
				//Para convertir un texto a double, metodo parse de la clase double
				r=Double.parseDouble(txtRadio.getText());
				h=Double.parseDouble(txtAltura.getText());
				// Proceso
				abase = 3.1416 * (r*r);
				alate = 2*3.1416*r*h;
				atotal= 2 * abase + alate;
				//4 Salida mostrar JtextArea
				txtS.setText("Propiedades Geometricas del cilindro"+"\n");
				txtS.append("Area base: "+"\t"+f.format(abase)+"\n");
				txtS.append("Area lateral: "+"\t"+f.format(alate)+"\n");
				txtS.append("Area total: "+"\t"+f.format(atotal)+"\n");
			}
		});
		btnProcesar.setBounds(328, 25, 76, 23);
		contentPane.add(btnProcesar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAltura.setText("");
				txtRadio.setText("");
				txtS.setText("");
			}
		});
		btnBorrar.setBounds(242, 25, 76, 23);
		contentPane.add(btnBorrar);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cerrar = System.exit(0); o dispose();
				dispose();
			}
		});
		btnCerrar.setBounds(414, 25, 76, 23);
		contentPane.add(btnCerrar);
		
	}
}
