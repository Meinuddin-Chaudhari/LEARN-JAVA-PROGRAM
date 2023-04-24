package in.ineuron.update;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.Student;
import in.ineuron.util.HibernateUtil;

public class UpdateRecord3 {

	public static void main(String[] args) throws Exception {

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			session = HibernateUtil.getSession();
			Student student = session.get(Student.class, 99);

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {
				if (student != null) {

					student.setSaddress("ggg");
					student.setSname("kohli");
					
					flag = true;
				} else {
					System.out.println("Record not available for updation...");
				}
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Object updated to database....");
			} else {
				transaction.rollback();
				System.out.println("Object not updated to database...");
			}

			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
