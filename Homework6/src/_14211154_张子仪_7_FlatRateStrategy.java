package homework7;
import java.util.*;
public class _14211154_张子仪_7_FlatRateStrategy implements _14211154_张子仪_7_IPricingStrategy {
	double discountPerBook;
	int type=2;
	String strname;
	String name="绝对值优惠策略";
	int booktype;
	public _14211154_张子仪_7_FlatRateStrategy(double discount, int booktype1, String name2) {
		// TODO Auto-generated constructor stub
		this.strname=name2;
		this.discountPerBook=discount;
		this.booktype=booktype1;
	}
	public double getDiscountPerBook() {
		return discountPerBook;
	}
	
			
	@Override
	public double getSubTotal(_14211154_张子仪_7_SaleLineItem item) {
		// TODO Auto-generated method stub
			return item.prodSpec.getPrice()-discountPerBook;
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
