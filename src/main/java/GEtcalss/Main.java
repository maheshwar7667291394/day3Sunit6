package GEtcalss;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import getEmf.GetEMF;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManager em=GetEMF.GetEm();
		
		Collage collage=new Collage();
		 collage.setCollageName("ptlipuutra");
		 collage.setCollageAddress("patna");
		 
		 Student student=new Student();
		 student.setEmail("@makumar.com");
		 student.setMobileNumber("677867789");
		 student.setStudentName("mahesh");
		 
		 Student student1=new Student();
		 student1.setMobileNumber("7897899");
		 student1.setEmail("@mkumar.com");
		 student.setStudentName("ramkua");
		 
		 student.setCollage(collage);
		 student1.setCollage(collage);
		 
		 collage.getStudent().add(student1);
		 collage.getStudent().add(student);
		 
		
		 
		em.getTransaction().begin();
		em.persist(collage);
		em.persist(student1);
		em.persist(student);
		em.getTransaction().commit();
		em.close();
		System.out.println("done.....");
		 
//		Collage d= em.find(Collage.class, 1);
		 
//		EntityManager em=GetEMF.GetEm();
//		Collage q=em.find(Collage.class,1);
//		System.out.println(d);
//		List<Student> stude=q.getStudent();
//		System.out.println(stude);
//		

}
}