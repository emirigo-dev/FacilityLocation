package FacilyLocation.Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Start extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 175, 720, 480);
		this.setTitle("Facily Location");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image image = Toolkit.getDefaultToolkit().getImage("ubicacion.png");
		setIconImage(image);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Map jmap = new Map();
				jmap.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Lucida Console", Font.PLAIN, 18));
		btnNewButton.setBounds(163, 354, 375, 52);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(77, 46, 510, 265);
		ImageIcon icon = new ImageIcon ("mapa.png");
		lblNewLabel.setIcon(icon);
		contentPane.add(lblNewLabel);
	}
}
