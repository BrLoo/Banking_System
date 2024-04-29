package gui.Teller;

import javax.swing.*;

import main.BankAccount;
import main.TellerGUIClient;

import java.awt.*;
import java.awt.event.*;
import java.util.Map;

public class TellerUserAccount {

	JButton button, button2, addUserButton, deleteUserButton, forgetPasswordButton, changePinButton, button8, button9, button10, button11, backButton;
	JLabel label;
	JFrame frame;
	JPanel panel = null;
	JPanel panel2 = null;
	boolean AccIn = false;
	TellerMainPage tellerMainPage = null;
	TellerGUIClient tellerGUIClient = null;
	int ID;
	
	public TellerUserAccount(TellerMainPage tellerMainPage, int ID) {
		this.tellerMainPage = tellerMainPage;
		this.tellerGUIClient = tellerMainPage.getTellerClient();
		this.ID = ID;
	}


	public TellerGUIClient getTellerGUIClient() {
		return this.tellerGUIClient;
	}
	
	public TellerGUIClient getClient() {
		return this.tellerGUIClient;
	}
	public TellerMainPage getMain() {
		return this.tellerMainPage;
	}
	public TellerUserAccount getUserAcc() {
		return this;

	}

	public TellerUserAccount getTellerUserAccount() {
		return this;
	}
	public void run() {
		frame = new JFrame("Teller(User)");
		Container contentPane = frame.getContentPane(); 
		contentPane.setLayout(new FlowLayout());
		
		button = new JButton("Create Account");
		button2 = new JButton("Delete Account");
		addUserButton = new JButton("Add User");
		deleteUserButton = new JButton("Delete User");
		forgetPasswordButton = new JButton("Forget Password");
		changePinButton = new JButton("Change PIN");
		button8 = new JButton("Transfer Admin");
		button9 = new JButton("Withdraw");
		button10 = new JButton("Deposit");
		button11 = new JButton("Transfer");
		backButton = new JButton("Back");
		JPanel panel = new JPanel();
		/*
		 * Placeholder Comment for Acc list of user to go into textArea
		 */
		JTextArea textArea = new JTextArea("test");
		contentPane.add(textArea);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3, 4));
		panel2.add(button);
		panel2.add(button2);
		panel2.add(addUserButton);
		panel2.add(deleteUserButton);
		panel2.add(forgetPasswordButton);
		panel2.add(changePinButton);
		panel2.add(button8);
		panel2.add(button9);
		panel2.add(button10);
		panel2.add(button11);
		panel2.add(backButton);
		
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.NORTH, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, panel2);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TellerCreateAccount(getUserAcc(), ID).createWindow();;
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert code here
			}
		});

		addUserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert code here
				frame.setVisible(false); // hide current window
				// jump to the TellerSelectAccountPage
				new TellerSelectAccountForAddUserPage(getTellerUserAccount()).go();
			}
		});

		deleteUserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert code here
				// insert code here
				frame.setVisible(false); // hide current window
				// jump to the TellerSelectAccountDelPage
				new TellerSelectAccountForDelUserPage(getTellerUserAccount()).go();
			}
		});


		forgetPasswordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert code here
				frame.setVisible(false);
				new TellerForgetPasswordPage(getTellerUserAccount()).go();
			}
		});

		changePinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert code here
				frame.setVisible(false);
				new TellerSelectAccountForChangePinPage(getTellerUserAccount()).go();
			}
		});

		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert code here
			}
		});

		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert code here
			}
		});

		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert code here
			}
		});

		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert code here
			}
		});
		
		backButton.addActionListener((e) -> {
			frame.setVisible(false); // hide current page
			tellerMainPage.run(); // jump back to TellerMainPage
		});
	}
}