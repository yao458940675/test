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
	//�࣬Ϊpublic������������Ϊpublic �����ڲ�ͬ�����ķ�����Ȩ��Ϊprotected
//	������Է���
	public static void main(String[] args) {
		A a =new A();
		a.name="hah";
		System.out.println(a.name);
	}
}
