package in.ineuron.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Student;

public class TestApp {
                                                                                                      
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		
		System.out.println("Bean id is :: " + Arrays.toString(factory.getBeanDefinitionNames()));


		Student stud1 = factory.getBean("in.ineuron.comp.Student#0", Student.class);
		System.out.println(stud1);
		
		

		factory.close();
	}

}
