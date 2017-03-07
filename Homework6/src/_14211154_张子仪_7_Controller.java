package homework7;
import java.util.*;
public class _14211154_张子仪_7_Controller {
	public boolean addBook(String isbn,String title,double price,int type,_14211154_张子仪_7_BookCatalog book){
		_14211154_张子仪_7_BookSpecification book1=new _14211154_张子仪_7_BookSpecification(isbn,title,price,type);
		return book.addbook(book1);
	}
	void addCompositeStrategy(_14211154_张子仪_7_CompositeStrategy a,_14211154_张子仪_7_PrincingStrategyFactory str){
		str.catalog.addStrategy(a);
	}
	void addStrategy(int booktype,String name,_14211154_张子仪_7_IPricingStrategy f,_14211154_张子仪_7_IPricingStrategy f1,_14211154_张子仪_7_PrincingStrategyFactory str){
		_14211154_张子仪_7_CompositeBestForCustomer c=new  _14211154_张子仪_7_CompositeBestForCustomer(booktype,name);
		c.add(f);
		c.add(f1);
		str.catalog.addStrategy(c);
	}
	void addStrategy(int discount,int booktype,String name,int type,_14211154_张子仪_7_PrincingStrategyFactory str){
		if(type==1){
			_14211154_张子仪_7_PercentageStrategy f=new _14211154_张子仪_7_PercentageStrategy(discount,booktype,name);
			str.catalog.addStrategy(f);
		}
		else if(type==2){
			_14211154_张子仪_7_FlatRateStrategy f=new _14211154_张子仪_7_FlatRateStrategy(discount,booktype,name);
			str.catalog.addStrategy(f);
		}
	}
	void addSimpleStrategy(double discount,int booktype,String name,_14211154_张子仪_7_PrincingStrategyFactory str){
		_14211154_张子仪_7_FlatRateStrategy f=new _14211154_张子仪_7_FlatRateStrategy(discount,booktype,name);
		str.catalog.addStrategy(f);
	}
	void addSimpleStrategy(int discount,int booktype,String name,_14211154_张子仪_7_PrincingStrategyFactory str){
		_14211154_张子仪_7_PercentageStrategy f=new _14211154_张子仪_7_PercentageStrategy(discount,booktype,name);
		str.catalog.addStrategy(f);
	}
	void deleteStrategy(int num,_14211154_张子仪_7_PrincingStrategyFactory str){
		str.catalog.strategy.remove(num);
	}
	void updateStrategy(int discount1,int booktype1,String name1,_14211154_张子仪_7_PrincingStrategyFactory str){
		_14211154_张子仪_7_PercentageStrategy p=new _14211154_张子仪_7_PercentageStrategy(discount1,booktype1,name1);
		int num=str.catalog.getUpdate();
		str.catalog.strategy.set(num, p);
	}
	void updateStrategy(double discount2,int booktype2,String name2,_14211154_张子仪_7_PrincingStrategyFactory str){
		_14211154_张子仪_7_FlatRateStrategy p=new _14211154_张子仪_7_FlatRateStrategy(discount2,booktype2,name2);
		int num=str.catalog.getUpdate();
		str.catalog.strategy.set(num, p);
	}
	void updateStrategy(_14211154_张子仪_7_IPricingStrategy s,_14211154_张子仪_7_PrincingStrategyFactory str){
		int num=str.catalog.getUpdate();
		str.catalog.strategy.set(num, s);
	}
	void updateStrategy(_14211154_张子仪_7_IPricingStrategy s){
		
	}
	void buyBook(_14211154_张子仪_7_BookSpecification book,int copies,_14211154_张子仪_7_Sale sale){
		_14211154_张子仪_7_SaleLineItem book1=new _14211154_张子仪_7_SaleLineItem(copies,book.getPrice(),book.getTitle(),book.getType());
		sale.items.add(book1);
	}
	_14211154_张子仪_7_Sale getSale(){
		return null;
	}
	public boolean is_input(String isbn,_14211154_张子仪_7_BookCatalog book){
		for(int i=0;i<book.books.size();i++){
			if(book.books.get(i).isbn.equals(isbn))
				return false;
		}
		return true;
	}
}
