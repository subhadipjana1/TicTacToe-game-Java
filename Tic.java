import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.Insets;

public class Tic extends JFrame {
	int allow = 0;
	ImageIcon x = new ImageIcon(this.getClass().getResource("Xtr1.png"));
	ImageIcon o = new ImageIcon(this.getClass().getResource("myo1.png"));
	ImageIcon i = new ImageIcon(this.getClass().getResource("img.jpg"));

	ImageIcon x1 = new ImageIcon(this.getClass().getResource("Xtrnot1.png"));
	ImageIcon x2 = new ImageIcon(this.getClass().getResource("Xtrnot2.png"));
	ImageIcon x3 = new ImageIcon(this.getClass().getResource("Xtrnot3.png"));
	ImageIcon x4 = new ImageIcon(this.getClass().getResource("Xtrnot4.png"));

	ImageIcon o1 = new ImageIcon(this.getClass().getResource("myonot1.png"));
	ImageIcon o2 = new ImageIcon(this.getClass().getResource("myonot2.png"));
	ImageIcon o3 = new ImageIcon(this.getClass().getResource("myonot3.png"));
	ImageIcon o4 = new ImageIcon(this.getClass().getResource("myonot4.png"));

	int counter;
	int v = 0;
	static char check1 = '*';
	static char check2 = '*';
	static char check3 = '*';
	static char check4 = '*';
	static char check5 = '*';
	static char check6 = '*';
	static char check7 = '*';
	static char check8 = '*';
	static char check9 = '*';

	JButton b1 = new JButton("");
	JButton b2 = new JButton("");
	JButton b3 = new JButton("");
	JButton b4 = new JButton("");
	JButton b5 = new JButton("");
	JButton b6 = new JButton("");
	JButton b7 = new JButton("");
	JButton b8 = new JButton("");
	JButton b9 = new JButton("");
	JButton play_again = new JButton("AGAIN!");
	JButton ex = new JButton("EXIT");
	JLabel lab1 = new JLabel("HAPPY PLAYING!");
	JTextArea field1 = new JTextArea("X PLAYER");
	JTextArea field2 = new JTextArea("Y PLAYER");

	JFrame jf;

	public static void main(String[] args) {
		new Tic();
	}

	public Tic() {
		jf = new JFrame("TIC_TAC_TOE");
		jf.setSize(300, 350);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.getContentPane().setBackground(Color.yellow);

		ListenForButton ListenForButton1 = new ListenForButton();

		b1.setIcon(i);
		b2.setIcon(i);
		b3.setIcon(i);
		b4.setIcon(i);
		b5.setIcon(i);
		b6.setIcon(i);
		b7.setIcon(i);
		b8.setIcon(i);
		b9.setIcon(i);

		b1.setBounds(60, 55, 60, 60);
		b2.setBounds(120, 55, 60, 60);
		b3.setBounds(180, 55, 60, 60);
		b4.setBounds(60, 115, 60, 60);
		b5.setBounds(120, 115, 60, 60);
		b6.setBounds(180, 115, 60, 60);
		b7.setBounds(60, 175, 60, 60);
		b8.setBounds(120, 175, 60, 60);
		b9.setBounds(180, 175, 60, 60);
		play_again.setBounds(60, 265, 80, 30);
		ex.setBounds(160, 265, 80, 30);
		lab1.setBounds(104, 10, 100, 30);
		field1.setBounds(60, 310, 180, 20);
		field2.setBounds(60, 340, 180, 20);

		b1.addActionListener(ListenForButton1);
		b2.addActionListener(ListenForButton1);
		b3.addActionListener(ListenForButton1);
		b4.addActionListener(ListenForButton1);
		b5.addActionListener(ListenForButton1);
		b6.addActionListener(ListenForButton1);
		b7.addActionListener(ListenForButton1);
		b8.addActionListener(ListenForButton1);
		b9.addActionListener(ListenForButton1);
		play_again.addActionListener(ListenForButton1);
		ex.addActionListener(ListenForButton1);

		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(b4);
		jf.add(b5);
		jf.add(b6);
		jf.add(b7);
		jf.add(b8);
		jf.add(b9);
		jf.add(play_again);
		jf.add(ex);
		jf.add(lab1);
		// jf.add(field1);
		// jf.add(field2);

	}

	private class ListenForButton implements ActionListener {

