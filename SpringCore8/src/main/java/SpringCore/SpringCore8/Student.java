package SpringCore.SpringCore8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{
	String message;
    
	@PostConstruct
	public void init() {
	  System.out.println("Student init() method");
	}
	 
	@PreDestroy
	public void destroy() {
	  System.out.println("Student destroy() method");
	}
public String getMessage() {
  return message;
}

public void setMessage(String message) {
  this.message = message;
}

public void afterPropertiesSet() throws Exception {
  System.out.println( message);
}

@Override
public String toString() {
  return "Student [message=" + message +"]";
}
}
