package test;
/**
 * ����ʱ�쳣�Ĵ���
 * RuntimeException
 * @author dell
 *
 */

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=1/0;
		System.out.print(a);*/
		String str=null;
		//str.length();//��ָ���쳣
		if(str!=null) {
			System.out.println(str.length());
		}
		Animal d=new Dog();
		//Cat c=(Cat)d;//ǿ��ת�ʹ���
		if(d instanceof Cat) {
			Cat c=(Cat)d;
			
		}
		//����Խ���쳣

	}

}
class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}