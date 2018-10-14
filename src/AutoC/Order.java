package AutoC;

public class Order {
	
	private String cNumber;
	public Order(String number) {
		cNumber = number;
	}
	
	public String getCNumber() {
		return cNumber;
	}
	public void setCNumber(String cNumber) {
		this.cNumber = cNumber;
	}

}
