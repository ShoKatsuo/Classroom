import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listar extends JDialog {

	/**
	 * Launch the application.
	 */
	
	mdi JFrame=new mdi();
	
	public static void main(String[] args) {
		try {
			Listar dialog = new Listar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Listar() {
		setResizable(false);
		setModal(true);
		setTitle("LISTAR");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 228, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			
			JTextArea txtS = new JTextArea();
			txtS.setBounds(10, 26, 403, 167);
			getContentPane().add(txtS);
			getContentPane().add(buttonPane);
			{
				JButton btnListar = new JButton("LISTAR");
				
				
				
				
				btnListar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//mdi p=new mdi();
						txtS.setText("");
					    txtS.append("CODIGO : "+mdi.codigo0);
					    txtS.append("Titulo : "+mdi.titulo0);
					    txtS.append("Autor  : "+mdi.autor0);
					    txtS.append("Precio : "+mdi.precio0);
					
					}
				});
				btnListar.setActionCommand("OK");
				buttonPane.add(btnListar);
				getRootPane().setDefaultButton(btnListar);
			}
			{
				JButton btnCerrar = new JButton("CERRAR");
				btnCerrar.setActionCommand("Cancel");
				buttonPane.add(btnCerrar);
			}
		}
		
		
	}
}
