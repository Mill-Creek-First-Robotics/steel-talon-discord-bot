package subsystem;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UserPointsDataStoreTest is for testing the 
 * UserPointsDataStore class. 
 */
public class UserPointsDataStoreTest
{
    /**
     * Default constructor for test class UserPointsDataStoreTest
     */
    public UserPointsDataStoreTest()
    {
    }
    

    UserPointsDataStore upds = new UserPointsDataStore();
    
    @Test
    public void testAddPoints() {
        upds.setPoints("test", 0);
        assertEquals(0, upds.getPoints("test"));
        upds.addPoints("test", 1337);
        assertEquals(1337, upds.getPoints("test"));
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