		public void win_check() {
			if (check1 == 'x' && check2 == 'x' && check3 == 'x') {
				b1.setIcon(x2);
				b2.setIcon(x2);
				b3.setIcon(x2);
				counter = 1;
				info();
			}

			else if (check4 == 'x' && check5 == 'x' && check6 == 'x') {
				b4.setIcon(x2);
				b5.setIcon(x2);
				b6.setIcon(x2);
				counter = 1;
				info();
			}

			else if (check7 == 'x' && check8 == 'x' && check9 == 'x') {
				b7.setIcon(x2);
				b8.setIcon(x2);
				b9.setIcon(x2);
				counter = 1;
				info();
			}

			else if (check1 == 'x' && check4 == 'x' && check7 == 'x') {
				b1.setIcon(x1);
				b4.setIcon(x1);
				b7.setIcon(x1);
				counter = 1;
				info();
			}

			else if (check2 == 'x' && check5 == 'x' && check8 == 'x') {
				b2.setIcon(x1);
				b5.setIcon(x1);
				b8.setIcon(x1);
				counter = 1;
				info();
			}

			else if (check3 == 'x' && check6 == 'x' && check9 == 'x') {
				b3.setIcon(x1);
				b6.setIcon(x1);
				b9.setIcon(x1);
				counter = 1;
				info();
			}

			else if (check1 == 'x' && check5 == 'x' && check9 == 'x') {
				b1.setIcon(x3);
				b5.setIcon(x3);
				b9.setIcon(x3);
				counter = 1;
				info();
			}

			else if (check3 == 'x' && check5 == 'x' && check7 == 'x') {
				b3.setIcon(x4);
				b5.setIcon(x4);
				b7.setIcon(x4);
				counter = 1;
				info();
			}

			else if (check1 == 'o' && check2 == 'o' && check3 == 'o') {
				b1.setIcon(o3);
				b2.setIcon(o3);
				b3.setIcon(o3);
				counter = -1;
				info();
			}

			else if (check4 == 'o' && check5 == 'o' && check6 == 'o') {
				b4.setIcon(o3);
				b5.setIcon(o3);
				b6.setIcon(o3);
				counter = -1;
				info();
			}

			else if (check7 == 'o' && check8 == 'o' && check9 == 'o') {
				b7.setIcon(o3);
				b8.setIcon(o3);
				b9.setIcon(o3);
				counter = -1;
				info();
			}

			else if (check1 == 'o' && check4 == 'o' && check7 == 'o') {
				b1.setIcon(o2);
				b4.setIcon(o2);
				b7.setIcon(o2);
				counter = -1;
				info();
			}

			else if (check2 == 'o' && check5 == 'o' && check8 == 'o') {
				b2.setIcon(o2);
				b5.setIcon(o2);
				b8.setIcon(o2);
				counter = -1;
				info();
			}

			else if (check3 == 'o' && check6 == 'o' && check9 == 'o') {
				b3.setIcon(o2);
				b6.setIcon(o2);
				b9.setIcon(o2);
				counter = -1;
				info();
			}

			else if (check1 == 'o' && check5 == 'o' && check9 == 'o') {
				b1.setIcon(o1);
				b5.setIcon(o1);
				b9.setIcon(o1);
				counter = -1;
				info();
			}

			else if (check3 == 'o' && check5 == 'o' && check7 == 'o') {
				b3.setIcon(x4);
				b5.setIcon(x4);
				b7.setIcon(x4);
				counter = -1;
				info();
			}

			else if (check1 != '*' && check2 != '*' && check3 != '*' && check4 != '*' && check5 != '*' && check6 != '*'
					&& check7 != '*' && check8 != '*' && check9 != '*' && counter != 1 && counter != -1) {
				counter = 0;
				info();
			}

			else {
				if (check1 == 'x') {
					b1.setIcon(x);
					counter = 0;
				} else if (check1 == 'o') {
					b1.setIcon(o);
					counter = 0;
				}

				if (check2 == 'x') {
					b2.setIcon(x);
					counter = 0;
				} else if (check2 == 'o') {
					b2.setIcon(o);
					counter = 0;
				}

				if (check3 == 'x') {
					b3.setIcon(x);
					counter = 0;
				} else if (check3 == 'o') {
					b3.setIcon(o);
					counter = 0;
				}

				if (check4 == 'x') {
					b4.setIcon(x);
					counter = 0;
				} else if (check4 == 'o') {
					b4.setIcon(o);
					counter = 0;
				}

				if (check5 == 'x') {
					b5.setIcon(x);
					counter = 0;
				} else if (check5 == 'o') {
					b5.setIcon(o);
					counter = 0;
				}

				if (check6 == 'x') {
					b6.setIcon(x);
					counter = 0;
				} else if (check6 == 'o') {
					b6.setIcon(o);
					counter = 0;
				}

				if (check7 == 'x') {
					b7.setIcon(x);
					counter = 0;
				} else if (check7 == 'o') {
					b7.setIcon(o);
					counter = 0;
				}

				if (check8 == 'x') {
					b8.setIcon(x);
					counter = 0;
				} else if (check8 == 'o') {
					b8.setIcon(o);
					counter = 0;
				}

				if (check9 == 'x') {
					b9.setIcon(x);
					counter = 0;
				} else if (check9 == 'o') {
					b9.setIcon(o);
					counter = 0;
				}

			}

		}

