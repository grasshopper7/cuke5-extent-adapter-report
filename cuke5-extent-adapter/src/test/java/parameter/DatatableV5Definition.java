package parameter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.DefaultDataTableCellTransformer;
import io.cucumber.java.DefaultDataTableEntryTransformer;
import io.cucumber.java.DefaultParameterTransformer;
import io.cucumber.java.en.Given;

import java.lang.reflect.Type;

public class DatatableV5Definition {

	/*
	 * // TableCellTransformer
	 * 
	 * @DataTableType public OrderLineId cellTransform(String cell) { return new
	 * OrderLineId(Integer.parseInt(cell)); }
	 * 
	 * // TableEntryTransformer
	 * 
	 * @DataTableType public OrderLine entryTransform(Map<String, String> entry) {
	 * return new OrderLine(new Dish(entry.get("dish")),
	 * Integer.parseInt(entry.get("quantity"))); }
	 */

	// TableRowTransformer

	@DataTableType
	public Dish rowTransform(List<String> row) {
		return new Dish(row.get(0), DishType.valueOf(row.get(1)));
	}

	// TableTransformer

	@DataTableType
	public Menu tableTransform(DataTable table) {
		Menu menu = new Menu();
		List<Dish> dishes = table.asMaps().stream().map(d -> new Dish(d.get("dish"), DishType.valueOf(d.get("type"))))
				.collect(Collectors.toList());
		menu.setDishes(dishes);
		return menu;
	}

	private final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JSR310Module());

	@DefaultParameterTransformer
	@DefaultDataTableEntryTransformer
	@DefaultDataTableCellTransformer
	public Object defaultTransformer(Object fromValue, Type toValueType) {
		JavaType javaType = objectMapper.constructType(toValueType);
		return objectMapper.convertValue(fromValue, javaType);
	}

	@Given("Customer orders the dishes")
	public void customer_Orders_the_dishes(List<OrderLine> orderLines) {
		System.out.println(orderLines);
	}

	@Given("Customer orders the below dishes")
	public void customer_Orders_the_below_dishes(Map<OrderLineId, OrderLine> orderLines) {
		System.out.println(orderLines);
	}

	@Given("Customer orders the following dishes")
	public void customer_Orders_the_followng_dishes(Map<Integer, OrderLine> orderLines) {
		System.out.println(orderLines);
	}

	@Given("Dishes in menu")
	public void dishes_in_Menu(List<Dish> dishes) {
		System.out.println(dishes);
	}

	@Given("Menu dishes")
	public void menu_Dishes(Menu menu) {
		System.out.println(menu);
	}

}
