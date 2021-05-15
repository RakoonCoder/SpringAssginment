package capegemini.SpringCore.springCoreQ1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreQ1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringCoreQ1Application.class, args);
		customer c1 = context.getBean(customer.class);
		c1.setCustomerName("Anuragini");
		c1.setCustomerId(01);
		c1.setCustomerContact(1234567890);
		c1.setCustomerAddress(c1.adShow());
		
		System.out.println(c1.getCustomerName());
		System.out.println(c1.getCustomerId());
		System.out.println(c1.getCustomerContact());
		System.out.println(c1.getCustomerAddress());
		
	}

}
