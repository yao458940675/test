package NO58;

public class C extends B {
	public static void main(String[] args) {
		Foo fo=new A();
		B x=new C();
		A a = x;
		Foo f =  x;
		//Foo f = (A) x;
		B b = (B) (A) x; 
//		�������ʵ����ĳ���ӿڣ���ô��������Ҳ�ǿ���ʵ����ӿ�
//		����   Foo fo=new A();
// 			Foo f =  x;
//		���ڶ����ǿ��ת���������ͨ������ת�͵����ģ����磺
//		A a=new B();��ôb��������ǿת��A,��Ϊ��������ת�����ģ��������
//		A a=new A();û������ת�ͣ���ôb�Ͳ�������ǿת��A��
		
		
		
	}
}
