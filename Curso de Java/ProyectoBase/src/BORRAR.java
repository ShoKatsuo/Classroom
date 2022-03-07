import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class BORRAR extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BORRAR dialog = new BORRAR();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BORRAR() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 228, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setBounds(31, 65, 378, 142);
					getContentPane().add(scrollPane);
					

					JTextArea txtS = new JTextArea();
					scrollPane.setViewportView(txtS);
				
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//mdi p=new mdi();
						txtS.setText("");
					    txtS.append("CODIGO : "+mdi.codigo0+"\n");
					    txtS.append("Titulo : "+mdi.titulo0+"\n");
					    txtS.append("Autor  : "+mdi.autor0+"\n");
					    txtS.append("Precio : "+mdi.precio0+"\n");
					    txtS.append("CODIGO : "+mdi.codigo1+"\n");
					    txtS.append("Titulo : "+mdi.titulo1+"\n");
					    txtS.append("Autor  : "+mdi.autor1+"\n");
					    txtS.append("Precio : "+mdi.precio1+"\n");
					    txtS.append("CODIGO : "+mdi.codigo2+"\n");
					    txtS.append("Titulo : "+mdi.titulo2+"\n");
					    txtS.append("Autor  : "+mdi.autor2+"\n");
					    txtS.append("Precio : "+mdi.precio2+"\n");
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
	}
}
