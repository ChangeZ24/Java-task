package homework7;
import java.util.*;

import homework6._14211154_������_6_NoDiscountStrategy;
public class _14211154_������_7_PrincingStrategyFactory {
	static _14211154_������_7_PrincingStrategyFactory instance=null;
	_14211154_������_7_StrategyCatalog catalog=new _14211154_������_7_StrategyCatalog();
	public static _14211154_������_7_PrincingStrategyFactory getInstance(){
		if(instance==null){
			instance=new _14211154_������_7_PrincingStrategyFactory();
		}
		return instance;
	}
	_14211154_������_7_IPricingStrategy getPrincingStreategy(int Type){
		if(this.catalog.strategies.isEmpty()==true||this.catalog.strategies.containsKey(Type)==false)
			return new _14211154_������_7_NoDiscountStrategy();
		else 
			return this.catalog.strategies.get(Type);
	}
	public void update(_14211154_������_7_IPricingStrategy strategy){
		catalog.update(strategy);
	}
	public void setCatalog(_14211154_������_7_StrategyCatalog catalog) {
		this.catalog = catalog;
	}
}
