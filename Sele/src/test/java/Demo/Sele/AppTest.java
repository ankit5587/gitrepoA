package Demo.Sele;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	
	public static void main(String[] args) {
		System.out.println("hi this is a t3t");
	}

	
    public AppTest( String testName )
    {
    	System.out.println("hi i am in apptest");
    }

    /**
     * Rigourous Test :-)
     */
    @Test
	public void testApp()
    {
        AssertJUnit.assertTrue( true );
    }
}