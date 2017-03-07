package homework7;
import java.awt.Component;
import java.util.*;
public class _14211154_������_7_SaleLineItem {
	public _14211154_������_7_BookSpecification prodSpec=new _14211154_������_7_BookSpecification();
	public _14211154_������_7_IPricingStrategy strategy;
	int copies;
	public _14211154_������_7_SaleLineItem(){
	};
	public _14211154_������_7_SaleLineItem(_14211154_������_7_BookSpecification prodSpec, _14211154_������_7_IPricingStrategy strategy) {
		this.prodSpec = prodSpec;
		this.strategy = strategy;
	}
	_14211154_������_7_SaleLineItem(int copies,double price1,String title1,int type1){
		this.copies=copies;
		_14211154_������_7_BookSpecification temp=new _14211154_������_7_BookSpecification(title1,price1,type1);
		this.setProdSpec(temp);
	}
	public _14211154_������_7_SaleLineItem(_14211154_������_7_BookSpecification b) {
		// TODO Auto-generated constructor stub
		this.prodSpec=b;
		this.copies=1;
	}
	public void setProdSpec(_14211154_������_7_BookSpecification prodSpec) {
		this.prodSpec = prodSpec;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	double getSubTotal(){
		_14211154_������_7_PrincingStrategyFactory e=_14211154_������_7_PrincingStrategyFactory.getInstance();
		int type=this.getProdSpec().getType();
		this.strategy=e.getPrincingStreategy(type);
		double total=this.strategy.getSubTotal(this);
		return copies*total;
	}
	public _14211154_������_7_BookSpecification getProdSpec() {
		return prodSpec;
	}
	public int getCopies() {
		return copies;
	}
	public _14211154_������_7_IPricingStrategy getStrategy() {
		return strategy;
	}
}
