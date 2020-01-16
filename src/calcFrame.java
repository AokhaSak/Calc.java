import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Point;
import java.awt.Font;


public class calcFrame extends JFrame {
	Function func = new Function();
	Getter get = new Getter();
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcFrame frame = new calcFrame();
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
	public calcFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 179, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		=================
//		Functions Section
//		=================
		
//		Button clear
		JButton btn_clear = new JButton("C");
		btn_clear.setForeground(Color.RED);
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_clear.setBounds(6, 75, 40, 40);
		contentPane.add(btn_clear);
		
//		Button equal
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				func.equal();
			}
		});
		btn_equal.setBounds(131, 238, 40, 40);
		contentPane.add(btn_equal);
		
//		Button percent
		JButton btn_per = new JButton("%");
		btn_per.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				func.per();
			}
		});
		btn_per.setBounds(48, 75, 40, 40);
		contentPane.add(btn_per);
		
//		Button divide
		JButton btn_divide = new JButton("÷");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				func.divide();
			}
		});
		btn_divide.setBounds(131, 75, 40, 40);
		contentPane.add(btn_divide);
		
//		Button multiplication
		JButton btn_multi = new JButton("×");
		btn_multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				func.multi();
			}
		});
		btn_multi.setBounds(90, 75, 40, 40);
		contentPane.add(btn_multi);
		
//		Button plus
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				func.sum();
			}
		});
		btn_plus.setBounds(131, 158, 40, 81);
		contentPane.add(btn_plus);
		
//		Button minus
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				func.minus();
			}
		});
		btn_minus.setBounds(131, 117, 40, 40);
		contentPane.add(btn_minus);
		
//		Button delete
		JButton btn_del = new JButton("Del");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_del.setBounds(90, 238, 40, 40);
		contentPane.add(btn_del);
		
//		===============
//		Numbers Section
//		===============
		
//		Button dot
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get.getDot(".");
			}
		});
		btn_dot.setBounds(48, 238, 40, 40);
		contentPane.add(btn_dot);
		
//		Button 0
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get.getValue(0);
			}
		});
		btn_0.setBounds(6, 238, 40, 40);
		contentPane.add(btn_0);
		
//		Button 1 
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get.getValue(1);
			}
		});
		btn_1.setBounds(6, 199, 40, 40);
		contentPane.add(btn_1);
		
//		Button 2
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get.getValue(2);
			}
		});
		btn_2.setBounds(48, 199, 40, 40);
		contentPane.add(btn_2);
		
//		Button 3
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get.getValue(3);
			}
		});
		btn_3.setBounds(90, 199, 40, 40);
		contentPane.add(btn_3);
		
//		Button 4
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get.getValue(4);
			}
		});
		btn_4.setBounds(6, 158, 40, 40);
		contentPane.add(btn_4);
		
//		Button 5
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get.getValue(5);
			}
		});
		btn_5.setBounds(48, 158, 40, 40);
		contentPane.add(btn_5);
		
//		Button 6
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get.getValue(6);
			}
		});
		btn_6.setBounds(90, 158, 40, 40);
		contentPane.add(btn_6);
		
//		Button 7
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get.getValue(7);
			}
		});
		btn_7.setBounds(6, 117, 40, 40);
		contentPane.add(btn_7);
		
//		Button 8
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get.getValue(8);
			}
		});
		btn_8.setBounds(48, 117, 40, 40);
		contentPane.add(btn_8);
		
//		Button 9
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get.getValue(9);
			}
		});
		btn_9.setBounds(90, 117, 40, 40);
		contentPane.add(btn_9);
	
//		Label Display
		JLabel label_display = new JLabel("0");
		label_display.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		label_display.setHorizontalAlignment(SwingConstants.RIGHT);
		label_display.setBorder(new LineBorder(Color.LIGHT_GRAY));
		label_display.setBounds(6, 8, 167, 61);
		contentPane.add(label_display);
//		lblNewLabel.setText(getValue);
		
	}
}
