package hx.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;




@ContextConfiguration(locations={"classpath:spring/applicationContext-mybatis.xml"})
public class ServiceTest extends AbstractTransactionalJUnit4SpringContextTests


{

	/**
	 * hibernate 测试
	 */
	
	
	/**
	 * jpa 测试
	 */
	
	
	
	/*protected JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	private UserServiceImpl userService;
	
	
	@Resource(name="dataSource")
	public void setDataSource(final DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Test
	public void testFind(){
		List<User> list = userService.getAllUser();
		System.out.println(list.size());
	}
	
	
	
	@Test
	@Rollback(false)
	public void test(){
		
		UserDto dto = new UserDto();
		dto.setAddress("xo");
		dto.setAge("cc");
		dto.setEmail("11.hx@gmail.com");
		dto.setName("yesfuck13");
		dto.setPhone("132");
		userService.addUser(dto);
		
	}*/
	
	
	
	/**
	 * mybatis 的测试  
	 */
	
	@Autowired
	@Qualifier("UserService02")
	private hx.service.mybatis.UserServiceImpl userService4Mybatis;
	
	@Test
	public void testmybatis(){
		hx.domain.mybatis.User u = userService4Mybatis.getUser("uniform");
		System.out.println("===success==address:["+u.getAddress()+"]");
	}
	
	
	
	
	public static void main(String[] args) {
		spring();
	}
	
	
	
	
	public static void spring(){
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		
		/*BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring/applicationContext.xml"));
		UserService us = bf.getBean(UserService.class);
		
		System.out.println("===user:"+us.getUser() );*/
		
		
	}

}
