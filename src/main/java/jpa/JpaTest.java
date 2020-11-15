package jpa;

import business.Fiche;
import business.Section;
import dao.FicheDao;
import dao.KanbanDao;
import dao.SectionDao;
import dao.UserDao;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//EntityManager manager = EntityManagerHelper.getEntityManager();
		//EntityTransaction tx = manager.getTransaction();
		//tx.begin();

		UserDao userDao = new UserDao();
		KanbanDao kanbanDao = new KanbanDao();
		FicheDao ficheDao = new FicheDao();
		SectionDao sectionDao = new SectionDao();
		Section section = new Section();
		//Fiche fiche = new Fiche("football","2mois","uuuu","aboisso","log.com","voir avec directeur");


		try {
			userDao.createUser("diallo");

			kanbanDao.createKanban("titi");
			ficheDao.createFiche("football","2mois","uuuu","aboisso","log.com","voir avec directeur");
			ficheDao.createFiche("tennis","3mois","ttt","abidjan","barça.com","voir avec directeur");
			//userDao.addFiche(fiche);
			sectionDao.createSection(section);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//tx.commit();


		//manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}


}
