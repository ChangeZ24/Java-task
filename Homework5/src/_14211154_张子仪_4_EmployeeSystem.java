package homework4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.xml.crypto.Data;
import java.util.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class _14211154_张子仪_4_EmployeeSystem extends JFrame implements ActionListener{
	int num=0;
	int flag;
	String fn,ln,sn,gs;
	JFrame frame = new JFrame("Employee System");
	JTextArea out=new JTextArea(30,60);
	JButton exit_button = new JButton("Exit");
	JButton cinput=new JButton("Input");
	JButton binput=new JButton("Input");
	JButton cfin=new JButton("Finish");
	JButton bfin=new JButton("Finish");
    JMenuBar menubar=new JMenuBar();
	JMenu menu1 = new JMenu("Employee Info Input") ;
    JMenu menu2 =  new JMenu("Search");
    JMenuItem submenu1=new JMenuItem("Commision Employee");
    JMenuItem submenu2 = new JMenuItem("Base Plus Commision Employee"); 
    JMenuItem submenu3 = new JMenuItem("AverageEarningSearch");
    JPanel pan=new JPanel();
    JDialog win=new JDialog(this,"Welcome New Commision Employee",true);
    JDialog win1 =new JDialog(this,"Welcome New Base Plus Commision Employee",true);
    JLabel cfn=new JLabel("Firstname",JLabel.CENTER);
    JLabel cln=new JLabel("Lastname",JLabel.CENTER);
    JLabel csn=new JLabel("Social Security Number",JLabel.CENTER);
    JLabel cgs=new JLabel("Gross Sales",JLabel.CENTER);
    JLabel bfn=new JLabel("Firstname",JLabel.CENTER);
    JLabel bln=new JLabel("Lastname",JLabel.CENTER);
    JLabel bsn=new JLabel("Social Security Number",JLabel.CENTER);
    JLabel bgs=new JLabel("Gross Sales",JLabel.CENTER);
    JTextField icfn = new JTextField(15);
    JTextField icln = new JTextField(15);
    JTextField icsn = new JTextField(15);
    JTextField icgs = new JTextField(15);
    JTextField ibfn = new JTextField(15);
    JTextField ibln = new JTextField(15);
    JTextField ibsn = new JTextField(15);
    JTextField ibgs = new JTextField(15);
    //JLabel coutput = new JLabel("You entered", JLabel.CENTER);
    //JLabel boutput = new JLabel("You entered", JLabel.CENTER);
    public ArrayList<_14211154_张子仪_4_Employee>  employee = new ArrayList(); 
	public _14211154_张子仪_4_EmployeeSystem(){
    	//面板
    	frame.setSize(800,600);
    	frame.setLocation(100,100);
    	frame.add(pan,BorderLayout.NORTH);
    	pan.setSize(400, 100);
    	frame.add(exit_button,BorderLayout.SOUTH);
    	frame.setVisible(true);
    	exit_button.setVisible(true);
    	exit_button.addActionListener(this);
    	exit_button.setActionCommand("Exit");
    	out.setSize(50,50);
    	frame.add(out, BorderLayout.CENTER);
    	out.setVisible(false);
    	//菜单
    	menu1.add(submenu1);
    	menu1.add(submenu2);
    	menu2.add(submenu3);
    	menubar.add(menu1);
    	menubar.add(menu2);
    	submenu1.setVisible(true);
    	submenu2.setVisible(true);
    	submenu3.setVisible(true);
    	menu1.setVisible(true);
    	menu2.setVisible(true);
    	menu1.addActionListener(this);
    	menu2.addActionListener(this);
    	submenu1.addActionListener(this);
    	submenu2.addActionListener(this);
    	submenu3.addActionListener(this);
    	frame.setJMenuBar(menubar);
    	//窗口
    	win.setBackground(Color.gray);
    	win.setLayout(null);
    	win.setSize(300,300);
    	win.setLocation(150, 100);
    	win.add(cfn);
    	cfn.setBounds(0, 0,60,60);
    	win.add(icfn);
    	icfn.setBounds(70,20,70,20);
    	win.add(cln);
    	cln.setBounds(0, 40,60,60);
    	win.add(icln);
    	icln.setBounds(70, 60,70,20);
    	win.add(csn);
    	csn.setBounds(0, 80,140,60);
    	win.add(icsn);
    	icsn.setBounds(150, 100,70,20);
    	win.add(cgs);
    	cgs.setBounds(0, 120,80,60);
    	win.add(icgs);
    	icgs.setBounds(90, 140,70,20);
    	//win.add(coutput);
    	//coutput.setBounds(0, 160,80, 60);
    	win.add(cinput);
    	cinput.setBounds(60, 220, 70, 20);
    	win.add(cfin);
    	cfin.setBounds(160, 220, 70, 20);
    	win.setVisible(false);
    	
    	win1.setBackground(Color.gray);
    	win1.setLayout(null);
    	win1.setSize(300,300);
    	win1.setLocation(150, 100);
    	win1.add(bfn);
    	bfn.setBounds(0, 0,60,60);
    	win1.add(ibfn);
    	ibfn.setBounds(70,20,70,20);
    	win1.add(bln);
    	bln.setBounds(0, 40,60,60);
    	win1.add(ibln);
    	ibln.setBounds(70, 60,70,20);
    	win1.add(bsn);
    	bsn.setBounds(0, 80,140,60);
    	win1.add(ibsn);
    	ibsn.setBounds(150, 100,70,20);
    	win1.add(bgs);
    	bgs.setBounds(0, 120,80,60);
    	win1.add(ibgs);
    	ibgs.setBounds(90, 140,70,20);
    	win1.add(binput);
    	binput.setBounds(60, 220, 70, 20);
    	//win1.add(boutput);
    	//boutput.setBounds(0, 160,80, 60);
    	win1.add(bfin);
    	bfin.setBounds(160, 220, 70, 20);
    	win1.setVisible(false);
    	
    	binput.addActionListener(this);
    	cinput.addActionListener(this);
    	cfin.addActionListener(this);
    	bfin.addActionListener(this);
    	frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	frame.setVisible(true);		
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("Exit")){
			System.exit(0);
		}
		if(e.getActionCommand().equals("AverageEarningSearch")){
			out.setText(null);
			double sum = 0,num = 0;
			for(int i=0;i<employee.size();i++){
				sum+=employee.get(i).earning();
				num++;
			}
			out.setVisible(true);
            out.setText("The average earning is : "+(sum/num));
			
		}
		if(e.getSource()==submenu1){
			flag=1;
			 inputInfo1();
		}
		if(e.getSource()==submenu2){
			flag=2;
			inputInfo2();
		}
		if(e.getActionCommand().equals(cinput)){
			
			
		}
		if(e.getActionCommand().equals("Input")){
			if(flag==1){
				fn=icfn.getText();
				ln=icln.getText();
				sn=icsn.getText();
				gs=icgs.getText();
				_14211154_张子仪_4_CommissionEmployee Cdata=new _14211154_张子仪_4_CommissionEmployee();
				Cdata.setFirstName(fn);
				Cdata.setLastName(ln);
				Cdata.setSocialSecurityNumber(sn);
				double gst=0;
				gst=Double.valueOf(gs);
				Cdata.setGrossSales(gst);
				employee.add(Cdata);
				JOptionPane.showMessageDialog(null,"Your user information is adding successfully！");
			}
			else if(flag==2){
				fn=ibfn.getText();
				ln=ibln.getText();
				sn=ibsn.getText();
				gs=ibgs.getText();
				_14211154_张子仪_4_BasePlusCommissionEmployee Bdata=new _14211154_张子仪_4_BasePlusCommissionEmployee();
				Bdata.setFirstName(fn);
				Bdata.setLastName(ln);
				Bdata.setSocialSecurityNumber(sn);
				double gst1=0;
				gst1=Double.valueOf(gs);
				Bdata.setGrossSales(gst1);
				employee.add(Bdata);
				JOptionPane.showMessageDialog(null,"Your user information is adding successfully！");
			}
			
		}
		if(e.getSource()==cfin){
			win.setVisible(false);
		}
		if(e.getSource()==bfin){
			win1.setVisible(false);
		}
	}
	void inputInfo1(){
		win.setVisible(true);
		cinput.setVisible(true);
		icfn.setText(null);
		icln.setText(null);
		icsn.setText(null);
		icgs.setText(null);
	}
	void inputInfo2(){
		win1.setVisible(true);
		binput.setVisible(true);
		ibfn.setText(null);
		ibln.setText(null);
		ibsn.setText(null);
		ibgs.setText(null);
	}
public static void main(String[] args) {  
	_14211154_张子仪_4_EmployeeSystem f=new _14211154_张子仪_4_EmployeeSystem();  
  }
}