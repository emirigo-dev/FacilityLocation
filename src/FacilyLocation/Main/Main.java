package FacilyLocation.Main;

import java.awt.EventQueue;

import javax.swing.JFrame;

import FacilyLocation.Interface.Start;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start start = new Start();
					start.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
