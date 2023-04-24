package in.ineuron.comp;

public class DTDC implements Courier {


	public DTDC() {
		System.out.println("DTDC:: Zero param constructor...");
	}
	@Override
	public String deliver(int oid) {
		return "DTDC Courier will delived with the order id :: "+oid+" for the ordered products";
	}

}
