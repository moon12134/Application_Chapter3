
public class Sample3_12{

	public static void main(String[] args) {
		Car11 car1;
		car1 = new Car11();
		
		car1.show();
	}
}

class Car11{
	//Car���O
	private int num;
	private double gas;
	
	public Car11()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
		
	}
}