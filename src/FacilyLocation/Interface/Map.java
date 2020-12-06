package FacilyLocation.Interface;

import java.awt.Color;
import java.awt.EventQueue;
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
import FacilyLocation.Logic.Locales;
import FacilyLocation.Logic.Persona;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Map extends JFrame {

	private JPanel contentPane;
	JMapViewer jmap;
	private ArrayList <Persona> clientes;
	private ArrayList <Locales> locales;
	public static int localesSize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Map frame = new Map();
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
	public Map() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 175, 720, 480);
		this.setTitle("Facily Location");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 704, 385);
		contentPane.add(panel);
		
		clientes = PersonaDao.personasFromJson();
		locales = LocalesDao.centrosFromJson();
		localesSize = locales.size();
		
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
		
		for (Locales local : locales) {
			Coordinate c = new Coordinate (local.getLatitud(), local.getLongitud());
			MapMarker m = new MapMarkerDot(local.getNombre(), c);
			m.getStyle().setColor(Color.BLUE);
			m.getStyle().setBackColor(Color.BLUE);
			jmap.addMapMarker(m);
		}
		panel.setLayout(null);
		
		panel.add(jmap);
		
		JButton btnNewButton = new JButton("Mostrar locales sugeridos");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Select select = new Select ();
				select.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Ebrima", Font.BOLD, 14));
		btnNewButton.setBounds(198, 396, 307, 34);
		contentPane.add(btnNewButton);
	}
}
