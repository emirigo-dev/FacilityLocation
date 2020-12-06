package FacilyLocation.Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.interfaces.MapMarker;

import FacilyLocation.DAO.LocalesDao;
import FacilyLocation.DAO.PersonaDao;
import FacilyLocation.Logic.Instancia;
import FacilyLocation.Logic.Locales;
import FacilyLocation.Logic.Persona;
import FacilyLocation.Logic.Solucion;
import FacilyLocation.Logic.Solver;

@SuppressWarnings("serial")
public class MapGoloso extends JFrame {

	private JPanel contentPane;
	ArrayList <Persona> clientes;
	ArrayList <Locales> locales;
	JMapViewer jmap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapGoloso frame = new MapGoloso(Select.count);
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
	public MapGoloso(int count) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 175, 720, 480);
		this.setTitle("Facily Location");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Image image = Toolkit.getDefaultToolkit().getImage("ubicacion.png");
		setIconImage(image);
		
		clientes = PersonaDao.personasFromJson();
		locales = LocalesDao.centrosFromJson();
		
		Instancia instancia = new Instancia();
		instancia.agregarClientes(clientes);
		instancia.agregarLocales(locales);
		instancia.setCantidadApertura(count);
		Solver solver = new Solver (instancia);
		Solucion solucion = solver.resolver();
		
		jmap = new JMapViewer();
		jmap.setBounds(0, 0, 704, 385);
		jmap.setZoomControlsVisible(false);
		Coordinate coordinate = new Coordinate (-34.521509610736004, -58.70071255847414);
		jmap.setDisplayPosition(coordinate, 12);
		
		for (Persona persona : clientes) {
			Coordinate c = new Coordinate (persona.getLatitud(), persona.getLongitud());
			MapMarker m = new MapMarkerDot(persona.getNombre(), c);
			m.getStyle().setColor(Color.RED);
			m.getStyle().setBackColor(Color.RED);
			jmap.addMapMarker(m);
		}
		
		for (Locales local : solucion.getLocales()) {
			Coordinate c = new Coordinate (local.getLatitud(), local.getLongitud());
			MapMarker m = new MapMarkerDot(local.getNombre(), c);
			m.getStyle().setColor(Color.BLUE);
			m.getStyle().setBackColor(Color.BLUE);
			jmap.addMapMarker(m);
		}
		
		contentPane.add(jmap);
	}

}
