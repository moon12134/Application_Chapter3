
public class Sample3_7{

	public static void main(String[] args) {
		Car6 car1;
		car1 = new Car6();
		
		int number = 1234;
		double gasoline=20.5;
		car1.setNumGas(number, gasoline);
		
	}
}

class Car6{
	//Car���O
	int num;
	double gas;
	
	void setNumGas(int n,double g) {
		num = n;
		gas =g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	} 	
	void show(){ 
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	} 
}