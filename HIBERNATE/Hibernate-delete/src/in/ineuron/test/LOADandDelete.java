package in.ineuron.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.Student;
import in.ineuron.util.HibernateUtil;

public class LOADandDelete {

	public static void main(String[] args) throws Exception {

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			session = HibernateUtil.getSession();
			int id = 99;
			Student student = session.get(Student.class, id);
			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {
				if (student != null) {
					session.delete(student);
					flag = true;
				} else {
					System.out.println("Record not available for deletion:: " + id);
				}
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Object delete from the database....");
			} else {
				transaction.rollback();
				System.out.println("Object not deleted from the database...");
			}

			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
