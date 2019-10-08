package lianxi;

public class TestBookStore {
	public static void main(String[] args) {
	BookStore<Book> bs=new BookStore<Book>();
	Book b=new Book();
	b.setName("sanguo");
	b.setNO(1);
	b.setPrice(100);
	Book b1=new Book();
	b1.setName("honglou");
	b1.setNO(2);
	b1.setPrice(200);
	bs.buy(b1);
	bs.buy(b);
	bs.showInfo();
	Book b2=new Book();
	b2.setName("honglou");
	b2.setNO(2);
	b2.setPrice(200);
	System.out.println(bs.contain(b2));
	BookStore<Drink> bd=new BookStore<Drink>();
	Drink dk=new Drink();
	dk.setName("Cola");
	dk.setPrice(2);
	Drink dk1=new Drink();
	dk1.setName("°ËÍõËÂ");
	dk1.setPrice(3);
	bd.buy(dk1);
	bd.buy(dk);
	bd.showInfo();
	Drink dk2=new Drink();
	dk2.setName("°ËÍõËÂ");
	dk2.setPrice(3);
	System.out.println(bd.contain(dk2));
	System.out.println(Integer.valueOf(5)==Integer.valueOf(6 ));
	
	}
}
