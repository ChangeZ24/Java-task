package homework7;
import java.util.*;
public class _14211154_张子仪_7_CompositeBestForCustomer extends _14211154_张子仪_7_CompositeStrategy {
	public _14211154_张子仪_7_CompositeBestForCustomer(int booktype1, String name1) {
		// TODO Auto-generated constructor stub
		super(booktype1,name1);
	}
	public double getSubTotal(_14211154_张子仪_7_SaleLineItem s){
		double min=s.getProdSpec().getPrice();
		for(int i=0;i<super.strategies.size();i++){
			double temp=super.strategies.get(i).getSubTotal(s);
			if(temp<min)
				min=temp;
		}
		return min;
	}
}
