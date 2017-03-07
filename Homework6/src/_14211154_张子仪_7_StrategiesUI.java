package homework7;
import  java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.awt.event.*;
public class _14211154_张子仪_7_StrategiesUI extends JFrame implements ActionListener{
	_14211154_张子仪_7_PrincingStrategyFactory f=_14211154_张子仪_7_PrincingStrategyFactory.getInstance();
	_14211154_张子仪_7_StrategyCatalog catalog;
	JLabel wel = new JLabel("Strategy Information Input");
	JButton add=new JButton("Add Strategy");
	JButton del = new JButton("Delete Strategy");
	JButton up=new JButton("Update Strategy");
	JButton in=new JButton("Inquire Strategy");
	
	JFrame addframe0 = new JFrame("Add Strategy");
	JButton fla=new JButton("FlatRate Strategy");
	JButton per=new JButton("Percentage Strategy");
	JButton cop = new JButton("Composite Strategy");
	JLabel  wel1=new JLabel("Please select the strategy you want to add:");
	
	JFrame addframe1=new JFrame("Add FlatRate Strategy");
	JLabel name1=new JLabel("The name of the stragegy:");
	JLabel su1=new JLabel("The suitable book type of the strategy:");
	JLabel per1=new JLabel("The discount money of the strategy:");
	JTextField tname1=new JTextField(20);
	JTextField tper1=new JTextField(20);
	JComboBox<String> csu1 =new JComboBox<String>();
	JButton add1=new JButton("Add");
	JButton update1=new JButton("Update");
	JButton exit1=new JButton("Exit");
	
	JFrame addframe2=new JFrame("Add Percentage Strategy");
	JLabel name2=new JLabel("The name of the stragegy:");
	JLabel su2=new JLabel("The suitable book type of the strategy:");
	JLabel per2=new JLabel("The discount percentage of the strategy:");
	JTextField tname2=new JTextField(20);
	JTextField tper2=new JTextField(20);
	JComboBox<String> csu2 =new JComboBox<String>();
	JButton add2=new JButton("Add");
	JButton update2=new JButton("Update");
	JButton exit2=new JButton("Exit");
	
	JFrame addframe3=new JFrame("The Current Strategy");
	JTable table=new JTable();
	JPanel pan=new JPanel();
	JPanel selpan=new JPanel();
	JScrollPane scrpan=new JScrollPane();
	JButton add3=new JButton("Add Composite Strategy");
	JButton del1=new JButton("Delete");
	JButton up1=new JButton("Update");
	
	JFrame addframe4 =new JFrame("Add Coposite Strategy");
	JLabel name3=new JLabel("The name of the strategy:");
	JTextField tname3= new JTextField(20);
	JLabel su3=new JLabel("The suitable book type of the strategy:");
	JComboBox<String> csu3 =new JComboBox<String>();
	JButton add4=new JButton("Add");
	JButton update3=new JButton("Update");
	JButton exit3=new JButton("Exit");
	
	//JFrame addframe5=new JFrame("Update Strategy");
	
