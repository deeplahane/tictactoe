package com.game;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToeApp {

	private JFrame frame;
	private int xCount1=0;
	private int oCount1=0;
	private JTextField xCount;
	private JTextField oCount;
	private String startGame="X";
	private int b1=10;
	private int b2=10;
	private int b3=10;
	private int b4=10;
	private int b5=10;
	private int b6=10;
	private int b7=10;
	private int b8=10;
	private int b9=10;
	private int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeApp window = new TicTacToeApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToeApp() {
		initialize();
	}
	
	private void choosePlayer() {
		if(startGame.equalsIgnoreCase("X")) {
			startGame="O";
		}else {
			startGame="X";
		}
	}
	
	private void winningGame() {
		
		if((b1==1 && b2==1 && b3==1) ||
		   (b4==1 && b5==1 && b6==1) ||
		   (b7==1 && b8==1 && b9==1) ||
		   (b1==1 && b4==1 && b7==1) ||
		   (b2==1 && b5==1 && b8==1) ||
		   (b3==1 && b6==1 && b9==1) ||
		   (b1==1 && b5==1 && b9==1) ||
		   (b3==1 && b5==1 && b7==1) ) {
			JOptionPane.showMessageDialog(frame,"Player X Has Won","Winner",JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		
		if((b1==0 && b2==0 && b3==0) ||
		   (b4==0 && b5==0 && b6==0) ||
   	       (b7==0 && b8==0 && b9==0) ||
		   (b1==0 && b4==0 && b7==0) ||
		   (b2==0 && b5==0 && b8==0) ||
		   (b3==0 && b6==0 && b9==0) ||
		   (b1==0 && b5==0 && b9==0) ||
		   (b3==0 && b5==0 && b7==0) ) {
					JOptionPane.showMessageDialog(frame,"Player O Has Won","Winner",JOptionPane.INFORMATION_MESSAGE);
					oCount1++;
					oCount.setText(String.valueOf(oCount1));
		}
		if(i==9) {
			JOptionPane.showMessageDialog(frame,"No One Has Won","Tic tac Toe",JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					b1=1;
					i++;
				}else {
					b1=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 70));
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					b2=1;
					i++;
				}else {
					b2=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 70));
		panel_3.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					b3=1;
					i++;
				}else {
					b3=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 70));
		panel_9.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_3 = new JButton("Player X");
		btnNewButton_3.setBackground(new Color(241, 241, 241));
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 18));
		panel_2.add(btnNewButton_3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton xCount = new JButton("0");
		xCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		xCount.setBackground(new Color(255, 255, 255));
		xCount.setFont(new Font("Arial", Font.BOLD, 35));
		panel_4.add(xCount, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					b4=1;
					i++;
				}else {
					b4=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 70));
		panel_5.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					b5=1;
					i++;
				}else {
					b5=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 70));
		panel_6.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					b6=1;
					i++;
				}else {
					b6=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 70));
		panel_7.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_8 = new JButton("Player Y");
		btnNewButton_8.setBackground(new Color(241, 241, 241));
		btnNewButton_8.setFont(new Font("Arial", Font.BOLD, 18));
		panel_8.add(btnNewButton_8, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JButton oCount = new JButton("0");
		oCount.setBackground(new Color(255, 255, 255));
		oCount.setFont(new Font("Arial", Font.BOLD, 35));
		panel_10.add(oCount, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					b7=1;
					i++;
				}else {
					b7=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 70));
		panel_12.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					b8=1;
					i++;
				}else {
					b8=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 70));
		panel_11.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					b9=1;
					i++;
				}else {
					b9=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 70));
		panel_13.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				b1=10;
				b2=10;
				b3=10;
				b4=10;
				b5=10;
				b6=10;
				b7=10;
				b8=10;
				b9=10;
				i=0;
			}
		});
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(128, 128, 192));
		btnReset.setFont(new Font("Arial", Font.BOLD, 20));
		panel_14.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Are You Sure You Want To Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(234, 23, 77));
		btnExit.setFont(new Font("Arial", Font.BOLD, 20));
		panel_15.add(btnExit, BorderLayout.CENTER);
	}

}
