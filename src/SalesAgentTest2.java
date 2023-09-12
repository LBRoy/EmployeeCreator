
/**
 * <p> The purpose of this class is to print out each SalesAgent and subclasses created.</p>
 * @author Braden Howard
 */
public class SalesAgentTest2 {  
	// Set max amount of SalesAgents
	private static final int MAX_SALESAGENTS = 7;
	/**
	 * @param args (not used)
	 */
	public static void main(String[] args) {
	   SalesAgent salesA = new SalesAgent("Dwayne", 40);
	   SalesAgent salesAA = new SalesAgent("Rock", 30);
	   SalesAgent salesS = new SalesSupervisor("Johnson", 20, "Ohio");
	   SalesAgent salesC = new SalesChief("Braden", 24, "Arnprior", "Human Resources");
	   // Creates array with SalesAgents and subclasses inside
       SalesAgent[] salesAgents = {salesA, salesAA, salesS, salesC};
       /* 
        * Gets lowest amount using Math.min and comparing array length vs 
        * MAX_SALESAGENT and sets it to variable called arrayLength
        */
       int arrayLength = Math.min(MAX_SALESAGENTS, salesAgents.length);// Citing for Math.min below [1]
       // For loop prints out salesAgent array, loops until  it hits MAX_SALESAGENTS or reaches end of array length
       for (int i = 0; i < arrayLength; i++) {
    	   SalesAgent salesAgent = salesAgents[i];
    	   System.out.println(salesAgent);
    	   }
       }
   } 

/*
 * References:
 * Used Math.min to decide how big array length should be, how Math.min works found from Vertex-Academy.com.
 * [1] How to find the largest and smallest value in Java. Vertex-Academy.com. 
 * https://vertex-academy.com/tutorials/en/display-lowest-highest-value-java/ (accessed Jul. 22, 2023). 
 */