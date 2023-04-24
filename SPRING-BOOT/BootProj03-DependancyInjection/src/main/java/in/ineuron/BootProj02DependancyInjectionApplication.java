package in.ineuron;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Student;


@SpringBootApplication
public class BootProj02DependancyInjectionApplication {
	static {
		System.out.println("BootProj02DependancyInjectionApplication.class file is loading...");
	}	

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BootProj02DependancyInjectionApplication.class,
				args);	

		
		Student wmg = applicationContext.getBean(Student.class);
		System.out.println(wmg);

		 wmg.preparation("hackerRank");
		
		((ConfigurableApplicationContext) applicationContext).close();
	}

	
}
