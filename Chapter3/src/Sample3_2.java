
public class Sample3_2{

	public static void main(String[] args) {
		Car1 car1;
		car1 = new Car1();
		car1.num=1234;
		car1.gas=20.5;

		System.out.println("�����O"+car1.num);
		System.out.println("�T�o�q�O"+car1.gas);
	}
}

class Car1{
	//Car���O
	int num;
	double gas;
}