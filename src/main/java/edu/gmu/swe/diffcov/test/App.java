package edu.gmu.swe.diffcov.test;

/**
 * Hello world!
 *
 */
public class App 
{
	public void otherMethod()
	{
		System.out.println("This change will be missed");
	}
    public void foo()
    {
    	bar();
    	if(i == 0)
    		System.out.println("i==0");
    }
    
    public void bar()
    {
    	System.out.println("Bar is called!!! wooo");
    	if(i > 0)
    		System.out.println("i>0");
    }
    public static int i;
    
}
