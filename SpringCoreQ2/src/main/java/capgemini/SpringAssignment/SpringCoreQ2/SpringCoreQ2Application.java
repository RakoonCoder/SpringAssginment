package capgemini.SpringAssignment.SpringCoreQ2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreQ2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringCoreQ2Application.class, args);
	    
		answer A= (answer) context.getBean("answer");
		A.a1.add(1);
		A.a1.add(2);
		A.a1.add(3);
		
		A.a2.add(1);
		A.a2.add(2);
		A.a2.add(3);
		
		A.a3.put("Q1", 1);
		A.a3.put("Q2", 2);
		A.a3.put("Q3", 3);
		
		A.getA1();
		A.getA2();
		A.getA3();
		
		
		
		
	}

}
