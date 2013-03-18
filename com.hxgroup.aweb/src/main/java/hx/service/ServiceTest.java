package hx.service;




//@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
public class ServiceTest //extends AbstractTransactionalJUnit4SpringContextTests


{/*

	
	protected JdbcTemplate jdbcTemplate;
	
	*//**
	 * @param args
	 *//*
	
//	@Autowired
	private UserServiceImpl userService;
	
	
//	@Resource(name="dataSource")
	public void setDataSource(final DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
//	@Test
	public void testFind(){
		List<User> list = userService.getAllUser();
		System.out.println(list.size());
	}
	
	
	
//	@Test
//	@Rollback(false)
	public void test(){
		
		UserDto dto = new UserDto();
		dto.setAddress("xo");
		dto.setAge("cc");
		dto.setEmail("11.hx@gmail.com");
		dto.setName("yesfuck13");
		dto.setPhone("132");
		userService.addUser(dto);
		
	}
	
	public static void main(String[] args) {
		spring();
	}
	
	
	
	
	public static void spring(){
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring/applicationContext.xml"));
		UserService us = bf.getBean(UserService.class);
		
		System.out.println("===user:"+us.getUser() );
		
		
	}

*/}
