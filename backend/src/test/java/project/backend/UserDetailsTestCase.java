package project.backend;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.UserDetailsDAO;


public class UserDetailsTestCase {
	
	/*static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	context=new AnnotationConfigApplicationContext(DatabaseConfiguration.class);
	}
	@Test
	public void testAddUser() {
		UserDetails ud = new UserDetails();
		ud.setEmailid("vicky23@gmail.com");
		ud.setUseraddress("Theni");
		ud.setPassword("uiuiui");
		ud.setUserid(18);
		ud.setUsername("Tamil");
		ud.setRole("Developer");
		UserDetailsDAO dao=(UserDetailsDAO)context.getBean("userdetailsDAO");
		 assertTrue(dao.addUser(ud));
	}
	@Ignore
	public void testUpdateUser()
	{
		UserDetailsDAO dao=(UserDetailsDAO)context.getBean("userdetailsDAO");
		UserDetails us = dao.findUserDetails("1");
		us.setUseraddress("Namakkal");
		dao.updateUser(us);
	}
	@Test
	public void testGetUserDetails() {
		//UserDetailsDAO dao=(UserDetailsDAO)context.getBean("userdetailsDAO");
	
	}
	@Test
	public void testcheckUserCredential() {
		UserDetailsDAO dao=(UserDetailsDAO)context.getBean("userdetailsDAO");
		UserDetails us = dao.findUserDetails("1");
		us.setRole("Tester");
		dao.checkUserCredential(us);
	}*/
}
