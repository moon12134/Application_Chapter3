
public class Sample3_9{

	public static void main(String[] args) {
		Car8 car1;
		car1 = new Car8();
		car1.num=1234;
		car1.gas=-10;
		
		car1.show();
	}
}

class Car8{
	//Car���O
	int num;
	double gas;
	
	void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
		
	}
}