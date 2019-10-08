package NO57;

public class Yen extends Money{
//	public String getC(){return super.country;} //不能直接访问父类的私有属性
	public String getC(){return super.getC();} 
}
