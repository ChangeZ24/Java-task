package homework7;
import  java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.event.*;
public class _14211154_张子仪_7_BuyUI extends JFrame implements ActionListener{
	JPanel pan=new JPanel();
	JPanel selpan=new JPanel();
	JScrollPane scrpan=new JScrollPane();
	JTable table=new JTable();
	JLabel isbn=new JLabel("ISBN: ");
	JLabel num=new JLabel("Num: ");
	JTextField tisbn=new JTextField(20);
	JTextField tnum=new JTextField(20);
	JButton buy=new JButton("Buy");
	JButton exit=new JButton("Exit");
	_14211154_张子仪_7_Sale sale=new _14211154_张子仪_7_Sale();
	_14211154_张子仪_7_BookCatalog catalog=new _14211154_张子仪_7_BookCatalog();
	_14211154_张子仪_7_ShoppingCarUI car1=new _14211154_张子仪_7_ShoppingCarUI();
	String[] tableHeads = new String[]{"ISBN","Name","Original Price","Present Price","Type"};
	Object[][] cellData = null;
	_14211154_张子仪_7_BuyUI(_14211154_张子仪_7_BookCatalog catalog1,_14211154_张子仪_7_Sale sale1){
		catalog=catalog1;
		sale=sale1;
		this.setTitle("Shopping System");
		this.setSize(600, 500);
		this.getContentPane().setBackground(Color.WHITE);
		this.setLayout(new BorderLayout(0,0));
		this.setVisible(false);
		//按钮
		pan.setLayout(new BorderLayout(0,0));
		pan.setPreferredSize(new Dimension(600,300));
		scrpan.setPreferredSize(new Dimension(500,300));
		showtable();
		pan.add(scrpan,BorderLayout.CENTER);
		pan.setBackground(Color.white);
		this.add(pan,BorderLayout.NORTH);
		this.add(selpan,BorderLayout.CENTER);
		selpan.setLayout(null);
		selpan.add(isbn);
		isbn.setBounds(230, 10,100,30);
		selpan.add(tisbn);
		tisbn.setBounds(280, 10, 100, 30);
		selpan.add(num);
		num.setBounds(230, 50, 100, 30);
		selpan.add(tnum);
		tnum.setBounds(280, 50, 100,30);
		selpan.add(buy);
		buy.setBounds(80, 100, 200, 40);
		buy.addActionListener(this);
		selpan.add(exit);
		exit.setBounds(320, 100, 200, 40);
		exit.addActionListener(this);
		car1=new _14211154_张子仪_7_ShoppingCarUI (sale);
		sale.registerObserver(car1);
	}
	public _14211154_张子仪_7_BuyUI() {
		// TODO Auto-generated constructor stub
	}
	public void showtable(){
		String[] typeHintIn = {"非教材类计算机图书 ","教材类图书",
				"连环画类图书","养生类图书","其他"};
		DefaultTableModel tmd = new DefaultTableModel(cellData,tableHeads);
		table.setModel(tmd);
		TableColumn column1 = table.getColumnModel().getColumn(0);
	    column1.setPreferredWidth(80);
		TableColumn column2 = table.getColumnModel().getColumn(1);
	    column2.setPreferredWidth(130);
	    scrpan.setViewportView(table);
		for(int i = 0; i <catalog.getSize(); i++) {
			Vector<String> v = new Vector<String>();
			v.add(catalog.books.get(i).getIsbn());
			v.add(catalog.books.get(i).getTitle());
			String priceStr = String.format("%.2f", catalog.books.get(i).getPrice());
			v.add(priceStr);
			
			_14211154_张子仪_7_SaleLineItem temp = new _14211154_张子仪_7_SaleLineItem(catalog.books.get(i));
			String prePrice = String.format("%.2f", temp.getSubTotal());
			v.add(prePrice);
			
			int type = catalog.books.get(i).getType() - 1;
			v.add(typeHintIn[type]);
			tmd.addRow(v);
			
		}
		JTable table = new JTable(tmd);
		scrpan.setViewportView(table);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==exit){
			System.exit(0);
		}
		if(e.getSource()==buy){
			String ISBN=tisbn.getText();
			String num1=tnum.getText();
			int num2=0;
			num2=Integer.parseInt(num1);
			_14211154_张子仪_7_BookSpecification book=catalog.getBook(ISBN);
			if(book==null){
				JOptionPane.showMessageDialog(this,"The book is not existed.");
				tisbn.setText(null);
				tnum.setText(null);
			}
			else{
				_14211154_张子仪_7_Controller con=new _14211154_张子仪_7_Controller();
				con.buyBook(book,num2,sale);
				sale.notifyObserver();
				JOptionPane.showMessageDialog(this,"The book is added to your shopping car.");
				tisbn.setText(null);
				tnum.setText(null);
				return ;
			}
		}
	}
}
