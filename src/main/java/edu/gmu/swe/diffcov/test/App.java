package edu.gmu.swe.diffcov.test;

/**
 * Hello world!
 *
 */
public class App extends AppSuper
{
	 public AppSuper fozo(int m, AppSuper a)
	    {
	    		System.out.println("i==0");
	    		return null;
	    }

	public void otherMethod()
	{
		System.out.println("This change will be missed");
	}
//    public void foo()
//    {
//    	bar();
//    	if(i == 0)
//    		System.out.println("i==0");
//    }
    public void magic()
    {
    	
    }
    public void bar()
    {
    	System.out.println("Bar is called!!! wooo");
    	if(i > 0)
    		System.out.println("i>0");
    }
    public static int i;
    
}
