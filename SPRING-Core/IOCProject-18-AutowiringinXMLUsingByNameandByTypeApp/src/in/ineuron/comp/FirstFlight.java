package in.ineuron.comp;

public class FirstFlight implements Courier {


	public FirstFlight() {
		System.out.println("FirstFlight :: Zero param constructor...");
	}

	@Override
	public String deliver(int oid) {
		return "FirstFlight Courier will delived with the order id ::" + oid + " for the ordered products";
	}

}
