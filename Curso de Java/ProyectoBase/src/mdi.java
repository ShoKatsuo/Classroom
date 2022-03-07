import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mdi extends JFrame {
	

	private JPanel contentPane;
	//seccion de declaraciones de variables publicas codigo,titulo,autor,precio
	public static String codigo0="c001";
	public static String codigo1="c002";
	public static String codigo2="c003";
	
	public static String titulo0="Como Programar en Java";
	public static String titulo1="Aplica SQL";
	public static String titulo2="Metodologia Investigación";
	
	public static String autor0="Cevallos";
	public static String autor1="Ramirez";
	public static String autor2="Joyanes";
	
	public static double precio0=150;
	public static double precio1=85;
	public static double precio2=120;
	

	/**
	 * Launch the application. mdi()
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
		
		
		
		setTitle("Tienda");
		
		setExtendedState(MAXIMIZED_BOTH);
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//1 crear una variable del JDialog DialogoConsultar
				DialogoConsultar ventanaConsultar;
				//2 crear un objeto de la clase DialogoConsultar
				ventanaConsultar=new DialogoConsultar();
				ventanaConsultar.setVisible(true);
				
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Listar");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//1. Declarar una variable de tu ventan JDialog Listar.java
				Listar dc;
				//2 crear un objeto de la clase Listar new
				dc=new Listar();
				//luego el objeto dc invoca al metodo setVisible para visualiza el cuadroDialogo
				dc.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Acerca de Tienda");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//declaro y creo objeto de AcercaDe
				AcercaDe vAcercaDe=new AcercaDe();
				vAcercaDe.setVisible(true);
				
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.setBackground(Color.BLUE);
	}

}
