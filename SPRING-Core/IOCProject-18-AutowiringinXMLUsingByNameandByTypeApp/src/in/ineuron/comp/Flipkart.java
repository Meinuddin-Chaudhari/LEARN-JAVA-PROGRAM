package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

//Target Object
public class Flipkart {

	// Dependent Object
	private Courier courier;
	private Float discount;

	
	public Flipkart() {
		System.out.println("Flipkart:: Zero param constructor");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	// Business logic
	public String doShopping(String[] items, float prices[]) {
		System.out.println("Implementation class is :: " + courier.getClass().getName());

		int oid = 0;
		float billAmt = 0.0f;
		Random random = null;
		for (float price : prices) {
			billAmt += price;
		}
		billAmt = billAmt -(discount/ 100.0f);
		random = new Random();
		oid = random.nextInt(1000);
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + " are purchased having prices  " + Arrays.toString(prices)
				+ " with billAmount of " + billAmt + "----->" + msg;
	}

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

}
