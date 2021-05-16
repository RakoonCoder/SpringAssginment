package capgemini.SpringAssignment.SpringCoreQ3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreQ3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringCoreQ3Application.class, args);
		
	  bankAccountRepositoryImpl b1=	context.getBean(bankAccountRepositoryImpl.class);
	  bankAccout b2=	context.getBean(bankAccout.class);
	  
	  System.out.println(b1.GetBalance(1000));
	  System.out.println(b1.updateBalancce(b2.getAccountId(), 100000));
	}

}
