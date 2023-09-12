
/**
 * <p> The purpose of this class is to print out each SalesAgent and subclasses created.</p>
 * @author Braden Howard
 */
public class SalesAgentTest {  
	
	/**
	 * @param args (not used)
	 */
	public static void main(String[] args) {
		// Declarations
		// Creates new SalesAgent
		SalesAgent salesA = new SalesAgent("Dwayne", 40);
		// Creates new SalesAgent
	    SalesAgent salesAA = new SalesAgent("Rock", 30);
	    // Creates new SalesSupervisor
	    SalesAgent salesS = new SalesSupervisor("Johnson", 20, "Ohio");
	    // Creates new SalesChief
	    SalesAgent salesC = new SalesChief("Braden", 24, "Arnprior", "Human Resources");
	   
	    // Prints out each new sales 
	    System.out.printf(salesA + "\n" + salesAA + "\n" + salesS + "\n" + salesC);
	    }
	}  