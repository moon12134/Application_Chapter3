
public class Sample3_13{

	public static void main(String[] args) {
		Car12 car1;
		car1 = new Car12();
		car1.show();
		
		Car12 car2;
		car2 = new Car12(1234,25.0);
		car2.show();
	}
}

class Car12{
	//Car���O
	private int num;
	private double gas;
	
	public Car12()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}	
	public Car12(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q��"+gas+"�����l");
	}
	public void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
		
	}
}