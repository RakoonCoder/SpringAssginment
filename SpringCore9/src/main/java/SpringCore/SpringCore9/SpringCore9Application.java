package SpringCore.SpringCore9;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCore9Application {

	public static void main( String[] args )  throws Exception

    {
    	
  
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
  
        context.close();
    }
}
