package in.ineuron.comp;

public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart:: Zero param constructor...");
	}

	@Override
	public String deliver(int oid) {
		return "BlueDart Courier will delived with the order id ::"+oid+" for the ordered products";
	}

}
