import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
//import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{
	private JPanel mainpnl;
	private JLabel regtitle, nametxt, passtxt, emailtxt, confpasstxt, addresstxt, DOBtxt;
	private JButton signupbtn, backbtn;
	private JTextField namefield, emailfield, addressfield;
	private JPasswordField passfield, confpassfield;
	private JDateChooser DOB;
	private Container cont;
	private JTable table;
	private DefaultTableModel model;
	private TableColumn col1, col2;
	private JScrollPane scrollpane;
	
	public Signup() {
		setTitle("JP.ID");
		setLayout(new BorderLayout());
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		register();
		setVisible(true);
	}
	
	private void register(){
		mainpnl = new Signupback("600x400.png");
		mainpnl.setLayout(null);
		
		regtitle = makeJLabel("Sign up to JP.ID",25);
		regtitle.setForeground(Color.WHITE);
		regtitle.setBounds(100, 30, 180,100);
		
		nametxt = makeJLabel("UserName", 15);
		nametxt.setForeground(Color.WHITE);
		nametxt.setHorizontalAlignment(JLabel.CENTER);
		nametxt.setBounds(30, 70, 100,100);
		
		
		emailtxt = makeJLabel("Email", 15);
		emailtxt.setForeground(Color.WHITE);
		emailtxt.setHorizontalAlignment(JLabel.CENTER);
		emailtxt.setBounds(30, 100, 100,100);
		
		passtxt = makeJLabel("Password", 15);
		passtxt.setForeground(Color.WHITE);
		passtxt.setHorizontalAlignment(JLabel.CENTER);
		passtxt.setBounds(30, 130, 100,100);
		
		confpasstxt = makeJLabel("Confirm Password", 15);
		confpasstxt.setForeground(Color.WHITE);
		confpasstxt.setHorizontalAlignment(JLabel.CENTER);
		confpasstxt.setBounds(20, 160, 120,100);
		
		addresstxt = makeJLabel("Address", 15);
		addresstxt.setForeground(Color.WHITE);
		addresstxt.setHorizontalAlignment(JLabel.CENTER);
		addresstxt.setBounds(30, 190, 100,100);
		
		DOBtxt = makeJLabel("DOB", 15);
		DOBtxt.setForeground(Color.WHITE);
		DOBtxt.setHorizontalAlignment(JLabel.CENTER);
		DOBtxt.setBounds(30, 220, 100,100);
		
		namefield = new JTextField();
		namefield.setBounds(180, 110, 150, 20);
		namefield.setColumns(10);
		namefield.setBorder(BorderFactory.createLineBorder(Color.GRAY,2));
		namefield.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				checkName();
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		emailfield = new JTextField();
		emailfield.setBounds(180, 140, 150, 20);
		emailfield.setColumns(10);
		emailfield.setBorder(BorderFactory.createLineBorder(Color.GRAY,2));
		emailfield.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				checkEmail();
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				
			}
		});
		
		passfield = new JPasswordField();
		passfield.setBounds(180, 170, 150, 20);
		passfield.setColumns(10);
		passfield.setBorder(BorderFactory.createLineBorder(Color.GRAY,2));
		passfield.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				checkpass();
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		
		confpassfield = new JPasswordField();
		confpassfield.setBounds(180, 200, 150, 20);
		confpassfield.setColumns(10);
		confpassfield.setBorder(BorderFactory.createLineBorder(Color.GRAY,2));
		confpassfield.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				checkConf();
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				
			}
		});
		
		addressfield = new JTextField();
		addressfield.setBounds(180, 230, 150, 20);
		addressfield.setColumns(10);
		addressfield.setBorder(BorderFactory.createLineBorder(Color.GRAY,2));
		addressfield.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				checkAddress();
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		
		DOB = new JDateChooser();
		DOB.setBounds(180, 260, 150, 20);
		
		signupbtn = new JButton("Sign up");
		signupbtn.setFont(new Font("Calibri", Font.BOLD, 15));
		signupbtn.setBounds(130, 300, 80, 30);
		signupbtn.addActionListener(this);
		
		backbtn = new JButton("Back");
		backbtn.setFont(new Font("Calibri", Font.BOLD, 13));
		backbtn.setBounds(10, 65, 60, 30);
		backbtn.addActionListener(this);
		
		mainpnl.add(regtitle);
		mainpnl.add(nametxt);
		mainpnl.add(emailtxt);
		mainpnl.add(passtxt);
		mainpnl.add(confpasstxt);
		mainpnl.add(addresstxt);
		mainpnl.add(DOBtxt);
		mainpnl.add(namefield);
		mainpnl.add(emailfield);
		mainpnl.add(passfield);
		mainpnl.add(confpassfield);
		mainpnl.add(addressfield);
		mainpnl.add(DOB);
		mainpnl.add(signupbtn);
		mainpnl.add(backbtn);
		
		cont = new Container();
		cont = getContentPane();
		cont.add(mainpnl);
	}
	
	private JLabel makeJLabel(String n, Integer size){
		JLabel label = new JLabel(n);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Calibri", Font.BOLD, size));
		return label;
	}
	
	private void checkName(){
		String name = namefield.getText();
		int length = name.length();
		int flag = 0;
		for(int i = 0; i < name.length();i++){
			if(name.contains(" ") && name.charAt(length-1) != ' '){
				flag = 1;
			}
			else{
				flag = 0;
			}
		}
		if(name.length()<5 || name.length()>50){
			flag = 0;
		}
		
		if(flag == 0 ){
			namefield.setBorder(BorderFactory.createLineBorder(Color.RED,2));
		}
		else if(flag == 1){			
			namefield.setBorder(BorderFactory.createLineBorder(Color.GRAY,2));
		}
		
	}
	
	private void checkEmail(){
		String email = emailfield.getText();
		if(email.endsWith("@gmail.com") && !email.startsWith("@")){
			emailfield.setBorder(BorderFactory.createLineBorder(Color.GRAY,2));
		}
		else{
			emailfield.setBorder(BorderFactory.createLineBorder(Color.RED,2));
		}
	}
	
	private void checkpass(){
		String pass = new String(passfield.getPassword());
		int flag = 0;
		for(int i = 0; i < pass.length(); i++){
			char test = pass.charAt(i);
			if(!Character.isLetterOrDigit(test)){
				flag = 0;
			}
			else if(Character.isLetterOrDigit(test)){
				flag = 1;
			}	
		}
		if(pass.length()<8 || pass.length()>50){
			flag = 0;
		}
		
		if(flag == 0){
			passfield.setBorder(BorderFactory.createLineBorder(Color.RED,2));	

		}
		else if(flag == 1){			
			passfield.setBorder(BorderFactory.createLineBorder(Color.GRAY,2));
		}
	}
	
	private void checkConf(){		
		String pass = new String(passfield.getPassword());
		String confpass = new String(confpassfield.getPassword());
		if(confpass.equals(pass)){
			confpassfield.setBorder(BorderFactory.createLineBorder(Color.GRAY,2));
		}
		else{
			confpassfield.setBorder(BorderFactory.createLineBorder(Color.RED,2));			
		}
	}
	
	private void checkAddress(){
		String address = addressfield.getText();
		if(address.length()<8 || address.length()>50){
			addressfield.setBorder(BorderFactory.createLineBorder(Color.RED,2));			
		}
		else{
			addressfield.setBorder(BorderFactory.createLineBorder(Color.GRAY,2));						
		}
	}
	
	private void checkSign(){
		String name = namefield.getText();
		String email = emailfield.getText();
		String pass = new String(passfield.getPassword());
		String confpass = new String(confpassfield.getPassword());
		String address = addressfield.getText();
		String date = ((JTextField)DOB.getDateEditor().getUiComponent()).getText();
		int length = name.length();
		int flag = 0;
		
		for(int i = 0; i < name.length();i++){
			if(name.contains(" ") && name.charAt(length-1) != ' '){
				flag = 1;
			}
			else{
				flag = 0;
			}
		}
		
		for(int i = 0; i < pass.length(); i++){
			char test = pass.charAt(i);
			if(!Character.isLetterOrDigit(test)){
				flag = 0;
			}
			else if(Character.isLetterOrDigit(test)){
				flag = 1;
			}	
		}
		
		if(name.length()<5 || name.length()>50){
			flag = 0;
		}
		
		else if(!email.endsWith("@gmail.com") || email.startsWith("@")){
			flag = 0;
		}
		
		else if(pass.length()<8 || pass.length()>50){
			flag = 0;
		}
		
		else if(!confpass.equals(pass)){
			flag = 1;
		}
		
		else if(address.length()<8 || address.length()>50){
			flag = 0;		
		}
//		else if(date.)
		
		
		else{
			flag = 1;
		}
		
		
		if(flag == 0){
			JOptionPane.showMessageDialog(null, "Wrong data, check again your data!", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		if(flag == 1){

			Signin s = new Signin();
			s.emailregist.addElement(email);
			s.passregist.addElement(pass);
			s.setVisible(true);
			JOptionPane.showMessageDialog(null, "Register Success!");
			dispose();

		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == signupbtn){
			checkSign();
		}
		else if(e.getSource() == backbtn){
			Signin s = new Signin();
			s.setVisible(true);
			dispose();
		}
		
		
	}

}
