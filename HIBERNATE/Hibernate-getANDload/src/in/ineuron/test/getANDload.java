package in.ineuron.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.ineuron.model.Student;
import in.ineuron.util.HibernateUtil;

public class getANDload {

	public static void main(String[] args) throws Exception {

		Session session = null;
		int id = 99; 
		try {
			session = HibernateUtil.getSession();

			if (session != null) {
				//Student student = session.load(Student.class, id);
				Student student = session.get(Student.class, id);
				if (student != null) {
					System.out.println(student);
//				System.out.println("Student id is      :: " + student.getSid());										
//				System.out.println("STUDENT NAME IS    :: " + student.getSname());
//				System.out.println("STUDENT AGE IS     :: " + student.getSage());
//				System.out.println("STUDENT ADDRESS IS :: " + student.getSaddress());
				}
				else
					System.out.println("Record not found for the given id :: "+id);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
