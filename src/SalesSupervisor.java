
/**
 * <p> The purpose of this class is to create a Sales Supervisor and return their name, age and location.</p>
 * @author Braden Howard
 */
public class SalesSupervisor extends SalesAgent {
	// Declaration
	private String location;
	/**
	 * <p>This constructor sets the name, age and location of the Sales Supervisor.</p>
	 * <p>Exceptions:</p>
     * <p>Does not validate if age passed is reasonable(between 1-130 years)</p>
	 * @param n the name of the Sales Supervisor
	 * @param a the age of the Sales Supervisor
	 * @param location the location of the Sales Supervisor
	 */
	public SalesSupervisor(String n, int a, String location) {
		super(n, a);
		this.location = location;
	}
	/**
	 * Returns the location for this Sales Supervisor
	 * @return location for this Sales Supervisor
	 */
	private String getLocation() {
		return location;
	}
	/**
	 * Returns the string of information about the Sales Supervisor.
     * @return a string of information about the Sales Supervisor
	 */
	public String toString() {
		return "Sales Supervisor  [super=" + super.toString() + ", location ="+ location+ "]";
	}
	/**
	 * The equals() method is used to see if two SalesSupervisor objects are equal based on their name, age and location.
	 * @param obj The object to compare with the SalesSupervisor object
     * @return true if the object is equal to the current SalesSupervisor object, return false if not true
	 */
	@Override
	public boolean equals(Object obj){    
		// Checks to see if it is a instanceof SalesSupervisor
		if (!(obj instanceof SalesSupervisor)) return false; 
		// Cast obj as a SalesSupervisor
		SalesSupervisor salesS = (SalesSupervisor)obj; 
		// Returns true if equal, uses super.equals(obj) to use equals() method from SalesAgent implementing DRY principle
		return super.equals(obj) && ((this.location).equals(salesS.getLocation())); 
	}
}
