package in.ineuron.test;

import in.ineuron.comp.WishMessageGenerator;

public class MainApp {

	public static void main(String[] args) {

		WishMessageGenerator generator = new WishMessageGenerator();
		
		java.util.Date date = new java.util.Date();
			
     	generator.setDate(date);

		System.out.println();
		
		String result = generator.generateMessage("sachin");
		System.out.println(result);

	}

}
