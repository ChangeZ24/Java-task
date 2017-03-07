package homework7;
import  java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.event.*;
public class _14211154_张子仪_7_ShoppingCarUI extends JFrame implements _14211154_张子仪_7_Observer {
	JTable table=new JTable();
	JPanel pan=new JPanel();
	JPanel selpan=new JPanel();
	JScrollPane scrpan=new JScrollPane();
	JLabel money=new JLabel();
	JLabel total=new JLabel();
	_14211154_张子仪_7_Sale sale=new _14211154_张子仪_7_Sale();
	_14211154_张子仪_7_ShoppingCarUI(_14211154_张子仪_7_Sale mySale){
		sale=mySale;
		this.setTitle("Shopping Car");
		this.setSize(300, 500);
		this.getContentPane().setBackground(Color.WHITE);
		this.setLayout(new BorderLayout(0,0));
		this.setLocation(680, 0);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
		//按钮
		pan.setLayout(new BorderLayout(0,0));
		pan.setPreferredSize(new Dimension(300,350));
		scrpan.setPreferredSize(new Dimension(300,300));
		showtable1();
		pan.add(scrpan,BorderLayout.CENTER);
		pan.setBackground(Color.white);
		this.add(pan,BorderLayout.NORTH);
		this.add(selpan,BorderLayout.CENTER);
		selpan.setLayout(null);
		selpan.add(money);
		money.setText("Total Money");
		money.setFont(new Font("Georgia",1,13));
		money.setBounds(100, 20, 100, 40);
		selpan.add(total);
		total.setFont(new Font("楷体",1,15));
		total.setBounds(100, 55, 100, 40);
		
	}

	public _14211154_张子仪_7_ShoppingCarUI() {
		// TODO Auto-generated constructor stub
	}

	public void showtable1(){
		String[] tableHeads = new String[]{"Name","Num","Price"};
		Object[][] cellData = null;
		DefaultTableModel tmd = new DefaultTableModel(cellData,tableHeads);
		for(int i = 0; i < sale.getSize(); i++) {
			Vector<String> v = new Vector<String>();
			v.add(sale.getItem(i).getProdSpec().getTitle());
			int num = sale.getItem(i).getCopies();
			String numS = Integer.toString(num) + "本";
			double price=sale.getItem(i).getSubTotal();
			v.add(numS);
			v.add(Double.toString(price));
			tmd.addRow(v);
		}
		JTable table = new JTable(tmd);
		scrpan.setViewportView(table);
		double totalMoney = sale.getTotal();
		String totalMoneyS = String.format("%.2f", totalMoney);
		total.setText(totalMoneyS + "元");
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		showtable1();
		this.setVisible(true);
	}

}
