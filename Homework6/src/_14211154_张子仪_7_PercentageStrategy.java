package homework7;
import java.util.*;
public class _14211154_张子仪_7_PercentageStrategy implements _14211154_张子仪_7_IPricingStrategy {
	int discountPercentage;
	String name="百分比折扣策略";
	String strname;
	int type=1;
	int booktype;
	public _14211154_张子仪_7_PercentageStrategy(int discount, int booktype2, String name2) {
		// TODO Auto-generated constructor stub
		this.discountPercentage=discount;
		this.booktype=booktype2;
		this.strname=name2;
	}
	public double getSubTotal(_14211154_张子仪_7_SaleLineItem item){
		return item.getProdSpec().getPrice()*(100-discountPercentage)/100;
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
	public int getDiscountPercentage() {
		return discountPercentage;
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
