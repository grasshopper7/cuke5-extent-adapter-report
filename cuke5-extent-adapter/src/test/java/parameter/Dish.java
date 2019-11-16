package parameter;

public class Dish {

	private String name;
	private DishType type;

	public Dish(String name) {
		this(name, DishType.GENERIC);
	}

	public Dish(String name, DishType type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public DishType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", type=" + type + "]";
	}
}
