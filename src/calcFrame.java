import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//ビッグデシマルインポート
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class calcFrame extends JFrame {
	private JPanel contentPane;
	public BigDecimal firstValue = BigDecimal.valueOf(0);	//最初の値を入れる変数
	public BigDecimal secondValue = BigDecimal.valueOf(0);	//次の値を入れる変数
	public int state;
	public int labelValue;
	public BigDecimal numInt;
	public int opeType; //足し算:1, 引き算:2, 掛け算:3, 割り算:4, 除算:5
	public String firstString;	//表示用に文字変換して入れる変数
	public BigDecimal Dec = BigDecimal.valueOf(10);	//Decimal(少数)に10を代入
	public Boolean decState = false; //少数判定用ステートメント。少数ならTrue(1)を返す。
	public int setN = 20; //配列の長さ
	public int counti = 0; //どのアドレスに入れるかカウント

	public String[] arrayValue = new String[setN]; //計算式を入れる配列
	public BigDecimal[] arrayCalc = new BigDecimal[setN]; // + - のみ計算する配列

	ArrayList<String> numList = new ArrayList<String>();
	private JTextField textField;

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
				firstValue = BigDecimal.valueOf(0);
				secondValue = BigDecimal.valueOf(0);
				firstString = firstValue.toString();
				textField.setText(firstString);
				decState = false;
			}
		});
		btn_clear.setBounds(6, 75, 40, 40);
		contentPane.add(btn_clear);

//		Button equal
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decState = false;
				state = 10;
				func();
			}
		});
		btn_equal.setBounds(131, 238, 40, 40);
		contentPane.add(btn_equal);

//		Button percent
		JButton btn_per = new JButton("%");
		btn_per.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decState = false;
				state = 5;
				func();
			}
		});
		btn_per.setBounds(48, 75, 40, 40);
		contentPane.add(btn_per);

//		Button divide
		JButton btn_divide = new JButton("÷");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decState = false;
				state = 4;
				func();
			}
		});
		btn_divide.setBounds(131, 75, 40, 40);
		contentPane.add(btn_divide);

//		Button multiplication
		JButton btn_multi = new JButton("×");
		btn_multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decState = false;
				state = 3;
				func();
			}
		});
		btn_multi.setBounds(90, 75, 40, 40);
		contentPane.add(btn_multi);



//		Button minus
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decState = false;
				state = 2;
				func();
			}
		});
		btn_minus.setBounds(131, 117, 40, 40);
		contentPane.add(btn_minus);

//		Button delete
		JButton btn_del = new JButton("Del");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decState = false;

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
				decState = true;	//少数ステートをtrueに
			}
		});
		btn_dot.setBounds(48, 238, 40, 40);
		contentPane.add(btn_dot);

//		Button 0
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numInt = BigDecimal.valueOf(0);
				state = 0;
				func();
			}
		});
		btn_0.setBounds(6, 238, 40, 40);
		contentPane.add(btn_0);



//		Button 2
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numInt = BigDecimal.valueOf(2);
				state = 0;
				func();
			}
		});
		btn_2.setBounds(48, 199, 40, 40);
		contentPane.add(btn_2);

//		Button 3
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numInt = BigDecimal.valueOf(3);
				state = 0;
				func();
			}
		});
		btn_3.setBounds(90, 199, 40, 40);
		contentPane.add(btn_3);

//		Button 4
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numInt = BigDecimal.valueOf(4);
				state = 0;
				func();
			}
		});
		btn_4.setBounds(6, 158, 40, 40);
		contentPane.add(btn_4);

//		Button 5
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numInt = BigDecimal.valueOf(5);
				state = 0;
				func();
			}
		});
		btn_5.setBounds(48, 158, 40, 40);
		contentPane.add(btn_5);

//		Button 6
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numInt = BigDecimal.valueOf(6);
				state = 0;
				func();
			}
		});
		btn_6.setBounds(90, 158, 40, 40);
		contentPane.add(btn_6);

//		Button 7
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numInt = BigDecimal.valueOf(7);
				state = 0;
				func();
			}
		});
		btn_7.setBounds(6, 117, 40, 40);
		contentPane.add(btn_7);

//		Button 8
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numInt = BigDecimal.valueOf(8);
				state = 0;
				func();
			}
		});
		btn_8.setBounds(48, 117, 40, 40);
		contentPane.add(btn_8);

//		Button 9
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numInt = BigDecimal.valueOf(9);
				state = 0;
				func();
			}
		});
		btn_9.setBounds(90, 117, 40, 40);
		contentPane.add(btn_9);

//		Button 1
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numInt = BigDecimal.valueOf(1);
				state = 0;
				func();
			}
		});
		btn_1.setBounds(6, 199, 40, 40);
		contentPane.add(btn_1);

