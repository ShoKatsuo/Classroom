import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mdi extends JFrame {

	private JPanel contentPane;
	//Declarar e inicializar las variables Publicas
	public static String codigo0="c001";
	public static String codigo1="c002";
	public static String codigo2="c003";
	
	public static String titulo0="Como programar en Java";
	public static String titulo1="Aplica SQL";
	public static String titulo2="Metodologia Investigación";
	
	public static String autor0="Cevallos";
	public static String autor1="Ramirez";
	public static String autor2="Joyanes";
	
	public static double precio0=150;
	public static double precio1=85;
	public static double precio2=120;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mdi frame = new mdi();
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
	public mdi() {
		setExtendedState(MAXIMIZED_BOTH); //metodo maximisa la ventana
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setFont(new Font("Roboto", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Salir");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);

		JMenu mnNewMenu_1 = new JMenu("Mantenimiento");
		mnNewMenu_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Consultar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. Crear una variable del JDialog DialogoConsultar
				DialogoConsultar vconsultar;
				//Crear objeto de la clase DialogoConsultar
				vconsultar=new DialogoConsultar();
				vconsultar.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1. Declarar una variable de tu ventana JDialog Listar.java
				Listar dc; //dc = cuadro de dialogo
				//2. Crear un objeto
				dc = new Listar();
				// luego el objeto dc invoca al metodo setVisible
				dc.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		mnNewMenu_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Acerca de tienda");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1. Declarar variable de Jdialog Dialogo Consultar
				//AcercaDe vAcercaDe;
				//2. Crear objeto
				//vAcercaDE = AcercaDe();
				//Simplificar, Declaro y creo de AcercaDe
				AcercaDe vAcercaDe=new AcercaDe();
				vAcercaDe.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.blue); //cambiar de color
	}
}
