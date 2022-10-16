package GetStudentCollageId;

import java.util.List;

import javax.persistence.EntityManager;

import com.mysql.cj.Query;

import GEtcalss.Collage;
import GEtcalss.Student;
import getEmf.GetEMF;

public class GetStudent {
	
	public static void main(String[] args) {
		EntityManager em=GetEMF.GetEm();
		List<Student> student=(List<Student>) em.find(Collage.class, 1);
		student.forEach(m->{
			System.out.println(m);
		});
		


	    
		
	
		
		
	}

}
