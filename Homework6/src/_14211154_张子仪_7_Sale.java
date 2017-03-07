package homework7;
import java.util.*;
public class _14211154_张子仪_7_Sale implements _14211154_张子仪_7_Subject{
	public ArrayList<_14211154_张子仪_7_SaleLineItem> items=new ArrayList<_14211154_张子仪_7_SaleLineItem>();
	public _14211154_张子仪_7_Observer watcher;
	double getTotal(){
		int size = items.size();
		double price=0;
		for (int i=0; i<size; i++) {
		    price=items.get(i).getSubTotal()+price;        
		}
		return price;
	}
	@Override
	public void removeObserver(_14211154_张子仪_7_Observer o) {
		// TODO Auto-generated method stub
		watcher=null;
	}
	@Override
	public void registerObserver(_14211154_张子仪_7_Observer o) {
		// TODO Auto-generated method stub
		watcher=o;
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		watcher.update();
	}
	public int getSize() {
		// TODO Auto-generated method stub
		return items.size();
	}
	public _14211154_张子仪_7_SaleLineItem getItem(int i) {
		// TODO Auto-generated method stub
		return this.items.get(i);
	}
}
