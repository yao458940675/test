package NO53;

import NO54.A;

public class Alpha {
	private String alpha;

	public Alpha() {
		this("A");
	}

	protected Alpha(String a) {
		alpha = a;
	}
//	package beta;
//	public class Beta extends alpha.Alpha{
//	public Beta(String a){super(a);}
	//类，为public，构造器可以为public ，对于不同、包的方法，权限为protected
//	子类可以访问
	public static void main(String[] args) {
		A a =new A();
		a.name="hah";
		System.out.println(a.name);
	}
}
