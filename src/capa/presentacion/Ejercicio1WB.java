package capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import capa.logica.LibreriaWB;
import capa.logica.TADLista;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Ejercicio1WB extends JFrame {

	private JPanel contentPane;
	private LibreriaWB Li;
	private TADLista L;
	private JTextArea txtLista; 
	private JLabel lblCantidad;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1WB frame = new Ejercicio1WB();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void alPrincipio()
	{
		String dato;
		lblMensaje.setText("");
		dato=Li.leerDato("INGRESE EL DATO");
		L.insertarAlPrincipio(dato);
		txtLista.setText(L.mostrarLista());
		lblCantidad.setText(L.longitud()+"");
	}
	
	public void alFinal()
	{
		String dato;
		lblMensaje.setText("");
		 
		dato=Li.leerDato("INGRESE EL DATO");
		L.insertarAlFinal(dato);
		txtLista.setText(L.mostrarLista());
		lblCantidad.setText(L.longitud()+"");
		
	}
	public void antesDe()
	{
		String dato,buscado;
		 
		dato=Li.leerDato("INGRESE EL DATO");
		buscado =Li.leerDato("INGRESE EL DATO ANTES:");
		lblMensaje.setText(L.insertarAntesDe(dato, buscado));
		txtLista.setText(L.mostrarLista());
		lblCantidad.setText(L.longitud()+"");
		
	}
	
	public void despuesDe()
	{
		String dato,buscado;
		 
		dato=Li.leerDato("INGRESE EL DATO");
		buscado =Li.leerDato("INGRESE EL DATO ANTES:");
		lblMensaje.setText(L.insertarDespuesDe(dato, buscado));
		txtLista.setText(L.mostrarLista());
		lblCantidad.setText(L.longitud()+"");
		
	}

	public void borrar()
	{
		String buscado;
		 
		buscado =Li.leerDato("INGRESE EL DATO A BORRAR:");
		lblMensaje.setText(L.borrar(buscado));
		txtLista.setText(L.mostrarLista());
		lblCantidad.setText(L.longitud()+"");
		
	}
	
	public void reemplazar()
	{
		String nuevo,buscado;
		 
		buscado =Li.leerDato("INGRESE EL DATO A REEMPLAZAR:");
		nuevo=Li.leerDato("INGRESE EL NUEVO DATO");
		
		lblMensaje.setText(L.reemplazar(buscado, nuevo));
		txtLista.setText(L.mostrarLista());
		lblCantidad.setText(L.longitud()+"");
		
	}


	/**
	 * Create the frame.
	 */
	public Ejercicio1WB() {
		Li = new LibreriaWB();
		L = new TADLista();
		txtLista = new JTextArea();
		lblCantidad = new JLabel("");
		lblMensaje= new JLabel("");

		setResizable(false);
		setTitle("MANEJO DE LISTA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		txtLista.setBounds(27, 33, 201, 211);
		contentPane.add(txtLista);
		
		JButton btnInsertarAlPrincipio = new JButton("INSERTAR AL PRINCIPIO");
		btnInsertarAlPrincipio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				alPrincipio();
			}
		});
		btnInsertarAlPrincipio.setBounds(250, 23, 162, 23);
		contentPane.add(btnInsertarAlPrincipio);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "LISTA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.CYAN);
		panel.setBounds(10, 11, 230, 249);
		contentPane.add(panel);
		
		JButton btnInsertarAlFinal = new JButton("INSERTAR AL FINAL");
		btnInsertarAlFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alFinal();
			}
			
		});
		btnInsertarAlFinal.setBounds(250, 57, 162, 23);
		contentPane.add(btnInsertarAlFinal);
		
		JButton button = new JButton("ANTES DE...");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				antesDe();
			}
		});
		button.setBounds(250, 91, 162, 23);
		contentPane.add(button);
		
		JButton btnDes = new JButton("DESPUES DE ...");
		btnDes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				despuesDe();
			}
		});
		btnDes.setBounds(250, 125, 162, 23);
		contentPane.add(btnDes);
		
		JLabel lblCantidadDeElementos = new JLabel("Cantidad de elementos");
		lblCantidadDeElementos.setBounds(37, 271, 162, 14);
		contentPane.add(lblCantidadDeElementos);
		
		
		lblCantidad.setBounds(194, 271, 46, 14);
		contentPane.add(lblCantidad);
		
		
		lblMensaje.setBounds(35, 308, 205, 14);
		contentPane.add(lblMensaje);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar();
			}
		});
		btnBorrar.setBounds(250, 172, 162, 23);
		contentPane.add(btnBorrar);
		
		JButton btnReemplazar = new JButton("REEMPLAZAR");
		btnReemplazar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reemplazar();
			}
		});
		btnReemplazar.setBounds(250, 207, 162, 23);
		contentPane.add(btnReemplazar);
	}
}
