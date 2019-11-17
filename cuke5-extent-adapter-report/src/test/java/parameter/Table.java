package parameter;

public class Table {

	private int number;
	

	public int getNumber() {
		return number;
	}
	
	public void setNumber(String num) {
		this.number = Integer.parseInt(num);
	}
	
	public void setNumber(int num) {
		this.number = num;
	}

	@Override
	public String toString() {
		return "Table [number=" + number + "]";
	}
	
}
