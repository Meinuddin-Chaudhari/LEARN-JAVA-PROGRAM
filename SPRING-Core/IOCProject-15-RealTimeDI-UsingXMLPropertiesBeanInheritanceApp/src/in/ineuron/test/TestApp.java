package in.ineuron.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.controller.MainController;
import in.ineuron.vo.CustomerVO;

public class TestApp {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the customerName:: ");
		String customerName = scanner.next();

		System.out.print("Enter the customerAddress:: ");
		String customerAddress = scanner.next();

		System.out.print("Enter the principalAmount:: ");
		String pamt = scanner.next();

		System.out.print("Enter the RateOfInterest:: ");
		String rate = scanner.next();

		System.out.print("Enter the TimePeriod:: ");
		String time = scanner.next();

		CustomerVO customerVO = new CustomerVO();
		customerVO.setCustomerName(customerName);
		customerVO.setCustomerAddress(customerAddress);
		customerVO.setPamt(pamt);
		customerVO.setRate(rate);
		customerVO.setTime(time);

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");

		MainController controller = factory.getBean("customerController", MainController.class);
		try {
			String result = controller.processCustomer(customerVO);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal problem.. Try again....." + e.getMessage());
		}
		factory.close();
		scanner.close();
	}

}
