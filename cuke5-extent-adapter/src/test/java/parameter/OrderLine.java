package parameter;


public class OrderLine {

	private Dish dish;	
	private int quantity;
	
	public OrderLine() {}

	public OrderLine(Dish dish, int quantity) {
		this.dish = dish;
		this.quantity = quantity;
	}

	public Dish getDish() {
		return dish;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "OrderLine [dish=" + dish + ", quantity=" + quantity + "]";
	}
}
