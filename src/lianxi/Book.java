package lianxi;

public class Book {
	private String name;
	private double price;
	private int NO;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNO() {
		return NO;
	}
	public void setNO(int nO) {
		NO = nO;
	}
	public void showInfo(){
		System.out.println("书编号:"+NO+",书名:"+name+",单价:"+","+price);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + NO;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book){
			if(((Book) obj).getName().equals(name)&&((Book)obj).getNO()==NO){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
}
