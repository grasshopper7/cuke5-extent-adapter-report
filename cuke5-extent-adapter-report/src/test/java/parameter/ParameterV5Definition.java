package parameter;

import java.time.LocalDate;
import java.time.LocalTime;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;

public class ParameterV5Definition {
	
	private Table table;

	public ParameterV5Definition(Table table) {
		this.table = table;
	}

	@ParameterType("\\d{2}:\\d{2}:\\d{2}")
	public LocalTime orderTime(String time) {
		return LocalTime.parse(time);
	}
	
	@ParameterType("\\d{4}-\\d{2}-\\d{2}")
	public LocalDate orderDate(String time) {
		return LocalDate.parse(time);
	}

	@ParameterType("(\\d)+ numbers of [\'\"]([a-zA-Z0-9_ ]*)[\'\"]")
	public OrderLine orderline(String qty, String name) {
		return new OrderLine(new Dish(name), Integer.parseInt(qty));
	}

	@Given("Dish ordered is {dishName}")
	public void customer_orders_numbers_of_dish(Dish dish) {
		System.out.println(dish);
		System.out.println("DI - Dish - "+ dish + " Table - " + table);
	}
	
	@Given("Table Number {table} orders {} quantity {}")
	public void table_Number_orders_quantity(Table table, int quantity, Dish dish) {
		System.out.println(dish);
		System.out.println(table);
	}

}
