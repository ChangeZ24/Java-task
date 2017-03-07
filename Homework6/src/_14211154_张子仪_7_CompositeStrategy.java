package homework7;

import java.util.*;

public class _14211154_������_7_CompositeStrategy implements _14211154_������_7_IPricingStrategy {
	ArrayList<_14211154_������_7_IPricingStrategy> strategies = new ArrayList();
	int type=3;
	String name="��ϲ���";
	String strname;
	int booktype;
	public _14211154_������_7_CompositeStrategy(int booktype1, String name2) {
		// TODO Auto-generated constructor stub
		this.booktype=booktype1;
		this.strname=name2;
	}
	public void delete(){
		for(int i=0;i<this.strategies.size();i++)
			this.strategies.get(i).noncomed();
	}
	@Override
	public double getSubTotal(_14211154_������_7_SaleLineItem item) {
		// TODO Auto-generated method stub
		return item.getProdSpec().getPrice();
	}
	public void add(_14211154_������_7_IPricingStrategy s){
		s.comed();
		this.strategies.add(s);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.strname;
	}
	@Override
	public int getIType() {
		// TODO Auto-generated method stub
		return this.type;
	}
	@Override
	public String getSType() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public int getBookType() {
		// TODO Auto-generated method stub
		return this.booktype;
	}
	int com=0;
	@Override
	public int is_comed() {
		// TODO Auto-generated method stub
		return this.com;
	}
	@Override
	public void comed() {
		// TODO Auto-generated method stub
		this.com=this.is_comed()+1;
	}
	@Override
	public void noncomed() {
		// TODO Auto-generated method stub
		this.com=this.is_comed()-1;
	}
}
