package homework7;
import java.util.*;
public class _14211154_������_7_Sale implements _14211154_������_7_Subject{
	public ArrayList<_14211154_������_7_SaleLineItem> items=new ArrayList<_14211154_������_7_SaleLineItem>();
	public _14211154_������_7_Observer watcher;
	double getTotal(){
		int size = items.size();
		double price=0;
		for (int i=0; i<size; i++) {
		    price=items.get(i).getSubTotal()+price;        
		}
		return price;
	}
	@Override
	public void removeObserver(_14211154_������_7_Observer o) {
		// TODO Auto-generated method stub
		watcher=null;
	}
	@Override
	public void registerObserver(_14211154_������_7_Observer o) {
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
	public _14211154_������_7_SaleLineItem getItem(int i) {
		// TODO Auto-generated method stub
		return this.items.get(i);
	}
}
