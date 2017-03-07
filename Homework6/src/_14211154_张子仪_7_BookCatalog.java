package homework7;

import java.util.*;

public class _14211154_张子仪_7_BookCatalog {
	ArrayList<_14211154_张子仪_7_BookSpecification> books=new ArrayList<_14211154_张子仪_7_BookSpecification>();
	
	
	_14211154_张子仪_7_BookSpecification getBookSpecification(String book){
		return null;
	}
	public int getSize(){
		return this.books.size();
	}
	public boolean addbook(_14211154_张子仪_7_BookSpecification book){
		for(int i=0;i<books.size();i++){
			if(books.get(i).getIsbn().equals(book.getIsbn()))
				return false;
		}
		books.add(book);
		return true;
	}
	public _14211154_张子仪_7_BookSpecification getBook(String ISBNnum) {
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getIsbn().equals(ISBNnum)) {
				return books.get(i);
			}
		}
		return null;
	}
}
