package ai.ineuron.beans;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyMainApp {

	public static void main(String[] args) 
	{
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("beans.xml");
		
		factory.getBean("credit", CreditCardPay.class);
		factory.getBean("debit", DebitCardPay.class);
		
		PaymentProcess process=factory.getBean("paying", PaymentProcess.class);
		//System.out.println("able to get the object");
		process.doPayment(100.0);
		

	}

}
