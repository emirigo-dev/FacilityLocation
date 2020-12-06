package FacilyLocation.Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class Select extends JFrame {

	private JPanel contentPane;
	public static int count;
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel regexLabel;
	private JLabel nullLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select frame = new Select();
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
	public Select() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 175, 720, 480);
		this.setTitle("Facily Location");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image image = Toolkit.getDefaultToolkit().getImage("ubicacion.png");
		setIconImage(image);
		
		JLabel lblNewLabel = new JLabel("Seleccione la cantidad de locales que desea abrir");
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(117, 68, 470, 47);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Consolas", Font.BOLD, 20));
		textField.setBackground(UIManager.getColor("Button.disabledShadow"));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(284, 160, 138, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		regexLabel = new JLabel("Debe seleccionar un numero entre 1 y " + Map.localesSize);
		regexLabel.setFont(new Font("Consolas", Font.PLAIN, 12));
		regexLabel.setHorizontalAlignment(SwingConstants.CENTER);
		regexLabel.setForeground(Color.RED);
		regexLabel.setBounds(127, 126, 451, 14);
		contentPane.add(regexLabel);
		regexLabel.setVisible(false);
		
		nullLabel = new JLabel("Debe Seleccionar un valor");
		nullLabel.setFont(new Font("Consolas", Font.PLAIN, 12));
		nullLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nullLabel.setForeground(Color.RED);
		nullLabel.setBounds(127, 126, 451, 14);
		contentPane.add(nullLabel);
		nullLabel.setVisible(false);
		
		btnNewButton = new JButton("Enviar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				nullLabel.setVisible(false);
				regexLabel.setVisible(false);
				
				if (textField.getText().equals(""))
					nullLabel.setVisible(true);
				
				else if (textField.getText().matches("[0-9]*")) {
					count = Integer.parseInt(textField.getText());
					if (count > 0 && count <= Map.localesSize) {
						MapGoloso mapGoloso = new MapGoloso (count);
						mapGoloso.setVisible(true);
						dispose();											
					}
					else
						regexLabel.setVisible(true);
				}
				else
					regexLabel.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Ebrima", Font.BOLD, 14));
		btnNewButton.setBounds(284, 243, 138, 36);
		contentPane.add(btnNewButton);
	}
}
