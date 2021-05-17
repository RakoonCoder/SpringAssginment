package SpringCore.SpringCore10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContext implements ApplicationContextAware{

		private ApplicationContext applicationContext;
		 
	    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	       
	        System.out.println("setApplicationContext method called");
	        this.applicationContext = applicationContext;
	       
	    }
	   
	    public void displayPersonDetails(){
	        fruit fruit = (fruit)( applicationContext).getBean(fruit);
	        System.out.println(fruit.getFruit());
	       
	        System.out.println((  applicationContext).isSingleton("fruit"));
	    }

		@Override
		public void setApplicationContext(org.springframework.context.ApplicationContext arg0) throws BeansException {
			// TODO Auto-generated method stub
			
		}

}
