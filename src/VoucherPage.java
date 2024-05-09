import java.awt.BorderLayout; 
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.TransferHandler;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VoucherPage extends JFrame 
{

	private JPanel PanelContent;
	private JPanel PanelCashback40;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					VoucherPage frame = new VoucherPage();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public VoucherPage() 
	{
		ImageIcon imgSrc;
		BufferedImage BuffIMG;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 576);
		PanelContent = new JPanel();
		PanelContent.setBorder(new EmptyBorder(7, 7, 7, 7));
		setContentPane(PanelContent);
		PanelContent.setLayout(null);
		JButton ButtonBack = new JButton("Back");
		ButtonBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
	        	new Homepage().setVisible(true);
	        	dispose();
			}
		});
		
		ButtonBack.setBounds(11, 12, 90, 24);
		PanelContent.add(ButtonBack);
		JPanel panel = new JPanel();
		panel.setBounds(88, 35, 750, 493);
		PanelContent.add(panel);
		panel.setLayout(null);

		imgSrc = new ImageIcon(EventItem.class.getResource("/ProjectLab/ongkir 10.jpg"));
	 	BuffIMG = new BufferedImage(imgSrc.getIconWidth(), imgSrc.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
		imgSrc.paintIcon(null, BuffIMG.getGraphics(), 0, 0);
		JPanel PanelOngkir10 = new PanelWithImage(BuffIMG);
		PanelOngkir10.setBounds(31, 12, 123, 210);
		PanelOngkir10.addMouseListener(voucherClick);
		PanelOngkir10.setName("PanelOngkir10");
		panel.add(PanelOngkir10);
		

		imgSrc = new ImageIcon(EventItem.class.getResource("/ProjectLab/cashback 10.jpg"));
	 	BuffIMG = new BufferedImage(imgSrc.getIconWidth(), imgSrc.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
		imgSrc.paintIcon(null, BuffIMG.getGraphics(), 0, 0);
		JPanel PanelCashback10 = new PanelWithImage(BuffIMG);
		PanelCashback10.setBounds(31, 245, 122, 210);
		PanelCashback10.addMouseListener(voucherClick);
		PanelCashback10.setName("PanelCashback10");
		panel.add(PanelCashback10);
		

		imgSrc = new ImageIcon(EventItem.class.getResource("/ProjectLab/ongkir 20.jpg"));
	 	BuffIMG = new BufferedImage(imgSrc.getIconWidth(), imgSrc.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
		imgSrc.paintIcon(null, BuffIMG.getGraphics(), 0, 0);
		JPanel PanelOngkir20 = new PanelWithImage(BuffIMG);
		PanelOngkir20.setBounds(220, 12, 123, 210);
		PanelOngkir20.addMouseListener(voucherClick);
		PanelOngkir20.setName("PanelOngkir20");
		panel.add(PanelOngkir20);
		

		imgSrc = new ImageIcon(EventItem.class.getResource("/ProjectLab/cashback 20.jpg"));
	 	BuffIMG = new BufferedImage(imgSrc.getIconWidth(), imgSrc.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
		imgSrc.paintIcon(null, BuffIMG.getGraphics(), 0, 0);
		JPanel PanelCashback20 = new PanelWithImage(BuffIMG);
		PanelCashback20.setBounds(220, 245, 122, 210);
		PanelCashback20.addMouseListener(voucherClick);
		PanelCashback20.setName("PanelCashback20");
		panel.add(PanelCashback20);
		

		imgSrc = new ImageIcon(EventItem.class.getResource("/ProjectLab/ongkir 40.jpg"));
	 	BuffIMG = new BufferedImage(imgSrc.getIconWidth(), imgSrc.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
		imgSrc.paintIcon(null, BuffIMG.getGraphics(), 0, 0);
		JPanel PanelOngkir40 = new PanelWithImage(BuffIMG);
		PanelOngkir40.setBounds(584, 12, 123, 210);
		PanelOngkir40.addMouseListener(voucherClick);
		PanelOngkir40.setName("PanelOngkir40");
		panel.add(PanelOngkir40);
		

		imgSrc = new ImageIcon(EventItem.class.getResource("/ProjectLab/ongkir 30.jpg"));
	 	BuffIMG = new BufferedImage(imgSrc.getIconWidth(), imgSrc.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
		imgSrc.paintIcon(null, BuffIMG.getGraphics(), 0, 0);
		JPanel PanelOngkir30 = new PanelWithImage(BuffIMG);
		PanelOngkir30.setBounds(395, 12, 122, 210);
		PanelOngkir30.addMouseListener(voucherClick);
		PanelOngkir30.setName("PanelOngkir30");
		panel.add(PanelOngkir30);
		

		imgSrc = new ImageIcon(EventItem.class.getResource("/ProjectLab/cashback 40.jpg"));
	 	BuffIMG = new BufferedImage(imgSrc.getIconWidth(), imgSrc.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
		imgSrc.paintIcon(null, BuffIMG.getGraphics(), 0, 0);
		PanelCashback40 = new PanelWithImage(BuffIMG);
		PanelCashback40.setBounds(584, 245, 122, 210);
		PanelCashback40.addMouseListener(voucherClick);
		PanelCashback40.setName("PanelCashback40");
		panel.add(PanelCashback40);
		

		imgSrc = new ImageIcon(EventItem.class.getResource("/ProjectLab/cashback 30.jpg"));
	 	BuffIMG = new BufferedImage(imgSrc.getIconWidth(), imgSrc.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
		imgSrc.paintIcon(null, BuffIMG.getGraphics(), 0, 0);
		JPanel PanelCashback30 = new PanelWithImage(BuffIMG);
		PanelCashback30.setBounds(394, 244, 121, 209);
		PanelCashback30.addMouseListener(voucherClick);
		PanelCashback30.setName("PanelCashback30");
		panel.add(PanelCashback30);
		

		imgSrc = new ImageIcon(EventItem.class.getResource("/ProjectLab/400x300.png"));
	 	BuffIMG = new BufferedImage(imgSrc.getIconWidth(), imgSrc.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
		imgSrc.paintIcon(null, BuffIMG.getGraphics(), 0, 0);
		JPanel PanelBackground = new PanelWithImage(BuffIMG);
		PanelBackground.setBounds(0, 0, 901, 538);
		PanelContent.add(PanelBackground);
		
	}
	
	MouseListener voucherClick = new MouseListener() 
	
	{

        @Override
        public void mouseClicked(MouseEvent e) 
        {
        	JPanel panel = (JPanel)e.getSource();
        	for (int i = 0; i < GeneralFX.listVoucher.size(); i++) 
        	{
				String ThereClaim = GeneralFX.listVoucher.get(i);
				if(ThereClaim.contains(panel.getName().toString())) 
				{
					String ValuePanel = panel.getName().toString().replace("Panel", "");
			        JOptionPane.showMessageDialog(null, "Sorry, You've alread claim this : " +ValuePanel + " before !");
					return;
				}
			}
        	
    		GeneralFX.ClaimChoosed = panel.getName().toString();
        	new Voucher().setVisible(true);
        	dispose();
        }

        @Override
        public void mousePressed(MouseEvent e) 
        {
        
        }

        @Override
        public void mouseReleased(MouseEvent e) 
        {
        }

        @Override
        public void mouseEntered(MouseEvent e) 
        {
        	
        }

        @Override
        public void mouseExited(MouseEvent e) 
        {

        }
    };
}

