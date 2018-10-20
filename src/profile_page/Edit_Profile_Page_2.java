package profile_page;

import registration.RegistrationVariable;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import loginPage.LoginVariable;

public class Edit_Profile_Page_2 extends JFrame {
	
	private static LoginVariable LoginVariableObject = new LoginVariable();

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField institutionNameTextField;
	private JTextField emailTextField;
	private JTextField phoneNumberTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit_Profile_Page_2 frame = new Edit_Profile_Page_2();
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
	public Edit_Profile_Page_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("Name");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		JLabel label_1 = new JLabel("Institution Name");
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		JLabel label_2 = new JLabel("Email");
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		JLabel label_3 = new JLabel("Phone Number");
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		nameTextField = new JTextField(LoginVariableObject.loginName);
		nameTextField.setHorizontalAlignment(SwingConstants.LEFT);
		nameTextField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		nameTextField.setColumns(10);
		
		institutionNameTextField = new JTextField(LoginVariableObject.loginInstitution);
		institutionNameTextField.setHorizontalAlignment(SwingConstants.LEFT);
		institutionNameTextField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		institutionNameTextField.setColumns(10);
		
		emailTextField = new JTextField(LoginVariableObject.loginEmail);
		emailTextField.setHorizontalAlignment(SwingConstants.LEFT);
		emailTextField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		emailTextField.setColumns(10);
		
		phoneNumberTextField = new JTextField(LoginVariableObject.loginPhone_number);
		phoneNumberTextField.setHorizontalAlignment(SwingConstants.LEFT);
		phoneNumberTextField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		phoneNumberTextField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginVariableObject.loginName=nameTextField.getText();
				LoginVariableObject.loginInstitution=institutionNameTextField.getText();
				LoginVariableObject.loginPhone_number=phoneNumberTextField.getText();
				LoginVariableObject.loginEmail=emailTextField.getText();
                                
                                SaveEditProfile SaveEditProfileObject = new SaveEditProfile();
                                SaveEditProfileObject.update();
                                
				Profile_page_1 Profile_page_1Object = new Profile_page_1();
				Profile_page_1Object.setVisible(true);
				dispose();
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
						.addComponent(institutionNameTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
						.addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
						.addComponent(phoneNumberTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(343, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(institutionNameTextField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(phoneNumberTextField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
