
import static org.junit.Assert.*;

import org.junit.Test;
/**
 * <p> The purpose of this class is to test the equals() method in the SalesVP class.</p>
 * @author Braden Howard
 */
public class SalesVPTest {
	/**
	 * <p>This method tests to see if two objects are equal using its equals() method, this one testing 
	 * SalesVP equals() method.</p>
	 */
	@Test
	public void testAssertEquals() {
		SalesVP vp1 = new SalesVP("Zhang", 23, "Ottawa", "Sales", 37027.812);
		// different bonus value, still within tolerance of 0.01
        SalesVP vp2 = new SalesVP("Zhang", 23, "Ottawa", "Sales", 37027.818);
        // Checks if vp1 and vp2 are equal
        assertEquals(vp1, vp2); 
        System.out.println("assertEquals() test completed"); 
	}
}
