package question2;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import getEmf.GetEMF;

public class Demo {
	
	public static void main(String[] args) {
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("empUnit");
		EntityManager em=emf.createEntityManager();
		
		Customer cus=new Customer();
		cus.setName("mahesh");
		cus.setEmail("@mai.com");
		cus.setMobileNumber("7899889");
		
		Add add1=new Add();
		
		add1.setCity("patna");
		add1.setPincode("8789");
		add1.setState("bihar");
		add1.setCus(cus);
		
		Add add2=new Add();
		add2.setCity("jaynagar");
		add2.setPincode("78978");
		add2.setState("bihar");
		add2.setCus(cus);
		
	   cus.getAddress().add(add1);
	   cus.getAddress().add(add2);
	   
	   em.getTransaction().begin();
	   em.persist(cus);
	   em.getTransaction().commit();
	   
	   System.out.println("done.....");
		
	}

}
