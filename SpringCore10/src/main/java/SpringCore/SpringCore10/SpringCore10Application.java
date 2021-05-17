package SpringCore.SpringCore10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ApplicationContextAware.Core10ApplicationContextAware.ApplicationContextImpl;

@SpringBootApplication
public class SpringCore10Application {

	 public static void main( String[] args )
	    {
	    	
	    	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
	    	 
	        ApplicationContext applicationContextAwareImpl = (ApplicationContext) applicationContext.getBean("app");
	       
	        System.out.println("Application context aware output");
	        applicationContextAwareImpl.displayfruitDetails();
	       
	    }
}
