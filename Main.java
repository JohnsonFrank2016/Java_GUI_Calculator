import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textbox;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton delkey;
	private JLabel lable1;
	private JLabel lable2;
	private double tb;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Java_Calculator");
		setBounds(100, 100, 510, 729);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		// ----------------------------------------------------------------------------TextBox
		textbox = new JTextField();
		textbox.setEditable(false);
		textbox.setHorizontalAlignment(SwingConstants.TRAILING);
		textbox.setColumns(10);
		textbox.setFont(new Font("Arial", Font.BOLD, 80));
		textbox.setText("0");
		// ----------------------------------------------------------------------------KeyAdapter
		textbox.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				char chr = e.getKeyChar();
				int num = (int) chr;
				// textbox.setText(String.valueOf(num));
				if (num >= 48 && num <= 57)// num
					enterNum(String.valueOf(num - 48));
				else if (num == 8)// backspace
					delNum();
				else if (num == 43)// '+'
					arithmetic(1);
				else if (num == 45)// '-'
					arithmetic(2);
				else if (num == 42)// '*'
					arithmetic(3);
				else if (num == 47)// '/'
					arithmetic(4);
				else if (num == 46)// '.'
					point();
				else if (num == 61 || num == 10)// '='key'Enter'
					equal();
				else if (num == 96)// '+/-',key'`'
					negativeNum();
				else if (num == 32)// 'AC',key'space'
					cleanAll();
				else if (num == 27)
					System.exit(0);
			}
		});
		// ----------------------------------------------------------------------------Lable
		lable1 = new JLabel("0");
		lable1.setHorizontalAlignment(SwingConstants.TRAILING);
		lable1.setFont(new Font("Arial", Font.BOLD, 25));
		lable2 = new JLabel(".");
		lable2.setHorizontalAlignment(SwingConstants.CENTER);
		lable2.setFont(new Font("Arial", Font.BOLD, 25));
		lable2.setBorder(BorderFactory.createLineBorder(Color.black));
		// ----------------------------------------------------------------------------Button
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equal();
			}
		});
		equal.setFont(new Font("Arial", Font.BOLD, 70));

		button1 = new JButton("+");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic(1);
			}
		});
		button1.setFont(new Font("Arial", Font.BOLD, 50));
		button2 = new JButton("-");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic(2);
			}
		});
		button2.setFont(new Font("Arial", Font.BOLD, 50));
		button3 = new JButton("*");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic(3);
			}
		});
		button3.setFont(new Font("Arial", Font.BOLD, 50));
		button4 = new JButton("/");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic(4);
			}
		});
		button4.setFont(new Font("Arial", Font.BOLD, 50));
		delkey = new JButton("Del");
		delkey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delNum();
			}
		});
		delkey.setFont(new Font("Arial", Font.BOLD, 50));

		JButton buttonNum_1 = new JButton("1");
		buttonNum_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum("1");
			}
		});
		buttonNum_1.setFont(new Font("Arial", Font.BOLD, 60));

		JButton buttonNum_2 = new JButton("2");
		buttonNum_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum("2");
			}
		});
		buttonNum_2.setFont(new Font("Arial", Font.BOLD, 60));

		JButton buttonNum_3 = new JButton("3");
		buttonNum_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum("3");
			}
		});
		buttonNum_3.setFont(new Font("Arial", Font.BOLD, 60));

		JButton buttonNum_4 = new JButton("4");
		buttonNum_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum("4");
			}
		});
		buttonNum_4.setFont(new Font("Arial", Font.BOLD, 60));

		JButton buttonNum_5 = new JButton("5");
		buttonNum_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum("5");
			}
		});
		buttonNum_5.setFont(new Font("Arial", Font.BOLD, 60));

		JButton buttonNum_6 = new JButton("6");
		buttonNum_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum("6");
			}
		});
		buttonNum_6.setFont(new Font("Arial", Font.BOLD, 60));

		JButton buttonNum_7 = new JButton("7");
		buttonNum_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum("7");
			}
		});
		buttonNum_7.setFont(new Font("Arial", Font.BOLD, 60));

		JButton buttonNum_8 = new JButton("8");
		buttonNum_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum("8");
			}
		});
		buttonNum_8.setFont(new Font("Arial", Font.BOLD, 60));

		JButton buttonNum_9 = new JButton("9");
		buttonNum_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum("9");
			}
		});
		buttonNum_9.setFont(new Font("Arial", Font.BOLD, 60));

		JButton buttonNum_0 = new JButton("0");
		buttonNum_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum("0");
			}
		});
		buttonNum_0.setFont(new Font("Arial", Font.BOLD, 60));

		JButton numpn = new JButton("+/-");
		numpn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				negativeNum();
			}
		});
		numpn.setFont(new Font("Arial", Font.BOLD, 45));

		JButton numdp = new JButton(".");
		numdp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				point();
			}
		});
		numdp.setFont(new Font("Arial", Font.BOLD, 45));

		JButton clac = new JButton("AC");
		clac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cleanAll();
			}
		});
		clac.setFont(new Font("Arial", Font.BOLD, 50));
		// ----------------------------------------------------------------------------Setting
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap(12, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lable2, GroupLayout.PREFERRED_SIZE, 29,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(lable1, GroupLayout.PREFERRED_SIZE, 423,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(textbox, 0, 0, Short.MAX_VALUE)
												.addGroup(gl_contentPane.createSequentialGroup()
														.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																.addComponent(clac, GroupLayout.PREFERRED_SIZE, 109,
																		GroupLayout.PREFERRED_SIZE)
																.addGroup(gl_contentPane
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(buttonNum_1,
																				GroupLayout.PREFERRED_SIZE, 109,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(buttonNum_7,
																				GroupLayout.PREFERRED_SIZE, 109,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(buttonNum_4,
																				GroupLayout.PREFERRED_SIZE, 109,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(numpn, GroupLayout.PREFERRED_SIZE,
																				109, GroupLayout.PREFERRED_SIZE)))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(gl_contentPane
																.createParallelGroup(Alignment.TRAILING, false)
																.addGroup(gl_contentPane
																		.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_contentPane
																				.createParallelGroup(Alignment.TRAILING)
																				.addGroup(gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(gl_contentPane
																								.createSequentialGroup()
																								.addComponent(
																										buttonNum_2,
																										GroupLayout.PREFERRED_SIZE,
																										109,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										buttonNum_3,
																										GroupLayout.PREFERRED_SIZE,
																										109,
																										GroupLayout.PREFERRED_SIZE))
																						.addGroup(gl_contentPane
																								.createSequentialGroup()
																								.addComponent(
																										buttonNum_8,
																										GroupLayout.PREFERRED_SIZE,
																										109,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										buttonNum_9,
																										GroupLayout.PREFERRED_SIZE,
																										109,
																										GroupLayout.PREFERRED_SIZE)))
																				.addGroup(gl_contentPane
																						.createSequentialGroup()
																						.addComponent(buttonNum_5,
																								GroupLayout.PREFERRED_SIZE,
																								109,
																								GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								ComponentPlacement.RELATED)
																						.addComponent(buttonNum_6,
																								GroupLayout.PREFERRED_SIZE,
																								109,
																								GroupLayout.PREFERRED_SIZE)))
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addComponent(buttonNum_0,
																						GroupLayout.PREFERRED_SIZE, 109,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addComponent(numdp,
																						GroupLayout.PREFERRED_SIZE, 109,
																						GroupLayout.PREFERRED_SIZE)))
																.addComponent(equal, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(gl_contentPane
																.createParallelGroup(Alignment.LEADING, false)
																.addComponent(button3, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(button4, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(button1, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(delkey, GroupLayout.DEFAULT_SIZE, 119,
																		Short.MAX_VALUE)
																.addComponent(button2, GroupLayout.DEFAULT_SIZE, 109,
																		Short.MAX_VALUE)))))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lable1)
										.addComponent(lable2, GroupLayout.PREFERRED_SIZE, 30,
												GroupLayout.PREFERRED_SIZE))
								.addGap(10)
								.addComponent(textbox, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(buttonNum_7, GroupLayout.PREFERRED_SIZE, 99,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(buttonNum_8, GroupLayout.PREFERRED_SIZE, 99,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(buttonNum_9, GroupLayout.PREFERRED_SIZE, 99,
														GroupLayout.PREFERRED_SIZE))
										.addComponent(delkey, GroupLayout.PREFERRED_SIZE, 99,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(buttonNum_6, GroupLayout.PREFERRED_SIZE, 99,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(buttonNum_5, GroupLayout.PREFERRED_SIZE, 99,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(buttonNum_4, GroupLayout.PREFERRED_SIZE, 99,
														GroupLayout.PREFERRED_SIZE))
										.addComponent(button1, GroupLayout.PREFERRED_SIZE, 99,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(buttonNum_1, GroupLayout.PREFERRED_SIZE, 99,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(buttonNum_3, GroupLayout.PREFERRED_SIZE, 99,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(buttonNum_2, GroupLayout.PREFERRED_SIZE, 99,
														GroupLayout.PREFERRED_SIZE))
										.addComponent(button2, GroupLayout.PREFERRED_SIZE, 99,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(numpn, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(numdp, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(buttonNum_0, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														99, Short.MAX_VALUE))
										.addComponent(button3, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(equal, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addComponent(button4, GroupLayout.PREFERRED_SIZE, 99,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(clac, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
								.addGap(16)));
		contentPane.setLayout(gl_contentPane);
	}

	public void cleanAll() {
		textbox.setText("0");
		lable1.setText("0");
		lable2.setText(".");
	}

	public int delNum() {
		String str = textbox.getText();
		if (str.equals("ERROR!") || str.equals("0.")) {
			cleanAll();
			return 0;
		}
		if ((str.indexOf("-") > -1 && str.length() == 2) || str.length() == 1) {
			textbox.setText("0");
			return 0;
		}
		textbox.setText(textbox.getText().substring(0, textbox.getText().length() - 1));
		return 0;
	}

	public int negativeNum() {
		String str = textbox.getText();
		if (str.length() > 9)
			return 0;
		if (str.equals("ERROR!") || str.equals("0"))
			return 0;
		if (str.indexOf("-") == 0) {
			textbox.setText(str.substring(1));
			return 0;
		}
		textbox.setText("-" + str);
		return 0;
	}

	public int point() {
		String str = textbox.getText();
		if (textbox.getText().length() > 9)
			return 0;
		if (str.indexOf(".") > 0)
			return 0;
		if (str.equals("ERROR!"))
			return 0;
		textbox.setText(str + ".");
		return 0;
	}

	public int enterNum(String num) {
		if (textbox.getText().length() > 8) {
			return 0;
		}
		if (textbox.getText().equals("0")) {
			textbox.setText(num);
			return 0;
		} else if (textbox.getText().equals("ERROR!")) {
			lable1.setText("0");
			textbox.setText(num);
			return 0;
		}
		textbox.setText(textbox.getText() + num);
		return 0;
	}

	public int arithmetic(int ar) {
		if (textbox.getText().equals("ERROR!"))
			return 0;
		if (ar == 1) {
			lable2.setText("+");
			lable1.setText(textbox.getText());
			textbox.setText("0");
		} else if (ar == 2) {
			lable2.setText("-");
			lable1.setText(textbox.getText());
			textbox.setText("0");
		} else if (ar == 3) {
			lable2.setText("*");
			lable1.setText(textbox.getText());
			textbox.setText("0");
		} else if (ar == 4) {
			lable2.setText("/");
			lable1.setText(textbox.getText());
			textbox.setText("0");
		}
		return 0;
	}

	public int equal() {
		String ar = lable2.getText();
		if (textbox.getText().equals("ERROR!"))
			return 0;
		if (lable1.getText().indexOf("=") > -1) {
			lable1.setText(textbox.getText());
			textbox.setText(String.valueOf(tb));
			return 0;
		}
		tb = Double.valueOf(textbox.getText());
		double lb = Double.valueOf(lable1.getText());
		double sum = 0;
		if (ar.equals(".")) {
			return 0;
		} else if (ar.equals("+")) {
			sum = lb + tb;
			ar = String.valueOf(lb + " + " + tb + " = ");
		} else if (ar.equals("-")) {
			sum = lb - tb;
			ar = String.valueOf(lb + " - " + tb + " = ");
		} else if (ar.equals("*")) {
			sum = lb * tb;
			ar = String.valueOf(lb + " * " + tb + " = ");
		} else if (ar.equals("/")) {
			if (tb == 0) {
				textbox.setText("ERROR!");
				lable1.setText(lb + " / 0 = Error!");
				return 0;
			}
			sum = lb / tb;
			ar = String.valueOf(lb + " / " + tb + " = ");
		}
		String temp = String.valueOf(sum);
		int size = temp.length() - 2;
		if (temp.substring(size).equals(".0"))
			temp = temp.substring(0, size);
		textbox.setText(temp);
		lable1.setText(ar);
		return 0;
	}
}