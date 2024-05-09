import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

public class Signin extends JFrame implements ActionListener {
	private JPanel backpnl;
	private JButton backbtn, signbtn;
	private JLabel lgntitle, emailtxt, passtxt, signuptxt, acctxt;
	private JTextField emailfield;
	private JPasswordField passfield;
	private Container cont;
	Vector<String> emailregist = new Vector<>();
	Vector<String> passregist = new Vector<>();
	
	public Signin() {	
		setTitle("JP.ID");
		setLayout(new BorderLayout());
		setSize(900, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		login();
		setVisible(true);
	}
	
	public void check(){
		
		String email = emailfield.getText();
		String pass = new String(passfield.getPassword());
		
		
		int flag = 0;
		int flag2 = 0;
		if(email.isEmpty()){
			errMsg("Email must be filled!");
		}
		else if(pass.isEmpty()){
			errMsg("Password must be filled");
		}
		else{
			for(int i = 0; i<emailregist.size();i++){
				if(email.equals(emailregist.elementAt(i))){
					flag = 1;
					flag2 = i;
					break;
				}
			}
			if(flag == 1){
				if(pass.equals(passregist.elementAt(flag2))){
					Home h = new Home();
					h.setVisible(true);
					dispose();
				}
				else{
					errMsg("Wrong Email or Password!");
					
				}
			}
			else{
				errMsg("Email not Found!");
			}
			
		}
	

	}
	
	private void errMsg(String n){
		JOptionPane.showMessageDialog(null, n, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void login(){
	

		backpnl = new RectangleSign("400x300.png");
		backpnl.setLayout(null);

		lgntitle = makeJLabel("Sign in to JP.ID", 30);
		lgntitle.setHorizontalAlignment(JLabel.CENTER);
		lgntitle.setBounds(350, 120, 200, 50);
		
		emailtxt = makeJLabel("Email", 20);
		emailtxt.setBounds(310, 160, 100, 30);
		
		passtxt = makeJLabel("Password", 20);
		passtxt.setBounds(310, 240, 100, 30);
		
		acctxt = makeJLabel("No account?", 20);
		acctxt.setBounds(370, 300, 120, 50);
		signuptxt = new JLabel();
		signuptxt.setText("<html><a href=\"\">Sign Up</a></html>");
		signuptxt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signuptxt.setFont(new Font("Calibri", Font.PLAIN, 20));
		signuptxt.setBounds(480, 295, 100, 50);
		signuptxt.addMouseListener(new MouseListener() {
			
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Signup reg = new Signup();
				reg.setVisible(true);
				dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
					
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
		});
			
		
		emailfield = new JTextField();
		emailfield.setBounds(310, 190, 300, 40);
		emailfield.setColumns(10);
		
		passfield = new JPasswordField();
		passfield.setBounds(310, 270, 300, 40);
		passfield.setColumns(10);
		
		backbtn = new JButton("Back");
		backbtn.setFont(new Font("Calibri", Font.PLAIN, 20));
		backbtn.setBounds(220, 125, 80, 30);
		backbtn.addActionListener(this);
		
		signbtn = new JButton("Sign In");
		signbtn.setFont(new Font("Calibri", Font.PLAIN, 20));
		signbtn.setBounds(310, 350, 300, 50);
		signbtn.addActionListener(this);
		
		backpnl.add(lgntitle);
		backpnl.add(emailtxt);
		backpnl.add(emailfield);
		backpnl.add(passtxt);
		backpnl.add(passfield);
		backpnl.add(acctxt);
		backpnl.add(signuptxt);
		backpnl.add(backbtn);
		backpnl.add(signbtn);

		cont = new Container();
		cont = getContentPane();
		cont.add(backpnl);

	}
	

	private JLabel makeJLabel(String n, Integer size){
		JLabel label = new JLabel(n);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Calibri", Font.BOLD, size));
		return label;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backbtn){
			Homepage h = new Homepage();
			h.setVisible(true);
			dispose();
		}
		else if(e.getSource() == signbtn){
			check();
		}
		
	}
	
	

	
}
