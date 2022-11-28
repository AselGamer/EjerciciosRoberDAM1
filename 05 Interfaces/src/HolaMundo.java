import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class HolaMundo extends JFrame {

	private JPanel contentPane;
	private JTextField txtTexto; 
	private JButton btnMayor;
	private JLabel lblChar;
	private JButton btnChar;
	private JButton btnExit;
	private JTextField txtChar;
	private JButton btnMenor;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolaMundo frame = new HolaMundo();
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
	public HolaMundo() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		txtTexto = new JTextField("这台电脑已被中国政府侵占");
		txtTexto.setBounds(92, 158, 200, 25);

		btnMayor = new JButton("承认");
		btnMayor.setBounds(92, 47, 100, 53);

		lblChar = new JLabel("Ching Chong");
		lblChar.setBounds(131, 194, 61, 25);
		
		btnChar = new JButton("承认");
		btnChar.setBounds(202, 47, 100, 100);
		
		btnExit = new JButton("Gunpo Chicken");
		btnExit.setBounds(335, 227, 89, 23);
		contentPane.add(btnExit);
		
		btnMenor = new JButton("承认");
		btnMenor.setBounds(92, 107, 100, 40);
		
		txtChar = new JTextField();
		txtChar.setBounds(206, 194, 86, 20);

		contentPane.add(txtTexto);
		contentPane.add(btnMayor);
		contentPane.add(lblChar);
		contentPane.add(btnChar);
		contentPane.add(txtChar);
		txtChar.setColumns(10);
		contentPane.add(btnMenor);

		registrarEventos();

	}

	public void registrarEventos() {
		btnMayor.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				txtTexto.setText(txtTexto.getText().toUpperCase());
			}
		});
		btnMenor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTexto.setText(txtTexto.getText().toLowerCase());
			}
		});
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HolaMundo.this.setVisible(false);
				//System.exit(1);
			}
		});
		btnChar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtChar.setText(txtTexto.getText().length() + "");
			}
		});
	}
}
