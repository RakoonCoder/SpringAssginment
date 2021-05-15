package capgemini.SpringAssignment.SpringCoreQ3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreQ3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringCoreQ3Application.class, args);
		
	  bankAccountController b1=	context.getBean(bankAccountController.class);
	  System.out.println(b1.accountDetails());
	}

}
