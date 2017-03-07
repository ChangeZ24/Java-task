package homework7;

import java.util.*;

public class _14211154_张子仪_7_StrategyCatalog {
	HashMap<Integer,_14211154_张子仪_7_IPricingStrategy>strategies=new HashMap<Integer,_14211154_张子仪_7_IPricingStrategy>();
	ArrayList<_14211154_张子仪_7_IPricingStrategy>strategy=new ArrayList<_14211154_张子仪_7_IPricingStrategy>();
	int update=-1;
	public _14211154_张子仪_7_IPricingStrategy getStrategy(int num){
		if(num>=0&&num<this.strategy.size())
			return this.strategy.get(num);
		return null;
	}
	public void addStrategy(_14211154_张子仪_7_IPricingStrategy a) {
		this.strategies.put(a.getBookType(), a);
		this.strategy.add(a);
	}
	public void delStrategy(_14211154_张子仪_7_IPricingStrategy a){
		this.strategies.remove(a.getBookType());
		strategy.remove(a);
	}
	public void setUpdate(int num){
		this.update=num;
	}
	public int getUpdate(){
		return this.update;
	}
	public void update(_14211154_张子仪_7_IPricingStrategy s){
		_14211154_张子仪_7_IPricingStrategy t=strategies.get(s.getBookType());
		strategies.put(s.getBookType(), s);
	}
}
