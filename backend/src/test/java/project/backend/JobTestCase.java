package project.backend;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.JobDAO;

public class JobTestCase {
	/*static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		context=new AnnotationConfigApplicationContext(DatabaseConfiguration.class);
	}
	@Test
	public void testAddJob() {
	Job jb = new Job();
	jb.setCompanyname("CTS");
	jb.setDescription("Developer");
	jb.setJobid(20);
	jb.setLocation("Chennai");
	jb.setSkills("Fast Learning");
	JobDAO dao = (JobDAO)context.getBean("jobDAO");
	assertTrue(dao.addJob(jb));
	}
	@Test
	public void testDelete() {
		JobDAO dao = (JobDAO)context.getBean("jobDAO");
		Job jb = dao.getJobDetails(20);
		dao.addJob(jb);
	}
	@Test
	public void testDisplayJob() {
		JobDAO dao = (JobDAO)context.getBean("jobDAO");
		Job jb = dao.getJobDetails(20);
		dao.displayJob();
	}
	@Test
	public void testGetJobDetails() {
		JobDAO dao = (JobDAO)context.getBean("jobDAO");
		dao.getJobDetails(20);
	}*/
}