	_14211154_张子仪_7_StrategiesUI(_14211154_张子仪_7_StrategyCatalog catalog1){
		catalog=catalog1;
		f.setCatalog(catalog);
		//主界面
		this.setSize(500, 400);
		this.setLocation(200, 100);
		this.setTitle("Strategy Catalog Maintenance");
		this.getContentPane().setBackground(Color.white);
		this.setLayout(null);
		this.setVisible(false);
		//主界面选择
		this.add(wel);
		wel.setFont(new Font("Georgia",0,22));
		wel.setBounds(120, 20, 300, 50);
		this.add(add);
		add.setFont(new Font("Georgia",0,15));
		add.setBounds(150, 100, 200, 40);
		add.addActionListener(this);
		this.add(del);
		del.setFont(new Font("Georgia",0,15));
		del.setBounds(150, 160, 200, 40);
		del.addActionListener(this);
		this.add(up);
		up.setFont(new Font("Georgia",0,15));
		up.setBounds(150, 220,200, 40);
		up.addActionListener(this);
		this.add(in);
		in.setFont(new Font("Georgia",0,15));
		in.setBounds(150, 280, 200, 40);
		in.addActionListener(this);
		//添加界面
		addframe0.setSize(400, 300);
		addframe0.setLocation(300, 200);
		addframe0.getContentPane().setBackground(Color.white);
		addframe0.setLayout(null);
		addframe0.setVisible(false);
		//添加界面输入
		addframe0.add(wel1);
		wel1.setFont(new Font("Georgia",1,13));
		wel1.setBounds(20, 0, 400, 50);
		addframe0.add(fla);
		fla.setFont(new Font("Georgia",0,15));
		fla.setBounds(100, 60,200, 40);
		fla.addActionListener(this);
		addframe0.add(per);
		per.setFont(new Font("Georgia",0,15));
		per.setBounds(100, 120,200, 40);
		per.addActionListener(this);
		addframe0.add(cop);
		cop.setFont(new Font("Georgia",0,15));
		cop.setBounds(100, 180,200, 40);
		cop.addActionListener(this);
		//绝对值策略
		addframe1.setSize(600, 320);
		addframe1.setLocation(10, 250);
		addframe1.getContentPane().setBackground(Color.white);
		addframe1.setLayout(null);
		addframe1.setVisible(false);
		//绝对值策咯输入
		addframe1.add(name1);
		name1.setFont(new Font("Georgia",1,15));
		name1.setBounds(20, 30, 300, 30);
		addframe1.add(su1);
		su1.setFont(new Font("Georgia",1,15));
		su1.setBounds(20, 90, 300, 30);
		addframe1.add(per1);
		per1.setFont(new Font("Georgia",1,15));
		per1.setBounds(20, 150, 300, 30);
		addframe1.add(tname1);
		tname1.setBounds(360, 30, 160, 30);
		addframe1.add(tper1);
		tper1.setBounds(360, 150, 160, 30);
		addframe1.add(csu1);
		csu1.setBounds(360, 90, 160, 30);
		String[] ch={"非教材计算机类图书","教材类图书","连环画类图书","养生类图书","其他"};
		for(int i=0;i<5;i++){
			csu1.addItem(ch[i]);
		}
		addframe1.add(add1);
		add1.setBounds(80, 210, 120, 40);
		add1.addActionListener(this);
		addframe1.add(update1);
		update1.setBounds(240, 210, 120, 40);
		update1.addActionListener(this);
		addframe1.add(exit1);
		exit1.setBounds(400, 210, 120, 40);
		exit1.addActionListener(this);
		//百分比策咯
		addframe2.setSize(600, 320);
		addframe2.setLocation(10, 250);
		addframe2.getContentPane().setBackground(Color.white);
		addframe2.setLayout(null);
		addframe2.setVisible(false);
		//绝对值策咯输入
		addframe2.add(name2);
		name2.setFont(new Font("Georgia",1,15));
		name2.setBounds(20, 30, 330, 30);
		addframe2.add(su2);
		su2.setFont(new Font("Georgia",1,15));
		su2.setBounds(20, 90, 330, 30);
		addframe2.add(per2);
		per2.setFont(new Font("Georgia",1,15));
		per2.setBounds(20, 150, 330, 30);
		addframe2.add(tname2);
		tname2.setBounds(360, 30, 160, 30);
		addframe2.add(tper2);
		tper2.setBounds(360, 150, 160, 30);
		addframe2.add(csu2);
		csu2.setBounds(360, 90, 160, 30);
		String[] ch1={"非教材计算机类图书","教材类图书","连环画类图书","养生类图书","其他"};
		for(int i=0;i<5;i++){
			csu2.addItem(ch1[i]);
		}
		addframe2.add(add2);
		add2.setBounds(80, 210, 120, 40);
		add2.addActionListener(this);
		addframe2.add(update2);
		update2.setBounds(240, 210, 120, 40);
		update2.addActionListener(this);
		addframe2.add(exit2);
		exit2.setBounds(400, 210, 120, 40);
		exit2.addActionListener(this);
		//当前策咯界面
		addframe3.setSize(700, 450);
		addframe3.setLocation(630, 300);
		addframe3.getContentPane().setBackground(Color.white);
		addframe3.setResizable(false);
		addframe3.setLayout(new BorderLayout(0,0));
		addframe3.setVisible(false);
		pan.setLayout(new BorderLayout(0,0));
		pan.setPreferredSize(new Dimension(500,300));
		scrpan.setPreferredSize(new Dimension(500,300));
		showstr();
		pan.add(scrpan,BorderLayout.CENTER);
		pan.setBackground(Color.white);
		addframe3.add(pan,BorderLayout.NORTH);
		addframe3.add(selpan,BorderLayout.CENTER);
		selpan.setLayout(null);
		selpan.add(add3);
		add3.setBounds(100, 40, 200, 40);
		add3.addActionListener(this);
		selpan.add(del1);
		del1.setBounds(340, 40, 100, 40);
		del1.addActionListener(this);
		selpan.add(up1);
		up1.setBounds(480, 40, 100, 40);
		up1.addActionListener(this);
		//组合策略
		addframe4.setSize(600, 270);
		addframe4.setLocation(300, 200);
		addframe4.getContentPane().setBackground(Color.white);
		addframe4.setLayout(null);
		addframe4.setVisible(false);
		//组合策咯输入
		addframe4.add(name3);
		name3.setFont(new Font("Georgia",1,15));
		name3.setBounds(20, 30, 330, 30);
		addframe4.add(su3);
		su3.setFont(new Font("Georgia",1,15));
		su3.setBounds(20, 90, 330, 30);
		addframe4.add(tname3);
		tname3.setBounds(360, 30, 160, 30);
		addframe4.add(csu3);
		csu3.setBounds(360, 90, 160, 30);
		String[] ch2={"非教材计算机类图书","教材类图书","连环画类图书","养生类图书","其他"};
		for(int i=0;i<5;i++){
			csu3.addItem(ch2[i]);
		}
		addframe4.add(add4);
		add4.setBounds(80, 160, 120, 40);
		add4.addActionListener(this);
		addframe4.add(update3);
		update3.setBounds(240, 160, 120, 40);
		update3.addActionListener(this);
		addframe4.add(exit3);
		exit3.setBounds(400, 160, 120, 40);
		exit3.addActionListener(this);
		_14211154_张子仪_7_Controller con=new _14211154_张子仪_7_Controller();
		con.addStrategy(1,2,"绝对值优惠策咯1",2,f);
		con.addStrategy(7, 3, "百分比策略1", 1, f);
		con.addStrategy(3, 1,"百分比优惠策略2", 1, f);
		con.addStrategy(4, "顾客最优策略1", f.catalog.strategies.get(2), f.catalog.strategies.get(1),f);
		this.showstr();
	}
	public void showstr(){
		String th[]=new String[]{"ID","Name","Type","Book Type","Discount(Money/Percentage)","Select"};
		Object[][] cell=null;
		DefaultTableModel t=new DefaultTableModel(cell,th);
		String[] booktype={"非教材计算机类","教材类","连环画类","养生类","其他"};
		for(int i=0;i < f.catalog.strategy.size();i++){////////////
			ArrayList<String> list=new ArrayList();
			_14211154_张子仪_7_IPricingStrategy temp=f.catalog.getStrategy(i);
			list.add("Discount00"+Integer.toString(i+1));
			list.add(temp.getName());
			list.add(temp.getSType());
			int type=temp.getBookType()-1;
			list.add(booktype[type]);
			
			if(temp.getIType()==1){
				_14211154_张子仪_7_PercentageStrategy a=(_14211154_张子仪_7_PercentageStrategy)temp;
				 int discount = a.getDiscountPercentage();
				 list.add(Integer.toString(discount));
			}
			else if(temp.getIType()==2){
				_14211154_张子仪_7_FlatRateStrategy a =(_14211154_张子仪_7_FlatRateStrategy)temp;
				double discount=a.getDiscountPerBook();
				list.add(Double.toString(discount));
			}
			else
				list.add("--");
			t.addRow(new Object[]{list.get(0),list.get(1),list.get(2),list.get(3),list.get(4),new Boolean(false)});
		}
		table.setModel(t);
		TableColumn column0 = table.getColumnModel().getColumn(0);
	    column0.setPreferredWidth(120);
		TableColumn column1 = table.getColumnModel().getColumn(1);
	    column1.setPreferredWidth(150);
		TableColumn column2 = table.getColumnModel().getColumn(2);
	    column2.setPreferredWidth(150);
		TableColumn column3 = table.getColumnModel().getColumn(3);
	    column3.setPreferredWidth(170);
		TableColumn column4 = table.getColumnModel().getColumn(4);
	    column4.setPreferredWidth(250);
		scrpan.setViewportView(table);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(5).setCellEditor(new DefaultCellEditor(new JCheckBox()));
		tcm.getColumn(5).setCellRenderer(new TestTableCellRenderer());     
		tcm.getColumn(5).setPreferredWidth(80);
		tcm.getColumn(5).setWidth(80);
		tcm.getColumn(5).setMaxWidth(80); 
		
		 //addStrategy(int discount,int booktype,String name,int type,_14211154_张子仪_7_PrincingStrategyFactory str)
		 //addStrategy(int booktype,String name,_14211154_张子仪_7_FlatRateStrategy f,_14211154_张子仪_7_PercentageStrategy f1)
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==add){
			addframe0.setVisible(true);
		}
		if(e.getSource()==del){
			addframe3.setVisible(true);
		}
		if(e.getSource()==in){
			addframe3.setVisible(true);
		}
		if(e.getSource()==up){
			addframe3.setVisible(true);
		}
		if(e.getSource()==fla){
			addframe1.setVisible(true);
		}
		if(e.getSource()==per){
			addframe2.setVisible(true);
		}
		if(e.getSource()==cop){
			addframe3.setVisible(true);
		}
		if(e.getSource()==add3){
			int count=0;
			for(int i=0;i<f.catalog.strategy.size();i++){
				if(((Boolean)(table).getValueAt(i,5)).booleanValue())
					count++;
			}
			if(count<2){
				JOptionPane.showMessageDialog(addframe3, "Please select selections at lease 2");
				return ;
			}
			addframe4.setVisible(true);
		}
		if(e.getSource()==del1){
			for(int i=0;i<f.catalog.strategy.size();i++){
				if(((Boolean)(table).getValueAt(i,5)).booleanValue()){
					if(f.catalog.getStrategy(i).is_comed()==0){
						//f.catalog=catalog;
						_14211154_张子仪_7_Controller con=new _14211154_张子仪_7_Controller();
						_14211154_张子仪_7_IPricingStrategy a=f.catalog.strategy.get(i);
						if(f.catalog.getStrategy(i).getIType()==3){
							_14211154_张子仪_7_CompositeStrategy a1=(_14211154_张子仪_7_CompositeStrategy)a;
							a1.delete();
							for(int j=0;j<i;j++)
								if(((Boolean)(table).getValueAt(j,5)).booleanValue())
									a.noncomed();
						}
						con.deleteStrategy(i, f);
						i--;
						this.showstr();
					}
					else{
						JOptionPane.showMessageDialog(addframe3, "This strategy is composited to another composite strategy, so can't be deleted");
					}
				}
			}
			//JOptionPane.showMessageDialog(addframe3, "There are no strategies to delete");
		}
		if(e.getSource()==add1){
			addframe3.setVisible(true);
			String name=tname1.getText();
			String count=tper1.getText();
			double discount;
			discount=Double.parseDouble(count);
			int booktype=csu1.getSelectedIndex()+1;
			_14211154_张子仪_7_Controller con=new _14211154_张子仪_7_Controller();
			con.addSimpleStrategy(discount,booktype,name,f);/////////////////////////////////
			//con.updateStrategy(f.catalog.getStrategy(i));
			this.showstr();
			//if(f.catalog.strategies.isEmpty()==true){
				JOptionPane.showMessageDialog(addframe1, "Add Successfully!");
			//}
			tname1.setText(null);
			tper1.setText(null);
			csu1.setSelectedIndex(0);
			addframe3.setVisible(false);
		}
		if(e.getSource()==update1){
			String name=tname1.getText();
			String count=tper1.getText();
			double discount;
			discount=Double.parseDouble(count);
			int booktype=csu1.getSelectedIndex()+1;
			_14211154_张子仪_7_Controller con=new _14211154_张子仪_7_Controller();
			if(f.catalog.getUpdate()==-1){
				JOptionPane.showMessageDialog(addframe1, "The strategy is not existed!");
			    return ;
			}
			con.updateStrategy(discount,booktype,name,f);
			this.showstr();
			JOptionPane.showMessageDialog(addframe1, "Update Successfully!");
			tname1.setText(null);
			tper1.setText(null);
			csu1.setSelectedIndex(0);
			addframe3.setVisible(false);
		}
		if(e.getSource()==exit1){
			addframe3.setVisible(false);
			addframe1.setVisible(false);
		}
		if(e.getSource()==add2){
			addframe3.setVisible(true);
			String name=tname2.getText();
			String count=tper2.getText();
			int discount;
			discount=Integer.parseInt(count);
			int booktype=csu2.getSelectedIndex()+1;
			_14211154_张子仪_7_Controller con=new _14211154_张子仪_7_Controller();
			con.addSimpleStrategy(discount,booktype,name,f);
			this.showstr();
			JOptionPane.showMessageDialog(addframe2, "Add Successfully!");
			tname2.setText(null);
			tper2.setText(null);
			csu2.setSelectedIndex(0);
			addframe3.setVisible(false);
		}
		if(e.getSource()==update2){
			String name=tname2.getText();
			String count=tper2.getText();
			int discount;
			discount=Integer.parseInt(count);
			int booktype=csu2.getSelectedIndex()+1;
			_14211154_张子仪_7_Controller con=new _14211154_张子仪_7_Controller();
			if(f.catalog.getUpdate()==-1){
				JOptionPane.showMessageDialog(addframe2, "The strategy is not existed!");
			    return ;
			}
			con.updateStrategy(discount,booktype,name,f);
			this.showstr();
			JOptionPane.showMessageDialog(addframe2, "Update Successfully!");
			tname2.setText(null);
			tper2.setText(null);
			csu2.setSelectedIndex(0);
			addframe3.setVisible(false);
		}
		if(e.getSource()==exit2){
			addframe3.setVisible(false);
			addframe2.setVisible(false);
		}
		if(e.getSource()==add4){
			String name=tname3.getText();
			int booktype=csu3.getSelectedIndex()+1;
			_14211154_张子仪_7_CompositeBestForCustomer c=new  _14211154_张子仪_7_CompositeBestForCustomer(booktype,name);
			for(int i=0;i<f.catalog.strategy.size();i++){
				if(((Boolean)table.getValueAt(i, 5)).booleanValue()){
					c.add(f.catalog.getStrategy(i));
				}
			}
			_14211154_张子仪_7_Controller con=new _14211154_张子仪_7_Controller();
			con.addCompositeStrategy(c,f);
			this.showstr();
			JOptionPane.showMessageDialog(addframe4, "Add Successfully!");
			tname3.setText(null);
			csu3.setSelectedIndex(0);
			addframe3.setVisible(false);
		}
		if(e.getSource()==update3){
			String name=tname3.getText();
			int booktype=csu3.getSelectedIndex()+1;
			_14211154_张子仪_7_CompositeBestForCustomer c=new  _14211154_张子仪_7_CompositeBestForCustomer(booktype,name);
			for(int i=0;i<f.catalog.strategy.size();i++){
				if(((Boolean)table.getValueAt(i, 5)).booleanValue()){
					c.add(f.catalog.getStrategy(i));
				}
			}
			_14211154_张子仪_7_Controller con=new _14211154_张子仪_7_Controller();
			if(f.catalog.getUpdate()==-1){
				JOptionPane.showMessageDialog(addframe2, "The strategy is not existed!");
			    return ;
			}
			con.updateStrategy(c,f);
			this.showstr();
			JOptionPane.showMessageDialog(addframe4, "Update Successfully!");
			tname3.setText(null);
			csu3.setSelectedIndex(0);
			addframe3.setVisible(false);
		}
		if(e.getSource()==exit3){
			addframe3.setVisible(false);
			addframe4.setVisible(false);
		}
		if(e.getSource()==up1){
			int num=0;
			int count=0;
			for(int i=0;i<f.catalog.strategy.size();i++){
				if(((Boolean)table.getValueAt(i, 5)).booleanValue()){
					count++;
					num=i;
					if(count!=1){
						JOptionPane.showMessageDialog(addframe3, "Please select one selection to update!");;
						return ;
					}
				}
			}
			if(count!=1){
				JOptionPane.showMessageDialog(addframe3, "Please select one selection to update!");;
				return ;
			}
			if(f.catalog.getStrategy(num).is_comed()!=0){
				JOptionPane.showMessageDialog(addframe3,"This strategy is composited to another composite strategy, so can't be updated!");
				return ;
			}
			f.catalog.setUpdate(num);
			_14211154_张子仪_7_IPricingStrategy temp=f.catalog.getStrategy(num);
			if(f.catalog.getStrategy(num).getIType()==1){//百分比
				addframe2.setVisible(true);
				tname2.setText(temp.getName());
				int booktype=temp.getBookType()-1;
				csu2.setSelectedIndex(booktype);
				_14211154_张子仪_7_PercentageStrategy p=(_14211154_张子仪_7_PercentageStrategy)temp;
				tper2.setText(Integer.toString(p.getDiscountPercentage()));
			}
			else if(f.catalog.getStrategy(num).getIType()==2){//绝对值
				addframe1.setVisible(true);
				tname1.setText(temp.getName());
				int booktype=temp.getBookType()-1;
				csu1.setSelectedIndex(booktype);
				_14211154_张子仪_7_FlatRateStrategy f=(_14211154_张子仪_7_FlatRateStrategy)temp;
				tper1.setText(Double.toString(f.getDiscountPerBook()));
			}
			else if(f.catalog.getStrategy(num).getIType()==3){//组合
				addframe4.setVisible(true);
				tname3.setText(temp.getName());
				int booktype=temp.getBookType()-1;
				csu3.setSelectedIndex(booktype);
			}
		}
		
	}
	class TestTableCellRenderer extends JCheckBox implements TableCellRenderer {
		 public Component getTableCellRendererComponent(JTable table, 
				 Object value, boolean isSelected, boolean hasFocus, int row,int column) {
			 Boolean b = (Boolean) value; 
			 this.setSelected(b.booleanValue()); 
			 return this;  
		 }
	}
}
