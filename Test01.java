package test;
/**
 * 运行时异常的处理
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
		//str.length();//空指针异常
		if(str!=null) {
			System.out.println(str.length());
		}
		Animal d=new Dog();
		//Cat c=(Cat)d;//强制转型错误
		if(d instanceof Cat) {
			Cat c=(Cat)d;
			
		}
		//数组越界异常

	}

}
class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}