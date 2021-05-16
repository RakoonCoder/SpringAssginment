package SpringCore.SpringCore9;

public class lifeCycle {
	public void init() throws Exception
    {
        System.out.println( "LifeCycle" + "instantiated"+ "init() method");
    }
  
    public void destroy() throws Exception
    {
        System.out.println( "Conatiner closed "+ "destroy() method");
    }

}
