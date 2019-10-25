package project.backend;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.BlogPostDAO;
import dao.FriendDAO;
import dao.JobDAO;
import dao.ProfilePictureDAO;
import dao.UserDetailsDAO;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		ApplicationContext ctx=new AnnotationConfigApplicationContext(DatabaseConfiguration.class);
        	  UserDetailsDAO a=(UserDetailsDAO)ctx.getBean("userdetailsDAO");
        	  UserDetails p=new UserDetails();
        	  p.setEmail("vickywaran@gmail.com");
        	  p.setFirstname("Vignesh");
        	  p.setLastname("C");
        	  p.setOnline(true);
        	  p.setPassword("12348765");
        	  p.setPhonenumber("8870633089");
        	  p.setUsername("vicky");
        	  p.setRole("Developer");
        	  a.registerUser(p);
        	  BlogPostDAO b = (BlogPostDAO)ctx.getBean("blogpostDAO");
        	  BlogPost q = new BlogPost();
        	  BlogComment r = new BlogComment();
        	  q.setApproved(true);
        	  q.setBlogTitle("Blog ");
        	  q.setDescription("Post");
        	  q.setId(1);
        	  q.setPostedBy(p);
        	  b.saveBlogPost(q);
        	  r.setBlogpost(q);
        	  r.setCommentedBy(p);
        	  r.setCommentText("Type Your Comments");
        	  b.addBlogcomment(r);
        	  FriendDAO c = (FriendDAO)ctx.getBean("friendDAO");
        	  Friend s = new Friend();
        	  s.setFromId("ZX");
        	  s.setId(1);
        	  s.setToId("E");
        	  c.addFriendRequest("vicky", "1");
        	  JobDAO d = (JobDAO)ctx.getBean("jobDAO");
        	  Job t =new Job();
        	  t.setCompanyname("NIIT");
        	  t.setJob(1);
        	  t.setJobTitle("Developer");
        	  t.setSalary("500000");
        	  d.saveJob(t);
        	  ProfilePictureDAO e =(ProfilePictureDAO)ctx.getBean("profilepictureDAO");
        	  ProfilePicture u = new ProfilePicture();
        	  u.setUsername("vicky");
        	  e.saveProfilePicture(u);
        	  System.out.println(" Table Created");
              } 
    	catch (BeansException e) 
    		{
    			System.out.println(" Table Not Created");
        		e.printStackTrace();
        	}
    }
}
