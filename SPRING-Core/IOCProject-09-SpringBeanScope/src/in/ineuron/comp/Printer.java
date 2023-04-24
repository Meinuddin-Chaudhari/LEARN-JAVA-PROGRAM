package in.ineuron.comp;

public class Printer {

	private static Printer INSTANCE = null;

	private Printer() {
	}

	public static Printer getInstance() {
		
		if (INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}

	@Override
	public String toString() {
		return "Printer [hashCode()=" + hashCode() + "]";
	}

}
