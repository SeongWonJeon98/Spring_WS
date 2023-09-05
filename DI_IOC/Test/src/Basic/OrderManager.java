package Basic;

public class OrderManager {
	private HyundaiMaker hyundaiMaker;

	public OrderManager() {
		super();
		this.hyundaiMaker = new HyundaiMaker();
	}

	public OrderManager(HyundaiMaker hyundaiMaker) {
		super();
		this.hyundaiMaker = new HyundaiMaker();
	}
	
	public void Order(int n) {
		Money money = new Money(n);
		Car car = hyundaiMaker.sell(money);
		System.out.println("판매상(인수) : " + car.getName());
	}
	
}
