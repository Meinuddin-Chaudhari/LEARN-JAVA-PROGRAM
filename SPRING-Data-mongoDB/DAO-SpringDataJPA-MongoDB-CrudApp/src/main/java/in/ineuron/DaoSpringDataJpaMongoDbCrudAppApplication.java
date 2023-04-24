package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerMgmtService;

@SpringBootApplication
public class DaoSpringDataJpaMongoDbCrudAppApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DaoSpringDataJpaMongoDbCrudAppApplication.class, args);
		
		ICustomerMgmtService service = applicationContext.getBean(ICustomerMgmtService.class);
	
		//System.out.println(service.registerCustomer(new CustomerDTO(12, "meinu", 120.0f,"vasai",9904L)));
		//service.findAllCustomers().forEach(System.out::println);
		
		//System.out.println(service.removeCustomer("e99ece1e38"));
		
		//System.out.println(service.registerCustomer(new CustomerDTO(3, "nitinmanjunath", 550.0f,"vasai",9904L)));
		
		//service.registerCustomer(new CustomerDTO(18, "kohli", 450.05f, "RCB", 999555776L));
		
		//service.fetchCustomerByBillAmount(340.50f, 560.05f).forEach(System.out::println);
		
		service.fetchCustomerByUsingAddressAndHavingMobileNo("nalla","vasai").forEach(System.out::println);
		((ConfigurableApplicationContext) applicationContext).close();		
	}
}
