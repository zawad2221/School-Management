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
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import loginPage.LoginVariable;

public class Profile_page_1 extends JFrame {
	
	private static LoginVariable LoginVariableObject = new LoginVariable();

	private JPanel contentPane;
	private JTextField NameTextField;
	private JTextField institutionNameTextField;
	private JTextField emailTextField;
	private JTextField phoneNumberTextField;
	private JButton btnEditProfile;
	private JLabel lblUserName;
	private JTextField userNameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile_page_1 frame = new Profile_page_1();
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
	public Profile_page_1() {
		setFont(new Font("Dialog", Font.BOLD, 14));
		setAlwaysOnTop(true);
		setTitle("PROFILE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		JLabel lblInstitutionName = new JLabel("Institution Name");
		lblInstitutionName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		NameTextField = new JTextField(LoginVariableObject.loginName);
		NameTextField.setHorizontalAlignment(SwingConstants.LEFT);
		NameTextField.setEditable(false);
		NameTextField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		NameTextField.setColumns(10);
		
		institutionNameTextField = new JTextField(LoginVariableObject.loginInstitution);
		institutionNameTextField.setHorizontalAlignment(SwingConstants.LEFT);
		institutionNameTextField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		institutionNameTextField.setEditable(false);
		institutionNameTextField.setColumns(10);
		
		emailTextField = new JTextField(LoginVariableObject.loginEmail);
		emailTextField.setHorizontalAlignment(SwingConstants.LEFT);
		emailTextField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		emailTextField.setEditable(false);
		emailTextField.setColumns(10);
		
		phoneNumberTextField = new JTextField(LoginVariableObject.loginPhone_number);
		phoneNumberTextField.setHorizontalAlignment(SwingConstants.LEFT);
		phoneNumberTextField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		phoneNumberTextField.setEditable(false);
		phoneNumberTextField.setColumns(10);
		
		btnEditProfile = new JButton("Edit Profile");
		btnEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Edit_Profile_Page_2 Edit_Profile_Page_2Object = new Edit_Profile_Page_2();
				Edit_Profile_Page_2Object.setVisible(true);
				dispose();
			}
		});
		btnEditProfile.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		userNameTextField = new JTextField(LoginVariableObject.loginUser_name);
		userNameTextField.setHorizontalAlignment(SwingConstants.LEFT);
		userNameTextField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		userNameTextField.setEditable(false);
		userNameTextField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblInstitutionName, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
										.addComponent(nameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblEmail, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(18))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblPhoneNumber, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(NameTextField, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
								.addComponent(institutionNameTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
								.addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
								.addComponent(phoneNumberTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblUserName, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(userNameTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnEditProfile, Alignment.TRAILING))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(NameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblInstitutionName, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(institutionNameTextField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(phoneNumberTextField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPhoneNumber, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserName, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(userNameTextField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnEditProfile)
					.addGap(29))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