//		Button add
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = 1;
				func();
			}
		});
		btn_plus.setBounds(131, 158, 40, 81);
		contentPane.add(btn_plus);

		//textField
		textField = new JTextField();
		textField.setAlignmentX(Component.RIGHT_ALIGNMENT);
		textField.setEnabled(false);
		textField.setBounds(6, 6, 165, 63);
		contentPane.add(textField);
		textField.setColumns(10);
	}

	public void func() {
		int valuei = 0;
		int calci = 0;
		int setMax = 0;
		BigDecimal ash = BigDecimal.valueOf(0);
		if (decState == true) {

			switch(state) {
			//押されたボタンが数字だった場合
					case 0:
						numInt = numInt.divide(Dec);
						firstValue = firstValue.add(numInt);
						firstString = firstValue.toString();
						textField.setText(firstString);
						Dec = Dec.multiply(BigDecimal.valueOf(10));
						break;
					default:
						break;
			}
		} else {
			switch(state) {
			//押されたボタンが数字だった場合
					case 0:
						//firstValue = firstValue.multiply(BigDecimal.valueOf(10)).add(numInt);
						//これが掛け算(multiply)
						firstValue = firstValue.multiply(BigDecimal.valueOf(10));
						//これが足し算(add)
						firstValue = firstValue.add(numInt);
						//表示するためにString型に変換
						firstString = firstValue.toString();
						//ここで表示
						textField.setText(firstString);
						break;
					//押されたボタンが＋の場合
					case 1:
//						if (arrayValue[counti - 1].replace(".","").isDigit() == true)　前回のボタンが演算子なら->＋＋ーみたいにならないようにする
						firstValue = firstValue.add(secondValue);
						arrayValue[counti] = firstValue.toString();
						counti += 1;	//中身カウント
						arrayValue[counti] = "+";	//配列演算子を入れる
						counti += 1;

//						secondValue = firstValue;
						firstValue = BigDecimal.valueOf(0);
						opeType = 1;
						firstString = secondValue.toString();
						textField.setText(firstString);
						break;
					//押されたボタンがーの場合
					case 2:
						firstValue = firstValue.add(secondValue);
						arrayValue[counti] = firstValue.toString();
						counti += 1;	//中身カウント
						arrayValue[counti] = "-";	//配列演算子を入れる
						counti += 1;

						secondValue = firstValue;
						firstValue = BigDecimal.valueOf(0);
						opeType = 2;
						firstString = firstValue.toString();
						textField.setText(firstString);
						break;
					//押されたボタンが*の場合
					case 3:
						firstValue = firstValue.add(secondValue);
						arrayValue[counti] = firstValue.toString();
						counti += 1;	//中身カウント
						arrayValue[counti] = "*";	//配列演算子を入れる
						counti += 1;

						secondValue = firstValue;
						firstValue = BigDecimal.valueOf(0);
						opeType = 3;
						firstString = firstValue.toString();
						textField.setText(firstString);
						break;
					//押されたボタンが÷の場合
					case 4:
						firstValue = firstValue.add(secondValue);
						arrayValue[counti] = firstValue.toString();
						counti += 1;	//中身カウント
						arrayValue[counti] = "/";	//配列演算子を入れる
						counti += 1;

						secondValue = firstValue;
						firstValue = BigDecimal.valueOf(0);
						opeType = 4;
						firstString = firstValue.toString();
						textField.setText(firstString);
						break;
					//押されたボタンが%の場合
					case 5:
						firstValue = firstValue.add(secondValue);
						arrayValue[counti] = firstValue.toString();
						counti += 1;	//中身カウント
						arrayValue[counti] = "rem";	//配列演算子を入れる
						counti += 1;

						secondValue = firstValue;
						firstValue = BigDecimal.valueOf(0);
						opeType = 5;
						firstString = firstValue.toString();
						textField.setText(firstString);
						break;
					case 10:
						arrayValue[counti] = firstValue.toString();
						counti += 1;	//中身カウント
						arrayValue[counti] = "";

						while(arrayValue[valuei] != "") {
							if(arrayValue[valuei] == "+") {
								valuei ++;
							} else if(arrayValue[valuei] == "-") {
								arrayCalc[calci] = new BigDecimal(String.valueOf(arrayValue[valuei + 1])).multiply(BigDecimal.valueOf(-1));
								valuei += 2;
							} else if(arrayValue[valuei] == "*") {
								arrayCalc[calci - 1] = new BigDecimal(String.valueOf(arrayValue[valuei - 1])).multiply(new BigDecimal(String.valueOf(arrayValue[valuei + 1])));
								valuei += 2;
							} else if(arrayValue[valuei] == "/") {
								arrayValue[valuei + 1] = BigDecimal.valueOf(1).divide(new BigDecimal(arrayValue[valuei + 1])).toString(); //分数にして計算 -> 1/3　みたいな
								arrayValue[valuei] = "*";
							} else if(arrayValue[valuei] == "rem") { //[%]が入らない！からremainderで妥協 -> ...cuz少数
								arrayCalc[calci + 1] = new BigDecimal(arrayValue[valuei-1]).remainder(new BigDecimal(String.valueOf(arrayValue[valuei + 1])));
								valuei += 2;
							} else {	//数字のとき
								arrayCalc[calci] = new BigDecimal(String.valueOf(arrayValue[valuei]));
								valuei ++ ;
								calci ++ ;
							}
						}
						setMax = calci - 1;
						calci = 0;
						ash = BigDecimal.valueOf(0);

						while(calci != setMax + 1) {
							System.out.println(arrayCalc[calci].toString());
							ash = ash.add(arrayCalc[calci]);
							calci ++ ;
						}

						textField.setText(ash.toString());
//						switch(opeType) {
//							case 1:
//								firstValue = firstValue.add(secondValue);
//								firstString = firstValue.toString();
//								textField.setText(firstString);
//								break;
//							case 2:
//								firstValue = firstValue.subtract(secondValue);
//								firstString = firstValue.toString();
//								textField.setText(firstString);
//								break;
//							case 3:
//								firstValue = firstValue.multiply(secondValue);
//								firstString = firstValue.toString();
//								textField.setText(firstString);
//								break;
//							case 4:
//								firstValue = firstValue.divide(secondValue);
//								firstString = firstValue.toString();
//								textField.setText(firstString);
//								break;
//							case 5:
//								firstValue = firstValue.remainder(secondValue);
//								firstString = firstValue.toString();
//								textField.setText(firstString);
//								break;
//						}
//						break;
					default:
						break;
				}
			}
		}
	}
