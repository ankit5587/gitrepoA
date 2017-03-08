package Demo.Sele;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	
	public static void main(String[] args) {
		System.out.println("hi this is a test");
	}

	
    public AppTest( String testName )
    {
    	System.out.println("hi i am in app test");
    }

    @Test
	public void testApp()
    {
        AssertJUnit.assertTrue( true );
    }
}
