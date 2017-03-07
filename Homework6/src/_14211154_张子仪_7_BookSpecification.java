package homework7;
import java.util.*;
public class _14211154_张子仪_7_BookSpecification {
	String isbn;
	double price;
	String title;
	int type;
	_14211154_张子仪_7_BookSpecification(){}
	_14211154_张子仪_7_BookSpecification(String isbn,String title,double price,int type){
		this.isbn=isbn;
		this.price=price;
		this.title=title;
		this.type=type;
	}
	_14211154_张子仪_7_BookSpecification(String title,double price,int type){
		this.price=price;
		this.title=title;
		this.type=type;
	}
	public String getIsbn() {
		return this.isbn;
	}
	public String getTitle() {
		return this.title;
	}
	public int getType() {
		return this.type;
	}
	public double getPrice(){
		return this.price ;
	}

}