		public void info() {
			if (counter == 1) {
			}

			else if (counter == -1) {
			} else {
				JOptionPane.showMessageDialog(null, "A DRAW!!", "RESULT", JOptionPane.INFORMATION_MESSAGE);
			}

		}

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == play_again) {
				b1.setIcon(i);
				b2.setIcon(i);
				b3.setIcon(i);
				b4.setIcon(i);
				b5.setIcon(i);
				b6.setIcon(i);
				b7.setIcon(i);
				b8.setIcon(i);
				b9.setIcon(i);
				check1 = '*';
				check2 = '*';
				check3 = '*';
				check4 = '*';
				check5 = '*';
				check6 = '*';
				check7 = '*';
				check8 = '*';
				check9 = '*';
				counter = 0;
			}

			if (e.getSource() == ex) {
				System.exit(0);
			}

			if (e.getSource() == b1) {

				v++;
				if (v >= 3) {
					v = 0;
				}
				if (v == 0) {
					b1.setIcon(i);
					check1 = '*';
				} else if (v == 1) {
					b1.setIcon(o);
					check1 = 'o';
				} else if (v == 2) {
					b1.setIcon(x);
					check1 = 'x';
				}
				win_check();
			}

			if (e.getSource() == b2) {
				v++;
				if (v >= 3) {
					v = 0;
				}
				if (v == 0) {
					b2.setIcon(i);
					check2 = '*';
				} else if (v == 1) {
					b2.setIcon(o);
					check2 = 'o';
				} else if (v == 2) {
					b2.setIcon(x);
					check2 = 'x';
				}
				win_check();
			}

			if (e.getSource() == b3) {
				v++;
				if (v >= 3) {
					v = 0;
				}
				if (v == 0) {
					b3.setIcon(i);
					check3 = '*';
				} else if (v == 1) {
					b3.setIcon(o);
					check3 = 'o';
				} else if (v == 2) {
					b3.setIcon(x);
					check3 = 'x';
				}
				win_check();
			}

			if (e.getSource() == b4) {
				v++;
				if (v >= 3) {
					v = 0;
				}
				if (v == 0) {
					b4.setIcon(i);
					check4 = '*';
				} else if (v == 1) {
					b4.setIcon(o);
					check4 = 'o';
				} else if (v == 2) {
					b4.setIcon(x);
					check4 = 'x';
				}
				win_check();
			}

			if (e.getSource() == b5) {
				v++;
				if (v >= 3) {
					v = 0;
				}
				if (v == 0) {
					b5.setIcon(i);
					check5 = '*';
				} else if (v == 1) {
					b5.setIcon(o);
					check5 = 'o';
				} else if (v == 2) {
					b5.setIcon(x);
					check5 = 'x';
				}
				win_check();
			}

			if (e.getSource() == b6) {
				v++;
				if (v >= 3) {
					v = 0;
				}
				if (v == 0) {
					b6.setIcon(i);
					check6 = '*';
				} else if (v == 1) {
					b6.setIcon(o);
					check6 = 'o';
				} else if (v == 2) {
					b6.setIcon(x);
					check6 = 'x';
				}
				win_check();
			}

			if (e.getSource() == b7) {
				v++;
				if (v >= 3) {
					v = 0;
				}
				if (v == 0) {
					b7.setIcon(i);
					check7 = '*';
				} else if (v == 1) {
					b7.setIcon(o);
					check7 = 'o';
				} else if (v == 2) {
					b7.setIcon(x);
					check7 = 'x';
				}
				win_check();
			}

			if (e.getSource() == b8) {
				v++;
				if (v >= 3) {
					v = 0;
				}
				if (v == 0) {
					b8.setIcon(i);
					check8 = '*';
				} else if (v == 1) {
					b8.setIcon(o);
					check8 = 'o';
				} else if (v == 2) {
					b8.setIcon(x);
					check8 = 'x';
				}
				win_check();
			}

			if (e.getSource() == b9) {
				v++;
				if (v >= 3) {
					v = 0;
				}
				if (v == 0) {
					b9.setIcon(i);
					check9 = '*';
				} else if (v == 1) {
					b9.setIcon(o);
					check9 = 'o';
				} else if (v == 2) {
					b9.setIcon(x);
					check9 = 'x';
				}
				win_check();
			}

		}

	}
}
