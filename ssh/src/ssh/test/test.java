package ssh.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class test {
	
	private static SessionFactory sf = null;
	
	@Test
	public void testConnect(){
		    Configuration cfg = new Configuration().configure();
		    sf = cfg.buildSessionFactory();
		    System.out.println("66666666**********");
		    Session session = sf.openSession();
		    System.out.println("数据库连接成功------------------");
		    System.out.println(session.toString());
	}
}
