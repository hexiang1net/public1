package hx.domain.test;

import hx.dao.mybatis.UserMapper;
import hx.domain.mybatis.User;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		

		try {
			mybatistest();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void mybatistest() throws Exception {
		
		Reader reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
		
		SqlSessionFactory ssfactory = new SqlSessionFactoryBuilder().build(reader);
		
		
		SqlSession ss = ssfactory.openSession();
		try {
			
			UserMapper umapper = ss.getMapper(UserMapper.class);
//			User u = new User();
//			u.setAddress("xx");
//			u.setAge("xxx");
//			u.setEmail("cc");
//			u.setName("uniform");
//			u.setPhone("132");
//			umapper.insertUser(u);
//			ss.commit();
//			System.out.println("===commit success===");
			
			User u1 = umapper.getUser("uniform");
			System.out.println("===get success===name:["+u1.getName()+"]");
			
		} catch (Exception e) {
			throw e;
		}finally{
			ss.close();
		}
		
		
		
		
		
		
	}

}
