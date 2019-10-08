package lianxi;

import java.util.ArrayList;
import java.util.List;

public class BookStore<T> {
	private List<T> lb=new ArrayList<T>();
	public T buy(T t){
		lb.add(t);
		return t;
	}
	public T sall(T t){
		lb.remove(t);
		return t;
		
	}
	
	public void showInfo(){
		for(T b:lb){
			if(b instanceof Book){
				((Book) b).showInfo();
			}else if(b instanceof Drink){
				((Drink)b).showInfo();
			}
			
		}
	}
	public boolean contain(T t){
		boolean flag = lb.contains(t);
		return flag;
	}
	
	
	
}
	
	

