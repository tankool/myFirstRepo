//package com.cskaoyan.servlet;
////�����ڲ����ֱ�ӷ����ⲿ��Ĳ���������private
//
//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
////�ֲ��ڲ���
//
//class Outter1{	
//	private int x ; //�ⲿ��ĳ�Ա
//	public void test(int o){
//		//ͨ����������ڲ��ľֲ�������ϵ�ܽ��ܣ�ͨ������ʷ����ڲ��ľֲ�����
//		final  int  a =o; //ջ��  �������ھ��������������
//		// ��һ�������϶����������ֲ��ڲ���
//		// �ֲ��ڲ�ֻ���ڸ÷�����ʹ��
//		class Inner2{
//			int y =1;
//			//�ֲ��ڲ�������ⲿ��ĳ�Ա:����ֱ�ӷ��� �ⲿ��ĳ�Ա������˽��			
//			public void printOutterX(){	
//				System.out.println("Outter1.test().Inner2.printOutterX()"+x);				
//			}
//			
//			//��η��ʾֲ�����
//			public void printLocalA(){
//				System.out.println("Outter1.test().Inner2.printLocalA()"+a);
//			}
//		}
//		
//		//�ڸ÷����ڲ�����ʵ����
//		Inner2 inner2 = new Inner2();
//		System.out.println("Outter1.test()"+inner2.y);
//		
//		//ʹ�ö��߳̿��Ծ�֤
//		
//
//	}
//	


//	public void test2(){
//		
//		//�ܷ���ʾֲ��ڲ���ĳ�Ա
//		
//			
//		
//	}
//}



package com.cskaoyan.servlet;


//�����ڲ���
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
		
		//�µ��﷨��ʽ��ȥʹ�ýӿ� ���� ������
		
		final int x = 100;
		
		//������һ���µĸýӿڵ����࣬�������������ź�û�����֣������ڲ���
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
		
		//��ε������ķ�����
		
		
		//����1 ��ֱ��.
		
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
		
		// ��ν������Ӧ�ö���
		
		
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
		
			
			//ת��
			Study study =	(Study) object ;
			
			//��̬
			study.toPlay();
			study.toStudy();*/
			
		
		//����2 �� ȥ���������ڲ���ķ���
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