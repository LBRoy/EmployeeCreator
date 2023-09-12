
/**
 * <p> The purpose of this class is to create a Sales Agent and return their name and age.</p>
 * @author Braden Howard
 */
public class SalesAgent {  
	// Declarations
    private String name;
    private int age;

   /**
    * <p>This constructor sets the name and age of the SalesAgent.</p>
    * <p>Exceptions:</p>
    * <p>Does not validate if age passed is reasonable(between 1-130 years)</p>
    * @param n the name of the Sales Agent
    * @param a the age of the Sales Agent
    */
	public SalesAgent(String n, int a) {
		this.name = n;
		this.age = a;
		}
	/**
	 * Returns the name for this SalesAgent.
	 * @return age for this SalesAgent
	 */
	public int getAge() {
		return age;
		}
	/**
	 * Returns the name for this SalesAgent.
	 * @return name for this SalesAgent.
	 */
	public String getName() {
		return name;
		}
	/**
	 * Returns the string of information about the Sales Agent.
     * @return a string of information about the Sales Agent
	 */
	public String toString() {  
		return "Sales Agent [name=" + name + ",age=" + age + "]"; 
		}
	/**
	 * The equals() method is used to see if two SalesAgent objects are equal based on their name and age.
	 * @param obj The object to compare with the SalesAgent object
     * @return true if the object is equal to the current SalesAgent object, return false if not true
	 */
	@Override
	public boolean equals(Object obj){        
		// Checks to see if it is a instanceof SalesAgent
		if (!(obj instanceof SalesAgent)) return false; 
		// Cast obj as a SalesAgent
        SalesAgent salesAgent = (SalesAgent)obj; 
        // Returns true if equal
        return (this.age == salesAgent.getAge()) && ((this.name).equals(salesAgent.getName())); 
        }
	}