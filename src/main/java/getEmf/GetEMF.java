package getEmf;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetEMF {
	
	private static EntityManagerFactory emf;
	 static {
		 emf=Persistence.createEntityManagerFactory("empUnit");
	 }
	 
	 public static EntityManager GetEm() {
		 EntityManager em=emf.createEntityManager();
		 return em;
	 }

}
