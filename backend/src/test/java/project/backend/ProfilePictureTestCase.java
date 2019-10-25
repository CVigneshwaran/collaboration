package project.backend;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.ProfilePictureDAO;

public class ProfilePictureTestCase {
	/*
	static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		context=new AnnotationConfigApplicationContext(DatabaseConfiguration.class);
	}
	@Test
	public void testAddProfilePicture() {
		ProfilePicture pic = new ProfilePicture();
		pic.setImage(null);
		pic.setUsername("Vigneshwaran.C");
		ProfilePictureDAO dao = (ProfilePictureDAO)context.getBean("profilepictureDAO");
		assertTrue(dao.addProfilePicture(pic));
	}
	@Test
	public void testGetProfilePicture() {
		ProfilePictureDAO dao = (ProfilePictureDAO)context.getBean("profilepictureDAO");
		dao.getProfilePicture("Vigneshwaran.C");
	}
*/
}
