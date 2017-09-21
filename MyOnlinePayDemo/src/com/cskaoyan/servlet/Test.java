//package com.cskaoyan.servlet;
////方法内部类可直接访问外部类的参数，包括private
//
//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
////局部内部类
//
//class Outter1{	
//	private int x ; //外部类的成员
//	public void test(int o){
//		//通常会跟方法内部的局部变量关系很紧密，通常需访问方法内部的局部变量
//		final  int  a =o; //栈上  声明周期就是这个函数调用
//		// 在一个方法上定义的类叫做局部内部类
//		// 局部内部只能在该方法中使用
//		class Inner2{
//			int y =1;
//			//局部内部类访问外部类的成员:可以直接访问 外部类的成员，包括私有			
//			public void printOutterX(){	
//				System.out.println("Outter1.test().Inner2.printOutterX()"+x);				
//			}
//			
//			//如何访问局部变量
//			public void printLocalA(){
//				System.out.println("Outter1.test().Inner2.printLocalA()"+a);
//			}
//		}
//		
//		//在该方法内部可以实例化
//		Inner2 inner2 = new Inner2();
//		System.out.println("Outter1.test()"+inner2.y);
//		
//		//使用多线程可以举证
//		
//
//	}
//	


//	public void test2(){
//		
//		//能否访问局部内部类的成员
//		
//			
//		
//	}
//}



package com.cskaoyan.servlet;


//匿名内部类
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Outter2 outter2 = new Outter2();
		 
		 outter2.test();
		 
	}

}


interface Study{
	
	void toStudy();	
	
	void toPlay();

}



class Outter2{
	
	
	
	public void test(){
		
		//新的语法形式，去使用接口 或者 抽象类
		
		final int x = 100;
		
		//定义了一个新的该接口的子类，但是这个子类很遗憾没有名字：匿名内部类
		new Study() {
			
			@Override
			public void toStudy() {
				// TODO Auto-generated method stub
				
				System.out.println("Outter2.test()  study() xxxx");
			}

			@Override
			public void toPlay() {
				// TODO Auto-generated method stub
				System.out.println("Outter2.test().new Study() {...}.toPlay()"+x);
			}
			
			
		}.toStudy();
		
		//如何调用它的方法？
		
		
		//方法1 ：直接.
		
        new Study() {
			
			@Override
			public void toStudy() {
				// TODO Auto-generated method stub
				
				System.out.println("Outter2.test()  study() xxxx");
			}

			@Override
			public void toPlay() {
				// TODO Auto-generated method stub
				System.out.println("Outter2.test().new Study() {...}.toPlay()");
			}
			
			
		}.toPlay();
		
		// 如何接受这个应用对象
		
		
		/* Object object =  new Study() {
				
				@Override
				public void toStudy() {
					// TODO Auto-generated method stub
					
					System.out.println("Outter2.test()  study() xxxx");
				}

				@Override
				public void toPlay() {
					// TODO Auto-generated method stub
					System.out.println("Outter2.test().new Study() {...}.toPlay()");
				}
				
				
			};
		
			
			//转型
			Study study =	(Study) object ;
			
			//多态
			study.toPlay();
			study.toStudy();*/
			
		
		//方法2 ： 去调用匿名内部类的方法
		Study study=  new Study() {
			
			@Override
			public void toStudy() {
				// TODO Auto-generated method stub
				
				System.out.println("Outter2.test()  study() xxxx");
			}

			@Override
			public void toPlay() {
				// TODO Auto-generated method stub
				System.out.println("Outter2.test().new Study() {...}.toPlay()");
			}
			
		};
			
		study.toPlay();
		study.toStudy();
		
	}
	
	
}