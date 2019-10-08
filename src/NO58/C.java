package NO58;

public class C extends B {
	public static void main(String[] args) {
		Foo fo=new A();
		B x=new C();
		A a = x;
		Foo f =  x;
		//Foo f = (A) x;
		B b = (B) (A) x; 
//		如果父类实现了某个接口，那么它的子类也是可以实现其接口
//		例如   Foo fo=new A();
// 			Foo f =  x;
//		关于对象的强制转换，如果是通过向上转型得来的，例如：
//		A a=new B();那么b可以向上强转成A,因为它是向上转型来的，但是如果
//		A a=new A();没有向上转型，那么b就不能向上强转成A类
		
		
		
	}
}
