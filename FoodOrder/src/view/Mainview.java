package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.OrderController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainview extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtChickenRice;
	private JTextField txtPorkRice;
	private JTextField txtVegRice;
	private JTextArea txtResultArea;
	private ButtonGroup extraGroup = new ButtonGroup();
	private JButton btnAddChicken;
	private JButton btnAddPork;
	private JButton btnAddVeg;
	private JButton btnMinusChicken;
	private JButton btnMinusPork;
	private JButton btnMinusVeg;
	private JButton btnClear;
	private JButton btnConfirm;
	private JButton btnPrint;
	private JButton btnExit;
	private JRadioButton rdbtnDisposable;
	private JRadioButton rdbtnRadish;
	private JRadioButton rdbtnSoup;
	private JRadioButton rdbtnDineIn;
	private JRadioButton rdbtnTakeOut;
	private JLabel lblTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            Mainview view = new Mainview();
	            OrderController controller = new OrderController(view);
	            controller.startClock();
	            view.setVisible(true);
	        }
	    });
	}

	/**
	 * Create the frame.
	 */
	public Mainview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("北車小館");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 30));
		lblNewLabel.setBounds(295, 10, 128, 54);
		contentPane.add(lblNewLabel);
		
		JPanel button_panel = new JPanel();
		button_panel.setBounds(34, 104, 305, 152);
		contentPane.add(button_panel);
		button_panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("雞腿飯120");
		lblNewLabel_1.setBounds(10, 25, 64, 15);
		button_panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("排骨飯100");
		lblNewLabel_1_1.setBounds(10, 72, 64, 15);
		button_panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("菜飯80");
		lblNewLabel_1_2.setBounds(10, 117, 64, 15);
		button_panel.add(lblNewLabel_1_2);
		
		btnMinusChicken = new JButton("-");
		btnMinusChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinusChicken.setBounds(94, 21, 46, 23);
		button_panel.add(btnMinusChicken);
		
		btnMinusPork = new JButton("-");
		btnMinusPork.setBounds(94, 68, 46, 23);
		button_panel.add(btnMinusPork);
		
		btnMinusVeg = new JButton("-");
		btnMinusVeg.setBounds(94, 113, 46, 23);
		button_panel.add(btnMinusVeg);
		
		btnAddChicken = new JButton("+");
		btnAddChicken.setBounds(233, 21, 46, 23);
		button_panel.add(btnAddChicken);
		
		btnAddPork = new JButton("+");
		btnAddPork.setBounds(233, 68, 46, 23); 
		button_panel.add(btnAddPork);
		
		btnAddVeg = new JButton("+");
		btnAddVeg.setBounds(233, 113, 46, 23);
		button_panel.add(btnAddVeg);
		
		txtChickenRice = new JTextField();
		txtChickenRice.setBounds(165, 22, 46, 21);
		button_panel.add(txtChickenRice);
		txtChickenRice.setColumns(10);
		txtChickenRice.setText("0");
		txtChickenRice.setEditable(false);
		txtChickenRice.setHorizontalAlignment(JTextField.CENTER);
		
		txtPorkRice = new JTextField();
		txtPorkRice.setColumns(10);
		txtPorkRice.setBounds(165, 69, 46, 21);
		button_panel.add(txtPorkRice);
		txtPorkRice.setText("0");
		txtPorkRice.setEditable(false);
		txtPorkRice.setHorizontalAlignment(JTextField.CENTER);
		
		txtVegRice = new JTextField();
		txtVegRice.setColumns(10);
		txtVegRice.setBounds(165, 114, 46, 21);
		button_panel.add(txtVegRice);
		txtVegRice.setText("0");
		txtVegRice.setEditable(false);
		txtVegRice.setHorizontalAlignment(JTextField.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 275, 305, 178);
		contentPane.add(panel);
		panel.setLayout(null);
		
		rdbtnDisposable = new JRadioButton("");
		rdbtnDisposable.setBounds(104, 28, 26, 23);
		panel.add(rdbtnDisposable);
		
		rdbtnRadish = new JRadioButton("");
		rdbtnRadish.setBounds(104, 75, 26, 23);
		panel.add(rdbtnRadish);
		
		rdbtnSoup = new JRadioButton("");
		rdbtnSoup.setBounds(104, 122, 26, 23);
		panel.add(rdbtnSoup);
		
		rdbtnDineIn = new JRadioButton("");
		extraGroup.add(rdbtnDineIn);
		rdbtnDineIn.setBounds(249, 27, 26, 23);
		panel.add(rdbtnDineIn);
		
		rdbtnTakeOut = new JRadioButton("");
		extraGroup.add(rdbtnTakeOut);
		rdbtnTakeOut.setBounds(249, 76, 26, 23);
		panel.add(rdbtnTakeOut);
		
		JLabel lblNewLabel_2 = new JLabel("一次性餐具");
		lblNewLabel_2.setBounds(20, 28, 78, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("辣蘿蔔");
		lblNewLabel_2_1.setBounds(20, 75, 57, 23);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("例湯");
		lblNewLabel_2_2.setBounds(20, 122, 57, 23);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("內用");
		lblNewLabel_2_3.setBounds(161, 28, 57, 23);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("外帶");
		lblNewLabel_2_4.setBounds(161, 75, 57, 23);
		panel.add(lblNewLabel_2_4);
		
		btnClear = new JButton("清除");
		btnClear.setBounds(55, 473, 87, 23);
		contentPane.add(btnClear);
		
		btnConfirm = new JButton("確定");
		btnConfirm.setBounds(217, 473, 87, 23);
		contentPane.add(btnConfirm);
		
		btnPrint = new JButton("列印");
		btnPrint.setBounds(401, 473, 87, 23);
		contentPane.add(btnPrint);
		
		btnExit = new JButton("離開");
		btnExit.setBounds(555, 473, 87, 23);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel_3 = new JLabel("滿500享9折優惠");
		lblNewLabel_3.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_3.setBounds(344, 102, 144, 35);
		contentPane.add(lblNewLabel_3);
		
		txtResultArea = new JTextArea();
		txtResultArea.setBounds(349, 147, 313, 307);
		contentPane.add(txtResultArea);
		txtResultArea.setColumns(10);
		
		lblTime = new JLabel("New label");
		lblTime.setBounds(482, 104, 191, 33);
		contentPane.add(lblTime);

	}

	public void setTime(String time) {
	    lblTime.setText(time);
	}
	
	public JTextArea getTxtResultArea() {
		return txtResultArea;
	}
	
	public JTextField getTxtChickenRice() {
		return txtChickenRice;
	}


	public JTextField getTxtPorkRice() {
		return txtPorkRice;
	}


	public JTextField getTxtVegRice() {
		return txtVegRice;
	}
	
	public JButton getBtnAddChicken() {
		return btnAddChicken;
	}

	public JButton getBtnAddPork() {
		return btnAddPork;
	}


	public JButton getBtnAddVeg() {
		return btnAddVeg;
	}


	public JButton getBtnMinusChicken() {
		return btnMinusChicken;
	}


	public JButton getBtnMinusPork() {
		return btnMinusPork;
	}


	public JButton getBtnMinusVeg() {
		return btnMinusVeg;
	}
	
	public JButton getBtnClear() {
		return btnClear;
	}
	
	public JButton getBtnConfirm() {
		return btnConfirm;
	}
	
	public JButton getBtnPrint() {
		return btnPrint;
	}
	
	public JButton getBtnExit() {
		return btnExit;
	}
	
	public JRadioButton getRdbtnDisposable() {return rdbtnDisposable;}
	public JRadioButton getRdbtnRadish() {return rdbtnRadish;}
	public JRadioButton getRdbtnSoup() {return rdbtnSoup;}
	
	public JRadioButton getRdbtnDineIn() {return rdbtnDineIn;}
	public JRadioButton getRdbtnTakeOut() {return rdbtnTakeOut;}
	
	public ButtonGroup getExtraGroup() {return extraGroup;}
}
			
			
