package SpringCore.SpringCore8;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCore8Application {

	 public static void main( String[] args )
	    {
	    	ConfigurableApplicationContext context = 
	                new ClassPathXmlApplicationContext(new String[] {"Bean.xml"});
	        
	        	Student stu = (Student)context.getBean("Student");
	        	
	        	System.out.println(stu);
	        	
	        	context.close();
	    }

}
