package lianxi;

public class Drink {
	private String name;
	private double price;
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
	public void showInfo(){
		System.out.println("饮料的名称:"+name+",价格:"+price);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Drink)) {
			return false;
		} else {
			if (((Drink) obj).getName().equals(name) && ((Drink) obj).getPrice() == price) {
				return true;

			} else {
				return false;
			}
		}
	}
	
}
