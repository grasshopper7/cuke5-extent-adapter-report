package parameter;

public class OrderLineId {

	private int id;

	public OrderLineId(int id) {
		this.id = id;
	}
	
	public OrderLineId(String id) {
		this.id = Integer.parseInt(id);
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "OrderLineId [id=" + id + "]";
	}
}
