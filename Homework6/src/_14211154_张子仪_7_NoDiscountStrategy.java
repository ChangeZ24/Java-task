package homework7;
import java.util.*;
public class _14211154_张子仪_7_NoDiscountStrategy implements _14211154_张子仪_7_IPricingStrategy {
	int booktype;
	int type=4;
	String name="无优惠";
	public double getSubTotal(_14211154_张子仪_7_SaleLineItem item){
		return item.prodSpec.getPrice();
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
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
