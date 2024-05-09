import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Voucher extends JFrame implements ActionListener{
	private JPanel backpnl;
	private JButton backbtn;

	
	public Voucher(){
		setTitle("JP.ID");
		setSize(1600, 1000);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		backpnl = new JPanel();
		backbtn = new JButton("Back");
		backpnl.add(backbtn);
		add(backpnl);
		backbtn.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backbtn){
			Homepage h = new Homepage();
			h.setVisible(true);
			dispose();
		}
		else{
			
		}
		
	}
	

}
