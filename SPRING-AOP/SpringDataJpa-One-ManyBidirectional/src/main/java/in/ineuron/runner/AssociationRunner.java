package in.ineuron.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ineuron.model.Person;
import in.ineuron.model.PhoneNumber;
import in.ineuron.service.IPersonMgmtService;

@Component
public class AssociationRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {

		// Save Operation parent to child

		/*
		// Create a parent object
		Person person = new Person("hyder", "RCB");

		// Create a child object
		PhoneNumber p1 = new PhoneNumber(9998887775L, "airtel", "office");
		PhoneNumber p2 = new PhoneNumber(8889997775L, "jio", "residence");

		// link parent to child 
		p1.setPerson(person);
		p2.setPerson(person);

		Set<PhoneNumber> contactDetails = Set.of(p1, p2);

		// link child to parent
		person.setContactDetails(contactDetails);

		System.out.println(service.savePerson(person));
		
		*/

		// Save Operation Child to Parent
		
		  PhoneNumber p1 = new PhoneNumber(6567754422L, "airtel", "office");
		  PhoneNumber p2 = new PhoneNumber(667657444L, "vodofane", "residence");
		  
		  Person person = new Person("nitin", "RCB"); 
		  p1.setPerson(person);
		  p2.setPerson(person);
		  
		  Set<PhoneNumber> phoneSet = Set.of(p1, p2);
		  person.setContactDetails(phoneSet);
		  
		  System.out.println(service.savePhoneNumbers(phoneSet));
		 

		// load Operation from Parent to Child[1 to Many]
		/*
		 * service.fetchByPerson().forEach(person -> { System.out.println("Parent :: " +
		 * person); Set<PhoneNumber> childs = person.getContactDetails();
		 * childs.forEach(contact -> { System.out.println("child :: " + contact); });
		 * });
		 */

		// load operation from Child to Parent[Many to One]
		/*
		 * System.out.println(); service.fetchByPhoneNumber().forEach(phone -> {
		 * System.out.println("child :: " + phone); Person person = phone.getPerson();
		 * System.out.println(person); });
		 */

		// System.out.println(service.deleteByPerson(1));

		// System.out.println(service.deleteAllPhoneNumbersOfAPerson(2));
	}
}
