package hibernate4.demo;
import javax.persistence.*;
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory e=Persistence.createEntityManagerFactory("monday");
EntityManager m=e.createEntityManager();
EntityTransaction t= m.getTransaction();

//Hero d= new Hero(); //d.setAge(56); d.setName("umesh");
// // d.setPhNO(978747847);
// * 
// * d.setAge(58); d.setName("ush"); d.setPhNO(9747847);
// * 
// * 
// * t.begin(); m.persist(d); t.commit();
// * 
// * //to fetch Hero h=m.find(Hero.class, 894394394);
// * System.out.println(h.getAge()+""+h.getName()+h.getPhNO());
// */

//to remove
//Hero a=m.find(Hero.class,58);
//t.begin();
//m.remove(a);
//t.commit();

//to update
Hero b=m.find(Hero.class, 56);
b.setName("kumar");

t.begin();
m.merge(b);
t.commit();



	}

}
