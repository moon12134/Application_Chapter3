
public class Sample3_6{

	public static void main(String[] args) {
		Car5 car1;
		car1 = new Car5();
		car1.setGas(20.5);
		car1.setNum(1234); 
	}
}

class Car5{
	//Car���O
	int num;
	double gas;
	
	void setNum(int n) {
		num = n;
		System.out.println("�N�����]��"+num);
	} 	
	void setGas(double g) {
		gas = g;
		System.out.println("�N�T�o�q�]��"+gas);
	} 
}