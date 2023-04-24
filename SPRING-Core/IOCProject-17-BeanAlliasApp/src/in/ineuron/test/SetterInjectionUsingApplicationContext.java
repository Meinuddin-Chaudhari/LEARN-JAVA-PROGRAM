package in.ineuron.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.WishMessageGenerator;

public class SetterInjectionUsingApplicationContext {

	public static void main(String[] args) throws Exception {

		ApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");


		
		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("HashCode of wmg is :: "+wmg.hashCode());
		System.out.println(wmg);
		
		System.out.println();
		
		WishMessageGenerator wishMessageGenerator = factory.getBean("wishMessageGenerator", WishMessageGenerator.class);
		System.out.println("HashCode of wishMessageGenerator is :: "+wishMessageGenerator.hashCode());
		System.out.println(wishMessageGenerator);

		((AbstractApplicationContext) factory).close();
	}
}
