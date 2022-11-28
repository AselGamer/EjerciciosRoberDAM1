import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

public class TresEnRaya extends JFrame {

	private JPanel contentPane;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JLabel lblJ1;
	private JButton btn4;
	private JButton btnColorJ1;
	private JButton btn5;
	private JButton btn6;
	private JLabel lblj2;
	private JButton btnColorJ2;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnNuevaPartida;
	private JButton btnSalir;
	private boolean turno;
	private boolean partida = false;
	private JButton[] arrayFichas;
	private JButton[] arrayGanador = new JButton[3];
	private int numFichas;
	private Timer reloj;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TresEnRaya frame = new TresEnRaya();
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
	public TresEnRaya() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 480, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 5, 0, 0));

		btn1 = new JButton("");
		contentPane.add(btn1);

		btn2 = new JButton("");
		contentPane.add(btn2);

		btn3 = new JButton("");
		contentPane.add(btn3);

		lblJ1 = new JLabel("Jugador1:");
		contentPane.add(lblJ1);

		btnColorJ1 = new JButton("");
		btnColorJ1.setBackground(new Color(255, 0, 0));
		contentPane.add(btnColorJ1);

		btn4 = new JButton("");
		contentPane.add(btn4);

		btn5 = new JButton("");
		contentPane.add(btn5);

		btn6 = new JButton("");
		contentPane.add(btn6);

		lblj2 = new JLabel("Jugador2:");
		contentPane.add(lblj2);

		btnColorJ2 = new JButton("");
		btnColorJ2.setBackground(new Color(0, 0, 255));
		contentPane.add(btnColorJ2);

		btn7 = new JButton("");
		contentPane.add(btn7);

		btn8 = new JButton("");
		contentPane.add(btn8);

		btn9 = new JButton("");
		contentPane.add(btn9);

		btnNuevaPartida = new JButton("NuevaPartida");
		contentPane.add(btnNuevaPartida);

		btnSalir = new JButton("Salir");
		contentPane.add(btnSalir);


		inicializar();
		registrarEventos();
	}

	private boolean compTablero() {
		for (int i = 0; i < 3; i++) {
			if(arrayFichas[i*3].getBackground() == arrayFichas[i*3+1].getBackground() &&
					arrayFichas[i*3].getBackground() == arrayFichas[i*3+2].getBackground() && 
					arrayFichas[i*3].getBackground() != btnSalir.getBackground()) {
				arrayGanador[0] = arrayFichas[i*3];
				arrayGanador[1] = arrayFichas[i*3+1];
				arrayGanador[2] = arrayFichas[i*3+2];
				return true;
			}
			if(arrayFichas[i].getBackground() == arrayFichas[i+3].getBackground() && 
					arrayFichas[i].getBackground() == arrayFichas[i+6].getBackground() && 
					arrayFichas[i].getBackground() != btnSalir.getBackground()) {
				arrayGanador[0] = arrayFichas[i];
				arrayGanador[1] = arrayFichas[i+3];
				arrayGanador[2] = arrayFichas[i+6];
				return true;
			}
			if(i == 0) {
				if (arrayFichas[i].getBackground() == arrayFichas[i+4].getBackground() && 
						arrayFichas[i].getBackground() == arrayFichas[i+4*2].getBackground() && 
						arrayFichas[i].getBackground() != btnSalir.getBackground()) {
					arrayGanador[0] = arrayFichas[i];
					arrayGanador[1] = arrayFichas[i+4];
					arrayGanador[2] = arrayFichas[i+4*2];
					return true;
				} else if (i == 2) { 
					if (arrayFichas[i].getBackground() == arrayFichas[i+2].getBackground() && 
							arrayFichas[i].getBackground() == arrayFichas[i+2*2].getBackground() && 
							arrayFichas[i].getBackground() != btnSalir.getBackground()) {
						arrayGanador[0] = arrayFichas[i];
						arrayGanador[1] = arrayFichas[i+2];
						arrayGanador[2] = arrayFichas[i+2*2];
						return true;
					}
				}
			}
		}
		return false;
	}

	private void resaltarJugada(boolean turno) {
		if (turno == true) {
			lblj2.setForeground(Color.black);
			lblJ1.setForeground(btnColorJ1.getBackground());
			lblj2.setFont(new Font("Arial", Font.PLAIN, 12));
			lblJ1.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 14));
		} else {
			lblJ1.setForeground(Color.black);
			lblj2.setForeground(btnColorJ2.getBackground());
			lblJ1.setFont(new Font("Arial", Font.PLAIN, 12));
			lblj2.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 14));
		}
	}

	private void inicializar() {
		
		
		arrayFichas = new JButton[9];
		arrayFichas[0]=btn1;
		arrayFichas[1]=btn2;
		arrayFichas[2]=btn3;
		arrayFichas[3]=btn4;
		arrayFichas[4]=btn5;
		arrayFichas[5]=btn6;
		arrayFichas[6]=btn7;
		arrayFichas[7]=btn8;
		arrayFichas[8]=btn9;

		numFichas = 0;

		estadoBotones(false);
	}

	private void registrarEventos() {
		for (JButton btn: arrayFichas) {
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (turno) {
						btn.setBackground(btnColorJ1.getBackground());
						numFichas++;
						btn.setEnabled(false);
					} else if (!turno) {
						btn.setBackground(btnColorJ2.getBackground());
						numFichas++;
						btn.setEnabled(false);
					}

					if (numFichas>4) {
						if (compTablero() && turno) {
							JOptionPane.showMessageDialog(TresEnRaya.this, lblJ1.getText() + " ha ganado");
							numFichas = 0;
							btnColorJ2.setEnabled(partida);
							btnColorJ1.setEnabled(partida);
							reloj.start();
							partida = !partida;
							btnNuevaPartida.setEnabled(true);
							turno = false;
							estadoBotones(false);
						} else if (compTablero() && !turno) {
							JOptionPane.showMessageDialog(TresEnRaya.this, lblj2.getText() + " ha ganado");
							numFichas = 0;
							btnColorJ2.setEnabled(partida);
							btnColorJ1.setEnabled(partida);
							reloj.start();
							partida = !partida;
							btnNuevaPartida.setEnabled(true);
							turno = true;
							estadoBotones(false);
						}
					}

					if (numFichas % 9==0 && numFichas != 0) {
						numFichas = 0;
						JOptionPane.showMessageDialog(TresEnRaya.this, "TABLAS.");
						partida = !partida;
						btnNuevaPartida.setEnabled(true);
					}
					turno = !turno;

					resaltarJugada(turno);
				}
			});
			reloj = new Timer(500, new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (turno) {
						if (arrayGanador[0].getBackground() == btnSalir.getBackground()) {
							arrayGanador[0].setBackground(btnColorJ1.getBackground());
							arrayGanador[1].setBackground(btnColorJ1.getBackground());
							arrayGanador[2].setBackground(btnColorJ1.getBackground());
						} else if (arrayGanador[0].getBackground() == btnColorJ1.getBackground()){
							arrayGanador[0].setBackground(null);
							arrayGanador[1].setBackground(null);
							arrayGanador[2].setBackground(null);
						}
					} else {
						if (arrayGanador[0].getBackground() == btnSalir.getBackground()) {
							arrayGanador[0].setBackground(btnColorJ2.getBackground());
							arrayGanador[1].setBackground(btnColorJ2.getBackground());
							arrayGanador[2].setBackground(btnColorJ2.getBackground());
						} else if (arrayGanador[0].getBackground() == btnColorJ2.getBackground()) {
							arrayGanador[0].setBackground(btnSalir.getBackground());
							arrayGanador[1].setBackground(btnSalir.getBackground());
							arrayGanador[2].setBackground(btnSalir.getBackground());
						}
					}
				}
			}
					);
		}


		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String j1, j2;

				j1 = JOptionPane.showInputDialog(TresEnRaya.this, "Introduce Nombre del Jugador1: ");

				if (j1 == null) {
				} else if (!j1.isEmpty()) {
					lblJ1.setText(j1);
				}

				do {
					j2 = JOptionPane.showInputDialog(TresEnRaya.this, "Introduce Nombre del Jugador2: ");

					if (j2==null) {
						break;
					}else if (j2.equals(j1) && !j2.isEmpty()) {
						JOptionPane.showMessageDialog(TresEnRaya.this, "Jugador1 y Jugador2 no pueden compartir nombre");
					}


				}while(j2.equals(j1) && !j2.isEmpty());

				if (j2 == null) {
				} else if (!j2.isEmpty()) {
					lblj2.setText(j2);
				}

				if (!partida) {
					btnColorJ2.setEnabled(partida);
					btnColorJ1.setEnabled(partida);
					partida = true;
					estadoBotones(partida);
					turno = true;
					resaltarJugada(turno);
					btnNuevaPartida.setEnabled(false);
				}
				else {
					estadoBotones(false);
					estadoBotones(true);
					inicializar();
					estadoBotones(true);
				}
				reloj.stop();
			}
		});
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(TresEnRaya.this, "Esta seguro?", "Aviso Salida", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					System.exit(1);
				}
			}
		});
		btnColorJ1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color bg;
				bg = JColorChooser.showDialog(TresEnRaya.this, "Elije color", btnColorJ1.getBackground());
				
				if (bg != null) {
					btnColorJ1.setBackground(bg);
					if (turno) {
						lblJ1.setForeground(bg);
					}
				}
			}
		});
		
		btnColorJ2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color bg;
				bg = JColorChooser.showDialog(TresEnRaya.this, "Elije color", btnColorJ2.getBackground());
				
				if (bg != null) {
					btnColorJ2.setBackground(bg);
					resaltarJugada(!turno);
				}
				if (!turno) {
					lblj2.setForeground(bg);
					resaltarJugada(turno);
				}
			}
		});
		
	}

	private void estadoBotones(boolean estado) {
		for (int i = 0; i < arrayFichas.length; i++) {
			arrayFichas[i].setEnabled(estado);
			arrayFichas[i].setBackground(null);
		}
	}
}
