package NO51;

public class C extends B {
	public AImpl doit(){
//		对于重写，如果继承过来的子类返回值是父类方法返回值得子类，那么可以理解为同一
//		类型，例如：B方法返回值是A类型（可以理解为一个借口类型的对象）,C继承了B
//		重写方法返回值是AImpl，它实现了A，可以理解为A的子类，所以被认为是同一种返回值类型
		 //more code here
		return null;
		}
		
//		public Object execute(){
//		//more code here
//			return null;
//		} 
}
