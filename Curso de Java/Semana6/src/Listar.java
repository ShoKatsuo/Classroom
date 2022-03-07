import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Cursor;

public class Listar extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
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
		setFont(new Font("Roboto", Font.PLAIN, 12));
		setResizable(false);
		setModal(true);
		setTitle("Listar");
		setBounds(100, 100, 450, 300);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 228, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().setLayout(null);
			
			JTextArea txtS = new JTextArea();
			txtS.setBounds(10, 26, 403, 167);
			getContentPane().add(txtS);
			getContentPane().add(buttonPane);
			{
				JButton btnListar = new JButton("Listar");
				btnListar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnListar.setFont(new Font("Roboto", Font.PLAIN, 11));
				
				
				
				
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
				JButton btnClose = new JButton("Cerrar");
				btnClose.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnClose.setFont(new Font("Roboto", Font.PLAIN, 11));
				btnClose.setActionCommand("Cancel");
				buttonPane.add(btnClose);
			}
		}
		
		
	}
}
