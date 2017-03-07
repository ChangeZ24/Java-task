package homework7;
import  java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class _14211154_张子仪_7_AddBookUI extends JFrame implements ActionListener{
	_14211154_张子仪_7_BookCatalog log=new _14211154_张子仪_7_BookCatalog();
	JLabel wel = new JLabel("Books Information Input");
	JLabel Lisbn = new JLabel("The isbn of the book");
	JLabel Ltitle =new JLabel("The title of the book");
	JLabel Lprice =new JLabel("The price of the book");
	JLabel Ltype = new JLabel("The type of the book");
	JTextField Tisbn = new JTextField(20);
	JTextField Ttitle = new JTextField(20);
	JTextField Tprice = new JTextField(20);
	JComboBox<String> Ctype =new JComboBox<String>();
	JButton input =new JButton("Input");
	JButton reset =new JButton("Reset");
	JButton exit =new JButton("Exit");
	_14211154_张子仪_7_BuyUI buy=new _14211154_张子仪_7_BuyUI();
	_14211154_张子仪_7_AddBookUI(_14211154_张子仪_7_BookCatalog log1,_14211154_张子仪_7_BuyUI buy1){
		//窗口
		this.setSize(500, 400);
		this.setLocation(200, 100);
		this.setTitle("Book Catalog Maintenance");
		this.getContentPane().setBackground(Color.white);
		this.setLayout(null);
		this.setVisible(false);
		//输入
		this.add(wel);
		wel.setFont(new Font("Georgia",0,22));
		wel.setBounds(120, 0, 300, 50);
		this.add(Lisbn);
		this.add(Tisbn);
		Lisbn.setFont(new Font("Georgia",0,16));
		Lisbn.setBounds(50,80,200,30);
		Tisbn.setBounds(230, 80, 200, 30);
		this.add(Ltitle);
		this.add(Ttitle);
		Ltitle.setFont(new Font("Georgia",0,16));
		Ltitle.setBounds(50,130,200,30);
		Ttitle.setBounds(230, 130, 200, 30);
		this.add(Lprice);
		this.add(Tprice);
		Lprice.setFont(new Font("Georgia",0,16));
		Lprice.setBounds(50,180,200,30);
		Tprice.setBounds(230, 180, 200, 30);
		this.add(Ltype);
		this.add(Ctype);
		Ltype.setFont(new Font("Georgia",0,16));
		Ltype.setBounds(50,230,200,30);
		Ctype.setBounds(230, 230, 200, 30);
		String[] ch={"非教材计算机类图书","教材类图书","连环画类图书","养生类图书","其他"};
		for(int i=0;i<5;i++){
			Ctype.addItem(ch[i]);
		}
		//按钮
		this.add(input);
		input.setBounds(60, 300, 100, 30);
		input.addActionListener(this);
		this.add(reset);
		reset.setBounds(200, 300, 100, 30);
		reset.addActionListener(this);
		this.add(exit);
		exit.setBounds(340, 300, 100, 30);
		exit.addActionListener(this);
		log=log1;
		buy=buy1;
		_14211154_张子仪_7_Controller cont=new  _14211154_张子仪_7_Controller();
		//_14211154_张子仪_7_BookSpecification b=new _14211154_张子仪_7_BookSpecification();
		cont.addBook("978-7-302-2","UML与模式应用",18,2, log);
		cont.addBook("978-7-312-3", "Java与模式", 34, 1, log);
		cont.addBook("968-6-302-1","HeadFirst设计模式", 58, 1, log);
		cont.addBook("958-1-302-2", "爱丽丝历险记", 30, 3, log);
		cont.addBook("900-7-392-2", "煲汤大全", 20, 4, log);
		buy.showtable();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==input){
			_14211154_张子仪_7_Controller cont=new  _14211154_张子仪_7_Controller();
			 String in_isbn=Tisbn.getText();
			 String in_title = Ttitle.getText();
			 String in_price=Tprice.getText();
			 double i_price=Double.valueOf(in_price);
			 int in_type=Ctype.getSelectedIndex()+1;
			 if(cont.addBook(in_isbn,in_title,i_price,in_type,log)){
				 JOptionPane.showMessageDialog(this,"Your user information is adding successfully！");
				 Tisbn.setText(null);
				 Ttitle.setText(null);
				 Tprice.setText(null);
				 Ctype.setSelectedItem(0);
				 buy.showtable();
			 }
				 else{
				 JOptionPane.showMessageDialog(this,"Your user information is adding unsuccessfully！");
				 Tisbn.setText(null);
				 Ttitle.setText(null);
				 Tprice.setText(null);
				 Ctype.setSelectedItem(0);
				 }
		}
		if(e.getSource()==reset){
			 Tisbn.setText(null);
			 Ttitle.setText(null);
			 Tprice.setText(null);
			 Ctype.setSelectedItem(0);
		}
		if(e.getSource()==exit){
			this.setVisible(false);
		}
	}
}
