package oops.com;

public class ElectricityBill {
	int consumerNo;
	String consumerName;
	float units;
	
	ElectricityBill(int consumerNo,String consumerName,float units){
		this.consumerNo=consumerNo;
		this.consumerName=consumerName;
		this.units=units;
	}
	
	void display() {
		System.out.println("Consumer No : "+consumerNo);
		System.out.println("Consumer Name : "+consumerName);
		System.out.println("Units : "+units);
	}
	
	void calculateBill() {
		float bill;
		if(units<=100) {
			bill=units*2;
		}else if(units<=200) {
			bill=100*2+(units-100)*3;
		}else if(units<=300) {
			bill=100*2+100*3+(units-200)*5;
		}else {
			bill=100*2+100*3+100*5+(units-300)*7;
		}
		System.out.println("Bill Amount :"+bill);
	}
	
}
