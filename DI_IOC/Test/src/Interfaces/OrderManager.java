package Interfaces;

public class OrderManager {
	private CarMaker Maker;


//	public OrderManager(CarMaker maker) {
//		super();
//		this.Maker = maker;
//	}
//	
	public void Order(int n) {
		Money money = new Money(n);
		Car car = Maker.sell(money);
		System.out.println("판매상(인수) : " + car.getName());
	}


	public void setMaker(CarMaker maker) {
		this.Maker = maker;
	}
	
	
}
