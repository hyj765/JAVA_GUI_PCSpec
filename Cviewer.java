package computerviewer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import computerviewer.GraphicsCard.disk;

import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class Cviewer {
	Boolean check=false;
	private JFrame frmCviewer;
	class disk
	{
		public String diskname;
		public String Freespace;
		public String Filesystem;
		public String TotalSpace;
		disk()
		{
			this.diskname = "";
			this.Filesystem = "";
			this.Freespace = "";
			this.TotalSpace = "";
		}
	}
	public Boolean Csetup(String data,JLabel target)
	{	
		if(data == null)
		{
			target.setText("Not Found");
			return false;
		}
		target.setText(data);
		return true;
	}
	public void Diskset(JLabel Dn,JLabel Fs,JLabel Ts,JLabel Fis,JLabel Dc,computerviewer.GraphicsCard.disk di,int Dcount)
	{
		 
		if(di.diskname != null)
		{
		Dn.setText(di.diskname);
		Fs.setText(di.Freespace);
		Ts.setText(di.TotalSpace);
		Fis.setText(di.Filesystem);
		Dc.setText(Integer.toString(Dcount));
		}
		return;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cviewer window = new Cviewer();
					window.frmCviewer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cviewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmCviewer = new JFrame();
		frmCviewer.setTitle("CViewer[Easy To See your Computer]");
		frmCviewer.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\\uD669\uC601\uC900\\Desktop\\sdfasdfsd.jpg"));
		frmCviewer.getContentPane().setBackground(Color.WHITE);
		frmCviewer.setBounds(100, 100, 840, 534);
		frmCviewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCviewer.getContentPane().setLayout(null);
		GraphicsCard CC = new GraphicsCard();
		try {
			check =CC.ComputerCheck();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 826, 168);
		frmCviewer.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CViewer");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 71));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(64, 51, 195, 57);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Let me Show you your Computer Spec");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(128, 112, 266, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("JAVA Programming Example");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(607, 10, 195, 15);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("NamSeoul University");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(657, 35, 145, 15);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("by ComputerSoftWare Youngjun Hwang");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(537, 143, 265, 15);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel CPUL = new JLabel("CPU");
		CPUL.setFont(new Font("Arial Black", Font.PLAIN, 22));
		CPUL.setBounds(29, 202, 65, 45);
		frmCviewer.getContentPane().add(CPUL);
		
		JLabel GraphicL = new JLabel("GPU");
		GraphicL.setFont(new Font("Arial Black", Font.PLAIN, 22));
		GraphicL.setBounds(501, 202, 65, 45);
		frmCviewer.getContentPane().add(GraphicL);
		
		JLabel lblOs = new JLabel("O S");
		lblOs.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblOs.setBounds(41, 443, 42, 31);
		frmCviewer.getContentPane().add(lblOs);
		
		JLabel lblRam = new JLabel("GPU RAM");
		lblRam.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblRam.setBounds(440, 240, 116, 45);
		frmCviewer.getContentPane().add(lblRam);
		
		JLabel lblRam_1 = new JLabel("RAM");
		lblRam_1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblRam_1.setBounds(29, 240, 65, 45);
		frmCviewer.getContentPane().add(lblRam_1);
		
		JLabel lblCore = new JLabel("Core");
		lblCore.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblCore.setBounds(29, 288, 65, 31);
		frmCviewer.getContentPane().add(lblCore);
		
		JLabel lblThread = new JLabel("Thread");
		lblThread.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblThread.setBounds(12, 329, 97, 31);
		frmCviewer.getContentPane().add(lblThread);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(397, 295, 417, 179);
		frmCviewer.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("DISK Information");
		lblNewLabel_2_3_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_2_3_1.setBounds(12, 10, 223, 24);
		panel_1.add(lblNewLabel_2_3_1);
		
		JLabel Dn = new JLabel("NOT FOUND");
		Dn.setHorizontalAlignment(SwingConstants.CENTER);
		Dn.setBounds(154, 61, 223, 15);
		panel_1.add(Dn);
		
		JLabel lblDiskName = new JLabel("DISK NAME");
		lblDiskName.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblDiskName.setBounds(12, 44, 96, 45);
		panel_1.add(lblDiskName);
		
		JLabel lblSpace = new JLabel("Available Space");
		lblSpace.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblSpace.setBounds(12, 77, 150, 33);
		panel_1.add(lblSpace);
		
		JLabel lblTotalSpace = new JLabel("Total Space");
		lblTotalSpace.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblTotalSpace.setBounds(12, 99, 150, 33);
		panel_1.add(lblTotalSpace);
		
		JLabel Fs = new JLabel("NOT FOUND");
		Fs.setHorizontalAlignment(SwingConstants.CENTER);
		Fs.setBounds(154, 89, 223, 15);
		panel_1.add(Fs);
		
		JLabel Ts = new JLabel("NOT FOUND");
		Ts.setHorizontalAlignment(SwingConstants.CENTER);
		Ts.setBounds(154, 110, 223, 15);
		panel_1.add(Ts);
		
		JLabel lblFilesystem = new JLabel("FileSystem");
		lblFilesystem.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblFilesystem.setBounds(12, 120, 150, 33);
		panel_1.add(lblFilesystem);
		
		JLabel Fis = new JLabel("NOT FOUND");
		Fis.setHorizontalAlignment(SwingConstants.CENTER);
		Fis.setBounds(154, 131, 223, 15);
		panel_1.add(Fis);
		
		JLabel lblDiskCount = new JLabel("Number of Disk");
		lblDiskCount.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblDiskCount.setBounds(247, 9, 133, 33);
		panel_1.add(lblDiskCount);
		
		JLabel Diskcount = new JLabel("0");
		Diskcount.setFont(new Font("Tahoma", Font.BOLD, 20));
		Diskcount.setHorizontalAlignment(SwingConstants.CENTER);
		Diskcount.setBounds(376, 11, 29, 28);
		panel_1.add(Diskcount);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1.setBounds(106, 209, 247, 31);
		frmCviewer.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel CPUdata = new JLabel();
		CPUdata.setText("NOT FOUND");
		CPUdata.setHorizontalAlignment(SwingConstants.CENTER);
		CPUdata.setBounds(12, 10, 223, 15);
		panel_1_1.add(CPUdata);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1.setBounds(106, 247, 247, 31);
		frmCviewer.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel CMemory = new JLabel("NOT FOUND");
		CMemory.setHorizontalAlignment(SwingConstants.CENTER);
		CMemory.setBounds(12, 10, 223, 15);
		panel_1_1_1.add(CMemory);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1_1.setBounds(106, 288, 247, 31);
		frmCviewer.getContentPane().add(panel_1_1_1_1);
		
		JLabel Core = new JLabel("NOT FOUND");
		Core.setHorizontalAlignment(SwingConstants.CENTER);
		Core.setBounds(12, 10, 223, 15);
		panel_1_1_1_1.add(Core);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1_1_1.setBounds(106, 329, 247, 31);
		frmCviewer.getContentPane().add(panel_1_1_1_1_1);
		
		JLabel Thread = new JLabel("NOT FOUND");
		Thread.setHorizontalAlignment(SwingConstants.CENTER);
		Thread.setBounds(12, 10, 223, 15);
		panel_1_1_1_1_1.add(Thread);
		
		JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1_1_1_1.setBounds(106, 442, 247, 31);
		frmCviewer.getContentPane().add(panel_1_1_1_1_1_1);
		
		JLabel OS = new JLabel("NOT FOUND");
		OS.setHorizontalAlignment(SwingConstants.CENTER);
		OS.setBounds(12, 10, 223, 15);
		panel_1_1_1_1_1_1.add(OS);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1_2.setBounds(567, 209, 247, 31);
		frmCviewer.getContentPane().add(panel_1_1_1_2);
		
		JLabel GPUdata = new JLabel("NOT FOUND");
		GPUdata.setHorizontalAlignment(SwingConstants.CENTER);
		GPUdata.setBounds(12, 10, 223, 15);
		panel_1_1_1_2.add(GPUdata);
		
		JPanel panel_1_1_1_2_1 = new JPanel();
		panel_1_1_1_2_1.setLayout(null);
		panel_1_1_1_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1_2_1.setBounds(567, 247, 247, 31);
		frmCviewer.getContentPane().add(panel_1_1_1_2_1);
		
		JLabel Gmemory = new JLabel("NOT FOUND");
		Gmemory.setHorizontalAlignment(SwingConstants.CENTER);
		Gmemory.setBounds(12, 10, 223, 15);
		panel_1_1_1_2_1.add(Gmemory);
		
		JLabel lblResolution = new JLabel("Resolution");
		lblResolution.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblResolution.setBounds(12, 370, 97, 31);
		frmCviewer.getContentPane().add(lblResolution);
		
		JPanel panel_1_1_1_1_1_2 = new JPanel();
		panel_1_1_1_1_1_2.setLayout(null);
		panel_1_1_1_1_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1_1_1_2.setBounds(106, 370, 247, 31);
		frmCviewer.getContentPane().add(panel_1_1_1_1_1_2);
		
		JLabel resol = new JLabel("NOT FOUND");
		resol.setHorizontalAlignment(SwingConstants.CENTER);
		resol.setBounds(12, 10, 223, 15);
		panel_1_1_1_1_1_2.add(resol);
		String CoreN = Integer.toString(Runtime.getRuntime().availableProcessors()/2);
		String ThreadN = Integer.toString(Runtime.getRuntime().availableProcessors());
		
		if(check == true)
		{	
			Csetup(CC.CPU,CPUdata);
			Csetup(CC.GPU,GPUdata);
			Csetup(CC.Displa+"MB",Gmemory);
			Csetup(CC.Memory+"MB",CMemory);
			Csetup(CC.OS,OS);
			Csetup(CC.Cm,resol);
			Diskset(Dn, Fs, Ts, Fis,Diskcount,CC.di[0],CC.Dcount);
			Core.setText(CoreN);
			Thread.setText(ThreadN);
		}
	}
}
