package homework7;
import  java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class _14211154_张子仪_7_MainUI extends JFrame implements ActionListener{
	
	JButton book=new JButton("Book Catalog Maintenance");
	JButton str=new JButton("Strategy Maintenance");
	JButton buy= new JButton("Start Shopping");

	_14211154_张子仪_7_BuyUI buyUI;
	_14211154_张子仪_7_ShoppingCarUI carUI;
	_14211154_张子仪_7_StrategiesUI strUI;
	_14211154_张子仪_7_AddBookUI bookUI;
	_14211154_张子仪_7_BookCatalog bc=new _14211154_张子仪_7_BookCatalog();
	_14211154_张子仪_7_StrategyCatalog sc=new _14211154_张子仪_7_StrategyCatalog();
	_14211154_张子仪_7_Sale sale=new _14211154_张子仪_7_Sale();
	
	_14211154_张子仪_7_MainUI(){
		//界面
		this.setSize(800, 500);
		this.setTitle("Book Shopping System");
		this.getContentPane().setBackground(Color.GRAY);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		//按钮
		this.add(book);
		this.add(str);
		this.add(buy);
		book.setBounds(300, 200, 200, 40);
		book.setVisible(true);
		book.addActionListener(this);
		str.setBounds(300, 280, 200, 40);
		str.setVisible(true);
		str.addActionListener(this);
		buy.setBounds(300, 360, 200, 40);
		buy.setVisible(true);
		buy.addActionListener(this);
		//窗口
		buyUI = new _14211154_张子仪_7_BuyUI(bc,sale);
		strUI= new _14211154_张子仪_7_StrategiesUI(sc);
		bookUI=new _14211154_张子仪_7_AddBookUI(bc,buyUI);
		
	}
	public void paint(Graphics g) {
   	     super.paint(g);
		 g.setFont(new Font("", Font.TRUETYPE_FONT, 30));        
		 g.setColor(Color.WHITE); 
		 g.drawString("Welcome to books shopping system！", 175, 155);
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==book){
			bookUI.setVisible(true);
		}
		if(e.getSource()==str){
			strUI.setVisible(true);
		}
		if(e.getSource()==buy){
			buyUI.setVisible(true);
		}
	}
	public static void main(String[] args) {  
		_14211154_张子仪_7_MainUI a=new _14211154_张子仪_7_MainUI();
		
	  }
}
