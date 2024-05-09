import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

public class Home extends JFrame implements ActionListener{
	private JMenuBar header;
	private JMenu voucher, event, promo; 
	private JMenuItem v1, e1, p1;
	private JPanel menupnl, botpnl;
	private JButton exit;
	EmbeddedMediaPlayer music;
	
	public Home() {
		setLayout(new BorderLayout());
		setTitle("JP.ID");
		setSize(1600, 1000);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		song();
		BackImg();
		menu();
		sign();
		setVisible(true);
	}
	
	private void BackImg(){
		getContentPane().add(new Background("red.png"));
	}
	
	
	private void song(){
		NativeLibrary.addSearchPath("libvlc", "C:\\Program Files\\VideoLAN\\VLC");
		Native.loadLibrary(LibVlc.class);
		music = new MediaPlayerFactory().newEmbeddedMediaPlayer();
		try {
			music.prepareMedia(new File(getClass().getResource("./home.mp3").toURI()).getAbsolutePath());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		music.play();

		
	}
	
	private void sign(){
		exit = new JButton("Exit");
		exit.setBackground(Color.decode("#a94457"));
		exit.setForeground(Color.WHITE);
		exit.setFont(new Font("Calibri", Font.PLAIN, 20));
		exit.setBorder(new EmptyBorder(10, 10, 10, 10));
		exit.addActionListener(this);
		botpnl = new JPanel(new FlowLayout(FlowLayout.CENTER,728,10));
		botpnl.add(exit);
		add(botpnl, BorderLayout.SOUTH);
	}
	
	private void menu(){
		menupnl = new JPanel(new GridLayout());

		header = new JMenuBar();
		voucher = new JMenu("Voucher");
		event = new JMenu("Event");
		promo = new JMenu("Promo");
		header.setSize(1600,20);
		voucher.setFont(new Font("Calibri",Font.PLAIN,20));
		voucher.setBorder(new EmptyBorder(10,10,10,30));
		voucher.setForeground(Color.WHITE);
		v1 = new JMenuItem("Voucher");
		v1.setFont(new Font("Calibri",Font.PLAIN,20));
		voucher.add(v1);
		v1.addActionListener(this);
		event.setFont(new Font("Calibri",Font.PLAIN,20));
		event.setBorder(new EmptyBorder(10,10,10,30));
		event.setForeground(Color.WHITE);
		e1 = new JMenuItem("Event");
		e1.setFont(new Font("Calibri",Font.PLAIN,20));
		event.add(e1);
		e1.addActionListener(this);
		promo.setFont(new Font("Calibri",Font.PLAIN,20));
		promo.setBorder(new EmptyBorder(10,10,10,30));
		promo.setForeground(Color.WHITE);
		p1 = new JMenuItem("Promo");
		p1.setFont(new Font("Calibri",Font.PLAIN,20));
		promo.add(p1);
		p1.addActionListener(this);
		header.setBackground(Color.decode("#a94457"));
		header.add(voucher);
		header.add(event);
		header.add(promo);
		menupnl.add(header);
		add(menupnl,BorderLayout.NORTH);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == v1){
			System.out.println("Voucher");
			music.pause();
		}
		
		else if(e.getSource() == e1){
			System.out.println("Event");
			music.pause();
		}
		
		else if(e.getSource() == p1){
			System.out.println("Promo");
			music.pause();
		}
		
		else{
			System.exit(0);
		}
		
	}
	

}
