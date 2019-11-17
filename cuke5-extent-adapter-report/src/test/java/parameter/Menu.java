package parameter;

import java.util.List;

public class Menu {

	private List<Dish> dishes;

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

	@Override
	public String toString() {
		return "Menu [dishes=" + dishes + "]";
	}
}
