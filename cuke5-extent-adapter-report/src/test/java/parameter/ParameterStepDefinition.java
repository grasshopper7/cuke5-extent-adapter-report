package parameter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;

public class ParameterStepDefinition {

	private Table table;

	public ParameterStepDefinition(Table table) {
		this.table = table;
	}

	@ParameterType(".*?")
	public Dish dishName(String name) {
		return new Dish(name);
	}

	@ParameterType(".*?")
	public Table table(String num) {
		Table table = new Table();
		table.setNumber(num);
		return table;
	}

	@Given("Customer orders at {orderTime} on {orderDate}")
	public void customer_orders_at_on(LocalTime time, LocalDate date) {
		String timeText = time.format(DateTimeFormatter.ofPattern("h:m:s a"));
		String dateText = date.format(DateTimeFormatter.ofPattern("d MMM yyyy"));
		System.out.println("Order paced at " + timeText + " on " + dateText);
	}

	@Given("Customer orders {dishName} dish {int} numbers")
	public void customer_orders_numbers_of_dish(Dish dish, int quantity) {
		OrderLine ol = new OrderLine(dish, quantity);
		System.out.println(ol);
	}

	@Given("Customer orders {orderline} dish")
	public void customer_orders_dish(OrderLine ol) {
		System.out.println(ol);
	}

	@Given("Table number {table} is served with order")
	public void table_number_is_served_with_order(Table table) {
		this.table.setNumber(table.getNumber());
		System.out.println(table);
		
	}
}
