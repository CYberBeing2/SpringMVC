import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arena.mapper.AdminMapper;
import com.arena.pojo.Admin;



public class testAdmin {

	private ApplicationContext applicationContext;
	
	private AdminMapper adminMapper;

	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		adminMapper = (AdminMapper) applicationContext.getBean("adminMapper");
	}


	//根据主键查询
	@Test
	public void testSelectByPrimaryKey() {
		Admin items =adminMapper.selectByPrimaryKey("20130059");
		System.out.println(items.getAname());
	}

	

}