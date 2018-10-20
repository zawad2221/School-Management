package admin;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.*;

import loginPage.LoginVariable;

public class CreateAccount extends JFrame {
    
    private SaveCreatedAccount SaveCreatedAccountObject = new SaveCreatedAccount();
	
	private JButton btnAddFlight;
	public JLabel label[];
	
	private CreatedAcountVariable CreatedAcountVariableObject = new CreatedAcountVariable();
	private static LoginVariable LoginVariableObject = new LoginVariable();
	

    /*public String nazvy[] = {
        "cesnak", "feferony", "hrasok", "cibula",
        "kecup", "tatarskaOmacka", "vajce",
        "kapia", "fazula", "kukurica", "ananas", "brokolica"
        };*/
    //private int[] b= new int[nazvy.length];
	

    JPanel ui= new JPanel(new GridLayout(10,1,4,4));

    //private JCheckBox boxes[];

    public CreateAccount() {
    	
    	
        ui.setBorder(new EmptyBorder(100,100,100,100));//set the border of jframe
        setContentPane(ui);
        //boxes = new JCheckBox[nazvy.length];

        for (int i = 0; i < CreatedAcountVariableObject.numberOfAccount; i++) {
            createrCheckBox(i);

        }
        JLabel labelPassword=new JLabel("Password is by default 1");
        labelPassword.setFont(new Font("Georgia", Font.PLAIN, 15));
        labelPassword.setForeground(new Color(50, 50, 25));
        ui.add(labelPassword, BorderLayout.CENTER);
        
        ui.add(labelPassword);
        
        
        btnAddFlight = new JButton("Back");
        btnAddFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Admin_Home_Page Admin_Home_Page_Object = new Admin_Home_Page();
				Admin_Home_Page_Object.setVisible(true);
				dispose();
			
			}
		});
        btnAddFlight.setBounds(100, 100, 60, 110);
        ui.add(btnAddFlight);

        setTitle("created account");
        pack();
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        
    }

    public void createrCheckBox(int i) {
    	
    	setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(Box.createRigidArea(new Dimension(0, 5)));
        /*boxes[i] = new JCheckBox(nazvy[i]);
        boxes[i].setBorder(new EmptyBorder(0,3,2,0));
        ui.add(boxes[i]);*/
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
        CreatedAcountVariableObject.userName=CreatedAcountVariableObject.userType+"."+dateFormat.format(date)+i;
        String Attendance=CreatedAcountVariableObject.userName;
        SaveCreatedAccountObject.save(Attendance);
        label = new JLabel[CreatedAcountVariableObject.numberOfAccount];
        label[i] = new JLabel(Attendance);
        
        label[i].setFont(new Font("Georgia", Font.PLAIN, 15));
        label[i].setForeground(new Color(50, 50, 25));
        ui.add(label[i], BorderLayout.CENTER);
        ui.setBorder(BorderFactory.createEmptyBorder(50,50,100,100));//set the border of jframe
        setLocationRelativeTo(null);
        ui.add(label[i]);
        
        
        
       /* boxes[i].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b[i]==0)
				{
					b[i]=1;
					//label[i].setText("P");
					System.out.println(i+" "+b[i]);
				}
				else
				{
					b[i]=0;
					//label[i].setText("A");
					System.out.println(i+" "+b[i]);
				}
				
				
				
			}
		});*/
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                JFrame frame = new CreateAccount();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBounds(100, 100, 666, 410);
                frame.setLocationRelativeTo(null);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
